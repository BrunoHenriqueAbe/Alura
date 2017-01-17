package br.com.empresa.banco;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.GeradorDeImpostoDeRenda;
import br.com.empresa.banco.conta.SeguroDeVida;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaGeradorDeImpostoDeRenda {
	public static void main(String[]args) throws ValorInvalidoException {
		GeradorDeImpostoDeRenda gerador = new GeradorDeImpostoDeRenda();
		SeguroDeVida sv = new SeguroDeVida();
		gerador.adiciona(sv);
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.deposita(1000);
		gerador.adiciona(contaCorrente);
		
		System.out.printf("O total de imposto é: R$%.2f", gerador.getTotal());
	}
}
