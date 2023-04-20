import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        //calendario.set(2023,3, 18, 19, 20 , 50);
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);

    }
}
