import java.util.*;
import javax.xml.soap.Text;

public class Switch {
    public static void main(String[] args) {

        // month를 기준으로 몇월인지 묻는 문제
        // int month = 12;
        // String monthString = "";
        // switch (month) {
        // case 1: monthString = "January";
        // break;
        // case 2: monthString = "February";
        // break;
        // case 3: monthString = "March";
        // break;
        // case 4: monthString = "April";
        // break;
        // case 5: monthString = "May";
        // break;
        // case 6: monthString = "June";
        // break;
        // case 7: monthString = "July";
        // break;
        // case 8: monthString = "August";
        // break;
        // case 9: monthString = "September";
        // break;
        // case 10: monthString = "October";
        // break;
        // case 11: monthString = "November";
        // break;
        // case 12: monthString = "December";
        // break;
        // default: monthString = "Invalid month";
        // break;
        // }
        // System.out.println(monthString);

        // 문제) Switch / case문을 사용하여 짝수이면 "짝수입니다." 홀수이면 "홀수입니다."를 출력하시오.
        // int num = 2;
        // String text = "";
        // switch (num % 2) {
        //     case 1:
        //         text = "홀수";
        //         break;
        //     case 0:
        //         text = "짝수";
        //         break;
        //     default:
        //         text = "none";
        //         break;
        // }
        // System.out.println(text);

        //2
         Scanner sc = new Scanner(System.in);
         System.out.println("짝수일까요?  홀수일까요? 숫자를 입력하세요.");
         int num = sc.nextInt();
         switch (num % 2) {
                case 1:
                    System.out.println("홀수입니다");
                    break;
                case 0:
                  System.out.println("짝수입니다");
                    break;
                default:
                    System.out.println(" ");
                    break;
            }

        //단항 연산자
        // i++, i--, ++i, --i, +i, -i, !b

        //이항 연산자
        // a + b, a - b, a * b, a / b, a % 2

        //삼항 연산자
        //num % w == 0 ? 1 : 2
        // (num % 2 == 0) ? 1 : 2
        // (조건식)?(참이면):(거짓이면)
        
        
    }
}