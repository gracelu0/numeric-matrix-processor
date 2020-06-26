import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String password = "";
        int numUpper = scanner.nextInt();
        int numLower = scanner.nextInt();
        int numDigits = scanner.nextInt();
        int length = scanner.nextInt();
        int letter = 65;


        for (int i = 0; i < numUpper; i++){
            password += (char) letter;
            if (i % 2 == 0){
                letter++;
            }
            else {
                letter--;
            }

        }

        letter = 65;

        for (int i = 0; i < numLower; i++){
            password += (char) (letter + 32);
            if (i % 2 == 0){
                letter++;
            }
            else {
                letter--;
            }
        }

        for (int i = password.length(); i < length; i++){
            if ( i < 10 ){
                password += i;
            }
            else{
                password += i % 10;
            }

        }

        System.out.println(password);





    }
}