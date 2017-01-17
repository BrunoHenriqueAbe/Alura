
public class Circulo implements AreaCalculavel {
	private int raio;
	private double PI = Math.round(Math.PI);
	
	public Circulo(int raio) {
		this.raio = raio;
		this.PI = PI;
	}
	
	public double calculaArea() {
		return this.PI * this.raio * this.raio;
	}
}

