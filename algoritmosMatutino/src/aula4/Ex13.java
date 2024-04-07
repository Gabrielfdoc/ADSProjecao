package aula4;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a sua renda anual: ");
        float rendaAnual = scanner.nextFloat();

        scanner.close();

        if (rendaAnual <= 20000 && rendaAnual > 0) {
            int aliquota = 10;
            calculaImposto(rendaAnual, aliquota);
        } else if (rendaAnual > 20000 && rendaAnual <= 50000) {
            int aliquota = 20;
            calculaImposto(rendaAnual, aliquota);
        } else if (rendaAnual > 50000) {
            int aliquota = 30;
            calculaImposto(rendaAnual, aliquota);
        } else {
            throw new IllegalArgumentException("Sua renda anual deve ser de no minimo 1 real!");
        }
    }

    public static void calculaImposto(float rendaAnual, int aliquota) {

        float impostoDeRenda;
        float rendaComDeducao;

            impostoDeRenda = rendaAnual * ((float) aliquota / 100);
            rendaComDeducao = rendaAnual - impostoDeRenda;

            System.out.println("O valor do seu imposto de renda é de: " + impostoDeRenda + "R$");
            System.out.println("A sua renda anual com a dedução do imposto de renda é de: " + rendaComDeducao + "R$");
    }
}
