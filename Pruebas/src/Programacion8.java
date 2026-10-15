import java.util.Scanner;

public class Programacion8 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();

        int menor = num;
        String respuesta;

        do {
            System.out.print("¿Desea introducir más números (S/N)? ");
            respuesta = teclado.next().toUpperCase();

            while (!respuesta.equals("S") && !respuesta.equals("N")) {
                System.out.print("Respuesta incorrecta. Introduzca S o N: ");
                respuesta = teclado.next().toUpperCase();
            }

            if (respuesta.equals("S")) {
                System.out.print("Introduce un número: ");
                num = teclado.nextInt();

                if (num < menor) {
                    menor = num;
                }
            }

        } while (!respuesta.equals("N"));

        System.out.println("El menor de los números introducidos es: " + menor);

        teclado.close();
    }
}


