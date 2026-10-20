import java.util.Scanner;

public class Programa9 {
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

            int numeroPositivo;
            int sumaDivisores;
            int divisor;


                do {
                    System.out.println("escribe un numero");
                    numeroPositivo = sc.nextInt();
                }while (numeroPositivo <1);

                sumaDivisores = 0;
                divisor = 1;

                while (divisor <= numeroPositivo/2){
                    if (numeroPositivo % divisor == 0){
                        sumaDivisores = sumaDivisores + divisor;
                    }
                    divisor++;
                }
                if (sumaDivisores == numeroPositivo) {
                    System.out.println("Es un numero perfecto");


                }


    }
}
