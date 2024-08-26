public class reversedArray{

    public static void main(String[] args) {
        
        int [] arr = {2,4,6,8,10,12,14,16,18,20};

        System.out.println("Original Order");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }

        System.out.println("\nReversed Order");
        for (int i = arr.length - 1 ; i >= 0; i--){
            System.out.print(arr[i] + ", ");
        }

    }
}