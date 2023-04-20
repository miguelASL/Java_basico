import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploUtilDate {
    public static void main(String[] args) {

        //Para ver varias versiones mirar en google "simpledateformat java 14" y mirar documentacion.

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        String fechaStr = df.format(fecha);

        long j = 0;
        for (int i = 0; i < 10000000; i++){
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime()- fecha.getTime();
        System.out.println("tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);
    }
}
