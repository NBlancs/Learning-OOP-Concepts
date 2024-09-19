// Name: Noel Jhumel G. Blanco
// Section: IT2R13
// Subject: Object-Oriented Programming


public class App {


        // eyyy colorrrss again
        public static final String ANSI_RESET = "\u001B[0m";

        public static final String ANSI_YELLOW = "\u001B[33m"; 
        public static final String ANSI_RED = "\u001B[31m"; 
        public static final String ANSI_GREEN = "\u001B[32m"; 
        public static final String ANSI_BLUE = "\u001B[34m"; 
        public static final String WHITE = "\033[0;37m";   

        // eyy bold colors again
        public static final String YELLOW_BOLD = "\033[1;33m"; 
        public static final String BLUE_BOLD = "\033[1;34m";  

    public static void main(String[] args) throws Exception {
        System.out.println(WHITE+"Name: Noel Jhumel G. Blanco");
        System.out.println("Section: IT2R13");
        System.out.println("Subject: Object-Oriented Programming");
        System.out.println();

        sol1();
        sol2();
        sol3();
        sol4();
        sol5();
    }

    // Solution for #1
    public static void sol1(){
        double array1 [] = {0.6,0.8,0.9,0.3,0.7,1.3};

        double meanforLoop =0;
        double meanforEach =0;

        // for-loop
        System.out.println("SOLUTION #1\n");
        System.out.println(BLUE_BOLD+"For-Loop Example");
        for (int i = 0; i < array1.length; i++){
            meanforLoop += array1[i]; 
        }
        System.out.print("For-Loop Mean = ");
        System.out.println(meanforLoop/array1.length);
        // while-loop

        double whileLoop = 0;
        int j = 0;

        while(j < array1.length ){

            whileLoop += array1[j];
            j++;
        }

        System.out.println("\nWhile-Loop Example");       
        System.out.print("While-Loop Mean = ");
        System.out.println(whileLoop/array1.length);


        // for-each loop example
        System.out.println("\nFor-Each-Loop Example");
        for(double i : array1){
            meanforEach += i;
        }

        System.out.print("For-Each-Loop Mean = ");
        System.out.println(meanforEach/array1.length);
        
    }


    // Solution #2
    public static void sol2(){

        int i = 1;

        int factorial = 1;
        int factorialTen = 10;


        System.out.println(WHITE+"\nSOLUTION #2\n");
        System.out.println(ANSI_RED+"\nFactorial of 10 Using For-Loop");
        for (i = 1; i <= factorialTen; i++){
            factorial *= i;
        }
        System.out.println(factorial);



        System.out.println("\nFactorial of 10 Using While-Loop");

        while(i <= factorialTen){
            factorial *= i;    
            i++;
        }
        
        System.out.println(factorial);

    }

    // Solution #3
    public static void sol3(){
        System.out.println(WHITE+"\nSOLUTION #3\n");
        System.out.println(ANSI_YELLOW+"\nFor-Loop Solving the Product Matrix");

        int r1 = 2;
        int r2 = 3;

        int c1 = 3;
        int c2 = 2;


        int [][]aMatrix = {{1,2,3},{4,5,6}};
        int [][]bMatrix = {{7,8},{9,10},{11,12}};


        int [][] result = new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < c1; k++){
                    result[i][j] += aMatrix[i][k] * bMatrix[k][j];
                }
            }
        }

        System.out.println("The Product of the Matrix C = A x B is: ");
        for (int[] row : result) {
            for(int col : row){
                System.out.print(col+ " ");
            }
            System.out.println();
        }



        
    }



    // Solution #4
    public static void sol4(){
        System.out.println(WHITE+"\nSOLUTION #4\n");
        System.out.println(ANSI_GREEN+"\nFor-Loop Solving the Euclidean Distance");	

        int []p = {2,-1,3};
        int []q = {4,0,-2};

        double euclideanDistance = 0.0;

        for (int i = 0; i < p.length; i++){
            euclideanDistance += Math.pow(q[i] - p[i],2);
        }

        euclideanDistance = Math.sqrt(euclideanDistance);
        System.out.println("The Euclidean distance between vectors p and q is: "+ euclideanDistance);
        System.out.println();
    }

    // Solution #5

    public static void sol5(){
        
        int []x = {50,55,24,36,39};
        double []y = new double[x.length];


        // for-loop
        System.out.println(WHITE+"\nSOLUTION #5\n");
        System.out.println(ANSI_RED+"For-Loop Linear Equation in slope intercept form: ");

        for (int i = 0; i< x.length; i++){
            y[i] = 0.05 * x[i] + 7.27;
            
            System.out.println("x = "+ x[i] +", "+"y = " + y[i]);
        }



        // while-loop
        System.out.println("\nWhile-Loop Linear Equation in slope intercept form: ");
        int index = 0;
        while(index < x.length){
            y[index] = 0.05 * x[index] + 7.27;
            System.out.println("x = "+ x[index] +", "+"y = " + y[index]);
            index++;
        }

        // for-each loop
        System.out.println("\nFor-Each-Loop Linear Equation in slope intercept form: ");
        for(double i : y) {
            System.out.println("y = " + i);
            index++;
        }
    }
}


