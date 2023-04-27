
public class Cuadrado {
	private String name;
	private double lado1;	
	private double lado2;	
	private double lado3;	
	private double lado4;	

	public Cuadrado (String name, double lado1, double lado2, double lado3, double lado4) {
		this.name = name;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		
	}//Constructor

	public double calcularArea() {
		return (getLado1() * getLado2());	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado1() + getLado2() + getLado3() + getLado4());
	}// calcularPerimetro

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getLado4() {
		return lado4;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}//Getters and Setters

	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4="
				+ lado4 + "]";
	}//toString
}//class Cuadrado




