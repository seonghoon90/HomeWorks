package Level_1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            while (true) { //반복문
            System.out.println("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int a = sc.nextInt();
            sc.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0);

            System.out.println("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int b = sc.nextInt();
            sc.nextLine();

            int result = 0;
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            boolean valid = true; // 연산의 유효성을 판단

            // 사칙연산 처리
            switch (operator) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        result = a / b;
                    }
                    break;
                default:
                    System.out.println("올바른 사칙연산 기호가 아닙니다."); // 올바르지 않은 연산자 처리
                    valid = false;
            }
            if (valid) {
                System.out.println("결과: " + result); // 최종 결과 출력
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다");
                    break;
                }
        }

    }
}
