import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistemas {
    public static void main(String[] args) {

        try{
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties((System.getProperties()));
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizda", "Mi valor guardado en el objeo properties");

            System.setProperties(p);
            System.getProperties().list(System.out);
        } catch (Exception e){
            System.out.println("No existe el archivo = " + e);
        }

    }
}
