package aula2;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a distância da viagem em KM: ");
        float distancia = scanner.nextFloat();

        System.out.print("Insira o consumo médio de combustível do seu veículo(Ex: Se meu carro consome " +
        "12km por litro, colocarei 12: ");
        float consumoMedio = scanner.nextFloat();

        System.out.print("Insira o preço do combustível por L: ");
        float precoCombustivel = scanner.nextFloat();

        float consumoTotal = distancia / consumoMedio;

        float precoTotal = consumoTotal * precoCombustivel;

        System.out.println("\nO custo da viagem será de: R$"+  precoTotal);
    }
}
