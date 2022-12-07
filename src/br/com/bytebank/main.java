package br.com.bytebank;

import br.com.bytebank.banco.ContaPoupanca;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String options = "";
		Scanner ler = new Scanner(System.in);

		System.out.println("Bem vindo ao ByteBank");
		System.out.println("Para iniciarmos o cadastro, digite seu nome:");
		String nome = ler.nextLine();
		System.out.println("Agora digite o valor incial da sua conta:");
		double valorInicial = ler.nextDouble();
		Integer numConta = (Integer) (int) (1000 + Math.random() * 9999);
		ContaPoupanca conta = new ContaPoupanca(1, numConta, nome, "000.000.000-00");
		conta.deposita(valorInicial);

		System.out.println("Conta criada com sucesso!");
		ler.nextLine();

		do {
			System.out.println("Digite 1 para Extrato");
			System.out.println("Digite 2 para Sacar");
			System.out.println("Digite 3 para Depositar");
			System.out.println("Digite sair para sair");
			options = ler.nextLine();

			if ("1".equals(options)) {
				System.out.println("Sr(a) "+nome+ " conta: "+conta.getNumero()+" seu saldo é de: R$" + conta.getSaldo());
				System.out.println("Até o momento você realizou "+conta.getContatador()+" saques");
				System.out.println("Obrigado por utilizar o ByteBank");
			} else if ("2".equals(options)) {
				System.out.println("Digite o valor que deseja sacar:");
				ler.nextLine();
				double valor = ler.nextDouble();
				if(conta.saca(valor)) {
					System.out.println("Saque realizado com sucesso!");
					System.out.println("Sr(a) "+nome+ " conta: "+conta.getNumero()+" seu saldo é de: R$" + conta.getSaldo());
				} else {
					System.out.println("Saldo insuficiente!");
				}
			} else if ("3".equals(options)) {
				System.out.println("Digite o valor que deseja depositar:");
				ler.nextLine();
				double valor = ler.nextDouble();
				conta.deposita(valor);
				System.out.println("Sr(a) "+nome+ " conta: "+conta.getNumero()+"seu saldo é de: " + conta.getSaldo());
			} else if ("sair".equals(options)) {
				System.out.println("Obrigado por utilizar o ByteBank");
			} else {
				System.out.println("Opção inválida");
			}
		} while (!"sair".equals(options));

	}
}
