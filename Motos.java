package Veiculos;

public class Motos extends Veiculos {
 
	
	public Motos(boolean motor) {
		super(motor);
		// TODO Auto-generated constructor stub
	}

	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		if(cilindradas>0 && isMotor()== true)
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motos [cilindradas=");
		builder.append(cilindradas);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
