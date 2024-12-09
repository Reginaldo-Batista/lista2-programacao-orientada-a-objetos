package src.classe_especial.PesquisaEleitoral;

public class Alternativa {

    private String texto;
    private int quantidadeVotos;

    public Alternativa(String texto) {
        this.texto = texto;
    }

    public void votar() {
        quantidadeVotos++;
    }

    public int getQuantidadeVotos() {
        return quantidadeVotos;
    }

    public String getTexto() {
        return texto;
    }
}
