package aula2;

import java.util.Scanner;

/**
 * Peça ao usuário que insira um valor em reais e uma taxa de câmbio. Calcule e
 * mostre o equivalente em dólares.
 */
public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor em reais: ");
        double reais = scanner.nextDouble();

        if (reais > 0) {
            System.out.println("Insira aqui a taxa de câmbio atual do real para o dólar: ");
            double taxaCambial = scanner.nextDouble();
            if (taxaCambial > 0) {
                double dolares = reais / taxaCambial;
                System.out.println("O equivalente em doláres é: $" + dolares);
            }
        } else {
            System.out.println("O valor não pode ser menor que 0!");
        }
    }
}
