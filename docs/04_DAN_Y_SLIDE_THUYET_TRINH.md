# DÀN Ý SLIDE THUYẾT TRÌNH BÁO CÁO TRƯỚC LỚP (POWERPOINT)
## BÀI TẬP NHÓM SỐ 1: BẢO TRÌ PHẦN MỀM (CT210H)
**Chủ đề:** Ứng dụng Kỹ thuật đảo ngược (Reverse Engineering) với Visual Paradigm trong bảo trì hệ thống Java Spring Boot  
**Thời lượng dự kiến:** 12 - 15 phút (bao gồm Live Demo) + 5 phút Q&A  

---

## Cấu trúc tổng thể của Slide Deck

| Slide # | Tiêu đề Slide | Thời lượng | Người trình bày (gợi ý) |
|:---:|:---|:---:|:---:|
| 1 | Trang bìa & Giới thiệu đề tài | 1 phút | Nhóm trưởng |
| 2 | Đặt vấn đề: Thách thức bảo trì hệ thống Legacy | 1 phút | Nhóm trưởng |
| 3 | Khái niệm & Vai trò của Reverse Engineering trong Bảo trì | 1.5 phút | Thành viên 2 |
| 4 | Khảo sát 3 công cụ: Visual Paradigm, EA, IntelliJ | 1.5 phút | Thành viên 2 |
| 5 | Ma trận đánh giá so sánh & Lý do chọn Visual Paradigm | 1 phút | Thành viên 2 |
| 6 | Các tính năng nổi bật của Visual Paradigm | 1.5 phút | Nhóm trưởng |
| 7 | Giới thiệu hệ thống thực nghiệm: Spring Boot Backend | 1 phút | Thành viên 3 |
| 8 | Kịch bản 1: Instant Reverse Controller - Service - Repo | 1.5 phút | Live Demo / Video |
| 9 | Kịch bản 2: Trích xuất ERD từ JPA Entities | 1.5 phút | Live Demo / Video |
| 10 | Kịch bản 3: Round-trip Engineering (Model $\leftrightarrow$ Code) | 1.5 phút | Live Demo / Video |
| 11 | Kịch bản 4: Điểm nhấn mở rộng - AI-Augmented Impact Analysis | 1.5 phút | Nhóm trưởng |
| 12 | Đánh giá ưu nhược điểm & Bài học kinh nghiệm | 1 phút | Thành viên 3 |
| 13 | Kết luận, Hướng phát triển & Lời cảm ơn | 1 phút | Nhóm trưởng |
| 14+ | Phụ lục (Backup Screenshots khi demo) | Dự phòng | Cả nhóm |

---

## Chi tiết nội dung và Lời thoại từng Slide (Speaker Notes)

### SLIDE 1: TRANG TIÊU ĐỀ
- **Tiêu đề lớn:** NGHIÊN CỨU VÀ ỨNG DỤNG CÔNG CỤ KỸ THUẬT ĐẢO NGƯỢC (REVERSE ENGINEERING) TRONG BẢO TRÌ PHẦN MỀM
- **Phụ đề:** Thực nghiệm trên hệ thống Java Spring Boot với công cụ Visual Paradigm & Mở rộng phân tích tác động bằng AI
- **Thông tin:** Môn học: Bảo trì phần mềm (CT210H) - Giảng viên hướng dẫn: [Tên Thầy/Cô] - Nhóm thực hiện: [Tên nhóm & Thành viên].
- 🗣️ **Speaker Note (Lời thoại mở đầu):**  
  *"Kính chào Thầy/Cô và các bạn. Hôm nay nhóm em xin phép đại diện trình bày bài tập nhóm số 1 với chủ đề: Khảo sát và ứng dụng công cụ Kỹ thuật đảo ngược trong bảo trì phần mềm..."*

---

### SLIDE 2: ĐẶT VẤN ĐỀ - CƠN ÁC MỘNG CỦA KỸ SƯ BẢO TRÌ BACKEND
- **Nội dung hiển thị:**
  + Chi phí bảo trì chiếm 60 - 80% ngân sách vòng đời phần mềm.
  + Hơn 50% thời gian của kỹ sư bị tiêu tốn vào việc **"Đọc hiểu mã nguồn" (Program Comprehension)**.
  + Thực trạng hệ thống doanh nghiệp (Java Spring Boot): Dự án qua nhiều thế hệ developer, tài liệu thiết kế (UML, ERD) bị thất lạc hoặc lỗi thời so với mã nguồn thực tế.
