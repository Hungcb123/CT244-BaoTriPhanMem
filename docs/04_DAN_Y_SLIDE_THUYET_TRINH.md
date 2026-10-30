# DÀN Ý SLIDE CT210H — THUYẾT TRÌNH 5 PHÚT

## Brief gửi người làm slide

Làm **6 slide**, tổng phần nói dự kiến **4 phút 40 giây**, còn 20 giây dự phòng chuyển slide. Chủ đề: **Khảo sát công cụ reverse engineering Java và lựa chọn Visual Paradigm**. Không dùng dàn ý 12–15 phút trước đây.

Trọng tâm là kết quả thử ba công cụ trên cùng mã Java và lý do lựa chọn. Không demo live trong 5 phút; dùng ảnh đã có. Không đưa round-trip hoặc AI thành kết quả đã thực hiện. Không thêm bảng điểm/radar định lượng chưa được kiểm chứng.

Mỗi slide một thông điệp chính, tối đa ba ý ngắn, chữ nội dung từ khoảng 24pt. Ưu tiên vùng ảnh có tên class, quan hệ và Browser/Model Explorer; cắt phần trống, giữ nguyên nội dung minh chứng. Có thể dùng ảnh tổng quan và một vùng phóng to thay vì thu nhỏ toàn bộ ảnh đến mức không đọc được.

## Phân bổ thời lượng

| Slide | Nội dung | Thời lượng |
|---|---|---|
| 1 | Chủ đề và mục tiêu | 15 giây |
| 2 | Reverse engineering giúp gì cho bảo trì? | 35 giây |
| 3 | Cách thử nghiệm ba công cụ | 35 giây |
| 4 | Kết quả EA và StarUML | 65 giây |
| 5 | Kết quả Visual Paradigm và so sánh | 100 giây |
| 6 | Kết luận và giới hạn | 30 giây |
| **Tổng phần nói** | | **280 giây = 4 phút 40 giây** |

Nếu 5 phút bao gồm hỏi đáp, rút phần trình bày xuống khoảng 4 phút: giảm slide 4 còn 50 giây, slide 5 còn 75 giây. Không đưa thêm lý thuyết hoặc demo live.

## Slide 1 — Chủ đề và mục tiêu (15 giây)

**Trên slide:**

- Khảo sát công cụ Reverse Engineering Java.
- Visual Paradigm · Enterprise Architect · StarUML.
- CT210H — tên nhóm, thành viên theo thông tin thực tế.

**Lời nói gợi ý:**

“Nhóm khảo sát ba công cụ chuyển mã Java thành sơ đồ lớp, so sánh khả năng tự động hóa và công sức thao tác, từ đó chọn công cụ phù hợp để hỗ trợ bảo trì.”

## Slide 2 — Vì sao cần reverse engineering? (35 giây)

**Trên slide:**

- Tiếp nhận code cũ nhưng thiếu sơ đồ thiết kế.
- Java source → Class Diagram → hiểu quan hệ lớp.
- Hỗ trợ xác định phần liên quan trước khi thay đổi.

**Hình gợi ý:** Một luồng ba bước đơn giản; không cần thêm ảnh sản phẩm.

**Lời nói gợi ý:**

“Khi tiếp nhận một hệ thống, kỹ sư cần hiểu lớp nào phụ thuộc lớp nào trước khi sửa. Reverse engineering giúp khôi phục mô hình từ mã đã có. Trong bài này, nhóm dùng Class Diagram để quan sát thuộc tính, phương thức, quan hệ kế thừa và liên kết giữa các lớp. Sơ đồ hỗ trợ đọc hiểu mã, nhưng vẫn phải đối chiếu với source khi phân tích thay đổi.”

## Slide 3 — Thử trên cùng một mã nguồn (35 giây)

**Trên slide:**

- Mã mẫu quản lý đơn hàng: 12 class/interface.
- Controller · Service · Repository · Model.
- So sánh: quan hệ lớp, tự tạo sơ đồ, thao tác thủ công.

**Hình gợi ý:** Bốn khối tên package. Ghi nhỏ đường dẫn `demo_sample_project/src/main/java` nếu cần.

**Lời nói gợi ý:**

“Cả ba công cụ được thử trên cùng mã Java quản lý đơn hàng gồm 12 class và interface, chia thành bốn package. Đây là mã mô phỏng kiến trúc phân tầng, chưa phải ứng dụng Spring Boot chạy hoàn chỉnh. Nhóm xem công cụ tạo được những class, quan hệ nào, và cần bao nhiêu công sức gom, kéo thả hoặc chỉnh sơ đồ để có tổng quan dễ đọc.”

## Slide 4 — EA và StarUML: kết quả và công sức thao tác (65 giây)

**Trên slide:** Dùng hai cột, mỗi cột một ảnh và hai dòng nhận xét.

| Enterprise Architect | StarUML + Java extension |
|---|---|
| Có diagram theo package và quan hệ lớp | Có overview/hierarchy qua extension |
| Quy trình gom tổng quan đang thử cần chọn, kéo class và thêm phần tử liên quan | Lần thử của nhóm cần nhiều thao tác kéo thả, gom class và chỉnh bố cục |

**Ảnh:**

