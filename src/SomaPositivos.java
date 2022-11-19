import java.util.Scanner;

public class SomaPositivos {
    public static void main(String[] args) {
        // Criar um programa que enquanto estiver recebendo números positivos,
        // imprime no console a soma dos números inseridos,
        // caso receba um número negativo, encerre o programa.
        // Tente utilizar a estrutura do while.

        Scanner teclado = new Scanner(System.in);
        int numeroPositivo = 0;
        int acumulo = 0;
        System.out.println("Digite numeros positivos para somar. Digite um negativo para sair do programa.");
        while (numeroPositivo >= 0){
            acumulo = acumulo + numeroPositivo;
            System.out.printf("O total acumulado até agora é: %d \n", acumulo);
            numeroPositivo = teclado.nextInt();
        }
        System.out.println("Você digitou um número negativo!");
        teclado.close();
    }
}
