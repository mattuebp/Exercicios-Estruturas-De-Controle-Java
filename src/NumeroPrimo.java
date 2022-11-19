import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        // programa que receba um número e diz se ele é um número primo.

        Scanner teclado = new Scanner(System.in);
        String resposta = "O número é primo!";
        System.out.println("Digite um numero para saber se ele é primo: ");
        int numero = teclado.nextInt();
        for (int i = 2; i < numero; i++) {
            if (numero > 2 && numero % i == 0){
                resposta = "O numero não é primo!";
                break;
            }
        }
        System.out.println(resposta);
        teclado.close();
    }
}
