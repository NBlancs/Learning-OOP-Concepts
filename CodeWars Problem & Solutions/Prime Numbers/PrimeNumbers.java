
// Must only print out the first 100 prime numbers

// Prime numbers are numbers that are only divisible to themselves

public class PrimeNumbers {
    public static void main(String[] args) {
        
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
            }
    }


    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        
  
    return true;  
 }
}
