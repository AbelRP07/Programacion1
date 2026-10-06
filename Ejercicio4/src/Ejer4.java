import java.util.Scanner;

public class Ejer4 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("cual es tu edad?");
        int num1 = sc.nextInt();
        if (num1 <= 12)
            System.out.println("eres un niño");
        else if (num1 <= 17)
            System.out.println("eres un adolescente");
        else if (num1 <= 29)
            System.out.println("eres un adulto");
    }
}

