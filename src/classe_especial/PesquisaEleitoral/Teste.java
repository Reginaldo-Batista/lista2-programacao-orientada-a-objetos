package src.classe_especial.PesquisaEleitoral;

public class Teste {

  public static void main(String[] args) {
    Participante p1 = new Participante("João");
    Participante p2 = new Participante("Maria");
    Participante p3 = new Participante("José");

    Enquete enquete = new Enquete("Enquete sobre a eleição");
    Questao q1 = new Questao("Em quem você votaria para presidente?");
    q1.addAlternativa(new Alternativa(q1, "Bolsonaro"))
        .addAlternativa(new Alternativa(q1, "Lula"))
        .addAlternativa(new Alternativa(q1, "Ciro"))
        .addAlternativa(new Alternativa(q1, "Branco"));

    enquete.adicionarQuestao(q1);

    p1.responder(q1.getAlternativas().get(0));
    p2.responder(q1.getAlternativas().get(1));
    p3.responder(q1.getAlternativas().get(2));

    ContabilizarRespostas.contabilizarRespostas();
    ContabilizarRespostas.exibirResultados();
  }

}
