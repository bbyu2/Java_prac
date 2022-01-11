import javax.print.attribute.SupportedValuesAttribute;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // System.out.println("Say Thx!");

        // 배열 예제
        // int score[] = new int[5];
        // int k = 1;

        // score[0] = 50;
        // score[1] = 60;
        // score[2] = 70;
        // score[3] = 80;
        // score[4] = 90;

        // //for 문으로 배열의 모든 요소를 출력한다.
        // for(int i=0; i<5; i++) {
        // System.out.printf("score[%d]:%d%n", i, score[i]);
        // }

        // // array length
        // System.out.printf("length : %d%n", score.length);

        // ArrayIndexOutOfBoundsException
        // System.out.printf("score[%d]:%d\n", 7, score[7]);

        // 배열 초기화

        // 문제) score 배열에 50, 60, 70, 80, 90 을 입력하고 순서대로 출력하시오.
        // int score[] = new int[]{50,60,70,80,90};

        // for (int i=0; i<5; i++) {
        // System.out.println(score[i]);
        // }

        // 문제) chArr 배열에 a, b, c, d, e 를 입력하고 순서대로 출력하시오.
        // char chArr[] = new char[]{'A','B','C','D','E'};
        // String strArr[] = new String[]{"A", "B", "C", "D", "E"};

        // String str = "";
        // int total = 0;
        // for(char i:chArr) {
        // str += i + "\n";
        // }
        // System.out.println(str);

        // 문제) boolArr 배열에 true, false, true, true, false 를 입력하고 순서대로 출력하시오.
        // boolean boolArr[] = new boolean[]{true, false, true, true, false};
        // for(int i=0; i<boolArr.length; i++) {
        // System.out.println(boolArr[i]);
        // }

        // 문제) score 배열에 50, 60, 70, 80, 90 을 입력하고 처음 값과 마지막 값을 더한 다음 출력하시오.
        // int score[] = {50,60,70,80,90};
        // System.out.printf("%d+%d = %d", score[0], score[4], score[0]+score[4]);

        // 문제) 배열에 100, 88, 100, 100, 90 을 입력하고 총합과 평균을 출력하시오
        // int arr[] = {100, 88, 100, 100, 90};
        // int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        // float ave = (arr[0]+arr[1]+arr[2]+arr[3]+arr[4])/arr.length;
        // System.out.println(sum+" , "+ave);

        // 최대값과 최소값
        // int[] score = {79, 88, 91, 33, 100, 55, 95};

        // int max = score[0];
        // int min = score[0];

        // for(int i=1; i < score.length; i++) {
        // if(score[i] > max) {
        // max = score[i];
        // } else if(score[i] < min) {
        // min = score[i];
        // }
        // }

        // System.out.println("max:" + max);
        // System.out.println("min:" + min);

        // 문제) 변수 a, 변수 b 의 값을 서로 교환하고 출력하시오.
        // int a = 10, b = 20, temp = 0;

        // System.out.println("a는 " + a);
        // System.out.println("b는 " + b);

        // temp = a;
        // a = b;
        // b = temp;

        // System.out.println("a는 " + a);
        // System.out.println("b는 " + b);

        // 문제) 배열에 75, 100, 85, 60, 95 를 입력하고, 높은 점수순으로 rank를 표시하시오.
        // int[] score = new int[]{75,100,85,60,95};
        // int rank = 1;
        // for(int i=0;i<score.length;i++){
        // for(int j=0; j<score.length;j++){
        // if(score[i] < score[j]){
        // rank += 1;
        // }
        // }
        // System.out.println(score[i]+" "+rank);
        // rank=1;
        // }

        //// 섞기(Shuffle)
        // int[] numArr = new int[10];
        // for (int i = 0; i < numArr.length; i++) {
        // numArr[i] = i;
        // System.out.println(numArr[i]);
        // }

        // System.out.println();

        // for (int i = 0; i < 100; i++) {
        // int n = (int) (Math.random() * 10);
        // int tmp = numArr[0];
        // numArr[0] = numArr[n];
        // numArr[n] = tmp;
        // }

        // for (int i = 0; i < numArr.length; i++)
        // System.out.print(numArr[i] + "\n");

        // 임의의 값으로 배열채우기
        // int[] arr = new int[5];

        // for(int i = 0; i < arr.length; i++) {
        // arr[i] = (int)(Math.random() * 5);
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // 문제)거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
        // int[] changeMny = { 1000, 500, 100, 50, 10 };
        // System.out.print("거스름돈 : 2860원");
        // int money = 2860;

        // for (int i = 0; i <= changeMny.length - 1; i++) {
        // System.out.print(" / " + changeMny[i] + "원:" + money / changeMny[i] + "개");
        // money %= changeMny[i];
        // }

        // int money = 2860;
        // int[] coin = new int[] { 500, 100, 50, 10 };

        // int count = 0;

        // for (int i = 0; i < coin.length; i++) {
        // System.out.println("현재돈 : " + money);
        // System.out.println("얼마짜리로 거슬러 줄지 : " + coin[i]);

        // count += money / coin[i]; // 낸돈에서 500원짜리부터 나눈 몫을 count에 더해줌
        // money %= coin[i]; // 낸돈에서 500짜리부터 나눈 나머지를 다시 money에 할당

        // System.out.println("현재 받은 동전 개수 : " + count);
        // System.out.println("*****************************");
        // }

        // System.out.println("거슬러줄 동전 개수 : " + count);

        // 문제) 1~5 사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
        // int arr[] = new int[10];

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = (int) (Math.random() * 10);
        // }
        // System.out.println(arr[10]);

        // 선택정렬(Selection Sort)
        // int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        // int tmp;
        // for(int i = 0; i < arr.length; i++){
        // int minIndex = i;
        // for(int j = i+1; j<arr.length; j++){
        // if(arr[minIndex] > arr[j]){
        // minIndex = j;
        // }
        // }
        // tmp = arr[i];
        // arr[i] = arr[minIndex];
        // arr[minIndex] = tmp;
        // }
        // System.out.println(Arrays.toString(arr));

        // 삽입정렬(Insertion Sort)
        // int arr[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        // for(int i = 1; i < arr.length; i++) {
        // for(int j = i; j >= 1; j--){
        // if(arr[j] < arr[j-1]){
        // int tmp = arr[j];
        // arr[j] = arr[j-1];
        // arr[j-1] = tmp;
        // }else
        // break;
        // }
        // }
        // System.out.println(Arrays.toString(arr));

        // 퀵 정렬

        // int array[] = { 5, 7, 9, 0, 3, 1, 6, 2, 4, 8 };

        // quickSort(array, 0, array.length - 1);

        // for (int i : array) {
        //     System.out.printf("%d ", i);
        // }
        // ;

        // 2
        // public static void quickSort(int array[], int start, int end){

        // if(start >= end) //원소가 1개인 경우 종료
        // return;

        // int pivot = start; //피벗은 첫 번째 원소
        // int left = start+1;
        // int right = end;

        // while ( left <= right){

        // //피벗보다 큰 데이터를 찾을 때까지 반복
        // while (left <= end && array[left] <= array[pivot])
        // left+=1;

        // //피벗보다 작은 데이터를 찾을 때까지 반복
        // while(right > start && array[right] >= array[pivot])
        // right-=1;

        // if(left > right){ // 엇갈렸다면 작은 데이터와 피벗을 교체
        // int tmp = array[right];
        // array[right] = array[pivot];
        // array[pivot] = tmp;
        // }else{ //엇갈리지 않았다면 적은 데이터와 큰 데이터를 교체
        // int tmp = array[right];
        // array[right] = array[left];
        // array[left] = tmp;
        // }

        // //분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
        // quickSort(array, start, right -1);
        // quickSort(array, right +1, end);
        // }

        // 4. String 배열
        String[] name = new String[3]; // 3개의 문자열을 담을 수 있는 배열을 생성한다.
        name[0] = "kim";
        name[1] = "park";
        name[2] = "yi";

        //문제) 향상된 for 문을 사용해 String 배열  name의 값을 출력하시오
        

    }
}
