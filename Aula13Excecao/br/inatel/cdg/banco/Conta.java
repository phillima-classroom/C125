package br.inatel.cdg.banco;

public class Conta {
	
	private double saldo;
	private double limite;
	private Cliente[] clientes;
		
	public Conta(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
		this.clientes = new Cliente[4];
	}

	public boolean sacar(double quantia) {
			
		if(quantia < (saldo + limite)) {
			this.saldo -= quantia;
			return true;
		}else {
			System.out.println("Saldo Insuficiente.");
			return false;
		}
	}
	
	public void deposita(double quantia) {
		this.saldo += quantia;
	}
	
	public void addCliente(Cliente cliente) {
		
		for (int i = 0; i < clientes.length; i++) {
			if(clientes[i] == null) {
				clientes[i] = cliente;
				break;
			}
		}
	}
	
	public void mostraInfo() {
		System.out.println("Informações da Conta");
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Limite: " + this.limite);
		System.out.println("Dados dos clientes");
		for (Cliente cliente : clientes) {
			try {
				System.out.println("Nome do cliente: " + cliente.getNome());
				System.out.println("CPF do cliente: " + cliente.getCpf());
			} catch (NullPointerException e) {
				System.out.println("Erro: " + e);
			}
		}
	}
		
	
	//Getters 
	public double getSaldo() {
		return saldo;
	}
	public double getLimite() {
		return limite;
	}
	
	
}
