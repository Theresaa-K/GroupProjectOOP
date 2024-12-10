package CodingQuestions;
//Done by Justin
public class VowelCounter {
    // method countVowels which takes a string parameter and counts the
    //number of vowels in the string parameter.
    public static int countVowels(String i){
        i = i.toLowerCase();
        StringBuilder sb = new StringBuilder(i);
        int counter = 0;
        for (int x =0; x < sb.length(); x++){
            if(sb.charAt(x) == 'a' || sb.charAt(x) == 'e' || sb.charAt(x) == 'i' || sb.charAt(x) == 'o' || sb.charAt(x) == 'u'){
                counter += 1;
            }
        }

        return counter;
    }
    public static void main(String[] args) {

        // Vowel count of the word 'documentation' is
        // output to the console using the following line.
        System.out.println(countVowels("Documentation"));

    }
}
