import java.util.ArrayList;
import java.util.List;

  public class Biblioteca{
   private ArrayList<Livro> listaLivros = new ArrayList<Livro>();

  
    public void adicionarLivro(Livro x){

      listaLivros.add(x);
    
  }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao, int id){

      Livro livro = new Livro(titulo, autor, anoPublicacao, id);
      listaLivros.add(livro);

    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){

      Livro livro = new Livro(titulo, autor, anoPublicacao);
      listaLivros.add(livro);

    }

    
  public void ListarLivros(){

    for(int i = 0; i < listaLivros.size(); i ++){

      System.out.println(listaLivros.get(i).titulo);
      
    }
    
  }
  public void consultarLivro(String x){
    try{
    if(x == null){
      throw new IllegalArgumentException("Título não pode ser nulo.");
    }
    
    boolean achouLivro = false;
    
    for(int i = 0; i < listaLivros.size(); i ++){
      
        if (x.equals(listaLivros.get(i).titulo)){

            System.out.println(listaLivros.get(i));
            achouLivro = true;
        }
      
    }
    if (!achouLivro){
      System.out.println("Livro não encontrado");
    
    }
    }catch(IllegalArgumentException e){
      System.out.println("Erro ao localizar o livro");
    }   
      
  }


    
    @Override
    public String toString() {
    return listaLivros.toString();
    }

  
}