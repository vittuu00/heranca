package ambiente;

public class Cozinha extends Ambiente {

	private boolean microondas;
	
	public boolean isMicroondas() {
		return microondas;
	}

	public void setMicroondas(boolean microondas) {
		this.microondas = microondas;
	}

	public Cozinha() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cozinha [microondas=");
		builder.append(microondas);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}

}
