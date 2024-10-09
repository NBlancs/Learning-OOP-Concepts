public class highestint {
    public static void main(String[] args) {
        

        int []arr = {12,123,12354,3242342}; 

        int highest = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > highest){
                highest = arr[i];
            }
        }

        for (int j = 0; j < arr.length; j++){
            if (highest == arr[j]){
                System.out.println("The index of the highest number in the array is: " + "["+j+"]");
            }
        }
        System.out.println("The Highest number in the array is: " + highest);
    }
}
