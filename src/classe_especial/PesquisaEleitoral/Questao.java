package src.classe_especial.PesquisaEleitoral;

import java.util.ArrayList;
import java.util.List;

public class Questao {

    private String enunciado;
    private List<Alternativa> alternativas = new ArrayList<>();
    private Alternativa alternativaEscolhida;

    public Questao(String enunciado, List<Alternativa> alternativas) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
    }

    public void adicionarAlternativa(Alternativa alternativa) {
        alternativas.add(alternativa);
    }

    public void removerAlternativa(Alternativa alternativa) {
        alternativas.remove(alternativa);
    }

    public void setAlternativaEscolhida(Alternativa alternativa) {
        alternativaEscolhida = alternativa;
    }

    public void confirmarResposta() {
        if (alternativaEscolhida == null) {
            throw new RuntimeException("Alternativa não escolhida");
        }
        alternativaEscolhida.votar();
    }

    public String getEnunciado() {
        return enunciado;
    }

    public List<Alternativa> getAlternativas() {
        return alternativas;
    }

    public Alternativa getAlternativaEscolhida() {
        return alternativaEscolhida;
    }
}
