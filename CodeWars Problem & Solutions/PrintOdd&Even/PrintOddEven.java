public class PrintOddEven {
    public static void main(String[] args) {
        
        // prints even numbers from 1 - 100


        System.out.println("====== Even Numbers ======");
        for(int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }


        // prints odd numbers from 1 - 100

        System.out.println("\n====== Odd Numbers ======");
        for(int i = 1; i <= 100; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

    }
}
