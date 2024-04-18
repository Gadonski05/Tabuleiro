public class Personagem {
    
    String nome;
    private Color cor;
    private int posx;
    private int posy;
    String desenho;

    public Personagem(String nome, Color cor, int posx, int posy){
        this.nome = nome;
        this.cor = cor;
        this.posx = posx;
        this.posy = posy;
    }
    public int getPox(){

        return posx;

    }

    public int getPoy(){

        return posy;

    }
}
