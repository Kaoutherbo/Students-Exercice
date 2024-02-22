public class Student {
    // Attributes of the student class
    double Id;
    String name;
    String specialty;

    // Constructor with no params
    public Student(){}

    // Constructor with one param
    public Student(String name){
        this.name = name;
    }

    // Constructor with two params
    public Student(double Id, String name){
        this.Id = Id;
        this.name = name;
    }

    // Constructor with three params
    public Student(double Id ,String name, String specialty){
        this.Id = Id;
        this.name = name;
        this.specialty = specialty;
    }

}
