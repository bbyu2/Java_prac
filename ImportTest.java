import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");

        System.out.println("오늘 날짜는 : " + date.toString());
        System.out.println("연재 시간은 : " + time.toString());
    }
}
