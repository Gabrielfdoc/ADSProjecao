package aula4;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        float ladoA = scanner.nextFloat();

        System.out.println("Insira o segundo valor: ");
        float ladoB = scanner.nextFloat();

        System.out.println("Insira o terceiro valor: ");
        float ladoC = scanner.nextFloat();

        scanner.close();

        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            System.out.println("Lados nulos ou negativos não são válidos!");
            System.exit(0);
        }

        if (ladoA >= ladoB + ladoC || ladoB >= ladoA + ladoC || ladoC >= ladoA + ladoB) {
            System.out.println("Não existe um triângulo!");
            System.exit(0);
        }

        if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {

            System.out.println("É um triângulo escaleno!");

        } else if ((ladoA == ladoB && ladoA != ladoC) || (ladoB == ladoC && ladoA != ladoB) ||
                (ladoA == ladoC && ladoB != ladoA)) {

            System.out.println("É um triângulo isósceles!");

        } else if (ladoA == ladoB && ladoA == ladoC) {

            System.out.println("É um triângulo equilátero!");
        }
    }
}
