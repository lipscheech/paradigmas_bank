package br.com.bytebank;

public class Gerente extends Funcionario{

	private int senha;
	private int numeroDeFuncionariosGerenciados;

	public Gerente(String nome, String cpf) {
		super(nome, cpf);
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido");
			return true;
		} else {
			System.out.println("Acesso negado");
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public double getBonificacao() {
		return 1000;
	}
}
