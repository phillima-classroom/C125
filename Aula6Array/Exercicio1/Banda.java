public class Banda{

    String nome;
    String genero;
    Empresario empresario;
    Musica[] musicas;
    Membro[] membros;
    
    public Banda(){
        musicas = new Musica[5]; //Definindo o tamanho dentro do construtor
        membros = new Membro[5];
    }

    void addMusica(Musica novaMusica){
        for(int i = 0; i < musicas.length; i++){//Varrendo o vetor de musicas
            if(musicas[i] == null){//Verifica se não existe musica
                musicas[i] = novaMusica;
                break; //Adiciona e sai do metodo
            }
        }
    }

    void addMembro(Membro novoMembro){
        for(int i = 0; i < membros.length; i++){
            if(membros[i] == null){
                membros[i] = novoMembro;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("A Banda: " + this.nome + " possui os seguintes membros:");
        for (Membro membro : membros) {
            if(membro != null)//Verifica se existe membro antes de imprimir
                System.out.println(membro.nome);
        }
        System.out.println("A Banda: " + this.nome + " possui as seguintes musicas:");
        for (Musica musica : musicas) {
            if(musica != null)//Verifica se existe musica antes de imprimir
                System.out.println(musica.nome);
        }
    }

}