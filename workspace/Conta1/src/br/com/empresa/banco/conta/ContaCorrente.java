package br.com.empresa.banco.conta;

public class ContaCorrente extends Conta implements Tributavel {
	private String nome;
	
	public void atualiza(double taxa) {
		super.saldo += super.saldo * taxa * 2;
	}
	
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
