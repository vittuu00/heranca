package ambiente;

public class Quarto extends Ambiente {

	private int capacidade;
	
	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Quarto() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quarto [capacidade=");
		builder.append(capacidade);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}

}
