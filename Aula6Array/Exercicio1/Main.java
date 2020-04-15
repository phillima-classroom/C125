public class Main{


    public static void main(String args[]){

        Empresario empresario = new Empresario();
        empresario.nome = "Jaum Empresario";
        empresario.cnpj = 1000021023;

        Musica musica1 = new Musica();
        musica1.nome = "Paranoid";
        musica1.duracao = 3.4f;

        Musica musica2 = new Musica();
        musica2.nome = "N.I.B";
        musica2.duracao = 4.2f;

        Musica musica3 = new Musica();
        musica3.nome = "War Pigs";
        musica3.duracao = 6.2f;

        Membro membro1 = new Membro();
        membro1.nome = "Ozzy";
        membro1.funcao = "Vocalista";

        Membro membro2 = new Membro();
        membro2.nome = "Tony Iommi";
        membro2.funcao = "Guitarrista";

        Membro membro3 = new Membro();
        membro3.nome = "Geezer";
        membro3.funcao = "Baixista";

        Banda banda = new Banda();
        banda.empresario = empresario;
        banda.genero = "Heavy Metal";
        banda.nome = "Black Sabbath";
        //Adicionando Musicas
        banda.addMusica(musica1);
        banda.addMusica(musica2);
        banda.addMusica(musica3);
        //Adicionando Membros
        banda.addMembro(membro1);
        banda.addMembro(membro2);
        banda.addMembro(membro3);

        banda.mostraInfo();

    }


}