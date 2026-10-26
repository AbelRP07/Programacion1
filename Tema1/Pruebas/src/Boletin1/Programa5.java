package Boletin1;

import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean esValido = false;
        int num1;
        int contador;

        while (!esValido){
            System.out.println("dime un numero");
            contador = scanner.nextInt();
            if (contador < 0) {
                esValido = false;
                 System.out.println("el numero es negativo");


            } else System.out.println("el numero es positivo");
        }


    }
}
