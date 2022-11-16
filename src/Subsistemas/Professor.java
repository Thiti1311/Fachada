package Subsistemas;

import SistemaDeApoio.Grade;

//(alocação por disciplina, tempo de casa);
public class Professor extends Pessoa{
	
	private float tempoDeCasa = 0;

	private Grade grade = new Grade();

	private Salario salario = new Salario();


	public Professor(String nome) {
		super(nome);
		setTipo("Professor"); 
	}

    public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public float getSalario() {
		return salario.getValorSalario();
	}

	public void setSalario(float salario) {
		this.salario.setValorSalario(salario);
	}

	public float getTempoDeCasa() {
		return tempoDeCasa;
	}

	public void setTempoDeCasa(float tempoDeCasa) {
		this.tempoDeCasa = tempoDeCasa;
	}

	public void showGrade() {
		grade.showDetalhes();
	}

	@Override
	public String toString(){
		return "Nome: " + getNome() + "\n Função: " + getTipo() + "\nTempo de Casa: "+ getTempoDeCasa() + " ]";
	}
	
}
