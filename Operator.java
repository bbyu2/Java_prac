public class Operator {
    public static void main(String[] args) {
        //증감연산자
        int i = 5;
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i); // 7
        i--;
        System.out.println(i); // 6
        i = i - 1;
        System.out.println(i); // 5

        System.out.println(i++); // 5, 후위연산이라고 함
        System.out.println(i); // 6
        System.out.println(++i); // 7
        System.out.println(i); //7

        i = -10;
        System.out.println(i);
        i = +i;
        System.out.println(i);
        i = -i;
        System.out.println(i);

        boolean power = false;
        System.out.println(power);
        power = !power;
        System.out.println(power);
        power = !power;
        System.out.println(power);

    }
}