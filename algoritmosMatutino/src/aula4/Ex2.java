package aula4;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Insira a primeira nota: ");
        float notaA1 = scanner.nextFloat();

        System.out.print("Insira a segunda nota: ");
        float notaA2 = scanner.nextFloat();

        scanner.close();

        float media = (notaA1 + notaA2) / 2F;

        if (media >= 6) {
            System.out.println("Parabéns " + nomeAluno + ", você está aprovado(a) com média " + media + "!");
        } else {
            System.out.println(nomeAluno + ", infelizmente você está reprovado(a) com média " + media + "!");
        }
    }
}
