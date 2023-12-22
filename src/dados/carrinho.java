package dados;

import java.util.ArrayList;

import produto.produto;

public class carrinho {

	ArrayList <produto> Carrinho = new ArrayList<produto>();
	
	public carrinho() {
		
	}
	public void adicionarProduto(produto P){
		if (P != null) {
			Carrinho.add(P);
			//adiciona produtos no carrinho
		}
	    
	}
	public void buscarProduto (String P) {
		for (produto x:Carrinho) {
			if (x.getNome().toLowerCase().contains(P.toLowerCase())) x.imprimir();
			//Imprimir produtos na tela com base no termo
		}
	}
	public void removerProduto(String P) {
		for (produto x:Carrinho) {
			if (x.getNome().toLowerCase().equals(P.toLowerCase()))Carrinho.remove(x);
			//remove os produtos com base no termo
		}
	} public produto obterProduto (String buscar) {
		for (produto x:Carrinho) {
			if (x.getNome().toLowerCase().equals(buscar.toLowerCase())) {
				Carrinho.remove(x);
				return x;
				
			}
		
		}	
	      return null;
	}  
}	
