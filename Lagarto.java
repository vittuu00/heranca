package Animais;

public class Lagarto extends Reptil {

	public Lagarto(double peso, String especie, int idade) {
		super(peso, especie, idade);
		// TODO Auto-generated constructor stub
	}
private boolean veneno;
private String descricao;
public boolean isVeneno() {
	return veneno;
}
public void setVeneno(boolean veneno) {
	this.veneno = veneno;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Lagarto [veneno=");
	builder.append(veneno);
	builder.append(", descricao=");
	builder.append(descricao);
	builder.append("]");
	builder.append(super.toString());
	return builder.toString();
}

}
