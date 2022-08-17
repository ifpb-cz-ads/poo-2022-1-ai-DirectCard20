public class Categoria extends Livro {
    // Construtor padrão
    public Categoria(){
    }
    
    // Construtor com 6 parâmetros
    public Categoria(int indice, String nome, String autor, int anoLancamento, String editora, boolean disponivel){
        setIndice(indice);
        Acervo.livros.add(this.getIndice());
        setNome(nome);
        Acervo.livros.add(this.getNome());
        setAutor(autor);
        Acervo.livros.add(this.getAutor());
        setAnoLancamento(anoLancamento);
        Acervo.livros.add(this.getAnoLancamento());
        setEditora(editora);
        Acervo.livros.add(this.getEditora());
        setDisponivel(disponivel);
        Acervo.livros.add(this.getDisponivel());
    }
}