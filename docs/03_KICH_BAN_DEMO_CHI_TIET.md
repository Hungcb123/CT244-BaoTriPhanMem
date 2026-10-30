# KỊCH BẢN THỰC NGHIỆM REVERSE ENGINEERING JAVA — CT210H

## Phạm vi và chuẩn bị

So sánh ba công cụ trên `demo_sample_project/src/main/java`, sau đó tìm hiểu sâu Visual Paradigm. Tập trung Class Diagram và bảo trì mã Java; không demo trích xuất sơ đồ cơ sở dữ liệu.

Tạo project/package thử mới, ghi phiên bản công cụ, edition, Java extension và cấu hình import. Mã mẫu có 12 class/interface, mô phỏng kiến trúc phân tầng; chưa cấu hình chạy Spring Boot. Build: `mvn -f demo_sample_project/pom.xml compile`.

## Phần A — Tạo Class Diagram trên ba công cụ

### Visual Paradigm

1. Mở project mới, vào chức năng Reverse Java trong Tools → Code; tên menu thay đổi theo phiên bản.
2. Thêm source path `demo_sample_project/src/main/java`, chọn Java. Bỏ Reverse source on demand nếu muốn reverse ngay, nhấn OK.
3. Trong cây Java/Class Repository, chọn source/package → Reverse "java" to → New Class Diagram nếu giao diện hiển thị lựa chọn này.
4. Có thể chọn riêng package `model` rồi Form/Generate Class Diagram để tạo sơ đồ các entity, không cần kéo từng class.
5. Chụp sơ đồ tự sinh trước khi chỉnh, ghi nhận bố cục và các quan hệ liên tầng.

**Quan sát:** Người thực nghiệm đánh giá thao tác thuận tiện, dễ dùng. Sơ đồ tự bố trí không đồng nghĩa công cụ tự nhận diện đầy đủ kiến trúc MVC hay hành vi Spring runtime.

### Enterprise Architect

1. Tạo package mới `Test_JPA` hoặc tên thử nghiệm khác, chọn package đó trong Browser.
2. Ctrl+Shift+U → Import Source Directory; chọn Java và thư mục source dùng chung.
3. Bật Recursively Process Subdirectories và Create Diagram for each Package; bỏ Do not import private members và Dry Run nếu đang bật.
4. Nhấn OK; mở diagram bên trong từng package để chụp kết quả tự sinh.
5. Để thử tổng quan, tạo diagram loại Class. Mở rộng package service, kéo **class OrderService** vào trang vẽ. Không kéo diagram tên service: thao tác đó sẽ hiện Drop Diagram As.
6. Chuột phải class trên trang → Insert Related Elements; chọn hướng All, không giới hạn namespace, thử 2 mức, Refresh, chọn các kết quả và Layout Diagram when complete → OK.
7. Lệnh chỉ thêm phần tử đã có quan hệ trong mô hình. Ghi lại phần thiếu, chưa tự vẽ đường để che kết quả import.

### StarUML + Java extension

1. File → New. Cài Java extension qua Tools → Extension Manager nếu chưa có.
2. File → Preferences → Java Reverse Engineering: bật Use Association, Package Overview Diagram, Type Hierarchy Diagram; bỏ Public Only. Có thể bật Package Structure Diagram.
3. Tools → Java → Reverse Code, chọn source dùng chung.
4. Mở Model Explorer → mô hình vừa import → các package con; nhấp đúp Overview trong từng package để xem diagram tự sinh.
5. Muốn gom tổng quan, tạo Class Diagram mới, kéo các class/interface có sẵn vào mỗi cái một lần, ghi lại công sức chỉnh bố cục.

**Quan sát:** Trong lần thử của nhóm, thao tác gom và kéo thả khá tốn công. Extension vẫn có chức năng tạo diagram; không mô tả là hoàn toàn không tự động.

### Checklist so sánh

- Có đủ 5 class model, 2 service, 2 controller, 3 repository interface không?
- Có generalization từ bốn entity về BaseEntity không?
- Có association Customer–Order, Order–OrderItem, OrderItem–Product không?
- Quan hệ Controller–Service và Service–Repository thể hiện bằng connector hay chỉ field?
- Công cụ tự tạo những diagram nào? Bao nhiêu bước gom/chỉnh tay để có tổng quan?
- Lưu ảnh tự sinh và ảnh sau chỉnh; chưa có số đo thì không ghi độ chính xác 100% hoặc tỷ lệ thời gian tiết kiệm.

## Phần B — Bốn kịch bản trên Visual Paradigm

### Kịch bản 1: Reverse Java thành Class Diagram tổng quan

Import mã, tạo diagram chứa các package Controller, Service, Repository, Model. Giải thích quan hệ theo field Java; đối chiếu với source. Minh chứng là ảnh sơ đồ thực tế.

### Kịch bản 2: Khoanh vùng quan hệ lớp phục vụ bảo trì

Chọn package model rồi tạo Class Diagram riêng. Phân tích Customer–Order–OrderItem–Product và kế thừa BaseEntity. Từ sơ đồ tổng quan, chỉ ra OrderService phụ thuộc những repository nào khi thay đổi cách tính tiền. Đây là bài đọc hiểu mô hình tĩnh, không thay thế kiểm tra luồng gọi runtime.

### Kịch bản 3: Round-trip — cần kiểm chứng

Làm trên bản sao mã nguồn. Thêm `maintenanceNote: String` vào Customer trên model, dùng chức năng Java round-trip cập nhật code theo phiên bản đang dùng. Kiểm tra diff để xác nhận field mới, annotation và method body cũ; build lại. Sau đó thêm field khác trong Java rồi reverse để kiểm tra cập nhật mô hình và trùng class. Chỉ gọi là thành công khi có kết quả trước/sau; không mặc định Generate Code luôn merge an toàn.

### Kịch bản 4: AI hỗ trợ phân tích tác động — mở rộng

Đưa sơ đồ cùng source liên quan cho AI, yêu cầu đề xuất class bị ảnh hưởng khi đổi quy tắc tính tiền. Đối chiếu từng đề xuất với OrderService và repository; kiểm tra lại test gợi ý. Đây là chức năng kết hợp bên ngoài, không trình bày như khả năng AI tích hợp sẵn của VP hoặc kết quả chắc chắn đúng.

## Tài liệu đối chiếu

Xem nguồn chính thức và ma trận định tính tại [đánh giá công cụ](05_DANH_GIA_VA_LUA_CHON_CONG_CU.md). Chưa dùng radar điểm số để xếp hạng khi phép thử chưa hoàn tất.
