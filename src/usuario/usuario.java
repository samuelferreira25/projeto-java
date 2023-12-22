package usuario;

public abstract class usuario  {
	
	protected String nome;
	protected String genero;
	protected int idade;
	
	public usuario(String nome, String genero, int idade) {
		this.nome = nome;
		this.genero= genero;
		this.idade= idade;
		
	}
     public abstract void imprime();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
