<h1 align="center">🔷 Student Management Application 🔷</h1>

Welcome to the Student Management Application! This project provides a code to manage student information effectively.

## Table of Contents

- [Description](#description) 📝
- [Features](#features) ✨
- [Exercise](#exercise) 🏋️‍♂️
- [Classes](#classes) 📚
- [Usage](#usage) 🚀
- [Tools and Languages](#tools-and-languages) 🔧
- [Execution](#execution) 💻

## Description 📝

The Student Management Application simplifies the process of managing student records, including ID, name, and specialty. It includes meticulously crafted classes to handle various aspects of student information, ensuring seamless creation, modification, and visualization.

## Features ✨

- **Create Students**: Add students to the system with customizable attributes.
- **Flexible Constructors**: Utilize constructors with different parameters to accommodate various student data scenarios.
- **Attribute Modification**: Modify student attributes such as name, ID, and specialty as needed.
- **Efficient Data Management**: Streamline student data management with intuitive methods and classes.

## Exercises 🏋️‍♂️

 ---
### Exercise 1

#### Description 📝

Write the Java code that defines a Student class. Assume that a student is described by their ID (int), name (String), and specialty (String). The class must have:
- a constructor with two parameters m and n to initialize the ID and name.
- a constructor with three parameters m, n, and s to initialize the three attributes.

Write the following code and explain the result obtained by its execution (and the cause of the error if applicable)

```java
public class TestStudent {
    public static void main(String[] arg) {
        Student student1 = new Student("Ahmed"); // (1)
        Student student2 = new Student(); // (2)
        Student student3 = new Student(299, "Ahmed"); // (3)
        student1.specialty = "Computer Science";
        Student student4 = new Student(288, "Ali", "Math"); // (4)
        student4.specialty = student1.specialty;
        System.out.println(student1.name + " " + student1.specialty); // (5)
        System.out.println(student2.name + " " + student2.specialty); // (6)
        student1 = student2;
        student2.name = "Amel";
        System.out.println(student1.name + " " + student1.specialty); // (7)
    }
}

```
## Classes 📚

### Student.java 🎓

- Represents a student with attributes such as ID, name, and specialty.
- Provides constructors to create student objects with different parameters.
- Includes methods for attribute modification and data retrieval.

### TestStudent.java 🧪

- Main program to test the functionality of the `Student` class.
- Creates instances of the `Student` class and demonstrates various constructor usages and attribute assignments.

## Usage 🚀

1. **Clone the Repository**: Clone this repository to your local machine using `git clone`.
2. **Navigate to the Project Directory**: Open a terminal and move into the project directory.
3. **Navigate to the Source Directory**: Change directory to the `src` folder.
4. **Compile and Run**: Compile and run the `TestStudent.java` file.
   - Compile: `javac *.java`
   - Run: `java TestStudent`
5. **Interact with the Application**: Follow the on-screen instructions to manage student data effectively.

## Tools and Languages 🔧

- **Java**: Primary programming language.
- **IntelliJ IDEA**: Integrated Development Environment (IDE).

## Execution 💻

### Sample Output:

<img src="./Assets/sample_output.png" width="100%" />


