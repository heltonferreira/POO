package entidade;

public class Disciplina{
    
    public enum Tipo{obrigatoria, optativa, eletiva};
    
    private String titulo;
    private int carga_horaria_total;
    private int carga_horaria_pratica;
    private boolean reuni;
    private Tipo tipo;
    
    public Disciplina(String titulo, int carga_horaria_total, int carga_horaria_pratica, boolean reuni, Tipo tipo){
        this.titulo = titulo;
        this.carga_horaria_total = carga_horaria_total;
        this.carga_horaria_pratica = carga_horaria_pratica;
        this.reuni = reuni;
        this.tipo = tipo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public int getCarga_horaria_total(){
        return carga_horaria_total;
    }
    
    public void setCarga_horaria_total(int carga_horaria_total){
        this.carga_horaria_total = carga_horaria_total;
    }
     
    public int getCarga_horaria_pratica(){
        return carga_horaria_pratica;
    }
    
    public void setCarga_horaria_pratica(int carga_horaria_pratica){
        this.carga_horaria_pratica = carga_horaria_pratica;
    }
    
    public Tipo getTipo(){
        return tipo;
    }
    
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }
    
    public boolean getReuni(boolean reuni){
        return reuni;
    }
    
    public void setReuni(boolean reuni){
        this.reuni = reuni;
    }
}