package inputs;

import javax.swing.JOptionPane;

public class joptionPaneFindAvg {
    public static void main(String[] args) {

        // Declare Variables first
        int num1;
        int num2;
        int num3;
        double avg;

        // Inputs with custom titles
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Input the first Number:", "Find the average of 3 Numbers", JOptionPane.QUESTION_MESSAGE));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Input the second Number:", "Find the average of 3 Numbers", JOptionPane.QUESTION_MESSAGE));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Input the third Number:", "Find the average of 3 Numbers", JOptionPane.QUESTION_MESSAGE));

        // Formula to get the average
        avg = (num1 + num2 + num3) / 3.0;  // Changed to 3.0 to ensure double division

        // Output with custom title
        JOptionPane.showMessageDialog(null, "The average is: " + avg, "Average Result", JOptionPane.INFORMATION_MESSAGE);
    }
}

