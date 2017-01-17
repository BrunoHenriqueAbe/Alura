package br.com.empresa.banco.conta;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestaOrdenacao {
 public static void main(String[] args) throws ValorInvalidoException {
	ArrayList<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
	Random random = new Random();
	
	ContaPoupanca c1 = new ContaPoupanca(random.nextInt(2000), "Caio");
	c1.deposita(random.nextInt(10000) + random.nextDouble());
	contas.add(c1);
	
	ContaPoupanca c2 = new ContaPoupanca(random.nextInt(2000), "Adriano");
	c2.deposita(random.nextInt(10000) + random.nextDouble());
	contas.add(c2);
	
	ContaPoupanca c3 = new ContaPoupanca(random.nextInt(2000), "Vitor");
	c3.deposita(random.nextInt(10000) + random.nextDouble());
	contas.add(c3);
	
	Collections.sort(contas);
	
	for(Conta conta : contas) {
		System.out.println(conta);
	}
}
}
