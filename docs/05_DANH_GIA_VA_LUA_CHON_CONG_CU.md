# ĐÁNH GIÁ VÀ LỰA CHỌN CÔNG CỤ REVERSE ENGINEERING JAVA

## 1. Phạm vi và bằng chứng

Bài CT210H tập trung vào Java → Class Diagram, đọc hiểu quan hệ lớp, công sức tạo sơ đồ tổng quan và cập nhật mô hình khi bảo trì. Theo quyết định của nhóm ngày 28/10/2026, loại trích xuất sơ đồ cơ sở dữ liệu khỏi phạm vi đánh giá, demo và tính điểm.

Mã dùng chung: `demo_sample_project/src/main/java`. Đây là Java mô phỏng kiến trúc Controller – Service – Repository – Model, có annotation Jakarta Persistence ở các entity; chưa phải ứng dụng Spring Boot chạy hoàn chỉnh. Annotation trong mã không đồng nghĩa công cụ đọc đúng toàn bộ ngữ nghĩa của framework.

Phân biệt ba loại bằng chứng: ảnh kết quả, nhận xét thao tác của người thực nghiệm, và chức năng được tài liệu hãng xác nhận. Không dùng ảnh để suy ra số RAM, thời gian chạy, độ chính xác phần trăm hay hiệu năng trên dự án lớn.

## 2. Kết quả khảo sát

| Tác vụ | Visual Paradigm | Enterprise Architect | StarUML + Java extension |
|---|---|---|---|
| Đảo ngược Java | Đã tạo được Class Diagram có thuộc tính và quan hệ | Đã import và tạo diagram theo package | Đã import và hiển thị mô hình Java |
| Tạo sơ đồ theo package | Chọn package `model` rồi tạo Class Diagram; không cần kéo từng class | Có tùy chọn Create Diagram for each Package khi import | Extension có Package Overview Diagram và Type Hierarchy Diagram |
| Sơ đồ tổng quan liên package | Ảnh cho thấy Controller, Service, Repository và Model cùng các quan hệ liên tầng | Quy trình đang thử: tạo Class Diagram, kéo một class rồi Insert Related Elements; kết quả tổng quan cần hoàn tất | Trong lần thử của nhóm cần nhiều thao tác gom class, kéo thả và chỉnh bố cục |
| Quan hệ lớp | Thấy association và generalization; đối chiếu từng quan hệ với mã | Ảnh có association giữa entity và generalization về BaseEntity | Ảnh có quan hệ entity; Use Association là tùy chọn reverse field thành association |
| Dễ sử dụng trong tác vụ này | Người thực nghiệm đánh giá thuận tiện; ít thao tác khi tạo diagram từ package | Nhiều bước và cần phân biệt class với diagram trong Browser | Giao diện gọn nhưng công sức kéo thả làm giảm sự thuận tiện khi gom sơ đồ |
| Round-trip | Kịch bản cần thực hiện và kiểm tra diff mã | Có code synchronization theo tài liệu; chưa kiểm chứng trên mã mẫu | Có reverse và generate; hai chiều này chưa đủ chứng minh merge an toàn |

Ảnh gốc tham khảo: `VisualParadigmInterface.png`, `VisualP.png`, `EnterpriseArchitecture.png`, `EnterpriseArchitectureInterface.png`, `UMLInterface.png`. Các ảnh mới gửi trong hội thoại cần lưu vào dự án trước khi đóng báo cáo.

## 3. Tiêu chí đánh giá sau khi thu hẹp phạm vi

### Ghi nhận thao tác thực tế của người thực nghiệm — 28/10/2026

- **Enterprise Architect:** Khi làm sơ đồ tổng quan, người thực nghiệm phải tạo Class Diagram, mở cây Browser và kéo class vào trang vẽ trong quy trình đang thử. Đã gặp hộp thoại `Drop Diagram As` do kéo nhầm diagram thay vì class; phải hủy rồi tìm lại đúng phần tử. Bước tiếp theo được hướng dẫn là Insert Related Elements; chưa xác nhận bước này đã tạo đủ sơ đồ tổng quan. Việc phân biệt phần tử, tìm class và kéo thả làm tăng công sức thao tác so với quy trình VP đã thực hiện.
- **StarUML:** Người thực nghiệm báo việc gom class lên sơ đồ bằng kéo thả khá cực, cần nhiều thao tác gom và chỉnh bố cục để có sơ đồ tổng quan mong muốn. Chưa đo thời gian hoặc số lần kéo thả. Đây là hạn chế dễ sử dụng trong tác vụ reverse rồi trình bày toàn hệ thống, dù extension có tùy chọn sinh diagram theo package.
- **Visual Paradigm:** Người thực nghiệm đã chọn package `model` rồi tạo Class Diagram có các class và quan hệ, không cần kéo từng class vào sơ đồ. Người thực nghiệm đánh giá thao tác thuận tiện, dễ làm.

**Áp dụng khi chấm điểm:** Tính cả công sức tìm phần tử, kéo thả, gom sơ đồ và chỉnh bố cục vào tiêu chí tự động hóa và dễ sử dụng. Không đánh giá chỉ dựa vào giao diện đẹp/gọn. Những quan sát này thuộc quy trình nhóm đã thử; không khẳng định EA hoặc StarUML bắt buộc kéo từng class trong mọi cách sử dụng.