- 🗣️ **Speaker Note:**  
  *"Khi một kỹ sư mới bước vào một dự án Spring Boot hàng trăm ngàn dòng code, không ai có thể đọc từng file `.java` để vẽ lại kiến trúc. Nếu sửa đại, nguy cơ phá vỡ hệ thống là cực kỳ cao. Đó là lý do chúng ta cần đến Kỹ thuật đảo ngược."*

---

### SLIDE 3: BẢN CHẤT CỦA REVERSE ENGINEERING TRONG BẢO TRÌ
- **Nội dung hiển thị:**
  + **Định nghĩa (Chikofsky & Cross):** Quá trình phân tích hệ thống mã nguồn có sẵn để trích xuất ra các biểu diễn ở mức trừu tượng cao hơn (Kiến trúc, UML, ERD).
  + **Phân biệt ranh giới:**
    - Không phải Decompiler (Decompiler chỉ dịch từ mã máy ra mã nguồn thô).
    - Ngược chiều với Forward Engineering (Thiết kế $\rightarrow$ Code).
  + Đóng góp vào 4 hình thái bảo trì: Sửa lỗi (Corrective), Thích nghi (Adaptive), Hoàn thiện (Perfective), Phòng ngừa (Preventive - Refactoring).

---

### SLIDE 4: KHẢO SÁT 3 CÔNG CỤ REVERSE ENGINEERING TIÊU BIỂU
- **Nội dung hiển thị (3 cột so sánh trực quan kèm logo):**
  1. **Visual Paradigm:** Chuyên gia CASE tool, mạnh mẽ về UML, Instant Reverse đa ngôn ngữ, hỗ trợ giáo dục và doanh nghiệp.
  2. **Enterprise Architect (Sparx):** Nền tảng mô hình hóa đồ sộ cấp Enterprise, khả năng mở rộng cao nhưng giao diện phức tạp và chỉ có trial 30 ngày.
  3. **IntelliJ IDEA Ultimate Diagram Tool:** Nhanh gọn tích hợp trực tiếp trong IDE của lập trình viên, nhưng chỉ dừng ở mức xem sơ bộ, thiếu công cụ Round-trip và xuất tài liệu toàn diện.

---

### SLIDE 5: MA TRẬN ĐÁNH GIÁ VÀ ĐỀ XUẤT VISUAL PARADIGM
- **Nội dung hiển thị:** Bảng so sánh 6 tiêu chí (Reverse Java, Chuẩn UML, Trích xuất ERD, Round-trip, Xuất báo cáo, Bản quyền/Độ dễ tiếp cận).
- **Kết luận đề xuất:** Nhóm chọn **Visual Paradigm** vì đạt điểm tối ưu giữa tính năng chuyên sâu chuẩn giáo trình bảo trì, tính năng đồng bộ 2 chiều (Round-trip) và có phiên bản Community miễn phí.

---

### SLIDE 6: CÁC TÍNH NĂNG NÒNG CỐT CỦA VISUAL PARADIGM
- **Nội dung hiển thị (Icon + Mô tả ngắn):**
  + 🔄 **Instant Reverse Java:** Quét mã nguồn `.java` và `.jar`, nhận diện cấu trúc phân lớp trong tích tắc.
  + 🗄️ **ORM / JPA to ERD:** Tự động chuyển đổi các Entity chú thích JPA sang biểu đồ quan hệ thực thể cơ sở dữ liệu.
  + 🔁 **Round-trip Synchronization:** Sửa mô hình $\rightarrow$ cập nhật mã nguồn tự động mà không mất logic code cũ.
  + 📄 **Doc. Composer:** Tự động sinh tài liệu kiến trúc kỹ thuật bàn giao dạng Word/PDF/HTML.

---

### SLIDE 7: DỰ ÁN THỰC NGHIỆM - BACKEND SPRING BOOT
- **Nội dung hiển thị:**
  + Sử dụng kiến trúc Spring Boot tiêu chuẩn: Controller, Service, Repository, JPA Entity.
  + Đối tượng kiểm thử: Các module quản lý thực thể nghiệp vụ (`Owner`, `Pet`, `Visit`).

---

