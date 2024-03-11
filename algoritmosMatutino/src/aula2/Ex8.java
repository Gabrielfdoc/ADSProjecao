package aula2;

import java.util.Scanner;

/**
 * Peça ao usuário para inserir o valor total da compra e o valor pago. Calcule e
 * mostre o troco.
 */
public class Ex8 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor total da compra: R$");
        float valorCompra = scanner.nextFloat();

        System.out.print("Insira o valor pago: R$");
        float valorPago = scanner.nextFloat();

        float troco = valorPago - valorCompra;

        if (troco < 0) {
            System.out.println("\nSem calotes aqui! Pague ao menos o valor total da compra!");
        } else {
            System.out.println("\nSeu troco é de: R$" + troco);
        }

    }
}
