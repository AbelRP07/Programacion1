package Boletin1;

import java.util.Scanner;

public class Programacion7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeros;

        do {
            System.out.println("introduce los numeros que quiras calcular la media");
            numeros = sc.nextInt();
            if (numeros <= 0){
                System.out.println("inserta un numero positivo");
            }
        }while (numeros <= 0);

        int suma = 0;

        for (int i = 0; i < numeros; i++){
            System.out.println("introduce numeri "+ i);
            suma = suma + sc.nextInt();
        }
        System.out.println("La media es " + (double) suma / numeros);


    }

}
