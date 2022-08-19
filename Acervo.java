import java.util.Scanner;
import java.util.ArrayList;

public class Acervo implements Cadastro{
    // Instancia classe Categoria
    Categoria categoria = new Categoria();
    
    // Definindo Arraylist para guardar os livros
    static ArrayList livros = new ArrayList<>();
    
    // Constante para a quantidade de posições ocupadas por cada livro no ArrayList
    public static final int TAMANHO_LIVROS = 6;
    
    public void livrosPrevios(){
        //Chamando o construtor de 6 parâmetros
        Categoria categoria = new Categoria(1, "As Vantagens de Ser Invisível", "Stephen Chbosky", 2015, "Rocco Jovens Leitores", false);
        new Categoria(2, "Cinquenta Tons de Cinza", "E. L. James", 2011, "Intrínseca", true);
        new Categoria(3, "1984", "George Orwell", 1949, "Companhia das Letras", true);
        new Categoria(4, "Fahrenheit 451", "Ray Bradbury", 1953, "Biblioteca Azul", true);
        new Categoria(5, "Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881, "Principis", false);
        new Categoria(6, "Assassinato No Expresso do Oriente", "Agatha Christie", 1934, "Harper Collins", true);
        new Categoria(7, "Eu, Robô", "Isaac Asimov", 1950, "Aleph", true);
        new Categoria(8, "O Diário de Anne Frank", "Anne Frank", 1947, "Record", true);
        new Categoria(9, "O Iluminado", "Stephen King", 1977, "Suma", true);
        new Categoria(10, "A Cabana", "Willfiam P. Young", 2007, "Arqueiro", true);
        new Categoria(11, "Quem é Você, Alasca?", "John Green", 2005, "Intrínseca", true);
        new Categoria(12, "Duna", "Frank Herbert", 1965, "Aleph", true);
    }
    
    // Método cadastrarLivro com 1 parâmetro
    @Override
    public void cadastrarLivro(Scanner ler){
        categoria.setIndice((livros.size()/TAMANHO_LIVROS)+1);
        livros.add(categoria.getIndice());
        
        ler.nextLine();
        System.out.println("Digite o nome do livro: ");
        String nomeLivro = ler.nextLine();
        categoria.setNome(nomeLivro);
        livros.add(categoria.getNome());
        
        System.out.println("Digite o nome do autor: ");
        String autorLivro = ler.nextLine();
        categoria.setAutor(autorLivro);
        livros.add(categoria.getAutor());
        
        System.out.println("Digite o ano de publicação: ");
        int anoLivro = ler.nextInt();
        categoria.setAnoLancamento(anoLivro);
        livros.add(categoria.getAnoLancamento());
        
        ler.nextLine();
        System.out.println("Digite o nome da editora: ");
        String editoraLivro = ler.nextLine();
        categoria.setEditora(editoraLivro);
        livros.add(categoria.getEditora());
        
        categoria.setDisponivel(true);
        livros.add(categoria.getDisponivel());
        
        // Chamando método apresentarLivro
        apresentarLivro(livros);
    }
    
    // Método apresentarLivros sem parâmetro
    public void apresentarLivros(){
        int l = 0, m = 1, n = 2, o = 3, p = 4, q = 5;
        for(int i=0;i<Acervo.livros.size()/TAMANHO_LIVROS;i++){
            System.out.println("\n" + livros.get(l) + " --------------------------------------------------------------------------");
            System.out.println("Nome do livro: " + Acervo.livros.get(m) + "\nAutor: " + Acervo.livros.get(n) + "\nAno de lançamento: " + Acervo.livros.get(o) + "\nEditora: " + Acervo.livros.get(p));
            if(Acervo.livros.get(q).equals(true)){
                System.out.println("### Está disponível ###");
            } else {
                System.out.println("### Está indisponível ###");
            }
            l += 6;
            m += 6;
            n += 6;
            o += 6;
            p += 6;
            q += 6;
        }
    }
    
    // Método apresentarLivro com 1 parâmetro
    public void apresentarLivro(ArrayList livros){
        System.out.println("\nO seguinte livro foi doado: ");
        int l = livros.size()-5;
        int m = livros.size()-4;
        int n = livros.size()-3;
        int o = livros.size()-2;
        int i = livros.size()/TAMANHO_LIVROS;
        System.out.println(i + " --------------------------------------------------------------------------");
        System.out.println("Nome do livro: " + Acervo.livros.get(l) + "\nAutor: " + Acervo.livros.get(m) + "\nAno de lançamento: " + Acervo.livros.get(n) + "\nEditora: " + Acervo.livros.get(o) + "\n### Está disponível ###");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("\nDeseja continuar doando? \ndigite 1 para SIM ou 2 para NÃO");
        Scanner ler = new Scanner(System.in);
        int escolha = ler.nextInt();
        switch(escolha){
            case 1: // Chamando método cadastrarLivro
                    cadastrarLivro(ler);
                break;
            case 2: System.out.println("O que você deseja agora da nossa livraria?\n");
                    System.out.println("Digite 1 para PEGAR UM LIVRO EMPRESTADO\nDigite 2 para DEVOLVER UM LIVRO EMPRESTADO");
                    escolha = ler.nextInt();
                    // Chamando método decisaoUsuario
                    decisaoUsuario(ler ,escolha);
                break;
            default: System.out.println("Opção inválida.");
                    operacoesAceitas(ler);
        }
    }
    
    // Método sobrecarregado decisaoUsuario com 2 parâmetros
    public void decisaoUsuario(int escolha, Scanner ler){
        switch(escolha){
            case 1: System.out.println("\nEscolha um dos livros disponíveis abaixo: ");
                    // Chamando método apresentarLivros
                    apresentarLivros();
                    System.out.println("\nDigite o número do livro escolhido: ");
                    int numeroLivro = ler.nextInt();
                    // Chamando método escolheLivro
                    escolheLivro(numeroLivro, ler);
                break;
            
            case 2: // Chamando método apresentarLivros
                    apresentarLivros();
                    System.out.println("\nDigite o número do livro que você deseja devolver: ");
                    numeroLivro = ler.nextInt();
                    // Chamando método devolveLivro
                    devolveLivro(numeroLivro ,ler);
                break;
                
            case 3: // Chamando método cadastrarLivro
                    cadastrarLivro(ler);
                break;
            default: System.out.println("Opção inválida.");
                    operacoesAceitas(ler);
            } 
    }
    
    // Método sobrecarregado decisaoUsuario com 2 parâmetros
    public void decisaoUsuario(Scanner ler, int segundaEscolha){
        switch(segundaEscolha){
            case 1: System.out.println("\nEscolha um dos livros disponíveis abaixo: ");
                    // Chamando método apresentarLivro
                    apresentarLivros();
                    System.out.println("\nDigite o número do livro escolhido: ");
                    int numeroLivro = ler.nextInt();
                    // Chamando método escolheLivro
                    escolheLivro(numeroLivro, ler);
                break;
            
            case 2: // Chamando método apresentarLivro
                    apresentarLivros();
                    System.out.println("\nDigite o número do livro que você deseja devolver: ");
                    numeroLivro = ler.nextInt();
                    // Chamando método devolveLivro
                    devolveLivro(numeroLivro, ler);
                break;
            default: System.out.println("Opção inválida.");
                    operacoesAceitas(ler);
            }
    }
    
    // Método escolheLivro com 2 parâmetros
    public void escolheLivro(int numeroLivro, Scanner ler){
        if(numeroLivro>0 && numeroLivro<=(livros.size()/TAMANHO_LIVROS)){
            int l = 0;
            for(int i=0;i<livros.size();i++){
                if(livros.get(l).equals(numeroLivro)){
                    if(livros.get(l+5).equals(true)){
                        System.out.println("\nO livro escolhido foi: ");
                        System.out.println(numeroLivro + " --------------------------------------------------------------------------");
                        System.out.println("Nome do livro: " + Acervo.livros.get(l+1) + "\nAutor: " + Acervo.livros.get(l+2) + "\nAno de lançamento: " + Acervo.livros.get(l+3) + "\nEditora: " + Acervo.livros.get(l+4));
                        System.out.println("-----------------------------------------------------------------------------");
                        livros.set(l+5, false);
                        System.out.println("Deseja escolher outro livro?\nDigite 1 para SIM ou 2 para NÃO");
                        int novaEscolha = ler.nextInt();
                        switch(novaEscolha){
                            case 1: System.out.println("\nDigite o número do livro escolhido: ");
                                    numeroLivro = ler.nextInt();
                                    // Chamando método escolheLivro
                                    escolheLivro(numeroLivro, ler);
                                break;
                            case 2: System.out.println("O que você deseja agora da nossa livraria?\n");
                                    System.out.println("Digite 1 para DEVOLVER UM LIVRO EMPRESTADO\nDigite 2 para CEDER UM LIVRO PARA A LIVRARIA");
                                    int terceiraEscolha = ler.nextInt();
                                    switch(terceiraEscolha){
                                        case 1: // Chamando método apresentarLivros
                                                apresentarLivros();
                                                System.out.println("\nDigite o número do livro que você deseja devolver: ");
                                                numeroLivro = ler.nextInt();
                                                // Chamando método devolveLivro
                                                devolveLivro(numeroLivro ,ler);
                                            break;
                                        case 2: //Chamando método cadastrarLivro
                                                cadastrarLivro(ler);
                                            break;
                                        default: System.out.println("Opção inválida.");
                                                operacoesAceitas(ler);
                                    }
                                break;
                            default: System.out.println("Opção inválida.");
                                    operacoesAceitas(ler);
                        }
                    }else {
                        System.out.println("O livro está indisponível. Escolha um livro disponível: ");
                        numeroLivro = ler.nextInt();
                        // Chamando método escolheLivro
                        escolheLivro(numeroLivro, ler);
                    }
                }
                l++;
            }
        } else {
            System.out.printf("%c Não há nenhum livro com esse número.",94);
            System.out.println(" Por favor, digite um número existente na lista: ");
            numeroLivro = ler.nextInt();
            // Chamando método escolheLivro
            escolheLivro(numeroLivro, ler);
        }
    }
    
    // Método devolveLivro com 2 parâmetros
    public void devolveLivro(int numeroLivro, Scanner ler){
        if(numeroLivro>0 && numeroLivro<=(livros.size()/TAMANHO_LIVROS)){
            int l = 0;
            for(int i=0;i<livros.size();i++){
                if(livros.get(l).equals(numeroLivro)){
                    if(livros.get(l+5).equals(false)){
                        System.out.println("\nO livro devolvido foi: ");
                        System.out.println(numeroLivro + " --------------------------------------------------------------------------");
                        System.out.println("Nome do livro: " + Acervo.livros.get(l+1) + "\nAutor: " + Acervo.livros.get(l+2) + "\nAno de lançamento: " + Acervo.livros.get(l+3) + "\nEditora: " + Acervo.livros.get(l+4));
                        System.out.println("-----------------------------------------------------------------------------");
                        livros.set(l+5, true);
                        System.out.println("Deseja devolver outro livro?\nDigite 1 para SIM ou 2 para NÃO");
                        int novaEscolha = ler.nextInt();
                        switch(novaEscolha){
                            case 1: // Chamando método apresentarLivros
                                    apresentarLivros();
                                    System.out.println("\nDigite o número do livro que você deseja devolver: ");
                                    numeroLivro = ler.nextInt();
                                    // Chamando método devolveLivro
                                    devolveLivro(numeroLivro, ler);
                                break;
                                
                            case 2: System.out.println("O que você deseja agora da nossa livraria?\n");
                                    System.out.println("Digite 1 para PEGAR UM LIVRO EMPRESTADO\nDigite 2 para CEDER UM LIVRO PARA A LIVRARIA");
                                    novaEscolha = ler.nextInt();
                                    switch(novaEscolha){
                                        case 1: System.out.println("\nEscolha um dos livros disponíveis abaixo: ");
                                                // Chamando método apresentarLivros
                                                apresentarLivros();
                                                System.out.println("\nDigite o número do livro escolhido: ");
                                                numeroLivro = ler.nextInt();
                                                // Chamando método escolheLivro
                                                escolheLivro(numeroLivro, ler);
                                            break;
                                        case 2: // Chamando método cadastrarLivro
                                                cadastrarLivro(ler);
                                            break;
                                        default: System.out.println("Opção inválida.");
                                                operacoesAceitas(ler);
                                    }
                                break;
                            default: System.out.println("Opção inválida.");
                                    operacoesAceitas(ler);
                        }
                    } else{
                        System.out.println("O livro já estava disponível. Escolha um livro indisponível para devolver: ");
                        numeroLivro = 0;
                        numeroLivro = ler.nextInt();
                        // Chamando método devolveLivro
                        devolveLivro(numeroLivro, ler);
                    }
                }
                l++;
            }
        } else {
            System.out.printf("%c Não há nenhum livro com esse número.",94);
            System.out.println(" Por favor, digite um número existente na lista: ");
            numeroLivro = ler.nextInt();
            // Chamando método devolveLivro
            devolveLivro(numeroLivro, ler);
        }  
    }
    
    // Método operacoesAceitas com 1 parâmetro
    public void operacoesAceitas(Scanner ler){
        System.out.println("\nDigite 1 para PEGAR UM LIVRO EMPRESTADO\nDigite 2 para DEVOLVER UM LIVRO EMPRESTADO\nDigite 3 para CEDER UM LIVRO PARA A LIVRARIA");
        int escolha = ler.nextInt();
        // Chamando método escolhaUsuario
        decisaoUsuario(escolha, ler);
    }
}
