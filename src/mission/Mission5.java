package mission;

import java.util.Scanner;

public class Mission5 {

    public static void main(String[] args) {

        // 초급1
//        int num = 1;
//        while(num <= 10){
//            System.out.print(num++ + " ");
//        }


        //초급 2
//        int row = 1;
//        int position = 0;
//
//        for(int num = 1; num <= 10; num++){
//            System.out.print(num + " ");
//            position++;
//
//            if(position == row){ //row 크기만큼 숫자 출력
//                System.out.println();
//                row++;
//                position = 0;
//            }
//        }

        // 초급 3
//        int row = 5;
//        for (int i = 1; i <= row; i++) {
//
//            //공백 출력
//            for (int j = 1; j <= row - i; j++) {
//                System.out.print(" ");
//            }
//
//            //별표 출력, 행에 홀수 만큼 출력
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//
//            //한 줄 출력 후 줄바꿈
//            System.out.println();
//        }

        // 중급 1
//        int num = 0;
//        do {
//            if (num % 2 == 0) {
//                num++;
//                continue;
//            }
//
//            System.out.print(num++ + " ");
//
//        } while (num <= 20);

        //중급 2

//        int row = 1;
//        int stars = 1;
//
//        while(true){
//
//            if(row == 5){
//                break;
//            }
//
//            //공백 출력
//            for (int j = 1; j <= 10 - row; j++) {
//                System.out.print(" ");
//            }
//
//            //별표 출력, 행에 홀수 만큼 출력
//            for (int k = 1; k <= stars; k++) {
//                System.out.print("*");
//            }
//
//            //한 줄 출력 후 줄바꿈
//            System.out.println();
//
//            row++;
//            stars += 2;
//        }

        //중급 3
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=5; j++){
//                System.out.printf("%3d", i * j); //간격 맞춰주기
//            }
//            System.out.println();
//        }

        // 고급 1
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 != 0 || i % 5 != 0) {
//                continue;
//            }
//            System.out.print(i + " ");
//        }

        //고급 2

//        int row = 5;
//        for (int i = 0; i < row; i++) {
//
//            //공백 출력
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//
//            //별표 출력, 행에 홀수 내림차순으로 출력
//            for (int k = 0; k < 2 * (row - i) - 1; k++) {
//                System.out.print("*");
//            }
//
//            //공백 출력
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//
//            System.out.println();
//
//        }

        //고급 3
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            //공백 출력
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            //숫자 출력, 숫자 수만큼 입력
            int position = 1;
            for (int k = 1; k <= 2 * i - 1; k++) {
                if(position % 2 == 0){
                    System.out.print(" ");
                    position++;
                    continue;
                }
                System.out.print(i);
                position++;
            }

            //한 줄 출력 후 줄바꿈
            System.out.println();
        }

    }
}
