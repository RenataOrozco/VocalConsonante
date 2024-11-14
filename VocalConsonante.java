package vocalconsonante;
import java.util.Scanner;

public class VocalConsonante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution ex2 = new Solution();
        String ph2;
        
        do {
            
            System.out.print("Introduzca su caracter: ");
            ph2 = sc.nextLine();
            String result2 = ex2.clasification(ph2);
            if(!ph2.equals("q")) {
                System.out.println(result2);
            }
            
        } while(!ph2.equals("q"));
        
    }
}

class Solution {

    String ph;
    
    public boolean isOneCharacter(String ph) {
        if(ph.length() == 1 && Character.isLetter(ph.charAt(0)) == true) {
            return true;
        }
        return false;
    }
    
    
    public String clasification(String ph) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú'};
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j','k',
                             'l', 'm', 'n', 'ñ', 'p', 'q', 'r',
                             's', 't', 'v', 'w', 'x', 'y', 'z'};
        
        char input;
        
        if(isOneCharacter(ph) == false) {
            return "No es una letra.";
        } 
        /*evalua si la entrada es de una sola letra,
        para no ejecutar el resto del codigo*/
        
        input = ph.charAt(0);
        
        for(char i: vowels) {
            if(Character.toLowerCase(input) == i) {
                return "Es vocal.";
            }
        }
        
        for(char i: consonants) {
            if(Character.toLowerCase(input) == i) {
                return "Es consonante.";
            }
        }
        
        return "No es una letra.";
    }
}