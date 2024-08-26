package ReversedString;

public class reverse {


    public static void main(String[] args) {
    
    // original sentence
    String originalSentence = "Noel is a USTP Student";
    System.out.println("Original Sentence: " + originalSentence+"\n");	    


    // reverses the entire string
    System.out.print("Reversed String: ");
    String name = "Noel is a USTP Student";

       for (int i = name.length() - 1; i >= 0; i--) {
           System.out.print(name.charAt(i));
       }


       System.out.println("\n");

    // the order of the words in the string remains however the words itself are reversed
    String sentence = "\n\nNoel is a USTP Student";

    sentence = sentence.trim();

    String [] words = sentence.split(" ");

       for (int i = 0; i < words.length; i++) {
           words[i] = new StringBuilder(words[i]).reverse().toString();
       }

       String reversedSentence = String.join(" ", words);

       System.out.println("Reversed String (Order of words remains): "+reversedSentence);
    }
}
