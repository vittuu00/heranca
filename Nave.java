package nave;

public class Nave {
	
	private double velocidadeMaxima;

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nave [velocidadeMaxima=");
		builder.append(velocidadeMaxima);
		builder.append("]");
		return builder.toString();
	}
}
