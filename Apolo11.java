package nave;

public class Apolo11 extends Nave {
	
	private String tipoCombust�vel;

	public String getTipoCombust�vel() {
		return tipoCombust�vel;
	}

	public void setTipoCombust�vel(String tipoCombust�vel) {
		this.tipoCombust�vel = tipoCombust�vel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Apolo11 [tipoCombust�vel=");
		builder.append(tipoCombust�vel);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}

}
