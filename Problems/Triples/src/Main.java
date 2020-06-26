import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numOfTriples = 0;
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size - 2; i++){
            if (arr[i] == arr[i+1]-1 && arr[i+1] == arr[i+2]-1){
                numOfTriples += 1;
            }
        }

        System.out.print(numOfTriples);

    }
}