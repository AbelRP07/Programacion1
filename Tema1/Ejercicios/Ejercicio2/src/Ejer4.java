import java.util.Scanner;

public class Ejer4 {
    static void main(String[] args){
        System.out.println("Cual es tu edad?");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if (num1 <= 12)
            System.out.println("Eres un niño");
        else if (num1 <= 17) {
            System.out.println("eres un adolescente");
        }
        else if (num1 <= 29){
            System.out.println("eres un adulto");
        }
    }
}
