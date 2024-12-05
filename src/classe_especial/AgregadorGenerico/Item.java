package src.classe_especial.AgregadorGenerico;

// Questão 4
public abstract class Item {

  private String nome;
  private double preco;
  private int quantidade;

  public Item(String nome, double preco, int quantidade) {
    this.setNome(nome);
    this.setPreco(preco);
    this.setQuantidade(quantidade);
  }

  public double getValorTotal() {
    return this.getPreco() * this.getQuantidade();
}

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    if (preco < 0) {
      throw new IllegalArgumentException("Preço não pode ser negativo");
    }
    this.preco = preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    if (quantidade < 0) {
      throw new IllegalArgumentException("Quantidade não pode ser negativa");
    }
    this.quantidade = quantidade;
  }

}
