package mission;

public class Mission6 {

    public static void main(String[] args) {
        double doubleValue = 22.2;
        int intValue = 11;

        System.out.println(doubleValue + intValue);

        int a = 10;
        int b = 20;
        convertTypes(a, b);


    }

    public static void convertTypes(int a, int b) {
        System.out.println("입력값: a = " + a + ", b = " + b);
        int sum = a + b;
        System.out.println("합계: " + sum);
        System.out.println();
        System.out.println("=== 자동 형변환 ===");

        // 1. int -> float (자동 형변환)
        float floatSum = sum;
        System.out.println("int -> float: " + floatSum);

        // 2. int -> double (자동 형변환)
        double doubleSum = sum;
        System.out.println("int -> double: " + doubleSum);

        System.out.println();

        System.out.println("=== 명시적 형변환 ===");

        // 3. 소수점이 있는 경우의 형변환
        double doubleValue = sum + 0.789;
        System.out.println("원본 double 값: " + doubleValue);
        System.out.println("double -> int 변환: " + (int)doubleValue);
        System.out.println("double -> float 변환: " + (float)doubleValue);

        System.out.println();
        // 4. 큰 수 형변환
        int largeNum = 123456;
        System.out.println("큰 수 형변환:");
        System.out.println("int -> float -> int: " + (int)(float)largeNum);
        System.out.println("int -> double -> int: " + (int)(double)largeNum);
    }

    public int castToInteger(double value) {
        // int형의 범위가 벗어나는지 체크, 벗어난다면 예외처리
        if (value > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("값이 int 최대값을 초과합니다.");
        }
        if (value < Integer.MIN_VALUE) {
            throw new IllegalArgumentException("값이 int 최소값 미만입니다.");
        }

        return (int)value;
    }
}
