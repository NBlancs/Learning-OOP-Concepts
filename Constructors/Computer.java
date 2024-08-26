package Constructors;

public class Computer {
    
    String motherboard;
    String CPU;
    String RAM;
    String GPU;



Computer (String motherboard, String CPU, String RAM, String GPU){

    this.motherboard = motherboard;
    this.CPU = CPU;
    this.RAM = RAM;
    this.GPU = GPU;
}

void motherboard() {
    System.out.println("Motherboard: "+this.motherboard);
}

void CPU() {
    System.out.println("CPU: " +this.CPU);
}

void RAM(){
    System.out.println("RAM "+this.RAM);
}

void GPU(){
    System.out.println("GPU "+this.GPU);
}
}