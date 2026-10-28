# NỘI DUNG VÀ ĐỀ CƯƠNG CHI TIẾT BÁO CÁO TỔNG KẾT (FILE WORD)
## BÀI TẬP NHÓM SỐ 1 - MÔN BẢO TRÌ PHẦN MỀM (CT210H)

> **Ghi chú định dạng bắt buộc theo yêu cầu giảng viên:**
> - **Font:** Times New Roman, Size 13pt.
> - **Giãn dòng (Line spacing):** 1.2 - 1.3 lines; After: 3pt - 6pt.
> - **Căn lề (Margins):** Top: 2cm, Bottom: 2cm, Left: 3cm (để đóng gáy), Right: 2cm. Khổ giấy: A4.
> - **Cấu trúc bắt buộc:** Trang bìa $\rightarrow$ Trang mục lục $\rightarrow$ Trang kế hoạch thực hiện $\rightarrow$ Nội dung báo cáo $\rightarrow$ Kết luận $\rightarrow$ Tài liệu tham khảo.

---

# [MẪU TRANG BÌA]

```text
                    BỘ GIÁO DỤC VÀ ĐÀO TẠO
                   TRƯỜNG ĐẠI HỌC CẦN THƠ
                 TRƯỜNG CÔNG NGHỆ THÔNG TIN VÀ TRUYỀN THÔNG
                         KHOA CÔNG NGHỆ PHẦN MỀM
                             ----------------***----------------


                      BÁO CÁO BÀI TẬP NHÓM SỐ 1
                     MÔN HỌC: BẢO TRÌ PHẦN MỀM (CT210H)

                     ĐỀ TÀI:
         NGHIÊN CỨU VÀ ỨNG DỤNG CÔNG CỤ KỸ THUẬT ĐẢO NGƯỢC
      (REVERSE ENGINEERING) TRONG BẢO TRÌ HỆ THỐNG JAVA SPRING BOOT
                  VỚI CÔNG CỤ VISUAL PARADIGM


                 Giảng viên hướng dẫn:  [Họ và tên Giảng viên]
                 Lớp học phần:         CT210H - Nhóm [xx]
                 Học kỳ:               [Học kỳ / Năm học]

                 Nhóm sinh viên thực hiện:
                 1. [Họ và tên SV 1]     - MSSV: [Bxxxxxxx] (Nhóm trưởng)
                 2. [Họ và tên SV 2]     - MSSV: [Bxxxxxxx]
                 3. [Họ và tên SV 3]     - MSSV: [Bxxxxxxx]
                 4. [Họ và tên SV 4]     - MSSV: [Bxxxxxxx]


                             Cần Thơ, Tháng ... / 2026
```

---

# MỤC LỤC BÁO CÁO

- **LỜI CẢM ƠN**
- **DANH MỤC TỪ VIẾT TẮT**
- **DANH MỤC HÌNH ẢNH VÀ BẢNG BIỂU**
- **TRANG KẾ HOẠCH THỰC HIỆN VÀ PHÂN CÔNG NHIỆM VỤ**
- **CHƯƠNG 1: TỔNG QUAN VỀ KỸ THUẬT ĐẢO NGƯỢC TRONG BẢO TRÌ PHẦN MỀM**
  - 1.1. Khái niệm Kỹ thuật đảo ngược (Reverse Engineering) theo chuẩn công nghệ phần mềm
  - 1.2. Phân biệt Reverse Engineering với Decompiler (Dịch ngược) và Forward Engineering
  - 1.3. Vai trò của Reverse Engineering trong 4 loại hình bảo trì phần mềm (Corrective, Adaptive, Perfective, Preventive)
  - 1.4. Thách thức thực tế khi bảo trì hệ thống Backend Java Spring Boot hiện đại
