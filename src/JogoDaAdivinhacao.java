import java.util.Scanner;
import java.util.Random;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        // Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
        // O Jogador tem 10 tentativas para adivinhar o número gerado.
        // Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
        // e imprima se o número inserido é maior ou menor do que o número armazenado.

        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(100);
        System.out.println(numeroAleatorio); // mostrando o numero gerado para fins de teste.

        int numeroTentativas = 10;
        Scanner teclado = new Scanner(System.in);

        while (numeroTentativas != 0){
            System.out.printf("Você tem %d para tentar adivinhar um número entre 0 e 100! \n", numeroTentativas);
            int tentativa = teclado.nextInt();
            if (tentativa == numeroAleatorio) {
                System.out.println("Acertou!!");
                break;
            }
            else {
                numeroTentativas--;
            }
        }
        teclado.close();
    }
}
