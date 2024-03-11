package aula2;

import java.util.Scanner;

/**
 * Peça ao usuário que insira o ano atual e o ano de nascimento. Calcule e
 * mostre a idade do usuário.
 */

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.println("Digite o seu ano de nascimento:");
        int anoDeNascimento = scanner.nextInt();

        System.out.println("Você já fez aniversário esse ano? (S para Sim/N para não)");
        String fezAniversario = scanner.next();

        int idade = anoAtual - anoDeNascimento;

        if (converteSOuNParaBoolean(fezAniversario)) {
            System.out.println("Sua idade é de " + idade + " anos!");
        } else {
            idade = idade - 1;
            System.out.println("Sua idade é de " + idade + " anos!");
        }
    }

    public static boolean converteSOuNParaBoolean(String sOuN) {
        boolean valorRetornado;

        if (sOuN.equalsIgnoreCase("S")) {
            valorRetornado = true;
        } else if (sOuN.equalsIgnoreCase("N")) {
            valorRetornado = false;
        } else {
            throw new IllegalArgumentException("Utilize apenas S ou N!");
        }
        return valorRetornado;
    }
}