package src.classe_especial.PesquisaEleitoral;

import java.util.ArrayList;
import java.util.List;

public class Participante {

    List<Enquete> enquentesParaResponder = new ArrayList<>();
    List<Resposta> respostas = new ArrayList<>();

    public void adicionarEnquete(Enquete enquete) {
        enquentesParaResponder.add(enquete);
    }

    public void removerEnquete(Enquete enquete) {
        enquentesParaResponder.remove(enquete);
    }

    public void responderEnquete(Enquete enquete, Questao questao, Alternativa alternativa) {
        if (!enquentesParaResponder.contains(enquete)) {
            throw new RuntimeException("Enquete não disponível para resposta");
        }
        if (!enquete.getQuestoes().contains(questao)) {
            throw new RuntimeException("Questão não disponível para resposta");
        }
        if (!questao.getAlternativas().contains(alternativa)) {
            throw new RuntimeException("Alternativa não disponível para resposta");
        }
        Resposta resposta = new Resposta(questao, alternativa);
        respostas.add(resposta);
    }

}