- **CHƯƠNG 2: KHẢO SÁT VÀ ĐÁNH GIÁ CÁC CÔNG CỤ REVERSE ENGINEERING PHỔ BIẾN**
  - 2.1. Giới thiệu 3 công cụ được khảo sát
    - 2.1.1. Visual Paradigm
    - 2.1.2. Enterprise Architect (Sparx Systems)
    - 2.1.3. StarUML (kèm tiện ích mở rộng Java Reverse)
  - 2.2. Bảng ma trận so sánh và đánh giá đa tiêu chí
  - 2.3. Đề xuất lựa chọn công cụ tối ưu cho đề tài: Lý do chọn Visual Paradigm
- **CHƯƠNG 3: TÌM HIỂU CHUYÊN SÂU CÁC TÍNH NĂNG CỦA CÔNG CỤ VISUAL PARADIGM**
  - 3.1. Tổng quan kiến trúc và giao diện làm việc của Visual Paradigm
  - 3.2. Tính năng Instant Reverse Java Source Code sang Class Diagram
  - 3.3. Tính năng trích xuất Entity-Relationship Diagram (ERD) từ JPA/Hibernate Entities
  - 3.4. Tính năng Round-trip Engineering (Đồng bộ hai chiều giữa Model và Code)
  - 3.5. Tính năng xuất tài liệu báo cáo kỹ thuật tự động (Doc. Composer)
- **CHƯƠNG 4: XÂY DỰNG VÀ THỰC HIỆN CHUỖI KỊCH BẢN THỰC NGHIỆM MINH HỌA**
  - 4.1. Giới thiệu hệ thống thực nghiệm: Ứng dụng Backend Java Spring Boot (Spring PetClinic / E-Commerce API)
  - 4.2. Kịch bản 1: Đảo ngược cấu trúc Controller - Service - Repository sang Class Diagram phân tầng
  - 4.3. Kịch bản 2: Đảo ngược các thực thể JPA thành sơ đồ cơ sở dữ liệu ERD
  - 4.4. Kịch bản 3: Thực hiện Round-trip Engineering khi thêm thuộc tính nghiệp vụ mới
  - 4.5. Kịch bản 4 (Mở rộng chuyên sâu): Kết hợp AI trong phân tích tác động thay đổi (AI-Augmented Change Impact Analysis)
- **CHƯƠNG 5: KẾT LUẬN VÀ HƯỚNG PHÁT TRIỂN**
  - 5.1. Những kết quả nhóm đã đạt được
  - 5.2. Thuận lợi và khó khăn trong quá trình nghiên cứu
  - 5.3. Hướng nghiên cứu và ứng dụng mở rộng
- **TÀI LIỆU THAM KHẢO**

---

# NỘI DUNG CHI TIẾT TỪNG CHƯƠNG (BẢN DỰ THẢO HOÀN CHỈNH)

## CHƯƠNG 1: TỔNG QUAN VỀ KỸ THUẬT ĐẢO NGƯỢC TRONG BẢO TRÌ PHẦN MỀM

### 1.1. Khái niệm Kỹ thuật đảo ngược (Reverse Engineering)
Theo định nghĩa kinh điển của Chikofsky và Cross (IEEE Software, 1990):
> *"Kỹ thuật đảo ngược (Reverse Engineering) là quá trình phân tích một hệ thống phần mềm nhằm: (1) Nhận dạng các thành phần và mối quan hệ giữa chúng, và (2) Tạo ra các biểu diễn của hệ thống ở mức độ trừu tượng cao hơn (higher level of abstraction)."*

Kỹ thuật đảo ngược **không làm thay đổi chức năng của phần mềm** và **không viết lại phần mềm sang một hệ thống mới**. Mục tiêu hàng đầu của nó là phục vụ công tác đọc hiểu chương trình (Program Comprehension), giúp các kỹ sư bảo trì nắm bắt được thiết kế nguyên bản khi tài liệu thiết kế bị thiếu hụt, lỗi thời hoặc không còn tồn tại.

