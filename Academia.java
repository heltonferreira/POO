package entidade;

public class Academia{
    
    public enum Exerc{natacao, musculacao, crossfit, corrida, levantamanto};
    
    private boolean personal;
    private String horario, dia;
    private int repeticao, peso, tempo;//tempo em min
    private Exerc exerc;
    
    public Academia(Exerc exerc, boolean faz, String horario, String dia, int repeticao, int peso, int tempo){
        this.exerc = exerc;
        this.horario = horario;
        this.dia = dia;
        this.repeticao = repeticao;
        this.peso = peso;
        this.tempo = tempo;
    }
    
    public Exerc getExerc(){
        return exerc;
    }
    
    public void setExerc(Exerc exerc){
        this.exerc = exerc;
    }
    
    public String getHorario(){
        return horario;
    }
    
    public void setHorario(String horario){
        this.horario = horario;
    }
    
    public String getDia(){
        return dia;
    }
    
    public void setDia(String dia){
        this.dia = dia;
    }
    
    public int getRepeticao(){
        return repeticao;
    }
    
    public void setRepeticao(int repeticao){
        this.repeticao = repeticao;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public int getTempo(){
        return tempo;
    }
    
    public void setTempo(int tempo){
        this.tempo = tempo;
    }
    
    public boolean getPersonal(){
        return personal;
    }
    
    public void setPersonal(boolean personal){
        this.personal = personal;
    }
}