- `docs/Anh_EnterpriseArchitect/1.jpg`: sơ đồ model.
- `docs/Anh_EnterpriseArchitect/2.jpg`: dùng khi muốn minh họa tổng quan thay ảnh trên.
- `docs/Anh_StarUML/1.jpg`: sơ đồ model và Model Explorer.
- `docs/Anh_StarUML/2.jpg`: có thể dùng làm vùng phụ minh họa các phần còn rời nhau.

Không đặt cả bốn ảnh nhỏ trên cùng một slide. Chọn một ảnh mỗi công cụ, phóng phần cần nói.

**Lời nói gợi ý:**

“EA đã tạo được sơ đồ theo package và có quan hệ giữa các entity, gồm association và kế thừa. Khi gom sơ đồ tổng quan, quy trình nhóm đang thử cần tìm đúng class trong Browser, kéo vào diagram rồi dùng Insert Related Elements. Việc phân biệt class và diagram cũng làm phát sinh thao tác làm lại. Với StarUML, Java extension có tùy chọn tạo sơ đồ, nhưng để có tổng quan mong muốn, nhóm vẫn phải kéo thả và chỉnh nhiều. Vì vậy, nhóm đánh giá cả công sức hoàn thành tác vụ, không chỉ giao diện đẹp hoặc việc import thành công.”

## Slide 5 — Vì sao chọn Visual Paradigm? (100 giây)

**Trên slide:**

- Chọn package → tạo Class Diagram, ít phải kéo từng class.
- Có sơ đồ tổng quan và sơ đồ riêng cho package model.
- Người thực nghiệm đánh giá thuận tiện, dễ sử dụng nhất trong tác vụ đã thử.

**Bố cục:** Ảnh tổng quan chiếm phần lớn slide; thêm một vùng phóng to quan hệ entity hoặc ba nhãn nhận xét. Không chèn radar điểm số.

**Ảnh:**

- Tổng quan: `docs/Anh_VisualPara/1793196676310_1784582928794907455_6260660485963750169_897aa58491780a8a80385b044e8bb517.jpg`.
- Sơ đồ model riêng: `docs/Anh_VisualPara/1793203029897_1784582928794907455_6260660485963750169_8498bb5ef4dd8c4ebe2f84aba51e5261.jpg`.
- Ảnh model còn lại có thể để dự phòng: `docs/Anh_VisualPara/1793196698604_1784582928794907455_6260660485963750169_01af1741e03f20fc4dfe532fa32351ec.jpg`.

**Lời nói gợi ý:**

“Với Visual Paradigm, nhóm chọn package rồi tạo Class Diagram mà không cần kéo từng class lên trang. Ảnh tổng quan cho thấy các package Controller, Service, Repository và Model cùng những quan hệ được hiển thị. Khi muốn tập trung vào entity, nhóm chọn riêng package model để tạo một sơ đồ dễ quan sát hơn. Trên hình, bốn lớp Customer, Order, OrderItem và Product kế thừa BaseEntity; giữa các lớp cũng có association. Khi xem sơ đồ tổng quan, nhóm có thể theo dõi OrderService và các repository liên quan để chuẩn bị phân tích một thay đổi nghiệp vụ. Điểm nhóm đánh giá cao là giảm công sức gom phần tử và dễ tạo đúng sơ đồ cần dùng. Đây là lý do chọn VP trong lần thực nghiệm này; không phải khẳng định EA và StarUML không có chức năng tự động.”

Thời lượng gồm khoảng 20–25 giây chỉ vào các quan hệ trên ảnh. Không đọc hết thuộc tính và phương thức.

## Slide 6 — Kết luận và giới hạn (30 giây)

**Trên slide:**

- Chọn **Visual Paradigm** cho tác vụ reverse Java → Class Diagram.
- Căn cứ: tự động hóa và dễ sử dụng trong thực nghiệm.
- Giới hạn: chưa đo hiệu năng; round-trip là hướng kiểm chứng tiếp theo.

**Lời nói gợi ý:**

“Nhóm chọn Visual Paradigm vì quy trình tạo Class Diagram thuận tiện và giảm thao tác thủ công trong bài thử. Kết luận giới hạn ở mã mẫu và các thao tác đã thực hiện; nhóm chưa đo hiệu năng hay xác nhận round-trip an toàn. Qua thực nghiệm, nhóm thấy sơ đồ lớp hữu ích để đọc hiểu cấu trúc và chuẩn bị bảo trì. Xin cảm ơn thầy cô và các bạn.”

## Ghi chú bàn giao và diễn tập

- Nguồn nhận xét: `docs/05_DANH_GIA_VA_LUA_CHON_CONG_CU.md`.
- Người làm slide cần điền tên nhóm, MSSV và giảng viên từ thông tin thật; không tự điền.
- Kiểm tra ảnh tổng quan VP đúng nội dung trước khi đặt; nếu tên ảnh không thuận tiện có thể sao chép với tên dễ nhớ, giữ bản gốc.
- Chỉ nêu kết quả ảnh chứng minh và trải nghiệm người thực nghiệm. Không ghi “100% chính xác”, tỷ lệ thời gian tiết kiệm hay “chỉ vẽ tay” cho EA/StarUML.
- Bấm giờ diễn tập một lượt; nếu quá giờ, cắt chi tiết thao tác EA, giữ phần minh chứng và lý do chọn VP.
- Đây là dàn ý và lời thoại để dựng slide, chưa phải file PowerPoint đã hoàn thành.
