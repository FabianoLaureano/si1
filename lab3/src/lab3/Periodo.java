package lab3;

import java.util.ArrayList;

public class Periodo {
	
	//CREATOR - Um periodo é feito de disciplinas
	protected ArrayList<Disciplina> disciplinas;
	protected String[] d = {"p1", "calc1", "labprog1", "lpt", "vetorial", "ic"};
	
	public Periodo() {
		disciplinas = new ArrayList<Disciplina>();
	}

}
