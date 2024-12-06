package src.classe_especial.strategyPagamento;

public class CreditCard implements Payment {

    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCard(String cardNumber, String expirationDate, String cvv) {
        setCardNumber(cardNumber);
        setExpirationDate(expirationDate);
        setCvv(cvv);
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão de crédito");
    }

    public String getCardNumber() {
        return cardNumber;
    }

    private void setCardNumber(String numeroCartao) {
        this.cardNumber = numeroCartao;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    private void setExpirationDate(String dataValidade) {
        this.expirationDate = dataValidade;
    }

    public String getCvv() {
        return cvv;
    }

    private void setCvv(String cvv) {
        this.cvv = cvv;
    }

}
