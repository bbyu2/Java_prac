import java.util.*;

public class For {
    public static void main(String[] args) {
        // int sum = 0;

        // for(int i=1; i <= 100; i++) {
        //     sum = sum + i;
        // }
        // System.out.println("1~100까지의 합 :" + sum);

        //문제) 1부터 5까지 숫자를 출력하시오.
        // int num = 1;

        // for(int i=1; i <= 5; i++) {
        //    num = i;
        //    System.out.println(num);
        // }
        
        //문제) 93부터 50까지 합을 출력하시오.
        // int sum = 0;

        // for(int i = 93; 49 < i; i--) {
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        // 문제) 아래와 같은 별 모양을 출력하시오.
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println( );
        // }

        // 중첩 for문
        // int n = 0;
        // for(int i=0; i<5; i++) {
        //     for(int j=0; j<5; j++) {
        //         n += 1; // n = n+1;
        //         System.out.print(n+"\t");
        //     }
        //     System.out.println();
        // }

        //문제)아래의 별 모양을 출력하시오.
        // for (int i = 1; i <= 10; i++){
        //     for (int j = 1; j <=10; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //문제)2~9단 구구단을 만들어봅시다
        // for (int i = 2; i < 10; i++) {
        //     System.out.println(i + "단");
        //     for (int j = 1; j < 10; j++) {
        //        System.out.printf("%d x %d = %d\n",i,j,i*j);
        //     }
        //     System.out.println();
        //  }

        //문제)1~100까지 숫자중 3과 5의 배수 출력
        // int sum = 0;
        // for(int i = 1; i <= 100; i++) {
        //     if(i % 3 == 0 && i % 5 == 0) {
        //         sum += i;
        //         System.out.print(i + " ");
        //     }
        // }
        // System.out.println("\n합계" + sum);

        //문제) 한개의 정수를 입력받아서 그 수의 배수를 차례로 10개 출력하는 프로그램
        System.out.print("숫자를 입력하세요 : ");
        int num = new Scanner(System.in).nextInt();

        for(int i = num; i <= num*10; i+=num) {
            System.out.print(i + " ");
        }



    }
}
