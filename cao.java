package Animais;

public class cao extends Mamifero {

	public cao(double peso, String especie, int idade) {
		super(peso, especie, idade);
		// TODO Auto-generated constructor stub
	}	
private String cordapta;
public String getCordapta() {
	return cordapta;
}
public void setCordapta(String cordapta) {
	this.cordapta = cordapta;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("cao [cordapta=");
	builder.append(cordapta);
	builder.append("]");
	builder.append(super.toString());
	return builder.toString();
}

	
	}
	


