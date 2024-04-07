package aula4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("Insira o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        if (numero1 >= numero2) {
            System.out.println("O número maior é o " + numero1 + "!");
        } else {
            System.out.println("O número maior é o " + numero2 + "!");
        }
    }
}
