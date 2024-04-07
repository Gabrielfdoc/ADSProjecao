package aula4;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira quantas maçãs deseja comprar: ");
        int macasCompradas = scanner.nextInt();

        scanner.close();

        float precoNormal = 0.30F;
        float precoFinal;

        if (macasCompradas < 12 && macasCompradas > 0) {
            precoFinal = macasCompradas * precoNormal;

            System.out.println("O valor total da compra é de: " + precoFinal + "R$");
        } else if (macasCompradas >= 12) {
            int quantidadeDeDuzias = macasCompradas / 12;
            int macasNaoDuzias = macasCompradas % 12;

            precoFinal = (quantidadeDeDuzias * 3) + (macasNaoDuzias * precoNormal);
            //Multiplico por 3 pois o valor de uma dúzia será sempre 3 reais.

            System.out.println("O valor total da compra é de: " + precoFinal + "R$");
        } else {
            throw new IllegalArgumentException("O número de maçãs compradas deve ser de no mínimo 1!");
        }
    }
}
