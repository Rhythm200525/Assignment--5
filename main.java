
class Person {
    String name;
    int age;

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String grade;

    void showStudentInfo() {
        showInfo(); // From Person
        System.out.println("Grade: " + grade);
    }
}


class Teacher extends Person {
    String subject;

    void showTeacherInfo() {
        showInfo(); // From Person
        System.out.println("Subject: " + subject);
    }
}


public class InheritanceExample {
    public static void main(String[] args) {
        // Create Student object
        Student s = new Student();
        s.name = "John";
        s.age = 15;
        s.grade = "9th";
        System.out.println("Student Details:");
        s.showStudentInfo();

        
        Teacher t = new Teacher();
        t.name = "Mrs. Smith";
        t.age = 40;
        t.subject = "English";
        System.out.println("\nTeacher Details:");
        t.showTeacherInfo();
    }
}