### 1.2. Phân biệt Reverse Engineering với Decompiler và Forward Engineering
Nhóm làm rõ ranh giới kỹ thuật để trả lời chính xác câu hỏi bản chất của môn học:
- **Forward Engineering (Kỹ thuật chuyển tiếp):** Là quy trình truyền thống đi từ mức trừu tượng cao xuống mức chi tiết thấp (từ Yêu cầu $\rightarrow$ Thiết kế kiến trúc/UML $\rightarrow$ Sinh mã nguồn $\rightarrow$ Kiểm thử).
- **Reverse Engineering (Kỹ thuật đảo ngược):** Đi ngược chiều với Forward Engineering. Bắt đầu từ mã nguồn đã có (Source Code) hoặc tệp thực thi để trích xuất ngược lại mô hình kiến trúc, biểu đồ lớp (Class Diagram), biểu đồ tuần tự (Sequence Diagram), hoặc mô hình dữ liệu (ERD).
- **Decompiler (Công cụ dịch ngược):** Thường chỉ tập trung vào việc biến đổi từ mã máy hoặc bytecode nhị phân (`.class`, `.jar`, `.exe`) trở về dạng mã nguồn lập trình cấp cao tương đương (như Java, C#) ở cùng mức trừu tượng của code, không có chức năng trừu tượng hóa lên mức mô hình kiến trúc UML như Reverse Engineering.

### 1.3. Vai trò của Reverse Engineering trong 4 loại hình bảo trì phần mềm
Trong vòng đời phần mềm, chi phí bảo trì chiếm từ 60% đến 80% tổng chi phí. Trong đó, thời gian kỹ sư dành cho việc đọc hiểu mã nguồn cũ (Comprehension) chiếm hơn 50% thời gian bảo trì. Kỹ thuật đảo ngược đóng vai trò then chốt:

1. **Bảo trì sửa lỗi (Corrective Maintenance):** Khi xảy ra lỗi (Bug) trong hệ thống lớn, việc đảo ngược mã nguồn giúp vẽ nên bản đồ phụ thuộc (Dependency Graph), giúp khoanh vùng chính xác module gây lỗi và luồng tương tác giữa các lớp.
2. **Bảo trì thích nghi (Adaptive Maintenance):** Khi chuyển đổi môi trường (nâng cấp phiên bản Spring Boot, đổi hệ quản trị cơ sở dữ liệu), Reverse Engineering giúp trích xuất lược đồ thực thể để chuẩn bị kế hoạch migration an toàn.
3. **Bảo trì hoàn thiện (Perfective Maintenance):** Khi thêm tính năng mới, kỹ sư cần hiểu rõ kiến trúc hiện tại để tích hợp module mới mà không vi phạm nguyên lý thiết kế (SOLID, Clean Architecture).
4. **Bảo trì phòng ngừa (Preventive Maintenance):** Phục vụ hoạt động Tái cấu trúc (Refactoring). Bằng cách đảo ngược ra sơ đồ lớp, kỹ sư dễ dàng phát hiện các "mùi mã" (Code Smells) như *God Class* (lớp chứa quá nhiều trách nhiệm), các vòng phụ thuộc chéo (Cyclic Dependencies) để tiến hành tái cấu trúc trước khi hệ thống sụp đổ.

### 1.4. Thách thức thực tế khi bảo trì hệ thống Backend Java Spring Boot
Các dự án Java Spring Boot trong doanh nghiệp thường có kích thước rất lớn với hàng trăm Class, sử dụng cơ chế Dependency Injection (IoC Container) và các Annotation phức tạp (`@RestController`, `@Service`, `@Repository`, `@Entity`, `@Transactional`). 
Khi kỹ sư mới tiếp nhận một hệ thống "Legacy" (đã phát triển nhiều năm, tài liệu Word/Confluence không được cập nhật):
- Không thể đọc chay từng file `.java` để hình dung bức tranh tổng thể.
- Mối quan hệ giữa các bảng trong cơ sở dữ liệu thông qua JPA Hibernate (`@OneToMany`, `@ManyToMany`) rất dễ gây ra lỗi hiệu năng N+1 queries nếu không có sơ đồ ERD trực quan.
Do đó, một công cụ Reverse Engineering chuyên dụng là cứu cánh bắt buộc.

---

## CHƯƠNG 2: KHẢO SÁT VÀ ĐÁNH GIÁ CÁC CÔNG CỤ REVERSE ENGINEERING PHỔ BIẾN

*(Chi tiết cơ sở lý thuyết, phân tích 6 Factors chuyên sâu và cẩm nang bảo vệ phản biện xem tại: docs/05_DANH_GIA_VA_LUA_CHON_CONG_CU.md)*

### 2.1. Giới thiệu 3 công cụ được khảo sát

#### 2.1.1. Visual Paradigm
- **Nhà phát triển:** Visual Paradigm International.
- **Mục đích sử dụng:** Bộ công cụ thiết kế UML, SysML, BPMN, Enterprise Architecture và hỗ trợ quy trình công nghệ phần mềm hoàn chỉnh.
- **Khả năng Reverse:** Cung cấp tính năng *Instant Reverse* hỗ trợ trực tiếp ngôn ngữ Java (cả Source Code `.java` và Bytecode `.class`/`.jar`), C++, C#, PHP, Python sang Class Diagram, Sequence Diagram, và trích xuất ERD từ Hibernate/JPA.
- **Phiên bản:** Có Community Edition (phiên bản miễn phí hỗ trợ tốt cho học tập/nghiên cứu) và bản thương mại chuyên sâu.

#### 2.1.2. Enterprise Architect (Sparx Systems)
- **Nhà phát triển:** Sparx Systems (Úc).
- **Mục đích sử dụng:** Một trong những công cụ mô hình hóa mạnh mẽ nhất trong môi trường doanh nghiệp lớn, tích hợp quản lý yêu cầu, kiến trúc hệ thống và kiểm thử.
- **Khả năng Reverse:** Hỗ trợ kỹ thuật đảo ngược rất nhiều ngôn ngữ, bao gồm Java. Khả năng phân tích sâu cấu trúc thư viện và tích hợp mã nguồn lớn.
- **Phiên bản:** Phần mềm thương mại đóng gói, thời gian dùng thử (Trial) giới hạn trong 30 ngày, giao diện tương đối phức tạp đối với sinh viên và dự án quy mô vừa.

#### 2.1.3. StarUML (kèm tiện ích mở rộng Java Reverse)
- **Nhà phát triển:** MKLabs Co., Ltd.
- **Mục đích sử dụng:** Công cụ mô hình hóa phần mềm tinh gọn, hiện đại hỗ trợ chuẩn UML 2.x, SysML và Data Modeling (ERD), phát triển trên nền tảng Electron đa nền tảng (Windows, macOS, Linux).
- **Khả năng Reverse:** Hỗ trợ kỹ thuật đảo ngược mã nguồn Java thông qua tiện ích mở rộng chính thức (*Java Extension / Java Reverse*) được tích hợp sẵn trong *Extension Manager*. Cho phép người dùng duyệt thư mục mã nguồn `.java` để phân tích cấu trúc class, interface, method, attribute và tự động trích xuất vào cây mô hình Model Explorer để đưa lên Class Diagram.
- **Hạn chế:** Tiện ích Java Reverse của StarUML chủ yếu nhận diện các cấu trúc hướng đối tượng thuần túy, chưa phân tích chuyên sâu các Annotation đặc thù của Spring Boot (`@Autowired`, `@RestController`) và không tự động ánh xạ JPA sang sơ đồ quan hệ thực thể ERD; tính năng đồng bộ hai chiều (Round-trip) chỉ ở mức cơ bản; không có công cụ sinh báo cáo kỹ thuật toàn diện dạng Doc. Composer như Visual Paradigm.

### 2.2. Bảng ma trận so sánh và đánh giá đa tiêu chí

Nhóm xây dựng thang điểm đánh giá từ 1 đến 5 sao ($\bigstar$) dựa trên 6 tiêu chí kỹ thuật phục vụ môn học Bảo trì phần mềm:

| Tiêu chí đánh giá | Visual Paradigm | Enterprise Architect | StarUML (Java Ext) |
|:---|:---:|:---:|:---:|
| **1. Khả năng Reverse Engineering mã Java** | $\bigstar\bigstar\bigstar\bigstar\bigstar$<br>*(Đảo ngược rất chuẩn từ package, class, method, annotation)* | $\bigstar\bigstar\bigstar\bigstar\bigstar$<br>*(Mạnh mẽ, xử lý được dự án enterprise khổng lồ)* | $\bigstar\bigstar\bigstar\bigstar$<br>*(Đảo ngược tốt class, method; chưa tối ưu sâu annotation Spring Boot)* |
| **2. Hỗ trợ chuẩn UML & Trực quan hóa** | $\bigstar\bigstar\bigstar\bigstar\bigstar$<br>*(Giao diện trực quan, layout tự động phân tầng 1-Click, chuẩn OMG UML)* | $\bigstar\bigstar\bigstar$<br>*(Giao diện đồ sộ, chia vụn diagram theo package, gom sơ đồ toàn hệ thống khá thủ công)* | $\bigstar\bigstar\bigstar$<br>*(Giao diện hiện đại phẳng, nhưng phải kéo thả thủ công từng class lên sơ đồ)* |
| **3. Trích xuất mô hình dữ liệu (ERD từ JPA)** | $\bigstar\bigstar\bigstar\bigstar\bigstar$<br>*(Trích xuất ERD trực tiếp từ Entity Java hoặc DB connection)* | $\bigstar\bigstar\bigstar\bigstar$<br>*(Có hỗ trợ Data Modeling chuyên nghiệp)* | $\bigstar\bigstar$<br>*(Có vẽ ERD thủ công nhưng không tự động trích xuất từ JPA Entity)* |
| **4. Tính năng Round-trip Engineering** | $\bigstar\bigstar\bigstar\bigstar\bigstar$<br>*(Đồng bộ 2 chiều Model $\leftrightarrow$ Code cực tốt)* | $\bigstar\bigstar\bigstar\bigstar$<br>*(Hỗ trợ code synchronization mạnh)* | $\bigstar\bigstar\bigstar$<br>*(Hỗ trợ sinh mã cơ bản, đồng bộ 2 chiều còn hạn chế)* |
| **5. Khả năng tự động xuất báo cáo (Doc. Generator)** | $\bigstar\bigstar\bigstar\bigstar\bigstar$<br>*(Công cụ Doc. Composer xuất tài liệu HTML/Word/PDF mẫu chuẩn)* | $\bigstar\bigstar\bigstar\bigstar$<br>*(Xuất RTF/HTML tốt nhưng template cấu hình phức tạp)* | $\bigstar\bigstar\bigstar$<br>*(Hỗ trợ xuất HTML/PDF sơ bộ, thiếu công cụ soạn mẫu tài liệu linh hoạt)* |
| **6. Khả năng tiếp cận & Chi phí (Bản quyền)** | $\bigstar\bigstar\bigstar\text{\textonehalf}$<br>*(Bản Enterprise là Evaluation 30 ngày; có bản Community miễn phí cơ bản làm dự phòng)* | $\bigstar\bigstar$<br>*(Chỉ có 30 ngày trial, sau đó khóa file, giá license rất đắt)* | $\bigstar\bigstar\bigstar\text{\textonehalf}$<br>*(Cài đặt siêu nhanh ~100MB, Trial Mode không khóa ngày nhưng hiện popup nhắc mua)* |

### 2.3. Đề xuất lựa chọn công cụ tối ưu cho đề tài
Từ bảng phân tích ma trận trên, nhóm quyết định lựa chọn **Visual Paradigm** làm công cụ chính để đi sâu nghiên cứu và xây dựng chuỗi kịch bản thực nghiệm, vì các lý do cốt lõi sau:
1. **Phù hợp tuyệt đối với mục tiêu môn học Bảo trì phần mềm:** Visual Paradigm minh họa rõ nét toàn bộ chu trình kỹ thuật đảo ngược: từ việc nạp mã nguồn $\rightarrow$ trích xuất biểu đồ phân tích $\rightarrow$ điều chỉnh mô hình $\rightarrow$ đồng bộ Round-trip ngược lại mã nguồn.
2. **Khả năng trực quan hóa xuất sắc:** Sơ đồ trích xuất có bố cục phân tầng mạch lạc, giúp sinh viên và giảng viên dễ dàng quan sát luồng dữ liệu của hệ thống Backend Java Spring Boot.
3. **Tính năng Doc. Composer:** Cho phép tự động trích xuất toàn bộ đặc tả lớp, thuộc tính, phương thức ra tài liệu phục vụ bàn giao và lưu trữ trong bảo trì phần mềm.

---

## CHƯƠNG 3: TÌM HIỂU CHUYÊN SÂU CÁC TÍNH NĂNG CỦA CÔNG CỤ VISUAL PARADIGM

### 3.1. Tổng quan giao diện và công nghệ cốt lõi
Visual Paradigm hoạt động dựa trên cơ chế phân tích cú pháp mã nguồn (Source Code Parser) và cây cú pháp trừu tượng (Abstract Syntax Tree - AST). Khi lập trình viên chỉ định thư mục mã nguồn Java, công cụ sẽ:
1. Quét toàn bộ các tệp `.java` hoặc tệp nén `.jar`.
2. Phân tích các định nghĩa `class`, `interface`, `enum`.
3. Nhận dạng các mối quan hệ Hướng đối tượng: Kế thừa (Generalization), Hiện thực hóa (Realization), Kết tập (Aggregation), Hợp thành (Composition), và Phụ thuộc (Dependency).
4. Đưa toàn bộ cấu trúc vào từ điển mô hình (Model Repository) độc lập với mã nguồn.

### 3.2. Tính năng Instant Reverse Java Source Code
- **Cách thức hoạt động:** Người dùng chọn menu `Tools` $\rightarrow$ `Code` $\rightarrow$ `Instant Reverse` $\rightarrow$ `Java`.
- **Lựa chọn phạm vi:** Cho phép chọn từng file cụ thể hoặc toàn bộ cây package. Trong kiến trúc Spring Boot, ta có thể khoanh vùng theo các package chuẩn:
  + `controller`: Lớp tiếp nhận HTTP request.
  + `service`: Lớp xử lý nghiệp vụ trung tâm.
  + `repository`: Lớp truy vấn dữ liệu.
  + `model` / `entity`: Lớp thực thể dữ liệu.
- **Tùy chọn tạo biểu đồ:** Tùy chọn tự động vẽ mới Class Diagram hoặc thêm các phần tử vào một Diagram có sẵn để phân tích mối quan hệ.

### 3.3. Tính năng trích xuất Entity-Relationship Diagram (ERD) từ JPA Entities
Trong bảo trì cơ sở dữ liệu, việc hiểu đúng lược đồ quan hệ giữa các bảng là tối quan trọng:
- Visual Paradigm có khả năng phân tích các JPA Annotations (`@Entity`, `@Table`, `@Id`, `@OneToMany`, `@ManyToOne`, `@JoinColumn`).
- Từ đó tự động ánh xạ cấu trúc Object sang Relational Model (ORM), vẽ nên biểu đồ ERD với đầy đủ Khóa chính (PK), Khóa ngoại (FK) và tính số bội (Cardinality: 1-1, 1-n, n-n).

### 3.4. Tính năng Round-trip Engineering (Đồng bộ hai chiều)
Một trong những nguyên nhân khiến tài liệu kiến trúc bị "lỗi thời" trong bảo trì là vì lập trình viên sửa code nhưng không sửa biểu đồ, hoặc kiến trúc sư sửa biểu đồ nhưng lập trình viên không cập nhật vào code.
- Round-trip Engineering giải quyết triệt để vấn đề này:
  + **Reverse (Code $\rightarrow$ Model):** Trích xuất mã nguồn thực tế thành sơ đồ.
  + **Model Modification:** Kỹ sư tiến hành tái cấu trúc ngay trên sơ đồ trực quan (thêm trường dữ liệu, đổi kiểu dữ liệu, tách lớp).
  + **Generate Code (Model $\rightarrow$ Code):** Visual Paradigm sinh ngược mã nguồn cập nhật vào dự án Java mà vẫn bảo toàn các đoạn code nghiệp vụ bên trong phương thức không bị ghi đè mất mát.

---

## CHƯƠNG 4: XÂY DỰNG VÀ THỰC HIỆN CHUỖI KỊCH BẢN THỰC NGHIỆM MINH HỌA

*(Xem chi tiết từng bước thao tác và hình ảnh tại tài liệu: docs/03_KICH_BAN_DEMO_CHI_TIET.md)*

### Tóm tắt 4 kịch bản thực nghiệm:
- **Kịch bản 1:** Đảo ngược toàn bộ tầng nghiệp vụ của ứng dụng Spring Boot mẫu sang Class Diagram. Phân tích tính kết dính (Cohesion) và độ phụ thuộc (Coupling) giữa Controller và Service.
- **Kịch bản 2:** Đảo ngược các JPA Entities (`Owner`, `Pet`, `Visit`) thành biểu đồ ERD vật lý, kiểm tra tính toàn vẹn quan hệ cha-con.
- **Kịch bản 3:** Thực nghiệm quy trình bảo trì Hoàn thiện (Perfective Maintenance): Bổ sung thuộc tính `emergencyContact` vào thực thể và dùng Round-trip Engineering cập nhật tự động vào mã nguồn Java.
- **Kịch bản 4 (Module mở rộng AI Integration):** Sử dụng LLM kết hợp với sơ đồ đảo ngược để thực hiện **Change Impact Analysis (Phân tích tác động thay đổi)**: Khi thay đổi logic tính phí dịch vụ, AI sẽ tự động lập danh sách các class bị ảnh hưởng và sinh bộ test case kiểm thử hồi quy tương ứng.

---

## CHƯƠNG 5: KẾT LUẬN VÀ HƯỚNG PHÁT TRIỂN

### 5.1. Kết quả đạt được
- Nắm vững vai trò chiến lược của Kỹ thuật đảo ngược trong chu trình bảo trì phần mềm thực tế.
- Khảo sát, so sánh định lượng 3 công cụ hàng đầu và chứng minh tính ưu việt của Visual Paradigm.
- Xây dựng thành công chuỗi kịch bản thực nghiệm trên dự án Java Spring Boot thực tế.
- Đề xuất mô hình kết hợp AI để nâng tầm kỹ thuật đảo ngược truyền thống sang tự động hóa phân tích tác động bảo trì.

### 5.2. Đánh giá ưu điểm và hạn chế
- **Ưu điểm:** Khả năng trực quan hóa cao, tiết kiệm 70% thời gian đọc hiểu code cũ cho kỹ sư mới, hỗ trợ xuất báo cáo hoàn chỉnh.
- **Hạn chế:** Các mối quan hệ lỏng thông qua Dependency Injection và Reflection của Spring Boot đôi khi cần cấu hình lọc thủ công để biểu đồ không bị rối mắt.

### 5.3. Hướng phát triển trong tương lai
Tích hợp các Agentic AI trực tiếp vào CASE tools để tự động đọc biểu đồ UML và tự động sinh mã kiểm thử hồi quy (Regression Test Generation) trong các quy trình CI/CD bảo trì hiện đại.

---

## TÀI LIỆU THAM KHẢO

1. Chikofsky, E. J., & Cross, J. H. (1990). *Reverse Engineering and Design Recovery: A Taxonomy*. IEEE Software, 7(1), 13-17.
2. Ian Sommerville (2015). *Software Engineering (10th Edition)* - Chương Software Evolution & Maintenance.
3. Visual Paradigm Official User Guide (2025/2026). *Instant Reverse Java to Class Diagram & Round-trip Engineering Documentation*.
4. Spring Framework Documentation: *Spring Boot Architecture and Dependency Injection Patterns*.
