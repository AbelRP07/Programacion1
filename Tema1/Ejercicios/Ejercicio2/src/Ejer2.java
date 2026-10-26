import javax.swing.*;
import java.util.Scanner;

public class Ejer2 {

    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("dime un numero");
        int num1 = teclado.nextInt();

        System.out.println("dime otro numero");
        int num2 = teclado.nextInt();


        if (num1 == num2)
            System.out.println("los numeros son iguales");
        else if (num1 > num2)
            System.out.println("el primer numero es mayor");
        else if (num1 < num2)
            System.out.println("el segundo nuero es mayor");


    }

}


