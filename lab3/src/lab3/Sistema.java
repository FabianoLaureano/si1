package lab3;

import java.util.ArrayList;

public class Sistema {
	
	protected Periodo periodo;
	protected ArrayList<Aluno> alunos;
	//protected Aluno aluno;
	
	public Sistema(Aluno aluno) {
		periodo = new Periodo();
		alunos = new ArrayList<Aluno>();
	}

	//CREATOR - O sistema tera que armazenar as disciplinas cadastradas
	public void adicionaDisciplina(Disciplina disciplina) {
		periodo.disciplinas.add(disciplina);	
	}
	
	public void adicionaAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public void matriculaAluno(Aluno aluno) {
		//aluno.periodo.disciplinas.addAll(//disciplinas);
	}

}
