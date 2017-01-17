class Conta {
	protected double saldo;
	protected Conta conta;

	public double getSaldo() {
		return this.saldo = saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
}

class ContaCorrente extends Conta {
	public void atualiza(double taxa) {
		super.saldo += super.saldo * (taxa * 2);
	}
}

class ContaPoupanca extends Conta {
	public void atualiza(double taxa) {
		super.saldo += super.saldo * (taxa * 3);
	}

	public void deposita(double valor) {
		super.saldo += (valor - 0.10);
	}
}

class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;


	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta conta) {
		System.out.println("Saldo anterior: R$" + conta.getSaldo());
		conta.atualiza(this.selic);
		this.saldoTotal += conta.getSaldo();
		System.out.println("Saldo atualizado: R$" + conta.getSaldo());
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}
}