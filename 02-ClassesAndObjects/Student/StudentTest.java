public class StudentTest {
    
    public static void main (String [] args) {

        // object creation
        Student s = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name + " " + s.age);

        Student s2 = new Student();
        s2.name = "Norbert";
        s2.age = 25;
        s2.semesterNumber = 3; 
        s2.studentIdCard = 123543;
        s2.avarageGrade = 5.0; 
        s2.sayHello();
        s2.displayName();
        s2.displayAge();
        s2.displayPrimaryStudentInfo();
        s2.displayStudentInfo();

        Student s3 = new Student();
        s3.name = "Roger";
        s3.age = 33;
        s3.semesterNumber = 5; 
        s3.studentIdCard = 431321;
        s3.avarageGrade = 4.5; 
        s3.sayHello();
        s3.displayName();
        s3.displayAge();
        s3.displayPrimaryStudentInfo();
        s3.displayStudentInfo();

    }
}

