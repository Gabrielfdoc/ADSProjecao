package aula2;

import java.util.Scanner;

/**
 * Peça ao usuário para inserir o peso (em kg) e a altura (em metros). Calcule e
 * mostre o Índice de Massa Corporal (IMC).
 */
public class Ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o seu peso em kg: ");
        double peso = scanner.nextFloat();

        System.out.println("Insira sua altura em metros: ");
        double altura = scanner.nextFloat();

        double imc = peso / (altura * altura);
        System.out.printf("O seu IMC é de:  %.2f", imc);

    }
}
