# DỰ ÁN MẪU JAVA SPRING BOOT PHỤC VỤ THỰC NGHIỆM REVERSE ENGINEERING

Thư mục này chứa sẵn một bộ mã nguồn Java Backend tiêu chuẩn theo kiến trúc phân tầng (Layered Architecture: Controller - Service - Repository - Entity) để nhóm có thể **mở Visual Paradigm và thực hành Kỹ thuật đảo ngược ngay lập tức** mà không cần mất thời gian cài đặt cơ sở dữ liệu hay tải thư viện nặng.

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

1. **Quan hệ Kế thừa (Inheritance):**  
   `Customer`, `Order`, `Product`, `OrderItem` đều kế thừa từ `BaseEntity`.
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
3. Nhấn **Add Source Folder** $\rightarrow$ Chọn đường dẫn:  
   `d:\Project_CT210H_BaoTriPhanMem\demo_sample_project\src\main\java`
4. Chọn toàn bộ package $\rightarrow$ Nhấn **Finish**. Biểu đồ sẽ xuất hiện ngay lập tức!
