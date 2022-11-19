import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Soletrando {
    public static void main(String[] args) {
        //  Criar um programa que receba uma palavra e imprime no console letra por letra.

        System.out.println("Digite uma palavra para imprimir sua sequência de letras.");
        Scanner teclado = new Scanner(System.in);
        String palavra = teclado.next();
        for (int i = 0; i <= palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }
        teclado.close();
    }
}
