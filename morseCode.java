public class morseCode {
    
    public static void morseToEnglish(String[] code, String morseCode, char[] letter) {

        
        String[] array = morseCode.split(" ");
        System.out.print("Morse code " + morseCode + " to English is ");

        // Morse code to English
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < code.length; j++) {
                if (array[i].compareTo(code[j]) == 0) {
                    System.out.print(letter[j]);
                    break;
                }
            }
        }
        System.out.println("");
    }

    public static void englishToMorse(String[] code, String english, char[] letter){

        System.out.print(english + " to Morse code is ");

        // English to Morse code
        for(int i = 0; i < english.length(); i++) {
            for(int j = 0; j < letter.length; j++) {
                if(english.charAt(i) == letter[j]) {
                    System.out.print(code[j] + " ");
                    break;
                }
            }
        }
        System.out.println("");
    }


    public static void main(String[] arg) {

        // store the all the alphabet in an array
        char[] letter 
        = {' ', 'a', 'b', 'c', 'd', 'e', 'f',
        'g', 'h', 'i', 'j', 'k', 'l',
        'm', 'n', 'o', 'p', 'q', 'r',
        's', 't', 'u', 'v', 'w', 'x',
        'y', 'z', '1', '2', '3', '4',
        '5', '6', '7', '8', '9', '0'};
        
        // Morse code by indexing
        String[] code
        = {"/", ".-", "-...", "-.-.", "-..",  ".",
        "..-.", "--.",  "....", "..",   ".---",
        "-.-",  ".-..", "--",   "-.",   "---",
        ".--.", "--.-", ".-.",  "...",  "-",
        "..-",  "...-", ".--",  "-..-", "-.--",
        "--..", "·−−−−",  "··−−−",  "···−−",  "····−",  
        "·····",  "−····",  "−−···",  "−−−··",  "−−−−·"};

        String morseCode = "... -.-. .... --- --- .-.. / .. ... / -.-. --- --- .-..";
        String english = "alice chicken";
        
        // Morse to English
        morseToEnglish(code, morseCode, letter);

        //English to Morse
        englishToMorse(code, english, letter);
    }
}