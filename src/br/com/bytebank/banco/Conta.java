package br.com.bytebank.banco;

import br.com.bytebank.Pessoa;
import br.com.bytebank.Usuario;

/**
 * Classe abstrata de conta
 *
 * @author filipe.santos
 */
public abstract class Conta {

	private Usuario titular;
	private double saldo;
	private int agencia;
	private int numero;

	/**
	 * Construtor, onde para cria uma conta é necessário passar a agencia, numero, nome e cpf
	 *
	 * @param agente
	 * @param cpf
	 * @param nome
	 * @param numero
	 * @author filipe.santos
	 */
	public Conta(int agente, int numero, String nome, String cpf) {
		this.agencia = agente;
		this.numero = numero;
		this.titular = new Usuario(nome, cpf);
	}

	/**
	 * método que realiza o deposito na conta
	 *
	 * @param valor
	 * @author filipe.santos
	 */
	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	/**
	 * método que realiza o saque na conta
	 *
	 * @param valor
	 * @return boolean
	 * @author filipe.santos
	 */
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	/**
	 * método que realiza a transfência de uma conta para outra
	 *
	 * @param valor
	 * @return boolean
	 * @author filipe.santos
	 */
	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public Usuario getTitular() {
		return titular;
	}

	public void setTitular(Usuario titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
