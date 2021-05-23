package br.inatel.cdg.funcionario;

public class Funcionario {

	private int id;
	private String estCivil;
	private double salario;
	private Integer numFilhos;
	private int mesesTrabalho;
	
	public Funcionario(int id, String estCivil, double salario, Integer numFilhos, int mesesTrabalho) {
		this.id = id;
		this.estCivil = estCivil;
		this.salario = salario;
		this.numFilhos = numFilhos;
		this.mesesTrabalho = mesesTrabalho;
	}
	public int getId() {
		return id;
	}
	public String getEstCivil() {
		return estCivil;
	}
	public double getSalario() {
		return salario;
	}
	public Integer getNumFilhos() {
		return numFilhos;
	}
	public int getMesesTrabalho() {
		return mesesTrabalho;
	}
	
}