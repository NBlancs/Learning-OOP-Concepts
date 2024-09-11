package inputs;

import javax.swing.*;

public class joptionPane {
    public static void main(String[] args) {

        // Declare Variables first
        String name = "";
        int age;
        double weight;

        // Asks name
        name = JOptionPane.showInputDialog("Please enter your name: ");	

        // Asks age
        age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age: "));

        // Asks weight
        weight = Double.parseDouble(JOptionPane.showInputDialog("Please enter your weight: "));

        String output = "Hello " + name;
        String ageOutput = "\nYou are " + age+ " years old";
        String weightOutput = "\n Your weight is: " + weight;

        JOptionPane.showMessageDialog(null, output + ageOutput + weightOutput);
    }
}
