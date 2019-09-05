package Animais;

public class Reptil extends Animal {

	public Reptil(double peso, String especie, int idade) {
		super(peso, especie, idade);
		// TODO Auto-generated constructor stub
	}
private String descricao;
private boolean rasteja;
public void Rept(String desc, boolean rasteja) {
	setDescricao(desc); setRasteja(rasteja);
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public boolean isRasteja() {
	return rasteja;
}
public void setRasteja(boolean rasteja) {
	this.rasteja = rasteja;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Reptil [descricao=");
	builder.append(descricao);
	builder.append(", rasteja=");
	builder.append(rasteja);
	builder.append("]");
	builder.append(super.toString());
	return builder.toString();
}

}
