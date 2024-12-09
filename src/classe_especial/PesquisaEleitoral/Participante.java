package src.classe_especial.PesquisaEleitoral;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Participante {

    private static List<Participante> participantes = new ArrayList<>();
    private static Map<String, Participante> participantesPorCpf = new HashMap<>();
    private String cpf;
    private List<Enquete> enquentesParaResponder = new ArrayList<>();
    private List<Resposta> respostas = new ArrayList<>();

    public Participante(String cpf) {
        setCpf(cpf);
        Participante.participantes.add(this);
        Participante.participantesPorCpf.put(cpf, this);
    }

    public void responder(Alternativa alternativa) {
        Resposta resposta = new Resposta(this, alternativa);
        respostas.add(resposta);
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            throw new RuntimeException("CPF inválido");
        }
        if (participantesPorCpf.containsKey(cpf)) {
            throw new RuntimeException("CPF já cadastrado");
        }
        this.cpf = cpf;
    }

    public static List<Participante> getParticipantes() {
        return participantes;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public List<Enquete> getEnquentesParaResponder() {
        return enquentesParaResponder;
    }

    public void adicionarEnquete(Enquete enquete) {
        enquentesParaResponder.add(enquete);
    }

    public void removerEnquete(Enquete enquete) {
        enquentesParaResponder.remove(enquete);
    }

    // public void responderEnquete(Enquete enquete, Questao questao, Alternativa
    // alternativa) {
    // if (!enquentesParaResponder.contains(enquete)) {
    // throw new RuntimeException("Enquete não disponível para resposta");
    // }
    // if (!enquete.getQuestoes().contains(questao)) {
    // throw new RuntimeException("Questão não disponível para resposta");
    // }
    // if (!questao.getAlternativas().contains(alternativa)) {
    // throw new RuntimeException("Alternativa não disponível para resposta");
    // }
    // Resposta resposta = new Resposta(questao, alternativa);
    // respostas.add(resposta);
    // }

}
