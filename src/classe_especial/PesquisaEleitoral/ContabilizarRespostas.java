package src.classe_especial.PesquisaEleitoral;

import java.util.List;

public class ContabilizarRespostas {

    public static List<Participante> participantes = Participante.getParticipantes();
    public static List<Enquete> enquetes = Enquete.getEnquetes();

    public static void contabilizarRespostas() {
        for (Participante participante : participantes) {
            List<Resposta> respostas = participante.getRespostas();
            for (Resposta resposta : respostas) {
                Alternativa alternativa = resposta.getAlternativaEscolhida();
                alternativa.addVoto();
            }
        }
    }

    public static void exibirResultados() {
        for (Enquete enquete : enquetes) {
            System.out.println("Enquete: " + enquete.getTitulo());
            List<Questao> questoes = enquete.getQuestoes();
            for (Questao questao : questoes) {
                System.out.println("Questão: " + questao.getEnunciado());
                List<Alternativa> alternativas = questao.getAlternativas();
                for (Alternativa alternativa : alternativas) {
                    System.out.println(alternativa.getTexto() + ": " + alternativa.getQuantidadeVotos());
                }
            }
        }
    }



}
