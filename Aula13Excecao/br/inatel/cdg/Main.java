package br.inatel.cdg;

import br.inatel.cdg.banco.Cliente;
import br.inatel.cdg.banco.Conta;

public class Main {

	public static void main(String[] args) {
			
			Conta conta = new Conta(100, 500);
			
			Cliente cliente1 = new Cliente("Jaum", 1234);
			Cliente cliente2 = new Cliente("Jaumzin", 4321);
			
			conta.addCliente(cliente1);
			conta.addCliente(cliente2);
			
			conta.mostraInfo();
			
			System.out.println("Fim do programa");
	}

}
