import java.util.Scanner;

public class EjerciciosOperadoresLogicos {
    public static void main(String[] args) {

        String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "Nordin";
        passwords[0] = "5678";

        usernames[1] = "Miguel";
        passwords[1] = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username: ");

        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutentico = false;

        for( int i = 0; i < usernames.length; i++ )
            if( usernames[i].toLowerCase().equals(u) && passwords[i].toLowerCase().equals(p)){
                esAutentico = true;
                break;
            }else{
                System.out.println("Username o password incorrecto");
            }

        if(esAutentico){
            System.out.println("Bienvenido usuario ".concat(u).concat(" ! "));
        } else{
            System.out.println("Lo siento, requiere autenticacion");
        }
    }
}
