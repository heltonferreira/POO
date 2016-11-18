package controle;

import entidade.Academia;
import java.util.ArrayList;

public class ImpressaoAcademia {
    
    private static Academia[] fichas;
    
    public static void main(String[] args){
        fichas = criarFichas();
        imprimirFichas("Fichas cadastradas: ", fichas);
        ArrayList<Academia> fichas_selecionadas = selecionarFichas();
        imprimirFichas("Fichas selecionadas", fichas_selecionadas.toArray(new Academia[fichas_selecionadas.size()]));
    }    
    
    private static Academia[] criarFichas(){
        Academia[] fichas = new Academia[6];
        fichas[0] = new Academia(Academia.Exerc.corrida, true, "08:00", "segunda-feira", 1, 0, 60);
        fichas[1] = new Academia(Academia.Exerc.levantamanto, true, "10:00", "quinta-feira", 15, 50, 0);
        fichas[2] = new Academia(Academia.Exerc.musculacao, false, "12:00", "terca-feira", 15, 20, 30);
        fichas[3] = new Academia(Academia.Exerc.crossfit, false, "07:00", "sabado", 1, 0, 30);
        fichas[4] = new Academia(Academia.Exerc.natacao, true, "13:00", "quinta-feira", 1, 0, 40);
        fichas[5] = new Academia(Academia.Exerc.natacao, true, "09:00", "quinta-feira", 1, 0, 25);
        return fichas;
    }
    
    private static void imprimirFichas(String cabecalho, Academia[] fichas){
        System.out.println("--- " + cabecalho);
        String dados_ficha;
        for (Academia ficha : fichas) {
            dados_ficha = "O exercicio " + ficha.getExerc() + " no dia: " + ficha.getDia() +
                    " no horario: " + ficha.getHorario() + " com " + ficha.getRepeticao() + " repeticoes " + "sera feito com " 
                    + ficha.getPeso() +  "kg em " + ficha.getTempo() + "min.";
            System.out.println(dados_ficha);
        }
        System.out.println(); 
    }
    
    private static ArrayList<Academia> selecionarFichas(){
        String dia = "quinta-feira";
        boolean personal = true;
        Academia.Exerc exerc = Academia.Exerc.natacao;
        
        System.out.println("Os filtros utilizados foram: " + dia + ", " + personal + " e " + exerc);
        return filtrarFichas(dia, personal, exerc);
    }
    
    private static ArrayList<Academia> filtrarFichas(String dia, boolean personal, Academia.Exerc exerc){
        ArrayList<Academia> fichas_selecionadas = new ArrayList();
        for(int n = 0; n < fichas.length; n++){
            if((fichas[n].getExerc().equals(exerc)) && (fichas[n].getDia().equals(dia)) && (!fichas[n].getPersonal())){
                fichas_selecionadas.add(fichas[n]);
            }
        }
        return fichas_selecionadas;
    }
}