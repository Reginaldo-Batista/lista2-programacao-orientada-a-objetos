package src.classe_especial.PesquisaEleitoral;

public class Alternativa {

    private String texto;
    private Questao questao;
    private int quantidadeVotos;

    public Alternativa(Questao questao, String texto) {
        this.questao = questao;
        this.texto = texto;
        this.quantidadeVotos = 0;
    }

    public void addVoto() {
        this.quantidadeVotos++;
    }

    public int getQuantidadeVotos() {
        return quantidadeVotos;
    }

    public Questao getQuestao() {
        return questao;
    }

    public String getTexto() {
        return texto;
    }
}
