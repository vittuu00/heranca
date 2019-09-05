package Pessoa_Aluno_Prof;

public class Professor extends Pessoa {

	private String disciplina;

	public Professor(int codigo, String nome, String endereco) {
		super(codigo, nome, endereco);
		
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		if (disciplina.length() > 0)
		this.disciplina = disciplina;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [disciplina=");
		builder.append(disciplina);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
}
