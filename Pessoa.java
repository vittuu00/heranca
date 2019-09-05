
public class Pessoa {
	private String nome = "";
	private String endereço = "";
	
	
	public Pessoa(String nome, String endereço) {
		setNome(nome); setEndereço(endereço);
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
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		if(endereço.length()>0)
		this.endereço = endereço;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", endereço=");
		builder.append(endereço);
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getEndereço()=");
		builder.append(getEndereço());
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
