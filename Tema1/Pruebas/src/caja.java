import java.util.Scanner;

public class caja {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ejey;

        System.out.println("dime el tamaño de la caja");
        ejey = sc.nextInt();

        for (int i = 0; i < ejey; i++) {

            for (int j = 0; j <ejey; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
