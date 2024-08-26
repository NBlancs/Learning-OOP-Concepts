package Constructors;

public class Main {
    public static void main(String[] args) {
        
        Computer computer = new Computer("A70", "Intel Core i7", "16GB", "RTX 3080");
        computer.motherboard();
        computer.CPU();
        computer.RAM();
        computer.GPU();
    }
}
