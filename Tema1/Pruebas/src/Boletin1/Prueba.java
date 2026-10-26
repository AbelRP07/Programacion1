package Boletin1;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int HoraB;
        int MinB;
        int SegB;
        int HoraSuma;
        int MinSuma;
        int SegSuma;

        System.out.println("dime una hora");
        HoraB = sc.nextInt();
        System.out.println("Dime los minutos");
        MinB = sc.nextInt();
        System.out.println("Dime los segundos");
        SegB = sc.nextInt();

        System.out.println("la hora es " + HoraB + " los minutos son " + MinB + " y los segundos son " + SegB);
    }
}

