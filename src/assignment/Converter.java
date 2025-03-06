package assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class Converter {
    private HashMap <String, String> map;

    public Converter(){
    map = new HashMap<>();
        map.put("A",".-");
        map.put("B","-...");
        map.put("C","-.-.");
        map.put("D","-..");
        map.put("E",".");
        map.put("F","..-.");
        map.put("G","--.");
        map.put("H","....");
        map.put("I","..");
        map.put("J",".---");
        map.put("K","-.-");
        map.put("L",".-..");
        map.put("M","--");
        map.put("N","-.");
        map.put("O","---");
        map.put("P",".--.");
        map.put("Q","--.-");
        map.put("R","-.-");
        map.put("S","...");
        map.put("T","-");
        map.put("U","..-");
        map.put("V","...-");
        map.put("W",".--");
        map.put("X","-..-");
        map.put("Y","-.--");
        map.put("Z","--..");

        // MORSE TO ENGLISH

        map.put(".-","A");
        map.put("-...","B");
        map.put("-.-.","C");
        map.put("-..","D");
        map.put(".","E");
        map.put("..-.","F");
        map.put("--.","G");
        map.put("....","H");
        map.put("..","I");
        map.put(".---","J");
        map.put("-.-","K");
        map.put(".-..","L");
        map.put("--","M");
        map.put("-.","N");
        map.put("---","O");
        map.put(".--.","P");
        map.put("--.-","Q");
        map.put(".-.","R");
        map.put("...","S");
        map.put("-","T");
        map.put("..-","U");
        map.put("...-","V");
        map.put(".--","W");
        map.put("-..-","X");
        map.put("-.--","Y");
        map.put("--..","Z");


    }

    public String engToMorse(String testdata) {
        if (testdata == null || testdata.trim().isEmpty()) {
            return "Error: Input is empty!";
        }

        // Check if input contains any lowercase letter
        if (!testdata.equals(testdata.toUpperCase())) {
            return "Error: Only uppercase letters are allowed!";
        }
       // if (testdata == null || testdata.isEmpty()) {
            // Error handling for empty input
          //  return "Error: Input is empty!";


        ArrayList<String> morseList = new ArrayList<>();
     String morse = "";
        String[] text = testdata.split("");
        for (String character : text) {
            // If the character is in the map, get its Morse code representation and add it to the list
            if (map.containsKey(character)) {
                morseList.add(map.get(character));
            } else {
                morseList.add("?"); // If the character is not in the map, add a placeholder
            }
        }

        // Join the Morse codes in the list with a space separator and return the result
        return String.join(" ", morseList);


       // String[] text = {"H","E","Y"};


        //for (int i = 0; i < text.length ; i++) {

          // morse= map.get(text[i]);
            //String[] j = {morse};
        //}
        //return morse;


    }
/*
    public String morseToEng(String testdata) {
        String[] morse = testdata.split(" ");
        return map.get(testdata);
    }*/

        public String morseToEng(String testdata) {
            if (testdata == null || testdata.isEmpty()) {
                return "Error: Input is empty!";
            }

            String[] morseArray = testdata.split(" ");
            StringBuilder result = new StringBuilder();

            for (String morseChar : morseArray) {
                if (map.containsKey(morseChar)) {
                    result.append(map.get(morseChar));
                } else if (morseChar.equals("/")) {
                    result.append(" "); // Space between words in the decoded message
                } else {
                    result.append("?"); // Handle invalid Morse characters
                }
            }

            return result.toString();
        }
    }


