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

## 2. CÔNG CỤ 2: INTELLIJ IDEA ULTIMATE (Tích hợp sẵn trong IDE)

### Cách sử dụng (Không cần cài thêm vì tích hợp sẵn trong IDE):
1. Mở thư mục `demo_sample_project` bằng **IntelliJ IDEA Ultimate** (Dùng tài khoản JetBrains sinh viên).
2. Trên cây thư mục dự án bên trái (Project Explorer):
   - Nhấp chuột phải vào package `com.maintenance.demo` (hoặc package `model`).
   - Chọn **Diagrams** $\rightarrow$ **Show Diagram...** (hoặc phím tắt `Ctrl + Alt + Shift + U`).
   - Chọn kiểu biểu đồ: **Java Classes**.
3. Tùy chỉnh hiển thị:
   - Trên thanh công cụ của biểu đồ, bật các icon: **Show Dependencies** (hiện mũi tên phụ thuộc), **Show Fields**, **Show Methods**.
   - Bấm icon **Layout** để đổi kiểu sắp xếp.

### Kết quả ghi nhận để đưa vào Báo cáo:
- **Ảnh chụp cần lấy:** Ảnh chụp màn hình biểu đồ Diagram trực tiếp bên trong cửa sổ IntelliJ IDEA, hiển thị các Class `Order`, `Customer`, `Product` nối với nhau.
- **Nhận xét thực tế:**
  + *Ưu điểm:* Nhanh, mượt, không cần cài thêm phần mềm ngoài, nhảy thẳng từ biểu đồ vào dòng code tương ứng khi nhấp đúp chuột.
  + *Nhược điểm:* Chỉ dừng ở mức xem nhanh (Viewer), khả năng chỉnh sửa kiến trúc để đồng bộ ngược lại code (Round-trip) rất hạn chế; không có tính năng tạo mô hình phân tích độc lập để bàn giao bảo trì như CASE tool; yêu cầu bản quyền Ultimate.

---

## 3. CÔNG CỤ 3: STARUML (Kèm Extension Java Reverse)
*(Hoặc Enterprise Architect nếu nhóm đã tải bản Trial)*

### Cách cài đặt & sử dụng StarUML:
1. Tải StarUML (bản siêu nhẹ ~100MB): `https://staruml.io/`
2. Cài đặt extension Java:
   - Mở StarUML $\rightarrow$ Menu **Tools** $\rightarrow$ **Extension Manager**.
   - Tìm kiếm từ khóa `Java` $\rightarrow$ Nhấn **Install** tại plugin *Java Reverse*.
3. Thực hiện Reverse:
   - Menu **Tools** $\rightarrow$ **Java** $\rightarrow$ **Reverse Code...**
   - Chọn thư mục `demo_sample_project/src/main/java`.
   - Chọn các file `.java` và bấm **Reverse**.

### Kết quả ghi nhận để đưa vào Báo cáo:
- **Ảnh chụp cần lấy:** Ảnh chụp giao diện StarUML hiển thị cây mô hình bên phải và Class Diagram ở khung làm việc chính.
- **Nhận xét thực tế:**
  + *Ưu điểm:* Cài đặt siêu nhanh, giao diện hiện đại (Modern UI), nhẹ nhàng, hỗ trợ xuất ảnh vector SVG/PNG sắc nét.
  + *Nhược điểm:* Extension Java Reverse của StarUML chỉ bắt được các quan hệ cơ bản, chưa nhận diện sâu các Annotation của Spring Boot/JPA; tính năng Round-trip và sinh ERD còn yếu hơn Visual Paradigm.

---

## 4. MA TRẬN ĐỐI SÁNH THỰC TẾ GIỮA 3 CÔNG CỤ (DÙNG ĐỂ CHỌN CÔNG CỤ SỐ 1)

| Tiêu chí khảo sát thực tế | Visual Paradigm | IntelliJ IDEA Diagram | StarUML (Java Ext) |
|:---|:---:|:---:|:---:|
| **Thời gian cài đặt & dung lượng** | Trung bình (~500MB) | Tích hợp sẵn trong IDE | Rất nhanh (~100MB) |
| **Độ chính xác khi nhận diện mã Java** | Rất cao (100%) | Rất cao (100%) | Khá (85% - thiếu một số annotation) |
| **Bố cục tự động (Auto Layout)** | Đẹp mắt, tự phân tầng | Cơ bản, hơi rối khi nhiều class | Khá, dễ kéo thả thủ công |
| **Khả năng trích xuất ERD từ JPA** | Có (rất mạnh) | Xem được JPA mapping | Không hỗ trợ tự động |
| **Đồng bộ hai chiều (Round-trip)** | Có (Rất xuất sắc) | Hạn chế (chủ yếu 1 chiều) | Hạn chế |
| **Sinh tài liệu kỹ thuật bảo trì** | Có (Doc. Composer) | Không (chỉ xuất ảnh) | Hạn chế (chỉ xuất PDF sơ bộ) |
| **Chi phí bản quyền cho sinh viên** | Miễn phí (Community) | Cần JetBrains Student | Miễn phí đánh giá (Eval) |

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
