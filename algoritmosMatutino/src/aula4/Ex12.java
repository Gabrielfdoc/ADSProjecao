package aula4;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        float numero = scanner.nextFloat();

        scanner.close();

        if (numero % 5 == 0 && numero % 7 == 0) {
            System.out.println("O número " + numero + " é divisivel por 5 e 7!");
        } else {
            System.out.println("O número " + numero + " não é divisivel por 5 e 7!");
        }
    }
}
