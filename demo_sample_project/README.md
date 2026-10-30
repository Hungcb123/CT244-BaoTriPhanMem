# DỰ ÁN MẪU JAVA SPRING BOOT PHỤC VỤ THỰC NGHIỆM REVERSE ENGINEERING

Thư mục này chứa mã Java mô phỏng kiến trúc phân tầng Controller - Service - Repository - Entity để thử nghiệm reverse engineering trên ba công cụ. Các entity đã có annotation Jakarta Persistence (JPA); controller, service và repository vẫn là Java thuần, chưa phải ứng dụng Spring Boot chạy được.

## Chuẩn bị chạy lại phép thử

- Import lại cùng thư mục `src/main/java` vào cả ba công cụ, ưu tiên project mới để tránh trộn mô hình cũ và mới.
- `Customer`, `Order`, `OrderItem`, `Product` có `@Entity` và `@Table`; `BaseEntity` có `@MappedSuperclass`, `@Id` và ID tự sinh. `BaseEntity` không có bảng riêng.
- Các khóa ngoại kỳ vọng: `orders.customer_id → customers.id`, `order_items.order_id → orders.id`, `order_items.product_id → products.id`.
- `Customer.orders` và `Order.items` là phía `mappedBy`; kiểm tra công cụ có đọc đúng phía sở hữu quan hệ hay chỉ nhận diện kiểu field Java.
- Tên entity JPA của lớp `Order` là `CustomerOrder` để tránh từ khóa truy vấn `ORDER`; tên bảng là `orders`.
- Build với JDK 17 trở lên và Maven: `mvn -f demo_sample_project/pom.xml compile` (chạy từ thư mục gốc). Maven tải dependency JPA ở lần đầu.
- POM cung cấp API để biên dịch annotation, chưa cấu hình persistence provider hay kết nối CSDL. Build thành công chưa chứng minh công cụ UML chuyển JPA sang ERD đúng.

Chụp lại cấu hình import, phiên bản công cụ/extension, sơ đồ và các PK/FK thực sự được tạo trước khi cập nhật bảng đánh giá trong `docs`.

---

## 1. Cấu trúc mã nguồn mẫu sẵn có trong thư mục

Mã nguồn mô phỏng một hệ thống Quản lý Đơn hàng (Order Management System - E-Commerce Mini):

```text
demo_sample_project/src/main/java/com/maintenance/demo/
├── controller/
│   ├── CustomerController.java      # REST API quản lý khách hàng
│   └── OrderController.java         # REST API quản lý đơn hàng
├── service/
│   ├── CustomerService.java         # Xử lý nghiệp vụ khách hàng
│   └── OrderService.java            # Xử lý nghiệp vụ đơn hàng & thanh toán
├── repository/
│   ├── CustomerRepository.java      # Giao tiếp cơ sở dữ liệu Khách hàng
│   ├── OrderRepository.java         # Giao tiếp cơ sở dữ liệu Đơn hàng
│   └── ProductRepository.java       # Giao tiếp cơ sở dữ liệu Sản phẩm
└── model/
    ├── BaseEntity.java              # Lớp cơ sở chứa id, createdAt, updatedAt
    ├── Customer.java                # Thực thể Khách hàng
    ├── Order.java                   # Thực thể Đơn hàng (liên kết Customer)
    ├── OrderItem.java               # Chi tiết đơn hàng (bảng trung gian N-N)
    └── Product.java                 # Thực thể Sản phẩm
```

---

## 2. Các mối quan hệ Hướng đối tượng & Cơ sở dữ liệu mẫu sẵn có

Khi thực hiện **Instant Reverse** trong Visual Paradigm, công cụ sẽ tự động nhận diện và vẽ nên các mối quan hệ:

1. **Quan hệ Kế thừa (Inheritance):**`Customer`, `Order`, `Product`, `OrderItem` đều kế thừa từ `BaseEntity`.
2. **Quan hệ Một - Nhiều (One-to-Many / Many-to-One):**
   - Một `Customer` có danh sách nhiều `Order`.
   - Một `Order` có danh sách nhiều `OrderItem`.
   - Mỗi `OrderItem` tham chiếu tới một `Product`.
3. **Quan hệ Phụ thuộc phân tầng (Dependency Injection):**
   - `OrderController` $\rightarrow$ gọi `OrderService`.
   - `OrderService` $\rightarrow$ gọi `OrderRepository`, `ProductRepository`, `CustomerRepository`.

---

## 3. Cách thực hiện Reverse nhanh trong Visual Paradigm:

1. Mở **Visual Paradigm**.
2. Chọn menu **Tools** $\rightarrow$ **Code** $\rightarrow$ **Instant Reverse** $\rightarrow$ **Java...**
3. Nhấn **Add Source Folder** $\rightarrow$ Chọn đường dẫn:`d:\Project_CT210H_BaoTriPhanMem\demo_sample_project\src\main\java`
4. Chọn toàn bộ package $\rightarrow$ Nhấn **Finish**. Biểu đồ sẽ xuất hiện ngay lập tức!
