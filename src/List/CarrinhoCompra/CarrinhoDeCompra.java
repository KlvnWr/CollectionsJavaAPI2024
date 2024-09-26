package List.CarrinhoCompra;

import java.util.ArrayList;
import java.util.List;

import List.ListaTarefa.Tarefa;

public class CarrinhoDeCompra {
	private List<Item> carrinhoCompra;
	
	public CarrinhoDeCompra() {
		this.carrinhoCompra = new ArrayList<Item>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade){
//		Item item = new Item(nome, preco, quantidade);
//		this.itemList.add(item);
		carrinhoCompra.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
	    if (!carrinhoCompra.isEmpty()) {
	      for (Item i : carrinhoCompra) {
	        if (i.getNome().equalsIgnoreCase(nome)) {
	          itensParaRemover.add(i);
	        }
	      }
	      carrinhoCompra.removeAll(itensParaRemover);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	}
	
	public void exibirItens() {
		if (!carrinhoCompra.isEmpty()) {
		      System.out.println(this.carrinhoCompra);
		    } else {
		      System.out.println("A lista está vazia!");
		    }
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0d;
	    if (!carrinhoCompra.isEmpty()) {
	      for (Item item : carrinhoCompra) {
	        double valorItem = item.getPreco() * item.getQuantidade();
	        valorTotal = valorTotal + valorItem;
	      }
	      return valorTotal;
	    } else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	}
	
	 public String toString() {
		    return "CarrinhoDeCompras{" +
		        "itens=" + carrinhoCompra +
		        '}';
		  }
	
	public static void main(String[] args) {
		CarrinhoDeCompra carrinhoCompra = new CarrinhoDeCompra();
		
		carrinhoCompra.adicionarItem("Lápis", 2d, 3);
		carrinhoCompra.adicionarItem("Batedeira", 300.00, 1);
		carrinhoCompra.adicionarItem("Colher", 10.00, 5);
		
		carrinhoCompra.exibirItens();

		carrinhoCompra.removerItem("Lápis");
		
		carrinhoCompra.exibirItens();
		
		System.out.println("O valor total da compra é = " + carrinhoCompra.calcularValorTotal());
		
		
		
	}
}
