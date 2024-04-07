package aula4;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        float numero = scanner.nextFloat();

        scanner.close();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número " + numero + " é múltiplo de 3 e 5");
        } else {
            System.out.println("O número " + numero + " não é múltiplo de 3 e 5");
        }
    }
}
