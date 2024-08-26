package Inheritance;

public class Main {
  
 
     // Superclass
    static class Brand {
       protected String brand = "Puregold";
        public void brands(){
            System.out.println("Hotdog sa puregold lami");
        }
    }

   
    // Subclass
    static class Food extends Brand {
        private String foodtype = "hotdog";

        public static void main(String[] args) {

            Food food = new Food();

            food.brands();
            System.out.println(food.brand + " " + food.foodtype);
        }        
    }
}
