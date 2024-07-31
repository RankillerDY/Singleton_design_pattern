# Singleton Design Pattern

## Mô tả

Dự án này minh họa việc áp dụng các phiên bản khác nhau của Singleton Design Pattern trong Java. Singleton Design Pattern là một trong những design pattern phổ biến thuộc nhóm Creational Pattern, nhằm đảm bảo rằng một lớp chỉ có duy nhất một instance và cung cấp một điểm truy cập toàn cục cho instance đó.

### Singleton Design Pattern

Singleton Design Pattern được sử dụng khi bạn muốn hạn chế số lượng instance của một lớp nhất định chỉ còn một duy nhất. Điều này hữu ích trong nhiều tình huống, chẳng hạn như khi bạn cần một đối tượng duy nhất để quản lý kết nối cơ sở dữ liệu hoặc cấu hình toàn cục của ứng dụng.

#### Đặc điểm chính của Singleton Design Pattern:
- **Một instance duy nhất**: Đảm bảo chỉ có một instance của lớp được tạo ra trong suốt vòng đời của ứng dụng.
- **Điểm truy cập toàn cục**: Cung cấp một phương thức toàn cục để truy cập instance duy nhất này.

#### Lợi ích của Singleton Design Pattern:
- **Tiết kiệm tài nguyên**: Tránh việc tạo ra nhiều instance không cần thiết, tiết kiệm bộ nhớ và tài nguyên hệ thống.
- **Quản lý trạng thái nhất quán**: Duy trì trạng thái nhất quán của một đối tượng duy nhất trong suốt vòng đời của ứng dụng.

### Các phiên bản của Singleton Design Pattern

Dự án này bao gồm bốn phiên bản khác nhau của Singleton Design Pattern:

1. **Double-Check Locking Singleton**: Đảm bảo an toàn trong môi trường đa luồng bằng cách sử dụng double-check locking.
2. **Eager Initialization Singleton**: Instance được khởi tạo ngay khi lớp được tải vào bộ nhớ.
3. **Lazy Initialization Singleton**: Instance chỉ được khởi tạo khi nó được yêu cầu lần đầu tiên.
4. **Thread-Safe Singleton**: Đảm bảo an toàn trong môi trường đa luồng bằng cách sử dụng từ khóa synchronized.

## Cài đặt và sử dụng

### Yêu cầu hệ thống

- Java Development Kit (JDK) 8 trở lên.

### Hướng dẫn cài đặt

1. **Clone repository:**
   ```bash
   git clone https://github.com/RankillerDY/singleton-design-pattern.git
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
```

### DoubleCheckLocking/ClientInstance.java

```java
public class ClientInstance {
    private static volatile ClientInstance instance;

    private ClientInstance() {
        // private constructor to prevent instantiation
    }

    public static ClientInstance getInstance() {
        if (instance == null) {
            synchronized (ClientInstance.class) {
                if (instance == null) {
                    instance = new ClientInstance();
                }
            }
        }
        return instance;
    }
}
```

### EagerInitialization/ClientInstance.java

```java
public class ClientInstance {
    private static final ClientInstance instance = new ClientInstance();

    private ClientInstance() {
        // private constructor to prevent instantiation
    }

    public static ClientInstance getInstance() {
        return instance;
    }
}
```

### LazyInitialization/ClientInstance.java

```java
public class ClientInstance {
    private static ClientInstance instance;

    private ClientInstance() {
        // private constructor to prevent instantiation
    }

    public static ClientInstance getInstance() {
        if (instance == null) {
            instance = new ClientInstance();
        }
        return instance;
    }
}
```

### ThreadSafe/ClientInstance.java

```java
public class ClientInstance {
    private static ClientInstance instance;

    private ClientInstance() {
        // private constructor to prevent instantiation
    }

    public static synchronized ClientInstance getInstance() {
        if (instance == null) {
            instance = new ClientInstance();
        }
        return instance;
    }
}
```
