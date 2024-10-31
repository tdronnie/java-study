package mission;

import java.util.Scanner;

public class Mission3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//
//        System.out.println(num1 + num2);
//
//        int score = 100;
//        int age = 15;
//
//        if (age >= 18 && score >= 70) {
//            System.out.println("합격");
//        }
//
//        if(num1>0 && num2<0)
//            System.out.println(num1 * num2);

        int[] arr = {2, -8, 4, -10, 0, 1, 2, 3};
        int sum = 0;

        for (int i=0; i<arr.length; i++){

            if(arr[i] % 2 != 0){
                System.out.println(sum);
                break; //홀수면 바로 반복문 종료! (회로 단락 평가)
            }
            if(arr[i] > 0 && arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
    }
}
