
public class Pessoa {
	private String nome = "";
	private String enderešo = "";
	
	
	public Pessoa(String nome, String enderešo) {
		setNome(nome); setEnderešo(enderešo);
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
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		if(enderešo.length()>0)
		this.enderešo = enderešo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", enderešo=");
		builder.append(enderešo);
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getEnderešo()=");
		builder.append(getEnderešo());
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
