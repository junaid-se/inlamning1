package assignment;
import java.util.Scanner;

public class Mainconvert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.println("Enter the text to convert to Morse code:");
        String inputText = scan.nextLine();
        String morseCode = converter.engToMorse(inputText);
        System.out.println("Morse Code: " + morseCode);

        System.out.println("Enter the Morse code to convert to text (use space to separate Morse characters):");
        String inputMorse = scan.nextLine();
        String decodedText = converter.morseToEng(inputMorse);
        System.out.println("Text: " + decodedText);
    }
}
