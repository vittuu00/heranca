package Pessoa_Aluno_Prof;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa(12345, "Vitor", "lalala");
		System.out.println(p);
		Aluno a = new Aluno(4423, "carlos", "lililili");
		a.setMatricula(3246);
		System.out.println(a);
		Professor prof = new Professor(423423, "roberto", "lulululu");
		prof.setDisciplina("aquela");
		System.out.println(prof);
		
		
		
		
	}
}
