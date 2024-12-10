package src.classe_especial.PesquisaEleitoral;

import java.util.ArrayList;
import java.util.List;

public class Questao {

    private String enunciado;
    private List<Alternativa> alternativas = new ArrayList<>();
    private Enquete enquete;

    public Questao(String enunciado) {
        this.enunciado = enunciado;
    }

    public Questao addAlternativa(Alternativa alternativa) {
        alternativas.add(alternativa);
        return this;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public List<Alternativa> getAlternativas() {
        return alternativas;
    }

    public Enquete getEnquete() {
        return enquete;
    }

}
