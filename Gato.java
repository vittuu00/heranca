package Animais;

public class Gato extends Mamifero {

	public Gato(double peso, String especie, int idade) {
		super(peso, especie, idade);
		// TODO Auto-generated constructor stub
	}
	private int unhas;
	public int getUnhas() {
		return unhas;
	}
	public void setUnhas(int unhas) {
		this.unhas = unhas;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gato [unhas=");
		builder.append(unhas);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
	

}
