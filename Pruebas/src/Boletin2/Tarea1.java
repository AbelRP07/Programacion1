package Boletin2;

import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        int invertido=0;
        while (numero > 0) {
            int ultimoDigito = numero % 10;
            invertido = (invertido * 10) + ultimoDigito;
            numero = numero / 10;
        }
        System.out.printf("Tu numero invertido es %d" , invertido);



    }
}
