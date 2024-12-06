package src.classe_especial.strategyPagamento;

public class Pix implements Payment {

    private String chavePix;

    public Pix(String chavePix) {
        setChavePix(chavePix);
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Pix");
    }

    public String getChavePix() {
        return chavePix;
    }

    private void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

}
