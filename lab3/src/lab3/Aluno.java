package lab3;

public class Aluno {
	
	private String matricula;
	private String nome;
	//private String periodo;
	protected Periodo periodo;
	
	public Aluno(String matricula, String nome /*String periodo*/) {
		this.matricula = matricula;
		this.nome = nome;
		this.periodo = new Periodo();
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	/*public String getPeriodo() {
		return this.periodo;
	}*/

}
