
// find the index of an element in a 2d array


public class find2darray {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};

        int target = 1;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                if (target == arr[i][j]){
                    System.out.println("The index of the target is at: " +"[ " + i + ", " + j + " ]");
                }
            }
        }
    
    }
}
