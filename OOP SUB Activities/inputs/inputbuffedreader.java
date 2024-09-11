package inputs;
import java.io.*;


// Two methods of getting Input 
// 1. BufferedReader class
// 2. JOptionPane class (gui)

public class inputbuffedreader {

public static void main(String[] args) {
    
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


    // Asks Name
    String name = "";
    System.out.print("Please enter your name: ");

    try {
        name = input.readLine();
    } catch (Exception e) {
        System.out.println("Error");
    }


    // Asks Weight
    System.out.print("Please enter your weight: ");

    String inputWeight = "";
    double number;

    try {
        inputWeight = input.readLine();
    } catch (Exception e) {
        System.out.println("Error");
    }
    number = Double.parseDouble(inputWeight);

    // Asks Age
    System.out.print("Please Enter your age: ");

    String inputAge = "";
    int age;

    try {
        inputAge = input.readLine();
    } catch (Exception e) {
        System.out.println("Error");
    }

    age = Integer.parseInt(inputAge);





    System.out.println("Hello, " + name);
    System.out.println("Your weight is: " + number);
    System.out.println("You are " + age + " years old");		
 }
}