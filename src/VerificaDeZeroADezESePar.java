import java.util.Scanner;

public class VerificaDeZeroADezESePar {
    public static void main(String[] args) {
        // Esse programa recebe um numero e verifica se está entre 0 e 10 e se ele é par;

        Scanner teclado = new Scanner(System.in);
        String entrada = "";
        while (!entrada.equalsIgnoreCase("sair")){
            System.out.println("Digite um número para verificar se é primo," +
                    " ou digite 'sair' para sair do programa: ");
            entrada = teclado.next();
            Double numero = Double.parseDouble(entrada);

            String verificaIntervalo = numero <= 10 && numero >= 0 ?
                    "O numero está entre zero e dez, e " :
                    "O numero não está entre zero e dez, e ";

            String verificaParidade = numero % 2 == 0 ?
                    "o número é par!" :
                    "o numero é impar!" ;

            System.out.println(verificaIntervalo + verificaParidade);
        }
        teclado.close();
    }
}
