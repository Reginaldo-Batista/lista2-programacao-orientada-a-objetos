package src.classe_especial.PesquisaEleitoral;

public class Resposta {
    
    private Questao questao;
    private Alternativa alternativaEscolhida;

    public Resposta(Questao questao, Alternativa alternativaEscolhida) {
        this.questao = questao;
        this.alternativaEscolhida = alternativaEscolhida;
    }

    public Questao getQuestao() {
        return questao;
    }

    public Alternativa getAlternativaEscolhida() {
        return alternativaEscolhida;
    }
}
