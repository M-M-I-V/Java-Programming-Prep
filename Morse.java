import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Morse {

    private static final Map<Character, String> englishToMorse = new HashMap<>();
    private static final Map<String, Character> morseToEnglish = new HashMap<>();

    static {
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                              "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                              ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};

        char[] lettersAndDigits = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();

        for(int i = 0; i < lettersAndDigits.length; i++) {
            englishToMorse.put(lettersAndDigits[i], morseCode[i]);
            morseToEnglish.put(morseCode[i], lettersAndDigits[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Translator");
        System.out.println("0. English to Morse Code");
        System.out.println("1. Morse Code to English");
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();

        scan.nextLine();

        if(choice == 0) {
            System.out.print("Enter English phrase: ");
            String englishPhrase = scan.nextLine().toUpperCase();
            String encodedMorse = toMorseCode(englishPhrase);
            System.out.println("Morse code: " + encodedMorse);
        } else if(choice == 1) {
            System.out.print("Enter morse code (separate each letter by space, and each word by three spaces): ");
            String morsePhrase = scan.nextLine();
            String decodedPhrase = toEnglishPhrase(morsePhrase);
            System.out.println("English phrase: " + decodedPhrase);
        } else {
            System.out.println("Please enter a valid choice");
        }

        scan.close();
    }

    public static String toMorseCode(String englishPhrase) {
        StringBuilder encoded = new StringBuilder();

        for(char c : englishPhrase.toCharArray()) {
            if(c == ' ') {
                encoded.append("   ");
            } else if(englishToMorse.containsKey(c)) {
                encoded.append(englishToMorse.get(c)).append(" ");
            }
        }
        return encoded.toString().trim();
    }

    public static String toEnglishPhrase(String morsePhrase) {
        StringBuilder decoded = new StringBuilder();

        String[] morseWords = morsePhrase.split("   ");
        for(String word : morseWords) {
            String[] morseLetters = word.split(" ");
            for(String morseLetter : morseLetters) {
                if(morseToEnglish.containsKey(morseLetter)) {
                    decoded.append(morseToEnglish.get(morseLetter));
                }
            }
            decoded.append(" ");
        }
        return decoded.toString().trim();
    }
}

