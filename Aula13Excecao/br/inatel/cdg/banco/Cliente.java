package br.inatel.cdg.banco;

public class Cliente {

	private String nome;
	private int cpf;
	
	public Cliente(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public int getCpf() {
		return cpf;
	}
	
	
}
