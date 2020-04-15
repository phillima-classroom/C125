package br.inatel.cdg;

import br.inatel.cdg.inimigos.CavaleiroNegro;
import br.inatel.cdg.inimigos.CavaleiroPrata;
import br.inatel.cdg.inimigos.Inimigo;
import br.inatel.cdg.inimigos.ZumbiLerdo;

public class Main {

	public static void main(String[] args) {
		
		ZumbiLerdo zumbi = new ZumbiLerdo("Zumbi Lerdo", 50, "Espada Curta");
		CavaleiroNegro cavNegro = 
				new CavaleiroNegro("Cavaleiro Negro", 150, "Espada Longa");
		CavaleiroPrata cavPrata = 
				new CavaleiroPrata("Cavaleiro Prata", 175, "Silver Sword");
		
		zumbi.atacando();
		cavNegro.atacando();
		cavPrata.atacando();		
	}

}