### SLIDE 8 $\rightarrow$ SLIDE 10: CHUỖI KỊCH BẢN MINH HỌA (KÈM DEMO TRỰC TIẾP)
*(Chiếu slide tóm tắt kịch bản rồi chuyển sang màn hình Demo live hoặc chiếu video minh họa)*
- **Kịch bản 1 (Slide 8):** Đảo ngược mã nguồn thành Class Diagram phân tầng MVC. (Thấy rõ quan hệ Controller gọi Service/Repo).
- **Kịch bản 2 (Slide 9):** Trích xuất ERD từ JPA Entities. (Xác định các ràng buộc khóa ngoại 1-N).
- **Kịch bản 3 (Slide 10):** Round-trip Engineering: Thêm trường dữ liệu trên Visual Paradigm $\rightarrow$ Mã nguồn Java tự động sinh thuộc tính và Getter/Setter.

---

### SLIDE 11: ĐIỂM NHẤN SÁNG TẠO - AI-AUGMENTED IMPACT ANALYSIS
- **Nội dung hiển thị:**
  + Mô hình kết hợp: **Visual Paradigm (Trích xuất sơ đồ cấu trúc)** $\rightarrow$ **AI Agent (Phân tích rủi ro bảo trì)**.
  + Khi nhận một yêu cầu thay đổi tính năng backend: AI phân tích sơ đồ lớp và chỉ ra chính xác các module bị ảnh hưởng (Direct/Indirect impact), ma trận rủi ro và các bộ Unit Test cần viết bổ sung.
- 🗣️ **Speaker Note:**  
  *"Kỹ thuật đảo ngược truyền thống giúp con người nhìn thấy cấu trúc. Nhưng khi kết hợp với AI, chúng ta nâng cấp lên mức Đánh giá rủi ro và Đề xuất kế hoạch bảo trì tự động."*

---

### SLIDE 12: ĐÁNH GIÁ ƯU NHƯỢC ĐIỂM & BÀI HỌC KINH NGHIỆM
- **Ưu điểm:** Tiết kiệm đáng kể thời gian đọc hiểu mã nguồn; tài liệu hóa kiến trúc luôn đồng bộ với mã nguồn; kiểm soát tốt cấu trúc phân tầng.
- **Hạn chế:** Cần lọc thủ công các lớp cấu hình phụ trợ của Spring Boot để sơ đồ không bị quá tải thông tin.
- **Bài học nhóm tích lũy được:** Nắm vững quy trình bảo trì phần mềm chuyên nghiệp; kỹ năng sử dụng CASE tools trong dự án doanh nghiệp.

---

### SLIDE 13: KẾT LUẬN & HƯỚNG PHÁT TRIỂN
- **Kết luận:** Hoàn thành toàn diện các yêu cầu bài tập nhóm số 1 của môn học; minh chứng công cụ qua kịch bản thực tiễn.
- **Hướng phát triển:** Tích hợp công cụ Reverse Engineering vào pipeline CI/CD để tự động kiểm tra vi phạm kiến trúc mỗi khi developer push code.
- **Cảm ơn & Q&A:** Mời Thầy/Cô và các bạn đặt câu hỏi.

---

## BỘ CÂU HỎI PHẢN BIỆN DỰ KIẾN CỦA GIẢNG VIÊN VÀ CÁCH TRẢ LỜI

1. **Câu hỏi:** *Visual Paradigm đảo ngược từ file `.java` hay file `.class`? Khác nhau thế nào?*
   - **Trả lời:** Visual Paradigm hỗ trợ cả hai. Đảo ngược từ `.java` lấy được đầy đủ tên tham số và comment mã nguồn. Đảo ngược từ `.class` (bytecode) rất hữu ích khi hệ thống chỉ còn các file `.jar` đóng gói của bên thứ ba mà không có source code.
2. **Câu hỏi:** *Làm thế nào để tránh biểu đồ bị rối (spaghetti diagram) khi import cả dự án Spring Boot lớn?*
   - **Trả lời:** Thay vì import toàn bộ project một lúc, nhóm sử dụng chiến lược khoanh vùng: phân chia theo từng package nghiệp vụ cụ thể (Bounded Context) hoặc lọc chỉ hiển thị các class liên quan đến một Use Case nhất định.
3. **Câu hỏi:** *Round-trip engineering có làm mất code xử lý nghiệp vụ bên trong các hàm không?*
   - **Trả lời:** Dạ không, Visual Paradigm sử dụng cơ chế AST merge: công cụ chỉ bổ sung hoặc cập nhật chữ ký phương thức (signature) và trường dữ liệu, toàn bộ thân hàm (method body) cũ được bảo toàn nguyên vẹn.
