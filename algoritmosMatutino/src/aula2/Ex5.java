package aula2;

import java.util.Scanner;

/**
 * Peça ao usuário para inserir uma temperatura em graus Celsius e converta
 * para Fahrenheit usando a fórmula: F = C * 9/5 + 32.
 */

public class Ex5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        float tempCelsius = scanner.nextFloat();

        float tempFahrenheit = tempCelsius * 9/5 + 32;
        System.out.println("A temperatura em graus Fahrenheit é de : " + tempFahrenheit);
    }
}
