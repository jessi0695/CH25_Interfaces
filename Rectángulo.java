
public class Rectángulo {
	private String name;
	private double base1;
	private double base2;
	private double altura1;
	private double altura2;
	
	
	public Rectángulo (String name, double base1, double base2, double altura1, double altura2) {
		this.name = name;
		this.base1 = base1;
		this.base2 = base2;
		this.altura1 = altura1;
		this.altura2 = altura2;
	}//Constructor

	public double calcularArea() {
		return (getBase1() * getAltura1());	
	}//calcularArea
	public double calcularPerimetro() {
		return (getBase1() + getAltura1() * getBase2() + getAltura2());
	}// calcularPerimetro
	public String getName() {
		return name;
	}

	public double getBase1() {
		return base1;
	}

	public void setBase1(double base1) {
		this.base1 = base1;
	}

	public double getBase2() {
		return base2;
	}

	public void setBase2(double base2) {
		this.base2 = base2;
	}

	public double getAltura1() {
		return altura1;
	}

	public void setAltura1(double altura1) {
		this.altura1 = altura1;
	}

	public double getAltura2() {
		return altura2;
	}

	public void setAltura2(double altura2) {
		this.altura2 = altura2;
	}

	public void setName(String name) {
		this.name = name;
	}//Getters and Setters

	@Override
	public String toString() {
		return "Rectángulo [name=" + name + ", base1=" + base1 + ", base2=" + base2 + ", altura1=" + altura1
				+ ", altura2=" + altura2 + "]";
	}//toString
	
}//class Rectángulo


