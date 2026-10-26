import java.sql.SQLOutput;
import java.util.Scanner;

public class rectangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ejey;
        int ejex;

        System.out.println("dime el eje Y");
        ejey = sc.nextInt();
        System.out.println("Dime el eje X");
        ejex = sc.nextInt();

        for (int i = 0; i < ejey; i++) {

            for (int j = 0; j <ejex; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
