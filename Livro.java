// Classe abstrata Livro
public abstract class Livro {
    // Atributos da classe Livro
    private int indice;
    private String nome;
    private String autor;
    private int anoLancamento;
    private String editora;
    private boolean disponivel = true;

    // Métodos Getters and Setters
    public int getIndice(){
        return indice;
    }
    public void setIndice(int indice){
        this.indice = indice;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public boolean getDisponivel(){
        return disponivel;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
}