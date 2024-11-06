package mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Mission7 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        boolean running = true;

        while (running) {

            System.out.println("서비스를 선택하세요.");
            System.out.print("계산기(1) || 퀴즈프로그램(2) || 도서 관리 시스템(3) || 종료(4)");

            switch (br.readLine()) {
                case "1":
                    calculator();
                    break;
                case "2":
                    quiz();
                    break;
                case "3":
                    bookManagerSystem();
                    break;
                case "4":
                    System.out.print("종료하시겠습니까?(Y/n)");
                    String userAnswer = br.readLine();
                    if (userAnswer.equals("Y") || userAnswer.equals("y")) {
                        running = false;
                        break;
                    }
                    System.out.println("종료를 취소합니다");
                    break;
                default:
                    throw new IllegalArgumentException("잘못된 입력입니다.");
            }
            System.out.println();
        }
    }

    static List<Book> bookList = new ArrayList<>(); //클래스 자체의 리스트는 클래스 외부에서 관리하자

    private static void bookManagerSystem() throws IOException {
        boolean bookManagerRunning = true;

        while (bookManagerRunning) {
            System.out.println("**도서 관리 시스템**");
            System.out.println("도서 등록(1) || 도서 조회(2) || 도서 삭제(3) || 종료(4)");
            int userAnswerNumber = Integer.parseInt(br.readLine());


            switch (userAnswerNumber) {
                case 1:
                    //도서 추가
                    addBook();
                    break;
                case 2:
                    //도서 조회
                    showBookList();
                    break;
                case 3:
                    //도서 삭제
                    removeBook();
                    break;
                case 4:
                    System.out.print("종료하시겠습니까?(Y/n)");
                    String userAnswer = br.readLine();
                    if (userAnswer.equals("Y") || userAnswer.equals("y")) {
                        bookManagerRunning = false;
                        break;
                    }
                    System.out.println("종료를 취소합니다");
                    break;
                default:
                    throw new IllegalArgumentException("잘못된 입력입니다.");
            }
            System.out.println();
        }
    }

    //도서 추가 기능 메서드 추출
    private static void addBook() throws IOException {
        System.out.print("도서 제목 입력: ");
        String title = br.readLine();

        System.out.print("도서 저자 입력: ");
        String author = br.readLine();

        Book newBook = new Book(title, author);
        bookList.add(newBook);

        System.out.println(newBook.getTitle() + ", " + newBook.getAuthor() + " 저 도서 저장");
    }

    //도서 조회 기능 메서드 추출
    //성빈님이 말씀하신 클래스 내부에서 bookList를 안써서 리스트를 조회하는 정보표현을 다르게 할 수 있다는 말은 어떤 뜻인지?
    private static void showBookList() {
        if (bookList.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        for (Book book : bookList) {
            System.out.println(book.getTitle() + ", " + book.getAuthor() + " 저");
        }
    }

    //도서 삭제 기능 메서드 추출
    private static void removeBook() throws IOException {
        System.out.print("삭제할 도서 제목 입력: ");
        String title = br.readLine();

        boolean cannotFindBookWithTitle = bookList.stream()
                .noneMatch(book -> book.getTitle().equals(title));

        if(cannotFindBookWithTitle) {
            System.out.println("해당 제목의 도서는 존재하지 않습니다.");
            return;
        }

        bookList.removeIf(book -> book.getTitle().equals(title));
        System.out.println("삭제 후 리스트");
        showBookList();
    }

    private static void quiz() throws IOException {
        List<String[]> problemList = getProblems();
        int score = 0;

        System.out.println("**퀴즈 프로그램**");

        for (int i = 0; i < problemList.size(); i++) {
            System.out.println("문제" + (i + 1));
            System.out.print(problemList.get(i)[0]);

            String userAnswer = br.readLine();

            if (userAnswer.equals(problemList.get(i)[1])) {
                System.out.println("정답!");
                score++;
            } else {
                System.out.println("땡!");
            }
            System.out.println();
        }

        System.out.println("점수는 " + score + "/" + problemList.size());
    }

    // 객체를 매번 생성하지 않고 변수를 사용하자
    private static List<String[]> getProblems() {
        List<String[]> problemList = new ArrayList<>();

        String[] problem1 = {"JVM의 런타임 데이터 영역에서 메서드 정보, 지역변수, 매개변수가 저장되는 영역은? (OO영역)", "스택"};
        String[] problem2 = {"상수 선언을 하는 자바의 예약어는?", "final"};
        String[] problem3 = {"한 조건에서 두 개 이상의 논리 조건을 사용할 때\n 첫번째 조건만으로 확정되면 두번째 조건은 판단하지 않는 것은? (OO OO OO)", "회로 단락 평가"};
        String[] problem4 = {"double ans = 3 / 2;에서 ans의 값은?", "1.0"};
        String[] problem5 = {"큰 타입에서 작은 타입으로 형변환을 하려면 OOO형변환이 필요하다", "명시적"};

        problemList.add(problem1);
        problemList.add(problem2);
        problemList.add(problem3);
        problemList.add(problem4);
        problemList.add(problem5);

        return problemList;
    }

    private static void calculator() throws IOException {
        StringBuilder sb = new StringBuilder();

        System.out.println("**계산기**");

        System.out.print("첫번째 수를 입력해주세요 : ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.print("두번째 수를 입력해주세요 : ");
        int num2 = Integer.parseInt(br.readLine());

        System.out.print("연산자를 입력해주세요(+, -, *, /) : ");
        char operation = br.readLine().charAt(0);

        switch (operation) {
            case '+':
                sb.append(num1 + num2);
                break;
            case '-':
                sb.append(num1 - num2);
                break;
            case '*':
                sb.append(num1 * num2);
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                sb.append(num1 / num2);
                break;
            default:
                throw new IllegalArgumentException("올바른 연산자를 입력하세요");
        }
        System.out.println(sb);
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
}
