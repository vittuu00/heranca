package midias;

public class Livro extends Item {
	private String autor;
	

	public Livro(int codigo, String descricao) {
		super(codigo, descricao);
	
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append(", getAutor()=");
		builder.append(getAutor());
		builder.append(super.toString());
		return builder.toString();
	}
	

}
