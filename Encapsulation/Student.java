 package Encapsulation;
 
 /**
  * Student
  */
 public class Student {
    
    private String name;
    private int age;
    private String gender;
    private int studentNumber;



    public String getName() {
        return name;
    }

    

    public void setName(String name) {
        this.name = name;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public void setGender(String gender) {
        this.gender = gender;
    }



    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }



    public int getAge() {
        return age;
    }


    public String getGender() {
        return gender;
    }


    public int getStudentNumber() {
        return studentNumber;
    }


    
 }