import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int count = 1;
		int codigoPromocao;
		
		Scanner entrada = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		cliente.nome = "Jaum";
		cliente.cpf = 123456;
		
		Computador computador1 = new Computador();
		Computador computador2 = new Computador();
		Computador computador3 = new Computador();
		
		MemoriaUSB memoria1 = new MemoriaUSB();
		memoria1.nome = "Pen-Drive";
		memoria1.capacidade = 16;
		
		MemoriaUSB memoria2 = new MemoriaUSB();
		memoria2.nome = "Pen-Drive";
		memoria2.capacidade = 32;
		
		MemoriaUSB memoria3 = new MemoriaUSB();
		memoria3.nome = "Pen-Drive";
		memoria3.capacidade = 64;
		
		//Preenchendo o computador 1
		computador1.marca = "Alienware";
		computador1.preco = 2500.00f;
		computador1.hardware[0].nome = "Intel Core i3 9100F";
		computador1.hardware[0].capacidade = 3.6f;
		computador1.hardware[1].nome = "Memoria RAM";
		computador1.hardware[1].capacidade = 8;
		computador1.hardware[2].nome = "NVidia Geforce 1060";
		computador1.hardware[2].capacidade = 4;
		computador1.so.nome = "Steam OS";
		computador1.so.tipo = 64;
		computador1.addMemoria(memoria1);
		
		//Preenchendo o computador 2
		computador2.marca = "Avell";
		computador2.preco = 3400.00f;
		computador2.hardware[0].nome = "Intel Core i5 9400F ";
		computador2.hardware[0].capacidade = 2.9f;
		computador2.hardware[1].nome = "Memoria RAM";
		computador2.hardware[1].capacidade = 8;
		computador2.hardware[2].nome = "NVidia Geforce 1070";
		computador2.hardware[2].capacidade = 4;
		computador2.so.nome = "Windows 8.1";
		computador2.so.tipo = 64;
		computador2.addMemoria(memoria2);
		
		//Preenchendo o computador 3
		computador3.marca = "Asus";
		computador3.preco = 4600.00f;
		computador3.hardware[0].nome = "ntel Core I7 9700K ";
		computador3.hardware[0].capacidade = 3.6f;
		computador3.hardware[1].nome = "Memoria RAM";
		computador3.hardware[1].capacidade = 16;
		computador3.hardware[2].nome = "NVidia Geforce 1080";
		computador3.hardware[2].capacidade = 8;
		computador3.so.nome = "Windows 10";
		computador3.so.tipo = 64;
		computador3.addMemoria(memoria3);
		
		do {
			System.out.print("Qual computador deseja comprar? ");
			codigoPromocao = entrada.nextInt();
			switch (codigoPromocao) {
			case 1:
				cliente.addComputador(computador1);
				break;
			case 2:
				cliente.addComputador(computador2);
				break;
			case 3:
				cliente.addComputador(computador3);
				break;

			default:
				System.out.println("Codigo Invalido de Promcao");
				break;
			}
			System.out.print("Deseja comprar mais um computador? Digite 0 para sair do programa, ou 1 para continuar: ");
			count = entrada.nextInt();
			
		}while(count != 0);
		
		
		for (Computador computador : cliente.computadores) {
			if(computador==null)
				continue;
			computador.mostraInfoPc();
		}
		System.out.println(cliente.calculaTotalCompra());
		
		entrada.close();
		
	}

}
