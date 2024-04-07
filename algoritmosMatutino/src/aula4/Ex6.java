package aula4;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o preço do produto: ");
        float precoProduto = scanner.nextFloat();

        scanner.close();

        if (precoProduto >= 100) {
            float desconto = precoProduto * (10F / 100F);
            precoProduto = precoProduto - desconto;

            System.out.println("Parabéns, você ganhou um desconto de 10%, o novo preço do produto é: " +
                    precoProduto + "R$");
        } else if (precoProduto > 0) {
            System.out.println("Apenas compras acima de 100R$ recebem desconto, seu produto custará: " + precoProduto +
                    "R$");
        } else {
            throw new IllegalArgumentException("O produto deve custar no mínimo 1 real!");
        }
    }
}
