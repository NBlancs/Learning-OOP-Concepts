    
import java.util.ArrayList;
import java.util.Arrays;



public class ArrayListDemo {


    // 1. Initialzie an ArrayList object
    // 2. Perform built-in methods of an ArrayList object
    // 3. Perform basic operations with an ArrayList object
    // 4. The type inside the ArrayList<DataDtype> must be a class (i.e, a reference type),
    // so the elements inside the ArrayList object are objects and have their own methods



    // 1. Initialize an ArrayList object
    ArrayList<String> student = new ArrayList<String>();                                                  // Intialization without pre-defined values.
    ArrayList<Integer> grades = new ArrayList<Integer>(Arrays.asList(35, 78, 45,44, 60));          // Intialization with pre-defined values.
    

    // 2. Perform built-n methods of an ArrayList object.
    public void arrayListMethods(){

        // add()
        student.add("Noel Blanco");
        student.add("21 years old");
        student.add("USTP BSIT STUDENT");
        System.out.println(student);
        
        // get()
        String first = student.get(1);
        System.out.println(first);

        // set()
        student.set(0, "Noel Jhumel Blanco");
        System.out.println(student);
        
        // remove ()
        student.remove(1);
        System.out.println(student);

        // clear()
            //student.clear();
            //System.out.println(student);
    }
    // 3. Perform basic operations with an ArrayList object

    public void basic_ops(){
        String[] p = {"Noel", "Eyy", "Merp"};

        for (String i : p){
            student.add(i);
        }
        System.out.println(student);
    }

    //4 . The type inside the ArrayList<DataDtype> must be a class (i.e, a reference type),
    // so the elements inside the ArrayList object are objects and have their own methods

    public void example(){
        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] b = {{-1, -2, -1}, {0, 0, 0}, {1,2,1}};

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        for (int[] row: a){
            ArrayList<Integer> ra = new ArrayList<>();
            for (int e: row){
                ra.add(e);
            }
            A.add(ra);
        }

        for (int[] row: b){
            ArrayList<Integer> rb = new ArrayList<>();
            for (int e: row){
                rb.add(e);
            }
            B.add(rb);
        }
        // System.out.println(A);
        // System.out.println(B);

        // Matrix A and B has 3x3 order
        // Thus, the resultant matrix C, must have the A[row] x B[col] order
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();

        for (int i = 0; i < A.size(); i++){                         // Iterate over the A[row] (3x)
            ArrayList<Integer> rc = new ArrayList<>();              // Instantiate row ArrayList called rc
            for (int j = 0; j < B.get(0).size(); j++){        // Iterate over the B[col] (3x)
                int sum = 0;                                        // Set a variable for aggregating results.
                for (int k = 0; k < A.get(0).size(); k++){    // Iterate over the elements in A (3x)
                    sum += A.get(i).get(k) * B.get(k).get(j);       // Increment the value for sum with A[i,k] * B[k, j]
                }
                rc.add(sum);                                        // Add the aggregated results of sum inside the row ArrayList
            }
            C.add(rc);                                              // Add the row ArrayList inside the resultant matrix C
        }                                                           // O(n) x O(n) x O(n) = O(n^3)
        System.out.println(C);
    }

}


