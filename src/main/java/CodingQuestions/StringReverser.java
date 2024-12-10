package CodingQuestions;
//Done by Alexander
public class StringReverser {public static String reverseString(String input) {
    StringBuilder reversed = new StringBuilder(input);
    return reversed.reverse().toString();
}

    public static void main(String[] args) {
        String input = "Hello";
        String result = reverseString(input); // Reverses line 10
        System.out.println(result);  // Prints the reversed string
    }
}
