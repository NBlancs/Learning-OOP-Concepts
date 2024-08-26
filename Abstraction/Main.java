package Abstraction;

abstract class Animal{
    public void abstactSound(){
        System.out.println("Sound of an animal");
    }
}

class Cow extends Animal{
    public void animalSound(){
        System.out.println("The cow says: moo moo");

    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: arf arf");
    }

}



public class Main {
    public static void main(String[]args){

        Cow myCow = new Cow();
        Dog myDog = new Dog();

        myCow.abstactSound();
        myDog.abstactSound();
        myCow.animalSound();
        myDog.animalSound();
    }
}
