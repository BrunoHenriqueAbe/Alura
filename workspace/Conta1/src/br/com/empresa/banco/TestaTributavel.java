package br.com.empresa.banco;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaTributavel {
	public static void main(String[]args) throws ValorInvalidoException {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.deposita(100);
		System.out.println(contaCorrente.calculaTributos());
	}
}
