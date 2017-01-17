package br.com.empresa.banco;
import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaDeposita extends Conta {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		try {
			contaCorrente.deposita(-1000);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}
