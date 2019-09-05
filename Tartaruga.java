package Animais;

public class Tartaruga extends Reptil {

	public Tartaruga(double peso, String especie, int idade) {
		super(peso, especie, idade);
		// TODO Auto-generated constructor stub
	}
private String aquatica;
private String regiaonasc;
public String getAquatica() {
	return aquatica;
}
public void setAquatica(String aquatica) {
	this.aquatica = aquatica;
}
public String getRegiaonasc() {
	return regiaonasc;
}
public void setRegiaonasc(String regiaonasc) {
	this.regiaonasc = regiaonasc;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Tartaruga [aquatica=");
	builder.append(aquatica);
	builder.append(", regiaonasc=");
	builder.append(regiaonasc);
	builder.append("]");
	builder.append(super.toString());
	return builder.toString();
}
 
}
