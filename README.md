# Singleton Design Pattern

## Mô tả

Dự án này minh họa việc áp dụng Singleton Design Pattern trong Java. Singleton Design Pattern là một trong những design pattern phổ biến thuộc nhóm Creational Pattern, nhằm đảm bảo rằng một lớp chỉ có duy nhất một instance và cung cấp một điểm truy cập toàn cục cho instance đó.

### Singleton Design Pattern

Singleton Design Pattern được sử dụng khi bạn muốn hạn chế số lượng instance của một lớp nhất định chỉ còn một duy nhất. Điều này hữu ích trong nhiều tình huống, chẳng hạn như khi bạn cần một đối tượng duy nhất để quản lý kết nối cơ sở dữ liệu hoặc cấu hình toàn cục của ứng dụng.

#### Đặc điểm chính của Singleton Design Pattern:
- **Một instance duy nhất**: Đảm bảo chỉ có một instance của lớp được tạo ra trong suốt vòng đời của ứng dụng.
- **Điểm truy cập toàn cục**: Cung cấp một phương thức toàn cục để truy cập instance duy nhất này.

#### Lợi ích của Singleton Design Pattern:
- **Tiết kiệm tài nguyên**: Tránh việc tạo ra nhiều instance không cần thiết, tiết kiệm bộ nhớ và tài nguyên hệ thống.
- **Quản lý trạng thái nhất quán**: Duy trì trạng thái nhất quán của một đối tượng duy nhất trong suốt vòng đời của ứng dụng.

## Cài đặt và sử dụng

### Yêu cầu hệ thống

- Java Development Kit (JDK) 8 trở lên.

### Hướng dẫn cài đặt

1. **Clone repository:**
   ```bash
   git clone https://github.com/username/singleton-design-pattern.git
   cd singleton-design-pattern
   ```

2. **Biên dịch các file mã nguồn:**
   ```bash
   javac -d bin src/*.java
   ```

3. **Chạy chương trình:**
   ```bash
   java -cp bin Main
   ```

## Cấu trúc dự án

```plaintext
singleton-design-pattern/
├── DoubleCheckLocking/
│   ├── ClientInstance.java
│   └── Main.java
├── EagerInitialization/
│   ├── ClientInstance.java
│   └── Main.java
├── LazyInitialization/
│   ├── ClientInstance.java
│   └── Main.java
├── ThreadSafe/
│   ├── ClientInstance.java
│   └── Main.java
└── README.md


