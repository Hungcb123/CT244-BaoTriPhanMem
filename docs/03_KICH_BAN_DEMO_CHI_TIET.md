# HƯỚNG DẪN THỰC HIỆN THỰC NGHIỆM ĐÁNH GIÁ 3 CÔNG CỤ & KỊCH BẢN CHUYÊN SÂU
## BÀI TẬP NHÓM SỐ 1 - MÔN BẢO TRÌ PHẦN MỀM (CT210H)

> **LƯU Ý QUAN TRỌNG VỀ YÊU CẦU ĐỀ BÀI:**  
> Đề bài yêu cầu: **"Tìm, cài đặt, sử dụng, và đánh giá ít nhất 3 công cụ thuộc loại đã chọn => chọn ra 1 công cụ phù hợp nhất. Cài đặt công cụ đã chọn, sử dụng và tìm hiểu sâu các tính năng..."**  
> Do đó, quy trình thực hiện của nhóm gồm 2 phần rõ rệt:  
> - **PHẦN A:** Cài đặt, chạy thử nghiệm cùng 1 mã nguồn trên **CẢ 3 CÔNG CỤ** để lấy ảnh chụp thực tế và lập bảng đánh giá đối sánh.  
> - **PHẦN B:** Đi sâu vào **CÔNG CỤ ĐƯỢC CHỌN (VISUAL PARADIGM)** với chuỗi 4 kịch bản chuyên sâu (bao gồm Round-trip và AI-Augmented Analysis).

---

# PHẦN A: THỰC NGHIỆM ĐÁNH GIÁ 3 CÔNG CỤ TRÊN CÙNG CODEBASE

Mã nguồn dùng chung để thử nghiệm cả 3 công cụ: Thư mục `demo_sample_project/src/main/java` (hoặc dự án Spring PetClinic).

---

## 1. CÔNG CỤ 1: VISUAL PARADIGM (Bản Community/Standard)

### Cách cài đặt & sử dụng:
1. Tải bản miễn phí từ: `https://www.visual-paradigm.com/download/` (chọn Community Edition).
2. Mở Visual Paradigm $\rightarrow$ Menu **Tools** $\rightarrow$ **Code** $\rightarrow$ **Instant Reverse** $\rightarrow$ **Java...**
3. Bấm **Add Source Folder** $\rightarrow$ Chọn thư mục `demo_sample_project/src/main/java`.
4. Chọn các package `controller`, `service`, `repository`, `model` $\rightarrow$ Nhấn **Finish**.

### Kết quả ghi nhận để đưa vào Báo cáo:
- **Ảnh chụp cần lấy:** Ảnh giao diện Class Diagram phân tầng với đầy đủ thuộc tính, phương thức và mũi tên quan hệ (Inheritance, Realization, Dependency).
- **Nhận xét thực tế:**
  + *Ưu điểm:* Giao diện trực quan xuất sắc, tự động bố trí layout phân tầng (Hierarchical layout) rất đẹp mắt, chuẩn ký hiệu OMG UML. Có tính năng xuất báo cáo Doc. Composer ra file Word/PDF.
  + *Nhược điểm:* Phần mềm chạy trên nền Java Swing nên đôi khi khởi động mất 10-15 giây.

---

## 2. CÔNG CỤ 2: STARUML (KÈM EXTENSION JAVA REVERSE)

### Cách cài đặt & sử dụng StarUML:
1. Mở StarUML (phiên bản Trial Mode).
2. Cài đặt tiện ích mở rộng Java:
   - Menu **Tools** $\rightarrow$ **Extension Manager...**
   - Tìm kiếm từ khóa `Java` $\rightarrow$ Nhấn **Install** tại extension *Java* (hoặc *Java Reverse*). Chờ thông báo Installed thành công.
3. Thực hiện Reverse Engineering:
   - Menu **Tools** $\rightarrow$ **Java** $\rightarrow$ **Reverse Code...**
   - Chọn thư mục mã nguồn: `D:\Project_CT210H_BaoTriPhanMem\demo_sample_project\src\main\java` (hoặc đường dẫn tương đương trên máy).
   - Chọn các file `.java` cần đảo ngược $\rightarrow$ Bấm **Reverse**.
