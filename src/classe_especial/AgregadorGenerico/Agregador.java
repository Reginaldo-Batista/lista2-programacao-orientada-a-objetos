package src.classe_especial.AgregadorGenerico;

import java.util.LinkedList;
import java.util.List;

public abstract class Agregador<T extends Item> {

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
