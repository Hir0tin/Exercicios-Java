import java.util.ArrayList;
import java.util.List;

public class Livro {
  
  public String titulo;
    private String autor;
    private int anoPublicacao;
    private int id;

     public ArrayList<Integer> listaId = new     ArrayList<Integer>();

   
    public Livro(String titulo, String autor, int anoPublicacao, int id) {
      
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.id = id;
        listaId.add(this.id);
      }
    

    
    public Livro(String titulo, String autor, int            anoPublicacao) {

        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.id = (int)(Math.random() * 10001); 
        for(int i = 0; i < listaId.size(); i ++){

          if (this.id == listaId.get(i)){
            i = 0;
            this.id = (int)(Math.random() * 10001); 
          }
          
        }
      
    }

    public void alterarTitulo(String titulo){
        this.titulo = titulo; 
        System.out.println("Titulo alterado! Novo titulo: " + titulo);
    }
    public void alterarAutor(String autor){
        this.autor = autor;
      System.out.println( "Autor alterado! Novo autor: " + autor);
    }
    public void alterarAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
      System.out.println( "Ano de publicação alterado! Novo ano de publicação: " + anoPublicacao);
    }

    public void imprimir(){

      System.out.println(this);
      
    }

    public void getID(){

      System.out.println(this.id);
      
    }
  
  
  @Override
  public String toString() {
  return "Livro: " +  titulo + " Autor: "+ autor  + " Ano de Publicacao: " + anoPublicacao ;
  }
  
  
        
}