4. Hiển thị lên Diagram:
   - Nhìn sang cột **Model Explorer** bên phải, mở rộng cây `Model` sẽ thấy các class `OrderController`, `OrderService`, `Customer`, `Order`,...
   - Mở Diagram `Main` ở giữa $\rightarrow$ Kéo thả các class từ Model Explorer vào trang vẽ.

### Kết quả ghi nhận để đưa vào Báo cáo:
- **Ảnh chụp cần lấy:** Ảnh chụp giao diện StarUML hiển thị cây mô hình bên phải và Class Diagram ở khung làm việc chính.
- **Nhận xét thực tế:**
  + *Ưu điểm:* Cài đặt siêu nhanh (~100MB), giao diện hiện đại (Modern UI), mượt mà, hỗ trợ xuất ảnh vector SVG/PNG rất sắc nét.
  + *Nhược điểm:* Extension Java Reverse của StarUML chỉ nhận diện cấu trúc OOP cơ bản, chưa nhận diện sâu các Annotation của Spring Boot/JPA; tính năng Round-trip và sinh ERD còn yếu hơn Visual Paradigm.

---

## 3. CÔNG CỤ 3: ENTERPRISE ARCHITECT (SPARX SYSTEMS)

### Cách cài đặt & sử dụng Enterprise Architect:
1. Tải bản dùng thử 30 ngày từ trang chủ Sparx Systems: `https://sparxsystems.com/products/ea/trial/`
2. Tạo mới một EAP/QEAX Project $\rightarrow$ Chọn mô hình mẫu Software Engineering.
3. Thực hiện Reverse Source Code:
   - Menu **Develop** (hoặc **Code**) $\rightarrow$ **Source Code** $\rightarrow$ **Import Binary / Source Directory...**
   - Chọn ngôn ngữ **Java**, trỏ đến thư mục `demo_sample_project/src/main/java`.
   - Chọn tạo tự động Class Diagram cho từng package.

### Kết quả ghi nhận để đưa vào Báo cáo:
- **Ảnh chụp cần lấy:** Ảnh chụp màn hình Project Browser và Class Diagram phân tích quan hệ phụ thuộc trong Enterprise Architect.
- **Nhận xét thực tế:**
  + *Ưu điểm:* Nền tảng mô hình hóa đồ sộ bậc nhất cho doanh nghiệp lớn, hỗ trợ phân tích mã nguồn quy mô hàng triệu dòng code, quản lý truy vết yêu cầu (Traceability) cực mạnh.
  + *Nhược điểm:* Dung lượng cài đặt lớn, giao diện phức tạp với hàng trăm menu con, thời gian dùng thử giới hạn 30 ngày, dốc học tập (learning curve) rất cao đối với sinh viên.

---

## 4. MA TRẬN ĐỐI SÁNH THỰC TẾ GIỮA 3 CÔNG CỤ (DÙNG ĐỂ CHỌN CÔNG CỤ SỐ 1)

| Tiêu chí khảo sát thực tế | Visual Paradigm | Enterprise Architect | StarUML (Java Ext) |
|:---|:---:|:---:|:---:|
| **Thời gian cài đặt & dung lượng** | Trung bình (~500MB) | Nặng (~400MB + cấu hình) | Rất nhanh (~100MB) |
| **Độ chính xác khi nhận diện mã Java** | Rất cao (100% - bắt trọn Annotation) | Rất cao (100% - cấp Enterprise) | Khá (85% - thiếu một số annotation) |
| **Bố cục tự động (Auto Layout)** | Đẹp mắt, tự phân tầng chuẩn 1-Click | Khá thủ công khi gom toàn hệ thống | Thủ công, phải kéo thả từng class |
| **Khả năng trích xuất ERD từ JPA** | Có (rất mạnh qua JPA mapping) | Có (Data Modeling chuyên nghiệp) | Không hỗ trợ tự động từ code JPA |
| **Đồng bộ hai chiều (Round-trip)** | Có (Rất xuất sắc) | Có (Mạnh nhưng phức tạp) | Hạn chế (chỉ sinh mã cơ bản) |
| **Sinh tài liệu kỹ thuật bảo trì** | Có (Doc. Composer linh hoạt) | Có (RTF/HTML template phức tạp) | Hạn chế (chỉ xuất HTML/PDF sơ bộ) |
| **Chi phí bản quyền cho sinh viên** | Bản Enterprise là Evaluation 30 ngày (có Community dự phòng) | Khóa cứng sau 30 ngày trial, license rất đắt | Trial Mode không khóa ngày nhưng hiện popup nhắc mua |

