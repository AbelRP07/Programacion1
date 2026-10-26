package Boletin4;

import java.io.PrintStream;
import java.util.Scanner;

public class Tarea44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HoraB;
        int MinB;
        int SegB;
        int HoraSuma;
        int MinSuma;
        int SegSuma;

        do {
            System.out.println("dime la hora");
            HoraB = sc.nextInt();
            if (HoraB < 00 || HoraB > 24) {
                System.out.println("introduce las horas entre 00-24");
            }
        }while (HoraB < 00 || HoraB >24);

        do {
            System.out.println("dime los minutos");
            HoraB = sc.nextInt();
            if (MinB < 00 || MinB > 24) {
                System.out.println("introduce los minutos entre 00-60");
            }
        }while (MinB < 00 || MinB >60);

        do {
            System.out.println("dime los segundos");
            HoraB = sc.nextInt();
            if (SegB > 00 && SegB < 60) {
                System.out.println("introduce los segundos entre 00-60");
            }
        }while (SegB < 00 || SegB >24);


    }
}
