package produto;

public class produto {
	private float preco;
	private String nome;
	
	public produto(String nome, float preco) {
		this.nome = nome;
		this.preco= preco;
		
		
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
     public void imprimir() {
    	 System.out.println("---------------------------");
    	 System.out.println("Nome do produto: " + nome);
    	 System.out.println("Preço do produto: " + preco);
    	 System.out.println("---------------------------");
     }
}
