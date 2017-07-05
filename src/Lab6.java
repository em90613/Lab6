import java.util.Scanner;

/**
 * Created by ericm on 6/30/2017.
 */
public class Lab6 {//Program is unfinished. Ask Antonella or Maurice for help.
    public static void main(String[] args) {

        System.out.print("Welcome to the Pig Latin Translator!\n");

        System.out.println("Enter a line to be translated: ");

        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();


        userInput = userInput.toLowerCase();//makes userInput all lower case characters.
        String result;//userInput will be initialize to a form of userInput to be displayed in an output line.

        if (isVowels(userInput)) {//vowels. Communicates userInput to the isVowels method to determine if a vowel is at index 0.
            result = pigVowels(userInput);//Assigns the return value of userInput from pigVowels to result if a vowel is present.
            System.out.println(result);//Prints out result.
        } else {//consonant/ Runs if vowels are not present at index 0.
            result = pigConsonants(userInput);//Assigns the return value of userInput from pigConsonants to result if vowel is not present.
            System.out.println(result);//Prints result.
            //6. Prompt user to play again
        }

    }

    private static boolean isVowels(String userInput) {//This determines if a word starts with a vowel or consonant
        if ((userInput.charAt(0)) == 'a' || (userInput.charAt(0)) == 'e' || (userInput.charAt(0)) == 'i' ||
                (userInput.charAt(0)) == 'o' || (userInput.charAt(0)) == 'u') {
            return true;//tells main if isVowel = true then refer to pigVowels

        } else {
            return false;//tells main is isVowel = false then  refer to pigConsonants
        }


    }

    private static String pigConsonants(String userInput) {
        String start;
        String end;
        String vowels = "aeiou";//Translates a word using Consonants pig latin logic
        for (int i = 0; i <userInput.length() ; i++) {
            if(vowels.contains("" + userInput.charAt(i))) {
                start = userInput.substring(0,i);
                end = userInput.substring(i);
                userInput = end + start + "ay";
                break;
            }

        }
        return userInput;//returns userInput to main
    }


    private static String pigVowels(String userInput) {//Translates a word using vowel pig latin logic.
        userInput = userInput.concat("way");//adds "way" onto the end of the userInput. Not sure if using stringBuffer will affect using this.
        return userInput;//returns userInput to main.
    }


}
