package br.com.empresa.banco.conta;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {
	public static void main(String[] args) throws ValorInvalidoException {
		Conta c1 = new ContaCorrente();
		c1.deposita(10000);
		
		Conta c2 = new ContaCorrente();
		c2.deposita(300);
		
		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
		
		mapaDeContas.put("Diretor", c1);
		mapaDeContas.put("Gerente", c2);
		
		Conta contaDoDiretor = mapaDeContas.get("Diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}
}
