package aula4;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String usuarioCorreto = "Gabriel";
        String senhaCorreta = "adm2024";

        System.out.println("Insira o nome do usuário: ");
        String usuarioInserido = scanner.nextLine();

        System.out.println("Insira a senha: ");
        String senhaInserida = scanner.nextLine();

        if (usuarioInserido.equals(usuarioCorreto) && senhaInserida.equals(senhaCorreta)) {
            System.out.println("Logado com sucesso!");
        } else {
            throw new IllegalArgumentException("Os dados inseridos estão incorretos!");
        }
    }
}
