
public class Pessoa {
	private String nome = "";
	private String endere�o = "";
	
	
	public Pessoa(String nome, String endere�o) {
		setNome(nome); setEndere�o(endere�o);
	}
	public Pessoa(String nome) {
		setNome(nome);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome!="")
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		if(endere�o.length()>0)
		this.endere�o = endere�o;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", endere�o=");
		builder.append(endere�o);
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getEndere�o()=");
		builder.append(getEndere�o());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
