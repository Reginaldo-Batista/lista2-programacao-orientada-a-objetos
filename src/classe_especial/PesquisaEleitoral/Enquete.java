package src.classe_especial.PesquisaEleitoral;

import java.util.ArrayList;
import java.util.List;

public class Enquete {
    
    private String titulo;
    private List<Questao> questoes = new ArrayList<>();

    public Enquete(String titulo) {
        this.titulo = titulo;
    }

    public void adicionarQuestao(Questao questao) {
        questoes.add(questao);
    }

    public void removerQuestao(Questao questao) {
        questoes.remove(questao);
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }
}
