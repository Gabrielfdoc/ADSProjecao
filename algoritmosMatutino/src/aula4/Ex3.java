package aula4;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero % 5 == 0) {
            System.out.println("O número " + numero + " é múltiplo de 5!");
        } else {
            System.out.println("O número " + numero + " não é múltiplo de 5!");
        }
    }
}
