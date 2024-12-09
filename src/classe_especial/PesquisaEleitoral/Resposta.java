package src.classe_especial.PesquisaEleitoral;

public class Resposta {

    private Participante participante;
    private Alternativa alternativaEscolhida;

    public Resposta(Participante participante, Alternativa alternativaEscolhida) {
        this.participante = participante;
        this.alternativaEscolhida = alternativaEscolhida;
    }

    public Questao getQuestao() {
        return alternativaEscolhida.getQuestao();
    }

    public Participante getParticipante() {
        return participante;
    }

    public Alternativa getAlternativaEscolhida() {
        return alternativaEscolhida;
    }
}
