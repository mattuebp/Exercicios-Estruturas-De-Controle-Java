import java.util.Scanner;

public class ImprimeOMaior {
    public static void main(String[] args) {
        // Crie um programa que recebe 10 valores e ao final imprima o maior número.
        Scanner teclado = new Scanner(System.in);
        int maiorNumero = 0;
        System.out.println("Digite uma sequencia de 10 números.\n");

        int i = 1;
        while (i <= 10){
            int entrada = teclado.nextInt();
            if (entrada > maiorNumero) {
                maiorNumero = entrada;
            }
            i++;
        }
        System.out.printf("O maior número da sequencia foi o %d.", maiorNumero);
        teclado.close();
    }
}
