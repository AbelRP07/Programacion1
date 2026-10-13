import java.util.Scanner;

public class Programa3 {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean esValido = false;
        int  contador;

        do {
            System.out.println("Cuantos numeros me vas a decir?");
            contador = scanner.nextInt();
            if (contador > 0) {
                esValido = true;

            } else System.out.println("has introducido un numero que no es valido");
        }while (!esValido);

        for (int i = 0; i < contador; i++) {
            System.out.println("introduce el numero");
            int numero1 = scanner.nextInt();
            if (numero1 %2 == 0){
                System.out.printf("%d es un numero par\n" ,numero1);
            }else System.out.printf("%d no es par\n" ,numero1);
        }
    }
}
