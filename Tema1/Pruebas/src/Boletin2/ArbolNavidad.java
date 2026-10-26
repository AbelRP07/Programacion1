package Boletin2;

import java.util.Scanner;

public class ArbolNavidad {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ejey;

        System.out.println("puedes decirme el eje X del arbol");
        ejey = sc.nextInt();

        for (int i = 0; i < ejey; i++) {
            for (int j = 0; j < ejey - i - 1; j++)
                System.out.print(" ");

            for (int j = 0; j <i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
