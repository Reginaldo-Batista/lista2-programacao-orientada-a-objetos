package src.classe_especial.PesquisaEleitoral;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Participante {

    private static List<Participante> participantes = new ArrayList<>();
    private static Map<String, Participante> participantesPorCpf = new HashMap<>();
    
    private String cpf;
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

}
