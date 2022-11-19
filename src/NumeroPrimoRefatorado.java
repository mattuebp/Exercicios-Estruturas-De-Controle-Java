import java.util.Scanner;

public class NumeroPrimoRefatorado {
    public static void main(String[] args) {
        //  Criar um programa que receba um número e diga se ele é um número primo, utilizando o switch.

        Scanner teclado = new Scanner(System.in);
        String entrada = "";
        while (!entrada.equalsIgnoreCase("sair")) {
            System.out.println("Digite um número para verificar se é primo," +
                    " ou digite 'sair' para sair do programa: ");
            entrada = teclado.next();
            int numero = Integer.parseInt(entrada);

            if (numero == 2)
                System.out.println("O número é primo!");
            else {
                loop: for (int i = 2; i != numero; i++) {
                    int verificacao = numero % i;
                    switch (verificacao){
                        case 0:
                            System.out.println("O número não é primo!");
                            break loop;
                        default:
                            System.out.println("O número é primo!");
                            break loop;
                    }
                }
            }
        }
        teclado.close();
    }
}
