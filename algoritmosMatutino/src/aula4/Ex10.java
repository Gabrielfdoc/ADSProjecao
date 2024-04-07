package aula4;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        float numero = scanner.nextFloat();

        scanner.close();

        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo!");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo!");
        } else {
            System.out.println("O número é zero!");
        }
    }
}
