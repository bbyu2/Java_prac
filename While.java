import java.util.*;


public class While {
    public static void main(String[] args) {
        // int i=1; // 초기값 설정
		// while (i<=10) { // 조건식 
		// 	System.out.println(i+". joker"); // 실행문
		// 	i++; // 증감식
        // }

        int sum = 0, odd = 0, even = 0; //합계 계산을 위한 초기값 할당
        int i = 1; // 반복문 초기값 할당
        while (i <= 100) { // 반복문 조건식
            sum += i; // sum = sum + i; 총합
            if (i % 2 == 0)  { // 짝수 조건식
                even += i; // even = even + i; 짝수 합
            } else {
                odd += i; // odd = odd + i; 홀수 합
            }
            i++; //증감식
        }
        System.out.println("1~100 합= " + sum); 
        System.out.println("1~100 짝수합= " + even);
        System.out.println("1~100 홀수합= " + odd);

		// boolean stop = false;
		// int num;
		// while (!stop) { // true를 의미
		// 	System.out.println("2개의 정수 입력");
		// 	Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		// 	int num1 = sc.nextInt(); // 콘솔창을 통해 값을 입력을 받음
		// 	int num2 = sc.nextInt(); // 콘솔창을 통해 값을 입력을 받음
		// 	num = num1 % num2; // 나머지 구하는 공식
		// 	System.out.println(num1 + " % " + num2 + " = " + num);
		// 	System.out.println("계속 Y, 종료 N 입력");
		// 	String yn = sc.next(); // 콘솔창을 통해 값을 입력을 받음
		// 	if (yn.equals("Y") || yn.equals("y")) { // Y 또는 y 입력시 반복
		// 		System.out.println("---------------------");
		// 		continue; // 보조제어문(반복 계속)
		// 	}
		// 	if (yn.equals("N") || yn.equals("n")) { // N 또는 n 입력시 종료
		// 		break; // 보조제어문(반복 종료)
		// 	}
		// }
		// System.out.println("시스템이 종료되었습니다.");

        //4. do ~ while문

        }
    }
