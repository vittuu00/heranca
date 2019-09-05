package ambiente;

public class Sala extends Ambiente {

	private boolean tv;
	
	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public Sala() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sala [tv=");
		builder.append(tv);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}

}
