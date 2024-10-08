
import java.util.ArrayList;
import java.util.Arrays;

// Write a Java program to create a class called "Movie" -> "App" with attributes for title
// director, actors and reviews, and methods for adding and retrieving the reviews


public class App {
    public static void main(String[] args) throws Exception {

        movie movie1 = new movie("Shrek", "Donkey", new ArrayList(Arrays.asList("Noel", "Blanco")));


        Review review1 = new Review("Chada", "Art", 9.8);
        Review review2 = new Review("Okay lang", "Jhum", 8.8);
        Review review3 = new Review("Goods", "Blancs", 8.8);
        Review review4 = new Review("Eyyy", "Wel", 9.5);
        Review review5 = new Review("Nice2", "mar", 7.8);

    

        movie1.addReview(review1);
        movie1.addReview(review2);
        movie1.addReview(review3);
        movie1.addReview(review4);
        movie1.addReview(review5);

        System.out.println("\nReviews for '" + movie1.getTitle() + "':");
        for (Review review : movie1.getReviews()) {
            System.out.println(review.getReviewText()+ " by " + review.getReviewerName() + " - " + review.getRating());
        }
    }
}
