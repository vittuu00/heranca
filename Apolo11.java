package nave;

public class Apolo11 extends Nave {
	
	private String tipoCombustível;

	public String getTipoCombustível() {
		return tipoCombustível;
	}

	public void setTipoCombustível(String tipoCombustível) {
		this.tipoCombustível = tipoCombustível;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Apolo11 [tipoCombustível=");
		builder.append(tipoCombustível);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}

}
