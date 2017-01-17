package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta{
	public ContaPoupanca(int i, String nome) {
		// TODO Auto-generated constructor stub
	}

	public void atualiza(double taxa) {
		super.saldo += super.saldo * taxa * 3;
	}
	
	public void deposita(double valor) {
		super.saldo += valor - 0.10;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return this.nome.compareTo(outra.nome);
	}
}
