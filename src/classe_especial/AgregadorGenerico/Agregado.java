package src.classe_especial.AgregadorGenerico;

import java.util.LinkedList;
import java.util.List;

// Questão 4
public abstract class Agregado<T extends Item> {

  private List<T> itens = new LinkedList<T>();

  public void addItem(T item) {
    itens.add(item);
  }

  public void removeItem(T item) {
    itens.remove(item);
  }

  public List<T> getItens() {
    return itens;
  }

}
