package aula4;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um ano para verificação: ");
        int anoVerificado = scanner.nextInt();

        scanner.close();

        int referencia = anoVerificado % 1930;

        if (referencia % 4 == 0) {
            System.out.println("É ano de copa do mundo!");
        } else {
            System.out.println("Não é ano de copa do mundo!");
        }
    }
}
