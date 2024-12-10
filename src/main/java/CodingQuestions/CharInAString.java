package CodingQuestions;

import java.util.Scanner;

public class CharInAString {
    public static void main(String[] args) {
        //Done by Theresa
        //Goal Find out how many alpha characters are present in a String

        //Created scanner object to read userInput
        Scanner userInput = new Scanner(System.in);

        //Print prompt to ask user their favorite quote
        System.out.println("Please enter a word");
        String userResponse = userInput.nextLine(); //Response
        //Captures users input

        int alphacount =0; //Counter for the word

        //Uses for loop to iterate through the word
        for (int i = 0; i< userResponse.length();i++){
            // Get the character at the current index
            char currentChar = userResponse.charAt(i);

            // Check if the character is alphabetic
            if (Character.isLetter(currentChar)){
                alphacount++; //increment the count for word
            }

        }
        System.out.println("You have: "+ alphacount+ " alphabetic characters");

        userInput.close();

    }
}
