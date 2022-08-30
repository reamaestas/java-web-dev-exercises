package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?";
        Scanner input = new Scanner(System.in);
        System.out.println("Type a text to search for in the first sentence of Alice in Wonderland.");
        String text = input.nextLine();

        if (firstSentence.toUpperCase().contains(text.toUpperCase())){
            System.out.println("Your text: '" + text + "' has " + text.length() + " characters " +
                    "and was found at index " + firstSentence.toUpperCase().indexOf(text.toUpperCase()));
        } else if (!firstSentence.toUpperCase().contains(text.toUpperCase())){
            System.out.println("Your text: '" + text + "' was NOT found.");
        }
        String modifiedSentence = firstSentence.replace(text, "");
        System.out.println(modifiedSentence);
    }
}
