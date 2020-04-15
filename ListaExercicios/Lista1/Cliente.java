
public class Cliente {
	
	String nome;
	long cpf;
	Computador computadores[];
		
	public Cliente() {
		computadores = new Computador[10];
	}
	
	void addComputador(Computador computador) {
		for (int i = 0; i < computadores.length; i++) {
			if(computadores[i]==null) {
				computadores[i] = computador;
				break;
			}
		}
	}
	
	float calculaTotalCompra() {
		
		float totalCompra = 0.0f;
		
		for (Computador computador : computadores) {
			if(computador == null)
				continue;
			totalCompra += computador.preco;
		}
		
		return totalCompra;
	}
	
}
