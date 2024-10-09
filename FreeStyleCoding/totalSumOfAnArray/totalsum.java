public class totalsum {
    
    public static void main(String[] args) {
        int []sum ={5,10,15,20, 100}; 
        int total = 0;

        for (int i = 0; i < sum.length; i++){
            total += sum[i];
        }

        System.out.println(total);
    }
}
