package Pessoa_Aluno_Prof;

public class Aluno extends Pessoa {

	private int matricula;
	
	public Aluno(int codigo, String nome, String endereco) {
		super(codigo, nome, endereco);
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
