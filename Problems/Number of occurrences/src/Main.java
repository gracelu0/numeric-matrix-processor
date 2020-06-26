import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String substring = scanner.nextLine();
        int freq = 0;
        int lastIndex = -1;

        if (str.length() >= substring.length()){
            for (int i = 0; i < str.length(); i++){
                //alternate solution (more concise!)
                lastIndex = str.indexOf(substring,i);
                if ( lastIndex >= 0){
                    freq++;
                    i += lastIndex;

                }

//                if (str.charAt(i) == substring.charAt(0) && i > lastIndex){
//                    for (int j = 0; j < substring.length(); j++){
//                        if (str.charAt(i + j) != substring.charAt(j)){
//                            break;
//                        }
//                        else if (j == substring.length() - 1){
//                            lastIndex = i+j;
//                            freq++;
//                        }
//
//                    }
//                }
            }

        }

        System.out.println(freq);
    }
}