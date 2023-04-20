public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a" + Byte.BYTES);
        System.out.println("tipo byte corresponde en byte a" + Byte.SIZE);
        System.out.println("tipo byte corresponde en byte a" + Byte.MAX_VALUE);
        System.out.println("tipo byte corresponde en byte a" + Byte.MIN_VALUE);

        short numeroShort = 3000;
        System.out.println("numeroByte = " + numeroShort);
        System.out.println("tipo short corresponde en byte a" + Short.BYTES);
        System.out.println("tipo short corresponde en byte a" + Short.SIZE);
        System.out.println("tipo short corresponde en byte a" + Short.MAX_VALUE);
        System.out.println("tipo short corresponde en byte a" + Short.MIN_VALUE);

        int numeroInt = 32768;
        System.out.println("numeroByte = " + numeroInt);
        System.out.println("tipo int corresponde en byte a" + Integer.BYTES);
        System.out.println("tipo int corresponde en byte a" + Integer.SIZE);
        System.out.println("tipo int corresponde en byte a" + Integer.MAX_VALUE);
        System.out.println("tipo int corresponde en byte a" + Integer.MIN_VALUE);

        long numeroLong = 2147483648L; //ojo aqui tiene que llevar la "L" al final.
        System.out.println("numeroByte = " + numeroLong);
        System.out.println("tipo long corresponde en byte a" + Long.BYTES);
        System.out.println("tipo long corresponde en byte a" + Long.SIZE);
        System.out.println("tipo long corresponde en byte a" + Long.MAX_VALUE);
        System.out.println("tipo long corresponde en byte a" + Long.MIN_VALUE);

        var numeroVar = 127; /*por defecto sera un numero entero. a menos que le pongamos la "L" al fina.*/
    }
}
