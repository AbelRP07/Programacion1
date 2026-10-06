import java.util.Scanner;

public class Ejer3 {
    static void main(String[] args) {
        System.out.println("introduce un numero");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if (num1 % 2 == 0){
            System.out.println("es multiplo de 2");
        }
        if (num1 % 3 == 0){
            System.out.println("es multiplo de 3");
        }


    }
}

