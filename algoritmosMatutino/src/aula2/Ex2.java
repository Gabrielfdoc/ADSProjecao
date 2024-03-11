package aula2;

import java.util.Scanner;

/**
 * Peça ao usuário um número e exiba o dobro e a metade do numero.
 */

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        double numero = scanner.nextInt();

        double dobro = numero * 2;
        double metade = numero / 2;

        System.out.println("O dobro de " + numero + " é: " + dobro);
        System.out.println("A metade de " + numero + " é: " + metade);
    }
}
