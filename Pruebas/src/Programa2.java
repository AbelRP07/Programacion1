import java.util.Scanner;

public class Programa2 {
    static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("De que numero entre 1 y 9 quieres ver su tabla de multiplicar?");
        int n1 =0;

        do {
            System.out.println("introduzca un numero del 1 al 10");
            n1 = sc.nextInt();
        } while(n1 > 0 || n1 < 10);

        for (int i = 0; i < 11; i++){
            System.out.println(n1 + " x " + i + " = " + n1*i);
        }


    }
}
