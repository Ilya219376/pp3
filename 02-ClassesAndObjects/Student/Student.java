
public class Student {

    String name;
    int age;
    int studentIdCard;
    boolean IsStudentIdCardValid; 
    int semesterNumber;
    double avarageGrade; 


    void sayHello(){
        System.out.println("Hello from " + name);
    }

    void displayName(){
        System.out.println("My name is " + name);
    }

    void displayAge(){
        System.out.println("My age is " + age);
    }

    void displayPrimaryStudentInfo(){
        System.out.println("Student's name: " + name);
        System.out.println("Semester number: " + semesterNumber);
        System.out.println("Student's average grade: " + avarageGrade);
    }

    void changeIdStatus (boolean Valid) {
        IsStudentIdCardValid = Valid; 
    }

    public void displayStudentInfo() {
        System.out.println("Student's name: " + name);
        System.out.println("Semester number: " + studentIdCard);
        System.out.println(IsStudentIdCardValid == true ? "Valid" : "Invalid");
    }


}
    
