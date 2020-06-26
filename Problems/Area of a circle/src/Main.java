import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius,2.0);
        System.out.print(area);
    }
}