package src.classe_especial.PesquisaEleitoral;

import java.util.ArrayList;
import java.util.List;

public class Questao {

    private String enunciado;
    private List<Alternativa> alternativas = new ArrayList<>();
    private Enquete enquete;

    public Questao(Enquete enquete, String enunciado, List<Alternativa> alternativas) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.enquete = enquete;
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
