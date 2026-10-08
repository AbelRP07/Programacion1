import java.util.Scanner;

public class Ejer5 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primero de 4 numeros");
        int  num1  = sc.nextInt();
        System.out.println("Dime el segundo numero");
        int  num2  = sc.nextInt();
        System.out.println("Dime el tercer numero");
        int  num3  = sc.nextInt();
         System.out.println("Dime el cuarto numero");
        int  num4  = sc.nextInt();

        double media = ((num1 + num2 + num3 + num4) / 4.0);

        System.out.println("la media es " + media);

        if (num1 > media)
            System.out.println("el primer numero es mayor");
        if (num2 > media)
            System.out.println("el segundo numero es mayor");
        if (num3 > media)
            System.out.println("el tercer numero es mayor");
        if (num4 > media)
            System.out.println("el cuarto numero es mayor");

    }
}
