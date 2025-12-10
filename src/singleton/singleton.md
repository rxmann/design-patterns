# Singleton Patterns in Java

## 1. Basic Singleton (GoF)

- Lazy initialization
- Single instance created on first access
- **Not thread-safe by default**

```java
public class SingletonGoF {
    private static SingletonGoF instance;
    private SingletonGoF() {}
    public static SingletonGoF getInstance() {
        if (instance == null) instance = new SingletonGoF();
        return instance;
    }
}
```

---

## 2. Thread-Safe Singleton (Synchronized)

- Ensures thread safety
- Uses `synchronized` on `getInstance()`
- Slight performance overhead

```java
public static synchronized SingletonGoF getInstance() { ... }
```

---

## 3. Double-Check Locking (DCL)

- Lazy + thread-safe
- Minimizes synchronization overhead

```java
public static SingletonGoF getInstance() {
    if (instance == null) {
        synchronized(SingletonGoF.class) {
            if (instance == null) instance = new SingletonGoF();
        }
    }
    return instance;
}
```

---

## 4. Bill Pugh Singleton

- Uses static inner class
- Lazy initialization and thread-safe

```java
private static class Holder { static final SingletonGoF INSTANCE = new SingletonGoF(); }
public static SingletonGoF getInstance() { return Holder.INSTANCE; }
```

---

## 5. Enum Singleton

- Thread-safe, reflection-proof, serialization-proof
- Easiest and safest way

```java
public enum SingletonEnum {
    INSTANCE;
}
```

---

## 6. Vulnerable Cases & Fixes

| Vulnerability | Issue                              | Fix                                                       |
| ------------- | ---------------------------------- | --------------------------------------------------------- |
| Cloning       | `clone()` creates new instance     | Override `clone()` and throw `CloneNotSupportedException` |
| Serialization | Deserialization creates new object | Implement `readResolve()`                                 |
| Reflection    | Can invoke private constructor     | Throw exception if instance already exists                |

---

## 7. Eager Initialization Singleton

- Instance created at class load time
- Simple, thread-safe
- Not lazy

```java
private static final SingletonGoF INSTANCE = new SingletonGoF();
public static SingletonGoF getInstance() { return INSTANCE; }
```

---

## Comparison Table

| Pattern              | Thread-Safe | Lazy | Reflection Safe | Serialization Safe | Performance      |
| -------------------- | ----------- | ---- | --------------- | ------------------ | ---------------- |
| Basic GoF            | ❌          | ✅   | ❌              | ❌                 | High risk        |
| Synchronized         | ✅          | ✅   | ❌              | ❌                 | Medium (sync)    |
| Double-Check Locking | ✅          | ✅   | ❌              | ❌                 | High (optimized) |
| Bill Pugh            | ✅          | ✅   | ❌              | ❌                 | High (efficient) |
| Enum                 | ✅          | ✅   | ✅              | ✅                 | High (best)      |
| Eager Initialization | ✅          | ❌   | ❌              | ❌                 | High (simple)    |

---

### Notes

- Use **Enum Singleton** in most cases (safest, simplest).
- Use **Bill Pugh** or **DCL** if you need lazy initialization without Enum.
- Always consider **cloning, serialization, reflection** if you implement classic singletons.
- Eager initialization is simple and thread-safe but not lazy.

---
