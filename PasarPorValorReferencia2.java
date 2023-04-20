class Persona{
    private String nombre;

    public void modicarNombre(String nuevoNombre){
        this.nombre = nuevoNombre; //"this" hacer referencia a la clase.
    }
    public String leerNombre() {
        return this.nombre;
    }
}
public class PasarPorValorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modicarNombre("Miguel");

        System.out.println("Iniciamos el metodo main");
        System.out.println("persona.leerNombre = " + persona.leerNombre());

        System.out.println("Antes de llamar al metodo test");

        test(persona);
        System.out.println("Despues de llamar al metodo test" );

        System.out.println("persona.leerNombre = " + persona.leerNombre());

        System.out.println("Finaliza el metodo main con los datos de la persona modificada !");
    }

    public static void test(Persona persona){
        System.out.println("iniciamos el metodo test");
        persona.modicarNombre("Itachi");
        System.out.println("Finaliza el metodo test");
    }
}
