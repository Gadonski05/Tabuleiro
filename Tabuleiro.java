// Importação do pacote das cores 
// Pacote: awt
import java.awt.Color;
import java.util.Scanner;

public class Tabuleiro {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.iniciaJogo();
    }

    public void iniciaJogo() {
        Scanner scanner = new Scanner(System.in);
        
        //O usuário determina o tamanho do tabuleiro
        //Mas poderia ter um tamanho determinado de "Tamanho = 10;"
        System.out.println("Digite o tamanho do tabuleiro:");
        int tamanho = scanner.nextInt();

        mostraTabuleiro(tamanho);
        posicionaPersonagem();
        adicionaJogador();
        //Mostrar o tabuleiro após a dição dos novos player
        mostraTabuleiro(Personagem);
    }

    public void mostraTabuleiro(int tamanho) {
        // Matriz para criação do tabuleiro
        for (int l = 0; l < tamanho; l++) {
            for (int c = 0; c < tamanho; c++) {
                System.out.print("[ . ]");

                boolean tevepersonagem = false;
                
                if (l == personagem.getPosy() && c == personagem.getPox()) {
                    System.out.println("[" + personagem.getDes() + "]");
                    
                } if (!tevepersonagem) {
                    System.out.println("[ . ]");
                }
            }
            //Gera um espaçamento 
            System.out.println();
        }
    }

    public void posicionaPersonagem() {

        //Relação das posições com os personagens dentro do tabuleiro
        System.out.println("Digite a posição da linha: " + posy);
        int posy = Scanner.posy;

        System.out.println("\nDigite a posição da coluna: " + posx);
        int posx = Scanner.posx;

    }

    public void adicionaJogador() {
        // Criação dos novos player
        //Mesma coisa de adicionar novos sabores de pizza

        Player jogador1 = new Player("Player 1", Color.BLUE);
        Player jogador2 = new Player("Player 2", Color.BLUE);
        Player jogador3 = new Player("Player 3", Color.BLUE);

        System.out.println("Todos os jogadores foram adicionados!");
    }

    public void adicionaInimigo() {
        // Inimigo terá uma cor diferente
        Color vermelhoEscuro = new Color(235, 50, 50);
       
       
    }
}

class Player {

    private String nome;
    private Color cor;

    public Player(String nome, Color cor) {

        this.nome = nome;
        this.cor = cor;
    }

  
}
