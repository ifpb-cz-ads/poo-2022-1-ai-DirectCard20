import java.util.Scanner;

public class Livraria {
    // Método pricipal
    public static void main(String[] args){
        // Instancia classe Acervo
        Acervo acervo = new Acervo();
        
        // Chamando método livrosPrevios
        acervo.livrosPrevios();
        
        // Instanciando a classe Scanner
        Scanner ler = new Scanner(System.in);
        
        System.out.println("************* Bem-vindo! *************");
        System.out.println("O que você deseja da nossa livraria?\n");
        System.out.println("Digite 1 para PEGAR UM LIVRO EMPRESTADO\nDigite 2 para DEVOLVER UM LIVRO EMPRESTADO\nDigite 3 para CEDER UM LIVRO PARA A LIVRARIA");
        
        // Usando método da classe Scanner
        int escolha = ler.nextInt();
        
        // Invoca método decisaoUsuario da classe Acervo
        acervo.decisaoUsuario(escolha, ler);
    }
}