| Tiêu chí | Cách ghi nhận | Trạng thái |
|---|---|---|
| Nhận diện lớp và quan hệ Java | Kiểm tra 12 class/interface, field, method, association và kế thừa với mã nguồn | Đã có ảnh; cần checklist đối chiếu |
| Tự động hóa tạo sơ đồ | Số bước từ import đến sơ đồ đủ nội dung; phần phải kéo thả/chỉnh tay | VP thuận tiện nhất theo quan sát hiện tại |
| Dễ sử dụng | Khả năng tìm lệnh, tạo diagram theo package, gom tổng quan | Ghi nhận ưu thế VP trong tác vụ thực nghiệm |
| Round-trip | Thêm field trên model, cập nhật code, reverse lại và kiểm tra code cũ | Chưa chốt kết quả |
| Hiệu năng | Đo cùng máy, cùng mã, cùng điều kiện | Chưa đo; chưa chấm điểm |
| Khả năng tiếp cận | Edition, extension và điều kiện license của đúng bản dùng | Ghi phiên bản khi chốt báo cáo |

Chưa chốt điểm tổng hợp hoặc thứ hạng định lượng. Radar `spider_chart_evaluation.png` minh họa điểm nhận xét tạm thời từ quy trình đã thử, không phải benchmark. Bảng so sánh trực quan được giữ riêng tại `tool_comparison_table.png`.

## 4. Lựa chọn công cụ

Nhóm chọn **Visual Paradigm** để tìm hiểu sâu vì trong thực nghiệm tạo Class Diagram từ mã Java, quy trình chọn package rồi sinh diagram thuận tiện, hiển thị được quan hệ và giảm việc gom class thủ công. Người thực nghiệm đánh giá cao cả tự động hóa và dễ sử dụng.

Đây là kết luận cho tác vụ và mã mẫu của nhóm. EA có tự tạo diagram theo package và Insert Related Elements; StarUML có tùy chọn sinh diagram trong Java extension. Công sức chỉnh sơ đồ thực tế vẫn cần ghi nhận khi so sánh. Không quy đổi cảm nhận thành tỷ lệ tiết kiệm thời gian khi chưa đo.

## 5. Bản quyền và giới hạn

- VP đang dùng Enterprise Evaluation. Community không thay thế Java round-trip; chức năng này có từ Standard theo bảng edition.
- EA Trial hết thời hạn sử dụng sau 30 ngày; điều này không có nghĩa file dự án bị khóa vĩnh viễn. Project trial có thể tiếp tục dùng bằng bản có bản quyền.
- StarUML là phần mềm thương mại; FAQ quy định evaluation 30 ngày. Không lấy việc vẫn mở được phần mềm làm căn cứ nói trial vô thời hạn.
- Không chốt công cụ nhanh nhất, nhẹ nhất hay giá rẻ nhất khi chưa đối chiếu đúng phiên bản và số đo.

## 6. Câu hỏi bảo vệ

**Vì sao chọn VP?** Trong lần thử của nhóm, chọn package rồi tạo Class Diagram có quan hệ thuận tiện hơn; ít phải kéo thả khi làm sơ đồ tổng quan.

**EA và StarUML có tự sinh diagram không?** Có các chức năng được hãng/extension tài liệu hóa. Nhóm so sánh công sức hoàn thành tác vụ, không kết luận hai công cụ hoàn toàn thủ công.

**Round-trip đã thành công chưa?** Chỉ kết luận sau khi có diff trước/sau, build và xác nhận logic cũ còn nguyên. Hiện đây là kịch bản cần kiểm chứng.

**Đóng góp cho bảo trì?** Class Diagram hỗ trợ đọc hiểu phụ thuộc để khoanh vùng sửa lỗi, đánh giá thay đổi môi trường, chuẩn bị mở rộng tính năng và rà soát cấu trúc trước refactoring. Mô hình tĩnh không bảo đảm phản ánh mọi hành vi runtime.

## 7. Tài liệu đối chiếu

- [EA — Import Source Directory](https://sparxsystems.com/enterprise_architect_user_guide/17.1/modeling_domains/revengtree.html)
- [EA — Insert Related Elements](https://www.sparxsystems.org/enterprise_architect_user_guide/17.2/modeling_fundamentals/insertrelatedelements.html)
- [Java extension StarUML — tùy chọn reverse](https://github.com/staruml/staruml-java/blob/master/preferences/preference.json)
- [VP — Java reverse](https://circle.visual-paradigm.com/docs/code-engineering/instant-reverse/how-to-generate-uml-from-java-sources-and-classes/)
- [VP — edition comparison](https://www.visual-paradigm.com/support/edition-comparison.jsp)
- [EA — Trial FAQ](https://www.sparxsystems.org/support/faq/trialinstallation.html)
- [StarUML — FAQ](https://staruml.io/help/)

## 8. Radar minh họa nhận xét tạm thời

Nhãn biểu đồ dùng tiếng Anh, không có nội dung trong ngoặc. Các điểm sau là cách lượng hóa nhận xét của nhóm để minh họa, chưa phải số đo hay điểm cuối cùng được xác nhận. Không tính tổng có trọng số. Các trục có liên quan với nhau nên không dùng chúng như ba phép đo độc lập.

| Criterion | Visual Paradigm | Enterprise Architect | StarUML |
|---|---|---|---|
| Diagram Automation | 4.5 | 3.5 | 2.5 |
| Ease of Use | 4.5 | 3.0 | 2.5 |
| Layout Convenience | 4.0 | 3.0 | 2.5 |

Thang 1–5, điểm cao thể hiện thuận tiện hơn trong quy trình đã thử. Căn cứ là nhận xét chọn package để sinh diagram của VP, bước tìm/kéo class và thêm phần tử liên quan ở EA, cùng công sức gom/chỉnh sơ đồ của StarUML. Không đưa hiệu năng, truy vết doanh nghiệp hay round-trip chưa kiểm chứng vào radar.
