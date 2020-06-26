import java.lang.Math;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double p = (a + b + c) / 2.0;

        double res = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(res);
    }
}