package Polymorphism;



class Animal{
    public void animalSound(){
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

        Animal myAnimal = new Animal();
        Animal myCow = new Cow();
        Animal myDog = new Dog();

        
        myAnimal.animalSound();
        myCow.animalSound();
        myDog.animalSound();
    }
}
