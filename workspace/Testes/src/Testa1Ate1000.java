import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class Testa1Ate1000 {
 public static void main(String[] args) {
	 ArrayList<Integer> lista = new ArrayList<>();
	for(int i = 1; i <= 1001; i++) {
		lista.add(i);
	}
	
	Collections.reverse(lista);
	
	for(Integer i : lista) {
		System.out.println(i + " ");
	}
}
}
