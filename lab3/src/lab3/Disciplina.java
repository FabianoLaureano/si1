package lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Disciplina {
	
	private String nome ;
	private String creditos;
	private String periodo;
	private ArrayList<String> todasAsDisciplinas;
	
	public Disciplina(String nome, String creditos, String periodo) {
		this.nome = nome;
		this.creditos = creditos;
		this.periodo = periodo;
	}
	
	public void a() {
		try {
			BufferedReader in = new BufferedReader(new FileReader("disc.txt"));
			String str;
			while (in.ready()) {
				str = in.readLine();
				System.out.println(str);
				todasAsDisciplinas.add(str);
			}
			in.close();
		} catch (IOException e) {
		}
	}
	
	public static void main(String[] args) {
		Disciplina d = new Disciplina("a", "1", "1");
		d.a();
		//d.todasAsDisciplinas.get(0);
	}

}
