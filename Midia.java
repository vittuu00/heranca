package midias;

public class Midia extends Item {

	public Midia(int codigo, String descricao) {
		super(codigo, descricao);
		// TODO Auto-generated constructor stub
	}
	
	private String gravadora;
	private int duracao;
	
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		if(gravadora.length()>0);
		this.gravadora = gravadora;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		if(duracao>0);
		this.duracao = duracao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append(", getGravadora()=");
		builder.append(getGravadora());
		builder.append(", getDuracao()=");
		builder.append(getDuracao());
		builder.append(super.toString());
		return builder.toString();
	}

}
