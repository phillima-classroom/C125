
public class Computador {

	String marca;
	float preco;
	MemoriaUSB memoria;
	HardwareBasico hardware[];
	SistemaOperacional so;
	
	public Computador() {
		hardware = new HardwareBasico[3];
		hardware[0] = new HardwareBasico();
		hardware[1] = new HardwareBasico();
		hardware[2] = new HardwareBasico();
		so = new SistemaOperacional();
	}
	
	void addMemoria(MemoriaUSB memoria) {
		this.memoria = memoria;
	}
	
	void mostraInfoPc() {
		System.out.println("Componentes");
		System.out.println(hardware[0].nome + " : " 
				+ hardware[0].capacidade);
		System.out.println(hardware[1].nome + " : " 
				+ hardware[1].capacidade);
		System.out.println(hardware[2].nome + " : " 
				+ hardware[2].capacidade);
		System.out.println("Sistema Operacioal: " + so.nome);
		System.out.println("Pen-Drive brinde com capacidade: " + memoria.capacidade);
	}
	
	
	
}
