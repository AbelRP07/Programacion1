import java.util.Scanner;

public class Programa6 {
    static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("dime el primer numero");
        int num1 = teclado.nextInt();

        System.out.println("dime el segundo numero");
        int num2 = teclado.nextInt();

        int resultado = 0;

        for (int i = 0; i<num2; i++){
            resultado = resultado + num1;

        }
        System.out.println("el resultado es " + resultado);
    }

}
