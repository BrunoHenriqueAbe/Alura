package br.com.empresa.banco;
import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.conta.ValorInvalidoException;
import br.com.empresa.banco.sistema.AtualizadorDeContas;

public class TestaAtualizadorDeContas {
	public static void main(String[]args) throws ValorInvalidoException {
		Conta conta = new Conta();
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		conta.deposita(1000);
		contaCorrente.deposita(1000);
		contaPoupanca.deposita(1000);
		
		AtualizadorDeContas atualizaConta = new AtualizadorDeContas(0.01);
		
		atualizaConta.roda(conta);
		atualizaConta.roda(contaCorrente);
		atualizaConta.roda(contaPoupanca);
		
		System.out.println("Saldo total: R$" + atualizaConta.getSaldoTodal());
	}
}
