
// reverse a string.
// sample
// 'world' - 'dlrow'
// 'world' - 'drow'


// solution
// sequence of solution 
// 1. Get the StringBuilder in built-function
// 2. use for loop to reverse the string
// 3. make the string into char value
// 4. append the char value
// 5. use toString()
// 6. return the string

public class Kata{
    // Your code here...
    public static String solution(String str) {
        // Your code here...
        StringBuilder reversed = new StringBuilder();
        
        for(int i = str.length() - 1; i >=0; i--){
          reversed.append(str.charAt(i));
        }
        
        return reversed.toString();
        }
}