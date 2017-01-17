package br.com.empresa.banco.conta;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import org.omg.Messaging.SyncScopeHelper;

public class TestaPerformance {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		ArrayList<Integer> teste = new ArrayList<Integer>();
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo gasto: " + tempo);
	}
}
