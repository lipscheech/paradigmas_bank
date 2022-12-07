package br.com.bytebank;

import br.com.bytebank.banco.Conta;
import br.com.bytebank.banco.ContaCorrente;
import br.com.bytebank.banco.ContaPoupanca;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new ContaCorrente(1111, 2121, "Filipe C", "1111111");
		primeiraConta.deposita(50);

		System.out.println(primeiraConta.getSaldo());

		primeiraConta.saca(20);
		System.out.println(primeiraConta.getSaldo());

		Conta contaDaMarcela = new ContaPoupanca(1234, 2123, "Gabriele F", "2222222");
		contaDaMarcela.deposita(1000);
		System.out.println(contaDaMarcela.getSaldo());
		contaDaMarcela.transfere(300, primeiraConta);
		System.out.println(contaDaMarcela.getSaldo());


	}

}
