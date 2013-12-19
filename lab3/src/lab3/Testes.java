package lab3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testes {
	
	private Sistema sistema;
	private Aluno a1;
	
	@Before
	public void setup() {
		a1 = new Aluno("321", "a1");
		sistema = new Sistema(a1);
	}
	
	@Test
	public void testaAdionaDisciplina() {
		assertEquals(sistema.periodo.disciplinas.size(), 0);
		
		Disciplina vetorial = new Disciplina("Vetorial", "4", "1");
		
		sistema.adicionaDisciplina(vetorial);
		
		assertEquals(sistema.periodo.disciplinas.size(), 1);		
		
	}
	
	@Test
	public void testaAdionaAluno() {
		assertEquals(sistema.alunos.size(), 0);
		
		sistema.adicionaAluno(a1);
		
		assertEquals(sistema.alunos.size(), 1);		
		
	}
	
	@Test
	public void testaMatriculaDoPrimeiroPeriodo() {
		sistema.matriculaAluno(a1);
	}

}
