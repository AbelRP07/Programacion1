import java.util.Scanner;

public class EjemBucle2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int n1 = sc.nextInt();

        if (n1 <= 1) {
            System.out.println("introduce un numero mayor que 1");
        } else {
            int divisor = 2;
            while  (n1 % divisor !=0){
                divisor++;
            }
            System.out.println("el primer divisor de " + n1 + "es " + divisor);
        }
    }
}
