package vocalconsonante;
import java.util.Scanner;

public class VocalConsonante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String ph2 = new java.util.Scanner(System.in).nextLine();
        Solution ex2 = new Solution(ph2);
        
        String result2 = ex2.clasification();
        System.out.println(result2);
    }
}

class Solution {

    String ph;

    public Solution(String ph) {
        this.ph = ph;
    }

    public String clasification() {
        int vowels = 0;
        int consonants = 0;
        int symbols = 0;

        ph = ph.toLowerCase();

        for (char ch : ph.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (!Character.isWhitespace(ch)) {
                symbols++;
            }
        }

        return "Número de vocales: " + vowels + "\n"
                + "Número de consonantes: " + consonants + "\n"
                + "Número de símbolos: " + symbols;
    }
}
