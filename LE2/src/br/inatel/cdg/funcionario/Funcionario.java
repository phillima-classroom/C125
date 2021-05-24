package br.inatel.cdg.funcionario;

public class Funcionario {

	private int id;
	private double salario;
	private Integer numFilhos;
		
	public Funcionario(int id, double salario, Integer numFilhos) {
		this.id = id;
		this.salario = salario;
		this.numFilhos = numFilhos;
	}
	public int getId() {
		return id;
	}
	public double getSalario() {
		return salario;
	}
	public Integer getNumFilhos() {
		return numFilhos;
	}
}