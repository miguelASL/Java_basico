public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Miguel";

        System.out.println("nombre.length() = " + nombre.length()); //aqui length es un metodo por eso lleva "()".
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Miguel\") = " + nombre.equals("Miguel"));
        //System.out.println("nombre.CompareTo(\"Miguel\") = " + nombre.compareTo("Miguel"));
        System.out.println("nombre.CompareTo(\"Nordin\") = " + nombre.compareTo("Nordin"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println(" nombre.charAt(nobre.length()-1 = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.subtring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length()-1 = " + nombre.substring(nombre.length()-1));
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.IndexOf = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a')  = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length; // aqui el length es un atributo por eso va sin "()".
        System.out.println("largo = " + largo);
        for(int i = 0 ; i < largo; i ++){
            System.out.print("arreglo[i] = " + arreglo[i]); // diferencia en el "print".
            System.out.println("arreglo = " + arreglo[i]); // diferencia en el "println".
        }
    }
};