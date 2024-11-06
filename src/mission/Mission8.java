package mission;

import java.util.Scanner;

public class Mission8 {

    public static void main(String[] args) {

        // 초급2
        int[] numbers = new int[1];
        numbers[0] = 10;

        System.out.println("numbers[0] = " + numbers[0]);

        // 초급3
        int[] nums = {2, 4, 6, 8, 10};

        for (int number : nums) {
            System.out.println("number = " + number);
        }

        // 중급1
        double[] doubleArray = new double[5];

        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = Math.pow(i, 2);
            System.out.print(doubleArray[i] + " ");
        }

        System.out.println();

        //중급3
        String[] fruits = {"apple", "banana", "cherry"};

        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.print(fruits[i] + " ");
        }

        System.out.println();

        //고급1
        Scanner scanner = new Scanner(System.in);
        System.out.print("행의 수: ");
        int row = scanner.nextInt();

        System.out.print("열의 수: ");
        int col = scanner.nextInt();

        int[][] arr = new int[row][col];

        int num = 1;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = num++;
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("모든 수의 합: " + sum);

        //각 행의 합
        for (int i = 0; i < row; i++) {
            int rowSum = 0;
            for (int j = 0; j < col; j++) {
                rowSum += arr[i][j];
            }
            System.out.println((i + 1) + "행의 합: " + rowSum);
        }

        System.out.println();

        //각 열의 합
        for (int i = 0; i < col; i++) {
            int colSum = 0;
            for (int j = 0; j < row; j++) {
                colSum += arr[j][i];
            }
            System.out.println((i + 1) + "열의 합: " + colSum);
        }

        System.out.println();

        System.out.print("배열의 크기 입력: ");
        int size = scanner.nextInt();
        int[] numArr = new int[size];
        double numSum = 0; //double로 선언해서 평균을 소수점까지 구하기

        for (int i = 0; i < size; i++) {
            numArr[i] = (int)(Math.random() * 100) + 1; //1부터 100까지의 자연수 중 랜덤값
            System.out.print(numArr[i] + " ");
            numSum += numArr[i];
        }

        System.out.println();
        System.out.println("배열의 평균: " + numSum / size);




    }
}
