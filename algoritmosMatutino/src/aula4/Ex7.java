package aula4;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero >= 20 && numero <= 50) {
            System.out.println("O número " + numero + " está no intervalo de 20 a 50!");
        } else {
            System.out.println("O número " + numero + " não está no intervalo de 20 a 50!");
        }
    }
}
