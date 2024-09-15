public class ControlStruct{

    boolean student = true;
    boolean isACollegestudent = true;
    int examScore = 80;

    public static final String ANSI_RESET = "\u001B[0m"; 

    public static final String ANSI_YELLOW = "\u001B[33m"; 
    public static final String ANSI_RED = "\u001B[31m"; 
    public static final String ANSI_GREEN = "\u001B[32m"; 
    public static final String ANSI_BLUE = "\u001B[34m"; 
    public static final String ANSI_PURPLE = "\u001B[35m"; 
    public static final String ANSI_CYAN = "\u001B[36m"; 



    public void sequential() {
        
        double grade1 = 95.2;
        double grade2 = 98.9;

        double gpa = (grade1 + grade2)/2;
        System.out.println(ANSI_YELLOW+"Your grade for this semester is: " + gpa + ANSI_RESET);
    }

    public void singleAlt(){

        if(student == true){
            System.out.println(ANSI_RED+"Noel is a student"+ANSI_RESET);
        }
    }

    public void doubleAlt(){
        if (isACollegestudent == true){
            System.out.println(ANSI_GREEN+"Noel is a college student"+ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN+"Noel is not a college student"+ANSI_RESET);
        }
    }


    public void multiAlt(){
        if(examScore >= 75){
            System.out.println(ANSI_BLUE+"Noel passed the exams"+ANSI_RESET);
        } else if(examScore <= 74 && examScore >= 70){
            System.out.println(ANSI_BLUE+"Noel will take a remedial exam"+ANSI_RESET);
        } else {
            System.out.println(ANSI_BLUE+"Noel failed the exams"+ANSI_RESET);
        }
    }

    public void whileLoop(){
        int i = 0;

        while (i <= 3){
            System.out.println(ANSI_PURPLE+"This is a while loop saying: Hello world"+ANSI_RESET);
            i++;
        }
    }

    public void forLoop(){
        
        for(int i = 0; i <= 3; i++ ){
            System.out.println(ANSI_CYAN+"This is a for loop saying: Hello world"+ANSI_RESET);
        }

    }
}