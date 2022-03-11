package br.com.anderson.lerdados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nome = "";
		String endereco = "";
		int idade = 0;
		boolean houveErroIdade = true;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		nome = scanner.nextLine();

		System.out.print("Digite seu endereco: ");
		endereco = scanner.nextLine();
		while (houveErroIdade) {
			try {
				System.out.print("Digite sua idade: ");
				idade = scanner.nextInt();
				houveErroIdade = false;
			} catch (Exception e) {
				scanner.next();
				houveErroIdade = true;
				System.out.println("Idade invalida! Digite números para a idade ou " + "0 se não desejar informa-la.");
			}
		}
		scanner.close();
		System.out.println("Ola " + nome + "!");
		System.out.println("Seu endereco eh: " + endereco + ".");

		String msgIdade = "Sua idade eh: ";
		if (idade == 0) {
			msgIdade = msgIdade + " Nao informada!";
		} else {
			msgIdade += idade + " anos.";
		}
		System.out.println(msgIdade);
	}
}
