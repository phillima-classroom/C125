package br.inatel.cdg;

import br.inatel.cdg.administrativo.Empresario;
import br.inatel.cdg.orquestra.Banda;
import br.inatel.cdg.orquestra.Membro;
import br.inatel.cdg.orquestra.Musica;

public class Main {

	public static void main(String[] args) {
			
		Banda banda = new Banda("Guns N Roses", "Rock");
		
		
		Musica musica = new Musica("Sweet Child", 3.45f);
		System.out.println(Musica.numMusicas);
		Musica musica1 = new Musica("Dont Cry", 5.43f);
		System.out.println(Musica.numMusicas);
		Musica musica2 = new Musica("November Rain", 9.32f);
		System.out.println(Musica.numMusicas);
		
		Membro membro1 = new Membro("Axl Rose", "Vocal");
		Membro membro2 = new Membro("Slash", "Guitarrista");
		Membro membro3 = new Membro("Duff", "Baixista");
		
		Empresario empresario = new Empresario("Tiao Esperto", 123456);
		
		banda.setEmpresario(empresario);
		
		banda.addMusica(musica1);
		banda.addMusica(musica2);
		banda.addMusica(musica);
		
		banda.addMembro(membro1);
		banda.addMembro(membro2);
		banda.addMembro(membro3);
		
		banda.mostraInfo();
		
	}

}
