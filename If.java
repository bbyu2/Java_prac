// import java.util.*;

// public class If {
//     public static void main(String[] args) {

//     if (true) {
//         System.out.println("실행1");
//     }

//     if(false) {
//         System.out.println("실행2");
//         System.out.println("실행3");
//     }

//     int a = 6;
//     if (a%2 == 0) {
//         System.out.println(a+"는 2의 배수");
//     }


// If example
//     class IfExam1 {
//         public static void main(String[] args) {
//           int input;
//           System.out.print("숫자를 하나 입력하세요.>");
//           Scanner scanner = new Scanner(System.in);
//           String tmp = scanner.nextLine();
//           input = Integer.parseInt(tmp);
//           if(input==0) {
//             System.out.println("입력하신 숫자는 0입니다.");
//           }
//           if(input==0) {
//             System.out.println("입력하신 숫자는 0이 아닙니다.");
//             System.out.printf("입력하신 숫자는 %d입니다.", input);
//           }

        //문제) 키보드로 입력받은 숫자가 10보다 작으면 "10보다 작습니다."를 출력하시오.
        // System.out.println("정수를 입력하시오 : ");
        // Scanner scanner = new Scanner(System.in);
        // int num = scanner.nextInt();
        // if(num<10){
        //     System.out.println("10보다 작습니다");
        // }
        // else {
        //     System.out.println("10보다 큽니당");
        // }
        // scanner.close();


//문제)키보드로 입력받은 숫자가 2로 나누었을때 나머지가 0이면 "짝수입니다."를 출력하시오.
// import java.util.*;

// public class If {
//     public static void main(String[] args) {
        
        
//문제) 변수 a 는 4 이면서, 변수 b 는 짝수이고, 변수 c 는 true 가 아닐 경우 "정답입니다."를 출력하시오.
// import java.util.*;

// public class If {
//     public static void main(String[] args) {
//         int a = 0;
//         int b = 0;
//         boolean c = false;
        
//         if(a == 4 && b%2 == 0 && c != true) {
//             System.out.println("정답입니다");
//         }
//     }
// }
       
       
//문제) 변수 a 가 10보다 크거나 5보다 작으면서 변수 b가 홀수일 경우 "정답입니다."를 출력하시오.
// import java.util.*;

// public class If {
//     public static void main(String[] args) {
//         int A = 0;
//         int b = 0;
//         boolean c = false;
        
//         if(a == 4 && b%2 == 0 && c != true) {
//             System.out.println("정답입니다");
//         }
//     }
// }     


//문제) 변수 a 가 -10보다 작거나 같고, 변수 b가 10보다 작으면서, a * b 가 100보다 크면 "정답입니다."를 출력하시오




// 2. if else 문
// 예제4
// int money = 2000;
// if (money >= 3000) {
//     System.out.println("택시ㄱ");
// }else {
//     System.out.println("걸어가세요");
// }

// import java.util.*;

// public class If {
//     public static void main(String[] args) {
        //예제5
        // int money = 2000;
        // boolean hasCard = true;

        //  if (money>=3000 || hasCard) {
        //      System.out.println("택시를 타고가랑");
        //  } else {
        //      System.out.println("걸어가랑");
        //  }

        // 문제) 키보드로 입력받은 숫자가 짝수이면 "짝수", 홀수이면 "홀수"를 출력하시오.
        // System.out.println("숫자를 입력하세요");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        //     System.out.println("짝수");
        // }else {
        //     System.out.println("홀수");
        // }
        // sc.close();

        //문제) 0~100까지의 난수를 생성하여 아래와 같이 출력하시오.

        // double dValue = Math.random();  //난수발생코드
        // int randomValue = (int)(dValue * 100); // 0~100난수 발생
        
        // if(randomValue > 90) {
        //     System.out.println("수");
        // } else if(randomValue > 80) {
        //     System.out.println("우");
        // } else if(randomValue > 70) {
        //     System.out.println("미");
        // } else if(randomValue > 60) {
        //     System.out.println("양");
        // } else {
        //     System.out.println("가");
        // }
        
        //문제) 정수 3개를 비교하여 최댓값을 구하시오.
        // int a = 10, b = 20, c = 9;
        // int max;

        // if (a > b && a > c ){
        //     max = a;
        // } else {
        //     if (b > c) {
        //         max = b;
        //     } else {
        //         max = c;
        //     }
        // }
        // System.out.println("max = " + max);

        //문제)
        // int age = 18;

        // if (age>=20 && age<30) {
        //     System.out.println("20대");
        // } else if (age<20) {
        //     System.out.println("잼미니");
        // } else if (age > 29 && age < 40) {
        //     System.out.println("30대");
        // } else if (age > 39 && age < 50) {
        //     System.out.println("40대");
        // } else {
        //     System.out.println("40대 이상");
        // }

        //문제) else if를 사용하여 주사위의 번호를 뽑으시오.
        // int num = (int) (Math.random() * 6) + 1; // 1~6의 랜덤변수
        // System.out.println(num + "번이 나왔습니다~");
        
        //문제) userID가 1이면 관리자 2이면 판매자 3이면 구매자이다. 
        //userID를 확인하여 누가 로그인했는지 출력하시오.
        // int userID = 3;

        // if(userID == 1) {
        //     System.out.println("관리자입니다. 어서오세요");
        // } else if(userID == 2) {
        //     System.out.println("판매자입니다. 화이팅");
        // } else {
        //     System.out.println("구매자입니다. 많이 사세요!");
        // }

        //2
        // Scanner sc = new Scanner(System.in);
        // System.out.print("userID를 입력하세요: ");
        // int userID = sc.nextInt();
        // if (userID == 1) {
        //     Scanner sc1 = new Scanner(system.in);
        //     System.out.print("패스워드를 입력하세요");
        // }


        // }}