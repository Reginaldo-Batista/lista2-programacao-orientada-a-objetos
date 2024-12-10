package src.classe_especial.PesquisaEleitoral;

public class Teste {

  public static void main(String[] args) {

    Participante p1 = new Participante("123419283");
    Participante p2 = new Participante("192837817");
    Participante p3 = new Participante("713723122");

    new Enquete("Enquete sobre a eleição")
        .addQuestao("Em quem você votaria para presidente?")
        .addAlternativa("Lula")
        .addAlternativa("Bolsonaro")
        .addAlternativa("Tales")
        .addAlternativa("Branco");

    p1.responder(Enquete.getEnquetes().get(0).getQuestoes().get(0).getAlternativas().get(1));
    p2.responder(Enquete.getEnquetes().get(0).getQuestoes().get(0).getAlternativas().get(2));
    p3.responder(Enquete.getEnquetes().get(0).getQuestoes().get(0).getAlternativas().get(2));

    Contabilizador.contabilizarRespostas();
    Contabilizador.exibirResultados();

  }

}
