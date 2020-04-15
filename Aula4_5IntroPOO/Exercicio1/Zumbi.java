public class Zumbi{

    //Membros da classe. O que os zumbis sabem sobre eles?
    String nome;
    double vida;
    boolean alimentado;

    //Métodos. O que os zumbis sabem fazer? 
    void alimentar(double vida){
        if(alimentar){
            //Já esta alimentado
            System.out.prinln("Já estou alimentado!");
        }else{
            //Está com fome. Irá se alimentar
            System.out.prinln("Sinto cheiro de sangue");
            this.vida += vida;
            if(this.vida >= 100)   //Adotando o critério de que se o zumbi estiver com
                alimentado = true; // mais de 100 de vida, ele estará alimentado
        }        
    }

    void perderVida(double vida){
        this.vida -= vida;
        if(this.vida < 100)
            alimentado = false;
    }


}