class Funcionario {
	public Funcionario() {
		this.identificador = ++this.identificador;
	}

	public Funcionario(String nome) {
		this.nome = nome;
	}

	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	private double ganhoAnual;
	private static int identificador;

	public int getIdentificador() {
		return this.identificador;
	}

	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	public double calculaGanhoAnual() {
		return this.ganhoAnual = salario * 12;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Data getDataEntrada() {
		return this.dataEntrada;
	}

	public void setDataEntrada(Data data) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void mostra() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("\nIdentificador: " + this.getIdentificador());
		System.out.println("\nDepartamento: " + this.getDepartamento());
		System.out.println("\nSalario atual: R$" + this.getSalario());
		System.out.println("\nData de entrada: " + this.getDataEntrada());
		System.out.println("\nRG: " + this.getRg());
		System.out.println("\nGanho anual: R$" + this.calculaGanhoAnual()"\n");
	}
}

class Data {
	int dia;
	int mes;
	int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

		if(!isDataViavel(dia, mes, ano)) {
			System.out.println("A data nao existe!");
		}
	}

	private boolean isDataViavel(int dia, int mes, int ano) {
		if(dia <= 0 || mes <= 0 || 	mes > 12 || ano <= 0) {
			return false;
	}

	int ultimoDiaDoMes = 31;

	if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
		ultimoDiaDoMes = 30;
	} else if(mes == 2) {
		ultimoDiaDoMes = 28;
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano %100 != 0))) {
			ultimoDiaDoMes = 29;
		}
	}
	
	if(dia > ultimoDiaDoMes) {
		return false;
	}

	return true;
	}
}

class TestaFuncionario {
	public static void main (String[]args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Hugo");
		f1.setDepartamento("Financeiro");
		f1.setSalario(6500);
		f1.setRg("37.253.905-1");
		f1.recebeAumento(2999);
		Data data = new Data(4, 6, 2016);
		f1.setDataEntrada(data);
		f1.mostra();

		Funcionario f2 = new Funcionario();
		f2.setNome("Mariana");
		f2.setDepartamento("Logistica");
		f2.setSalario(2000);
		f2.setRg("37.253.906-1");
		f2.recebeAumento(1000);
		Data data2 = new Data(6, 5, 2010);
		f1.setDataEntrada(data);
		f2.mostra();

		/*Funcionario f3 = f2;
		System.out.println(f2.getNome());

		if(f2 == f3) {
			System.out.println("Sao iguais");
		} else {
			System.out.println("Sao diferentes");
		}*/
		

		Funcionario f4 = new Funcionario();
		f4.setSalario(100);
		Data data3 = new Data(5, 9, 2007);
		f4.setDataEntrada(data2);
		f4.setNome("Jose");
		f4.setDepartamento("Financeiro");
		f4.setRg("37-253-905-1");
		f4.mostra();

	}

}

class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios;
	private int livre = 0;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario getFuncionario(int posicao) {
		return this.funcionarios[posicao];
	}

	public void adiciona(Funcionario f) {
		this.funcionarios[this.livre] = f;
		this.livre++;
	}

	public void mostraTodasAsInformacoes() {
		for (int posicaoFuncionario = 0; posicaoFuncionario < this.funcionarios.length; posicaoFuncionario++) {
			System.out.println("Funcionario na posicao " + posicaoFuncionario + 
				": " + "R$" + this.funcionarios[posicaoFuncionario].getSalario());
			this.funcionarios[posicaoFuncionario].mostra();
		}
	}

	public boolean contem(Funcionario f) {
		for(int posicaoFuncionario = 0; posicaoFuncionario < this.funcionarios.length; posicaoFuncionario++) {
			if(funcionarios[posicaoFuncionario].getNome() == null) {
				return false;
			}
		}
		return true;
	}
}

class TestaEmpresa {
	public static void main (String[]args) {
		Empresa empresa = new Empresa();
		///empresa.getFuncionario(posicaoFuncionario) = new Funcionario[2];

		Funcionario f1 = new Funcionario();
		f1.setNome("Joao");
		f1.setSalario(1500);
		f1.setRg("32.264.497-1");
		f1.setDepartamento("TI");
		Data data = new Data(03, 10, 1996);
		f1.setDataEntrada(data);
		empresa.adiciona(f1);

		Funcionario f2 = new Funcionario();
		f2.setNome("Andre");
		f2.setSalario(2000);
		f2.setRg("32.493.164-1");
		f2.setDepartamento("Logistica");
		Data data2 = new Data(07, 12, 1987);
		f2.setDataEntrada(data2);
		empresa.adiciona(f2);

		//empresa.funcionarios[0].mostra();
		//empresa.funcionarios[1].mostra();

		empresa.mostraTodasAsInformacoes();
	}
}