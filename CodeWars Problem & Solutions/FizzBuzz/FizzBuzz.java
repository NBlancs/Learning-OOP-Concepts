

// classic FizzBuzz problem
// rules
// Say Fizz if the number is divisible by 3
// Say Buzz if the number is divisible by 5
// Say FizzBuzz if the number is divisible by both 3 and 5

public class FizzBuzz {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
         if (i % 3 == 0 && i % 5 == 0){
            System.out.println("FizzBuzz");
         } else if (i % 3 == 0) {
            System.out.println("Fizz");
         } else if (i % 5 == 0) {
            System.out.println("Buzz");
         } else {
            System.out.println(i);
         }
        }


    }
}