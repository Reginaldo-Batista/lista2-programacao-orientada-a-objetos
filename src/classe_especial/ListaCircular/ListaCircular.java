package src.classe_especial.ListaCircular;

public class ListaCircular<T> {

    private Head<T> head;
    private Tail<T> tail;

    public ListaCircular() {
        head = new Head<T>();
        tail = new Tail<T>();
    }

    public void add(T valor) {
        Bloco<T> novoBloco = new Bloco<T>(valor);
        if (head.primeiro == null) {
            head.primeiro = novoBloco;
            head.ultimo = novoBloco;
            tail.primeiro = novoBloco;
            tail.ultimo = novoBloco;
            novoBloco.setProximo(novoBloco);
            novoBloco.setAnterior(novoBloco);
        } else {
            tail.ultimo.setProximo(novoBloco);
            novoBloco.setAnterior(tail.ultimo);
            novoBloco.setProximo(head.primeiro);
            tail.ultimo = novoBloco;
            head.primeiro.setAnterior(tail.ultimo);
        }
    }

    public T getUltimo() {
        return tail.ultimo.getValor();
    }
    
    public void print() {
        Bloco<T> atual = head.primeiro;
        while (atual != tail.ultimo) {
            System.out.println(atual.getValor());
            atual = atual.getProximo();
        }
        System.out.println(atual.getValor());
    }

}
