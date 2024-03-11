package aula2;

import java.util.Scanner;

/**
 * Crie um programa que troque o valor de duas variáveis.
 */
public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int primeiroValor = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int segundoValor = scanner.nextInt();
        int aux;

        aux = segundoValor;
        segundoValor = primeiroValor;
        primeiroValor = aux;

        System.out.println("O novo primeiro valor é: " + primeiroValor);
        System.out.println("O novo segundo valor é: " + segundoValor);
    }
}
