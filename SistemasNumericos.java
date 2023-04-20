import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = Integer.parseInt(numeroStr);
        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        String resultad;
        int numeroBinario = 0b111110100;
        System.out.println("numero octal de " + numeroDecimal + " + " +Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("numero hexadecimal de  " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nnumero octal de " + numeroDecimal + " + " +Integer.toOctalString(numeroDecimal);
        mensaje += "\nnumero hexadecimal de  " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        JOptionPane.showInputDialog(null, mensaje);
    }
}