> **KẾT LUẬN LỰA CHỌN:**  
> Dựa trên kết quả thực nghiệm trên cùng mã nguồn, **Visual Paradigm** vượt trội hoàn toàn về các tính năng chuyên sâu cho môn Bảo trì phần mềm (đặc biệt là Round-trip Engineering, trích xuất ERD và xuất tài liệu kỹ thuật). Do đó, nhóm lựa chọn **Visual Paradigm** làm công cụ chính để triển khai sâu ở Phần B.

---

# PHẦN B: CHUỖI 4 KỊCH BẢN CHUYÊN SÂU TRÊN VISUAL PARADIGM

*(Các kịch bản này dùng để thuyết trình trực tiếp và làm nội dung trọng tâm cho Chương 3 & 4 của Báo cáo)*

### KỊCH BẢN 1: ĐẢO NGƯỢC CẤU TRÚC PHÂN TẦNG MVC (CONTROLLER - SERVICE - REPO)
- **Thao tác:** `Tools` $\rightarrow$ `Code` $\rightarrow$ `Instant Reverse` $\rightarrow$ `Java...` $\rightarrow$ Chọn thư mục dự án $\rightarrow$ Tích chọn các lớp $\rightarrow$ Bật `Auto Layout (Hierarchic)`.
- **Minh chứng:** Sơ đồ phân tầng rõ ràng từ Controller $\rightarrow$ Service $\rightarrow$ Repository $\rightarrow$ Entity.

### KỊCH BẢN 2: ĐẢO NGƯỢC JPA ENTITY SANG SƠ ĐỒ CƠ SỞ DỮ LIỆU ERD
- **Thao tác:** Tạo mới biểu đồ ERD $\rightarrow$ Kéo các Entity (`Customer`, `Order`, `Product`, `OrderItem`) từ Model Explorer vào $\rightarrow$ Chuột phải chọn `Synchronize to Entity Relationship Diagram`.
- **Minh chứng:** Sơ đồ CSDL với đầy đủ Khóa chính (PK), Khóa ngoại (FK) và liên kết 1-N.

### KỊCH BẢN 3: ROUND-TRIP ENGINEERING (ĐỒNG BỘ HAI CHIỀU)
- **Thao tác:** Thêm trường `emergencyContact: String` vào lớp `Customer` trên Diagram $\rightarrow$ `Tools` $\rightarrow$ `Code` $\rightarrow$ `Generate Java Code...` (chọn tùy chọn *Merge with existing code*).
- **Minh chứng:** Mở mã nguồn Java kiểm tra thấy trường mới và Getter/Setter tự động xuất hiện mà không mất code cũ.

### KỊCH BẢN 4: AI-AUGMENTED CHANGE IMPACT ANALYSIS (ĐIỂM NHẤN SÁNG TẠO)
- **Thao tác:** Xuất danh sách phụ thuộc từ Visual Paradigm $\rightarrow$ Đưa vào AI Agent với Prompt đánh giá rủi ro bảo trì khi thay đổi quy tắc tính tiền đơn hàng.
- **Minh chứng:** AI phân tích ma trận rủi ro (Risk Matrix), liệt kê chính xác các Service bị ảnh hưởng và sinh test case kiểm thử hồi quy.
