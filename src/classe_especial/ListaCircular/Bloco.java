package src.classe_especial.ListaCircular;

public class Bloco<T> {

    private T valor;
    private Bloco<T> proximo;
    private Bloco<T> anterior;

    public Bloco(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Bloco<T> getProximo() {
        return proximo;
    }

    public void setProximo(Bloco<T> proximo) {
        this.proximo = proximo;
    }

    public Bloco<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Bloco<T> anterior) {
        this.anterior = anterior;
    }

}
