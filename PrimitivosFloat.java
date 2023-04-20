public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 10f; //OJO aqui tendremos que añadir la "f" al final.
        System.out.println("realFloat = " + realFloat);
        
        System.out.println("tipo float corresponde en byte a" + Float.BYTES);
        System.out.println("tipo float corresponde en byte a" + Float.SIZE);
        System.out.println("tipo float corresponde en byte a" + Float.MAX_VALUE);
        System.out.println("tipo float corresponde en byte a" + Float.MIN_VALUE);

        double realDouble = 3.4028235E39; //La "E" significa elevado.
        System.out.println("realDouble = " + realDouble);
        
        System.out.println("tipo double corresponde en byte a" + Double.BYTES);
        System.out.println("tipo double corresponde en byte a" + Double.SIZE);
        System.out.println("tipo double corresponde en byte a" + Double.MAX_VALUE);
        System.out.println("tipo double corresponde en byte a" + Double.MIN_VALUE);

        var varFlotante = 3.1416f; // Por defecto es double, pero si le quitamos el ."" sera entero.
        System.out.println("varFlotante = " + varFlotante);
        
    }
}
