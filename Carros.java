package Veiculos;

public class Carros extends Veiculos {

	
	public Carros(boolean motor) {
		super(motor);
		// TODO Auto-generated constructor stub
	}

	private int portas;

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		if(portas>=3 && portas <=5)
		this.portas = portas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carros [portas=");
		builder.append(portas);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
