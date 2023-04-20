public class WrapperInteger {
    public static void main(String[] args) {
        /* Estas son ls forma de pasar un tipo de dato a otro tipo, ojo cada uno tiene un capacidad,
         si la sobrepasamos significa que habrá una perdida de memoria:

         byte = [-128, 127];
         short = [-32.768, 32.767];
         int = [-231 a 231-1];
         long = [-263 a 263-1];
         float = [1.4x10-45 a 3.4028235x1038];
         double = [4.9x10-324 a 1.7976931348623157x10308];

         */
        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;

        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}
