package aula4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        float numero = scanner.nextFloat();

        scanner.close();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par!");
        } else {
            System.out.println("O número " + numero + " é ímpar!");
        }
    }
}
