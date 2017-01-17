package br.com.empresa.banco.sistema;
import br.com.empresa.banco.conta.Conta;

public class AtualizadorDeContas {
	private double selic;
	private double saldoTotal;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta conta) {
		System.out.println("Saldo anterior: R$" + conta.getSaldo());
		conta.atualiza(this.selic);
		this.saldoTotal += conta.getSaldo();
		System.out.println("Saldo atualizado: R$" + conta.getSaldo());
	}

	public double getSaldoTodal() {
		return this.saldoTotal;
	}
}
