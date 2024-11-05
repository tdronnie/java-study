package mission;

import java.util.Scanner;

public class Mission4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("짝수");
        } else{
            System.out.println("홀수");
        }


        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 >= num2){
            if(num1 >= num3){
                System.out.println(num1); // num2 <= num1, num3 <= num1
            } else {
                System.out.println(num3); //num2 <= num1 < num3
            }
        } else{
            if(num2 >= num3){
                System.out.println(num2); // num1 < num2, num3 <= num2
            } else {
                System.out.println(num3); //num1 < num2 < num3
            }
        }


        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }


        System.out.print("첫번째 수를 입력: " );
        int number1 = sc.nextInt();
        System.out.print("두번째 수를 입력: " );
        int number2 = sc.nextInt();
        System.out.print("실행 할 연산 입력(+, -, *, /): " );
        char op = sc.next().charAt(0);

        if (number2 == 0 && op == '/' || op == '%') {
            throw new IllegalArgumentException("0으로 수를 나눌 수 없습니다!");
        }

        switch (op) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
        }


        int month = sc.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("존재하지 않는 달입니다.");
        }


        int year = sc.nextInt();

        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년입니다." : "윤년이 아닙니다.");



    }
}