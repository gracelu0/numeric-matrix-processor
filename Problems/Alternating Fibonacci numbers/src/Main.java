import java.util.Scanner;

public class Main {

    public static long fib(long n){
        // write your code here
        if (n <= 1){
            return n;
        }
        else if (n == 2){
            return -1;
        }
        return fib(n-2) - fib(n-1);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}