import java.lang.Math;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double angle = 0.0;
        double dotProduct = 0;

        double[] vectorA = new double[2];
        for (int i = 0; i < 2; i++){
            vectorA[i] = scanner.nextDouble();
        }

        double[] vectorB = new double[2];
        for (int i = 0; i < 2; i++){
            vectorB[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 2; i++){
            dotProduct += vectorA[i] * vectorB[i];
//            magA += Math.pow(vectorA[i], 2);
//            magB += Math.pow(vectorB[i], 2);
        }

        double magA = Math.hypot(vectorA[0],vectorA[1]);
        double magB = Math.hypot(vectorB[0],vectorB[1]);

//        magA = Math.sqrt(magA);
//        magB = Math.sqrt(magB);

//        System.out.println("magA: " + magA);
//        System.out.println("magB: " + magB);

        angle = Math.toDegrees(Math.acos(dotProduct / (magA * magB)));
        System.out.println(angle);



    }
}