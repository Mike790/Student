
package student;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseWord {
    
    public static void main(String[] args){
        
        
        Scanner keyboard = new Scanner(System.in);
        while(true){
            System.out.println("Enter a word");
            String word = keyboard.nextLine();
            if(word.equals("quit"))
            {
                break;
            }
            char[] myLetters = new char[word.length()];

            for(int i = myLetters.length-1; i >=0; i--){
                myLetters[i] = word.charAt(i);
                System.out.print(myLetters[i]);
            }
            System.out.println();
        }
        
    }
}
