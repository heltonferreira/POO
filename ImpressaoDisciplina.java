package controle;

import entidade.Disciplina;
import java.util.ArrayList;

public class ImpressaoDisciplina{
    
    private static Disciplina[] disciplina;
    
    public static void main(String[] args){
        disciplina = criarDisciplina();
        imprimirDisciplina("disciplina cadastrados:", disciplina);
        ArrayList<Disciplina> disciplina_selecionados = selecionarDisciplina();
        imprimirDisciplina("disciplina Selecionados:",
                disciplina_selecionados.toArray(new Disciplina[disciplina_selecionados.size()]));
    }
    
    private static Disciplina[] criarDisciplina() {
        Disciplina[] disciplina = new Disciplina[8];
        disciplina[0] = new Disciplina ("Algoritmos", 72, 36, true, Disciplina.Tipo.obrigatoria); 
        disciplina[1] = new Disciplina ("Programacao", 72, 72, true, Disciplina.Tipo.optativa); 
        disciplina[2] = new Disciplina ("Fisica", 100, 0, false, Disciplina.Tipo.obrigatoria); 
        disciplina[3] = new Disciplina ("Calculo", 86, 0, false, Disciplina.Tipo.obrigatoria); 
        disciplina[4] = new Disciplina ("Banco de Dados", 36, 15, true, Disciplina.Tipo.optativa);
        disciplina[5] = new Disciplina ("Analise de Algoritmos", 72, 36, false, Disciplina.Tipo.optativa); 
        disciplina[6] = new Disciplina ("Automatos", 36, 0, false, Disciplina.Tipo.obrigatoria);
        disciplina[7] = new Disciplina ("Ciencia e Cotidiano", 36, 36, true, Disciplina.Tipo.obrigatoria); 
        return disciplina;
    }
    
    private static ArrayList<Disciplina> selecionarDisciplina() {
        int carga_teorica_minima = 1990;
        Disciplina.Tipo tipo = Disciplina.Tipo.eletiva;
        boolean reuni = true;
        if(reuni){
            System.out.println("--- Filtros de seleção: disciplinas de reuni" + " do tipo " + tipo + " e com carga teorica minima " + carga_teorica_minima + "\n");
        }
        return filtrarDisciplina(carga_teorica_minima, tipo, reuni);
    }
    
    private static void imprimirDisciplina (String cabeçalho, Disciplina[] disciplina) {
        System.out.println("--- " + cabeçalho);
        String dados_aluno;
        for (Disciplina aluno : disciplina) {
            dados_aluno = aluno.getNome() + " nasceu em " + aluno.getAnoNascimento() + " - sexo: ";
            if (aluno.getSexo() == 'F') dados_aluno += "feminino"; 
            else dados_aluno += "masculino";
                dados_aluno += " - estado civil: " + aluno.getTipo(); 
            if (aluno.getEstrangeiro()) dados_aluno += " - estrangeiro"; 
            System.out.println(dados_aluno);
        }
        System.out.println(); 
    }
    
private static ArrayList<Disciplina> filtrarDisciplina(int carga_teorica_minima, Disciplina.Tipo tipo, boolean reuni) {
    ArrayList<Disciplina> disciplina_selecionados = new ArrayList(); 
    for (int n = 0; n < disciplina.length; n++) {
        int carga_teorica_minima = (disciplina[n].getCarga_horaria_total) - (disciplina[n].getCarga_horaria_pratica);
        if ((ano_nascimento >= ano_inicial) && (ano_nascimento <= ano_final)
                && (disciplina[n].getTipo() == estado_civil)) {
            disciplina_selecionados.add(disciplina[n]); 
        }
    }
    return disciplina_selecionados; 
    }
}