package src.classe_especial.PesquisaEleitoral;

import java.util.ArrayList;
import java.util.List;

public class Questao {

    private Enquete enquete;
    private String enunciado;
    private List<Alternativa> alternativas = new ArrayList<>();

    public Questao(Enquete enquete, String enunciado) {
        this.enunciado = enunciado;
        this.enquete = enquete;
    }

    public Questao addAlternativa(String textoAlternativa) {
        Alternativa novaAlternativa = new Alternativa(this, textoAlternativa);
        alternativas.add(novaAlternativa);
        return this;
    }

    public List<Alternativa> getAlternativas() {
        return alternativas;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public Enquete getEnquete() {
        return enquete;
    }

}
