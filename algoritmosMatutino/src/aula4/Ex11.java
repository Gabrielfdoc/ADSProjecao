package aula4;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        float primeiroNumero = scanner.nextFloat();

        System.out.println("Insira o segundo número: ");
        float segundoNumero = scanner.nextFloat();

        System.out.println("Insira o terceiro número: ");
        float terceiroNumero = scanner.nextFloat();

        scanner.close();

        if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero) {
            System.out.println("O maior número é o " + primeiroNumero + "!");
        } else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero) {
            System.out.println("O maior número é o " + segundoNumero + "!");
        } else {
            System.out.println("O maior número é o " + terceiroNumero + "!");
        }
    }
}
