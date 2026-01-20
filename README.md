# Task S1.06: Java Generics

**Description**: This task delves into the use of Generic types (Generics) in Java to create reusable, type-safe, and clean code. The project evolves from non-generic classes (based on `Object`) to the implementation of complex generic methods combining fixed types and variable arguments (Varargs).

## 📌 Exercise Statement

The project is divided into two difficulty levels:

### Level 1
- **Exercise 1**: Create a `NoGenericMethods` class that stores three objects of the same type without using generics, demonstrating the necessity of manual casting.
- **Exercise 2**: Create a `Person` class and a generic `printElements()` method that accepts three different data types in any order.

### Level 2
- **These exercises are implemented within the same classes; this is indicated by comments.**
- **Exercise 1 & 2**: Refine the generic method to accept a fixed argument (`String`), a generic argument, and a variable number of generic arguments (`Varargs`), verifying the solution's flexibility.

## ✨ Features
- **Type Safety**: Use of generics to prevent type errors at runtime.
- **Total Flexibility**: Methods capable of receiving any object (`Person`, `String`, `Integer`, etc.).
- **Variable Arguments**: Implementation of `Varargs` to process lists of elements of indefinite length.
- **Type Inference**: Leveraging Java's ability to automatically detect data types passed to methods.

## 🛠 Technologies
- **Language**: Java 17+
- **Build Tool**: Gradle / Maven
- **IDE**: IntelliJ IDEA

## 🚀 Installation and Execution
1. **Clone the repository**:
   ```bash
   git clone [https://github.com/your-username/S1.06-Generics.git](https://github.com/your-username/S1.06-Generics.git)