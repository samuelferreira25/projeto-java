package projeto.java;

import java.util.InputMismatchException;
import java.util.Scanner;

import ContaController.ContaController;
import dados.carrinho;
import produto.produto;
import usuario.usuarioComprador;



public class Menu {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	
	int  opcao,idade;
	String nome, genero;
	float saldo,totalCompras=0;
	 carrinho dados = new carrinho();
	dados.adicionarProduto(new produto ("camisa verde", 29.99f));
	dados.adicionarProduto(new produto ("camisa Amarela", 29.99f));
	dados.adicionarProduto(new produto ("Calça jeans",   39.99f));
	dados.adicionarProduto(new produto ("Calça moletom", 49.59f));
	dados.adicionarProduto(new produto ("Bermuda jeans",35.79f));
	dados.adicionarProduto(new produto ("Bermuda tactel", 28.69f));
	dados.adicionarProduto(new produto ("jaqueta de frio", 99.99f));
	
	carrinho minhasCompras = new carrinho();
	ContaController usuarios = new ContaController();
	
	
		
	 
	while (true) {	

	System.out.println("                                                     ");
	System.out.println("            1 - Cadastrar cliente                    ");
	System.out.println("            2 - Buscar Produto no estoque            ");
	System.out.println("            3 - Adicionar produto no carrinho        ");
	System.out.println("            4 - Remover produto no carrinho          ");
	System.out.println("            5 - Finalizar compras                    ");
	System.out.println("            6 - Listar produtos do carrinho           ");
	System.out.println("            7 - Sair do menu                         ");
	System.out.println("                                                     ");
	System.out.println("             Entre com a opcao desejada:             ");
	
	try {
		opcao = leia.nextInt();
	} catch (InputMismatchException e) {
		System.out.println("\nDigite valores inteiros!");
		leia.nextLine();
		opcao = 0;
	}
	if (opcao == 7) {
		System.out.println("\nObrigado por acessar nosso menu!");
		leia.close();
		System.exit(0);
	}
	
	switch (opcao) {
	     
	case 1: 
		System.out.println("\nCadastrar  cliente ");
	
	System.out.println("\nDigite seu nome e sobrenome: ");
	leia.skip("\\R?");
	nome = leia.nextLine();
	System.out.println("\nDigite seu genero: ");
	leia.skip("\\R?");
	genero = leia.nextLine();
	System.out.println("\nDigite sua idade: ");
	leia.skip("\\R?");
	idade = leia.nextInt();
	System.out.println("\nDigite seu saldo: ");
	leia.skip("\\R?");
	saldo = leia.nextFloat();
	usuarioComprador cliente = new usuarioComprador(nome, genero, idade, saldo);
	usuarios.adicionar(cliente);
	
	
      break;
	case 2:
		System.out.println("\nBuscar produtos no estoque ");
		System.out.println("\nDigite um termo de busca: ");
		leia.skip("\\R?");
		dados.buscarProduto(leia.nextLine());
		break;
		
	case 3:
		System.out.println("\nAdicionar produto no carrinho ");
		 System.out.println("\nDigite o nome do produto que deseja adicionar: ");
		 leia.skip("\\R?");
		   String nomedoProduto = leia.nextLine();
		   produto y = dados.obterProduto(nomedoProduto);
		      if (y != null) {
		    	  minhasCompras.adicionarProduto(y);
		    	  System.out.println("\nProduto adicionado ao carrinho!! ");
		    	  totalCompras += y.getPreco();
		      }
		break;
	
	case 4: System.out.println("\nRemover produto do carrinho ");
	System.out.println("\nDigite o nome do produto que voce deseja remover: ");
	leia.skip("\\R?");
	   String Produto = leia.nextLine();
	   produto Z = minhasCompras.obterProduto(Produto);
	      if (Z != null) {
	    	 dados.adicionarProduto(Z);
	    	  System.out.println("\nProduto removido do carrinho!! ");
	    	  totalCompras -= Z.getPreco();
	      }

        break;
        
	case 5: 
		System.out.println("\nFinalizar compras: ");
		System.out.println("\nO valor total da compra é de R$"+totalCompras);
		usuarioComprador c = usuarios.primeiro();
		if (c != null) {
			if (c.comprar(totalCompras)) {
				System.out.println("\nA compra foi realizada com sucesso! O seu novo saldo é de R$ "+c.getSaldo());
				}else
					System.out.println("\nO saldo do usuario não é suficiente para executar a compra.");
		}
		
		break;
		
	case 6:
		System.out.println("\nListar produtos: ");
		minhasCompras.buscarProduto("");
		System.out.println("\nO total do carrinho é de R$: "+totalCompras);
		
		break;
		
	default:
		System.out.println("\nA opção selecionada é invalida!! ");
		break;
	}
	
	 }

	
	   
	}

	}
