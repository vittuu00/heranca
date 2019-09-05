package midias;

public class Vhs extends Midia {

	public Vhs(int codigo, String descricao) {
		super(codigo, descricao);
		// TODO Auto-generated constructor stub
	}
	public void Midia1(int duracao, String gravadora) {
		setGravadora(gravadora);
		setDuracao(duracao);
	}
	private String titulo;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vhs [titulo=");
		builder.append(titulo);
		builder.append(", getTitulo()=");
		builder.append(getTitulo());
		builder.append(super.toString());
		return builder.toString();
	}
	

}
