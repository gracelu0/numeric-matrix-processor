package processor;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option: ");
        System.out.println("1. Add matrices");
        System.out.println("2. Multiply matrix by a constant");
        System.out.println("3. Multiply matrices");
        System.out.println("4. Transpose matrix");
        System.out.println("5. Calculate a determinant");
        System.out.println("6. Inverse matrix");
        System.out.println("0. Exit");
        int choice = scanner.nextInt();

        while (choice != 0){
            if (choice == 1){
                addMatrices();
            }
            else if (choice == 2){
                scaleMatrix();
            }
            else if (choice == 3){
                multiplyMatrices();
            }
            else if (choice == 4){
                transposeMatrix();
            }
            else if (choice == 5){
                calculateDeterminant();
            }
            else if (choice == 6){
                findInverse();
            }
            System.out.println("Choose an option: ");
            System.out.println("1. Add matrices");
            System.out.println("2. Multiply matrix by a constant");
            System.out.println("3. Multiply matrices");
            System.out.println("4. Transpose matrix");
            System.out.println("5. Calculate a determinant");
            System.out.println("6. Inverse matrix");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
        }


    }

    public static void addMatrices(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of first matrix: ");

        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();

        double[][] matrixA = new double[rowsA][colsA];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter size of second matrix: ");

        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();

        double[][] matrixB = new double[rowsB][colsB];
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextDouble();
            }
        }

        if (rowsA != rowsB || colsA != colsB){
            System.out.println("ERROR");
        }
        else{
            System.out.println("The addition result is: ");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    double sum = matrixA[i][j] + matrixB[i][j];
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        }
    }

    public static void scaleMatrix(){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double factor = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                double product = factor * matrix[i][j];
                System.out.print(product + " ");
            }
            System.out.println();
        }
    }

    public static void multiplyMatrices(){
        Scanner scanner = new Scanner(System.in);
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();

        double[][] matrixA = new double[rowsA][colsA];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();

        double[][] matrixB = new double[rowsB][colsB];
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextDouble();
            }
        }

        if (colsA != rowsB){
            System.out.println("ERROR");
        }
        else{
            double[][] result = new double[rowsA][colsB];
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB ; j++) {
                    for (int k = 0; k < colsA; k++) {
                        result[i][j] += matrixA[i][k] * matrixB[k][j];
                    }

                }
            }
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void transposeMatrix(){
        System.out.println("1. Main diagonal");
        System.out.println("2. Side diagonal");
        System.out.println("3. Vertical line");
        System.out.println("4. Horizontal line");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your choice: ");

        int transposeChoice = scanner.nextInt();

        System.out.println("Enter matrix size: ");

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        System.out.println("Enter matrix: ");
        double[][] matrix= new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        if (transposeChoice == 1) {
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.println();
            }
        }
        else if (transposeChoice == 2) {
            for (int i = rows - 1; i >= 0; i--) {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.println();
            }
        }
        else if (transposeChoice == 3) {
            for (int i = 0; i < rows; i++) {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        else if (transposeChoice == 4) {
            for (int i = rows - 1; i >= 0; i--) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static double[][] findSubmatrix(double[][] matrix, int size, int r, int c){
        double[][] submatrix = new double[size - 1][size - 1];
        int currentRow = 0;
        int currentCol = 0;

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (i != r && j != c){
                    submatrix[currentRow][currentCol] = matrix[i][j];
                    currentCol++;

                    //row in submatrix is full
                    if (currentCol == size - 1){
                        currentCol = 0;
                        currentRow++;
                    }
                }
            }
        }
        return submatrix;
    }

    public static double det(double[][] matrix, int size){
        double res;

        if (size == 1){
            res = matrix[0][0];
        }
        else if (size == 2){
            res = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        }
        else {
            res = 0;
            for (int j = 0; j < size; j++){
                double[][] submatrix = findSubmatrix(matrix, size, 0, j);
                //debugging
//                for (int i = 0; i < size - 1; i++) {
//                    for (int k = 0; k < size - 1; k++) {
//                        System.out.print(submatrix[i][k] + " ");
//                    }
//                    System.out.println();
//                }
//                System.out.println();

                res += Math.pow(-1 , 2 + j) * matrix[0][j] * det(submatrix, size - 1);
            }

        }
        return res;

    }

    public static void calculateDeterminant(){
        double determinant = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrix size: ");

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        System.out.println("Enter matrix: ");
        double[][] matrix= new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }


        System.out.println("The result is: ");
        determinant = det(matrix, rows);
        System.out.println(determinant);

    }

    public static void printMatrix(double[][] matrix, int rows, int cols){
        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (matrix[i][j] == 0){
                    System.out.print(" " + 0 + "   ");
                }
                else{
                    System.out.print(df.format(matrix[i][j]) + " ");
                }
            }
            System.out.println();
        }
    }

    public static void findInverse(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrix size: ");

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        System.out.println("Enter matrix: ");
        double[][] matrix= new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double determinant = det(matrix, rows);
//        System.out.println("det(A): " + determinant);
        //co-factor matrix
        if (determinant != 0){
            double[][] cofactorMatrix = new double[rows][cols];
            for (int i = 0; i < rows; i++){
                for (int j = 0; j < cols; j++){
                    double[][] submatrix = findSubmatrix(matrix, rows, i, j);
//                    System.out.println("Submatrix: ");
//                    printMatrix(submatrix,rows - 1 , cols - 1);
                    double subDeterminant = det(submatrix, rows - 1);
                    double res = Math.pow(-1 , i + j + 2) * subDeterminant;
                    if (matrix[i][j] != 0 || subDeterminant != 0){
                        cofactorMatrix[j][i] = res;
                    }
                    else {
                        cofactorMatrix[j][i] = 0;
                    }

                }
            }
//
//            System.out.println("Cofactor matrix: ");
//            printMatrix(cofactorMatrix,rows,cols);
//            System.out.println();

//            //transpose matrix
//            double[][] transposedMatrix = new double[rows][cols];
//            for (int i = 0; i < cols; i++) {
//                for (int j = 0; j < rows; j++) {
//                    transposedMatrix[i][j] = cofactorMatrix[j][i];
//                }
//            }
//
//            System.out.println("Transposed cofactor matrix: ");
//            printMatrix(transposedMatrix,rows,cols);
//            System.out.println();

            System.out.println("The result is: ");
            double[][] inverse = new double[rows][cols];
            for (int i = 0; i < rows; i++){
                for (int j = 0; j < cols; j++){
                    inverse[i][j] = (1.0 / determinant) * cofactorMatrix[i][j];
                }
            }

            printMatrix(inverse, rows, cols);

        }
        else{
            System.out.println("determinant = 0: NO INVERSE");
        }

    }
}
