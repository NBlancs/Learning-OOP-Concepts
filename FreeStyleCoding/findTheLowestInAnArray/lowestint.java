public class lowestint {
    public static void main(String[] args) {
        
        int []arr = {213,2,1,38912,213};

        int lowest = arr[0];


        for (int i = 0; i < arr.length; i++){
            if (arr[i] < lowest){
                lowest = arr[i]; 
            }
        }

        for (int j = 0; j < arr.length; j++){
            if (lowest == arr[j]){
                System.out.println("The index of the lowest number in the array is: " + "["+j+"]");
            }
        }

        System.out.println("The lowest number in the array is: " + lowest);
    }
}
