import java.util.Scanner;

public class Programacion10 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int num;
        int factorial = 1;

        do {
            System.out.print("Introduce un numero entero positivo o cero");
            num = teclado.nextInt();

            if (num < 0) {
                System.out.println("el numero debe ser positivo o cero");
            }

        } while (num < 0);

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + num + " es " + factorial);


    }
}


