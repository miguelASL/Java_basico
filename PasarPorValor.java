public class PasarPorValor {
    public static void main(String[] args) {

        Integer i = 10;

        System.out.println("Iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("Finaliza el metodo test con i (se mantiene igual) = " + i);
    }

    public static void test(Integer i){
        System.out.println("iniciamos el metodo main con i = " + i);
        i = 35;
        System.out.println("Finaliza el metodo test con i = " + i);
    }
}
