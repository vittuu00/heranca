package Animais;

public class Mamifero extends Animal {
	public Mamifero(double peso, String especie, int idade) {
		super(peso, especie, idade);
		// TODO Auto-generated constructor stub
	}
	private int patas;
	private String cordopelo;
	public void Mamifer(int patas, String cordopelo,boolean domestico) {
		setPatas(patas);setCordopelo(cordopelo);getDomestico(domestico);
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCordopelo() {
		return cordopelo;
	}
	public void setCordopelo(String cordopelo) {
		this.cordopelo = cordopelo;
	}
	public boolean getDomestico(boolean situacao) {
		if(situacao)
			return true;
		else {
			return false;
		}
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [patas=");
		builder.append(patas);
		builder.append(", cordopelo=");
		builder.append(cordopelo);
		builder.append("]");
		
		builder.append(super.toString());
		return builder.toString();
	}

}
