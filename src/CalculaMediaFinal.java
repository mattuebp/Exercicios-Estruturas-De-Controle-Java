
import java.util.Scanner;

public class CalculaMediaFinal {
    public static void main(String[] args) {
        // Recebe duas notas parciais, calcular a média final.
        // Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
        // Se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
        // Caso contrário imprime no console "Reprovado".

        Scanner teclado = new Scanner(System.in);
        double num = 0;
        int i = 0;
        System.out.println("Digite os numeros os quais deseja fazer a média: ");
        while (i < 2){
            num = num + teclado.nextDouble();
            i++;
        }
        teclado.close();
        System.out.println("O resultado da média entre os dois numeros informados é: " + num/i);
    }
}
