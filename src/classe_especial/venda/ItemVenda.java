package src.classe_especial.venda;

import src.classe_especial.AgregadorGenerico.Item;

// Questão 4
public class ItemVenda extends Item {

  public ItemVenda(String nome, double preco, int quantidade) {
    super(nome, preco, quantidade);
  }

  @Override
  public String toString() {
    return this.getNome() +
        " - R$ " +
        this.getPreco() +
        " - " +
        this.getQuantidade() + " unidade(s)";
  }

}
