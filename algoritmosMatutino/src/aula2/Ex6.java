package aula2;

import java.util.Scanner;

/**
 * Peça ao usuário para inserir o preço de um produto e um valor de desconto.
 * Calcule e mostre o preço com o desconto aplicado.
 */
public class Ex6 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o preço do produto: ");
        float preco = scanner.nextFloat();

        System.out.println("Insira o desconto em %: ");
        float desconto = scanner.nextInt();

        float valorDoDesconto = preco * (desconto / 100);
        float precoComDesconto = preco - valorDoDesconto;

        System.out.println("O preço com desconto aplicado é de: R$" + precoComDesconto);
    }
}