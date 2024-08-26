package Encapsulation;
public class Main {
    public static void main(String[] args) {
        
        Student student = new Student();

        student.setName("Noel");
        student.setGender("Male");
        student.setStudentNumber(2024300617);
        student.setAge(21);

        System.out.println("\n\n=============Student Information===========\n");

        System.out.println("Name: " +student.getName());
        System.out.println("Gender: " +student.getGender());
        System.out.println("Student Number: " +student.getStudentNumber());
        System.out.println("Age: " +student.getAge());
        
        System.out.println("\n\n=============Student Information===========\n");

    }
}


