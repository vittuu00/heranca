package ambiente;

public class Banheiro extends Ambiente {
	
	private boolean banheira;

	public boolean isBanheira() {
		return banheira;
	}

	public void setBanheira(boolean banheira) {
		this.banheira = banheira;
	}

	public Banheiro() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banheiro [banheira=");
		builder.append(banheira);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}

}
