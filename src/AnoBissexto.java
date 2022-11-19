import java.util.*;
import java.time.*;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        //  Esse programa recebe um ano e verifica se é bissexto;

        LocalDate data = LocalDate.now();
        String resposta = data.isLeapYear() ? "O ano atual é bissexto!" : "O ano atual não é bissexto!";
        System.out.println(resposta);
    }
}
