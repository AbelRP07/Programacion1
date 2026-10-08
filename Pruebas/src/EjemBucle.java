import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class EjemBucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta un numero");
        int num = sc.nextInt();
        int i = 2;
        boolean encontrado = false;

        while (!encontrado) {
            if (num % i == 0) {
                encontrado = true;
            }
            i++;
        }
        System.out.println();

    }
}

