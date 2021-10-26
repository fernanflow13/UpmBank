import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.printf("PlaceHolder seleccion (alta, crear cuenta, deposito, extraccion, transferencia, prestamo, datos)\n");
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.nextLine();
        switch (entrada) {
            case "alta":

                String nombre = Alta.nombre();
                String fechaNacimiento = Alta.fecha();
                int numDni = Alta.numDni();
                String letraDni = Alta.letraDni();
                String correo = Alta.correo();

                System.out.println("nombre: " + nombre + "\nfecha de nacimiento: " + fechaNacimiento + "\nDNI: " + numDni + letraDni + "\nemail: " + correo);

                break;

            case "crear cuenta":
                System.out.println("PH crear cuenta");
                String numCuenta = Cuentas.SICA();
                System.out.println(numCuenta);
                break;
            case "deposito":
                System.out.println("PH deposito");
                break;
            case "extraccion":
                System.out.println("PH extraccion");
                break;
            case "transferencia":
                System.out.println("PH transferencia");
                break;
            case "prestamo":
                System.out.println("PH prestamo");
                break;
            case "datos":
                System.out.println("PH datos");
                break;
            default:
                System.out.println("PH error_de_entrada");
                break;
        }
    }

}