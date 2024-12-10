package src.classe_especial.PesquisaEleitoral;

import java.util.ArrayList;
import java.util.List;

public class Enquete {

    private static List<Enquete> enquetes = new ArrayList<>();
    private String titulo;
    private List<Questao> questoes = new ArrayList<>();

    public Enquete(String titulo) {
        this.titulo = titulo;
        Enquete.enquetes.add(this);
    }

    public Enquete adicionarQuestao(Questao questao) {
        questoes.add(questao);
        return this;
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

    public static List<Enquete> getEnquetes() {
        return enquetes;
    }
}
