package Pessoa_Aluno_Prof;

public class Pessoa {
	
	private int codigo;
	private String endereco;
	private String nome;
	
	
	public Pessoa(int codigo, String nome, String endereco) {
		setCodigo(codigo);
		setNome(nome);
		setEndereco(endereco);

	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if (endereco.length() > 0)
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length() > 0)
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [codigo=");
		builder.append(codigo);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append(", nome=");
		builder.append(nome);
		return builder.toString();
	}
	

}
