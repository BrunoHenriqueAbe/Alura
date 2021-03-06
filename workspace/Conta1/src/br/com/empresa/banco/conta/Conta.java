package br.com.empresa.banco.conta;

public abstract class Conta implements Comparable<Conta> {
	protected double saldo;
	protected int numero;
	public String nome;	

	public void deposita(double valor) throws ValorInvalidoException {
		if(valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
		this.saldo += valor;
		}
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void atualiza(double taxa) {
		this.saldo = this.saldo * taxa;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "O saldo da conta �: " + this.saldo;
	}
	
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return this.getNumero() == outraConta.getNumero();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return this.getNumero() - outra.getNumero();
	}
}



