package src.classe_especial.AgregadorGenerico;

public abstract class Item {

  private static long itemIdCounter = 0;
  private long iD;
  private String nome;
  private double preco;
  private int quantidade;

  public Item(String nome, double preco, int quantidade) {
    this.iD = itemIdCounter;
    itemIdCounter++;
    this.setNome(nome);
    this.setPreco(preco);
    this.setQuantidade(quantidade);
  }

  public long getiD() {
    return iD;
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
    this.preco = preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

}
