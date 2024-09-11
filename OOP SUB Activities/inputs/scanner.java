package inputs;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        // Asks Name
        System.out.print("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        // Asks weight
        System.out.print("Please Input your weight: ");
        double weight = scanner.nextDouble();

        // Asks age
        System.out.print("Please Input your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name);	
        System.out.println("Your weight is: " + weight);
        System.out.println("You are " + age+" years old");


    }
}
