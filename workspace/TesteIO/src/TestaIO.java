import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaIO {
	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		PrintStream saida = new PrintStream(new FileOutputStream("saida.txt"));
		
		while(entrada.hasNextLine()) {
			saida.println(entrada.nextLine());
		}

		entrada.close();
		saida.close();
	}
	
}
