package Veiculos;

public class Veiculos {
	private boolean motor;
public Veiculos(boolean motor) {
	setMotor(motor);
}
	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		if(motor)
		this.motor = motor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculos [motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}
	

}
