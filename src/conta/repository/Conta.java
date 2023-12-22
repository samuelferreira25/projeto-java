package conta.repository;


import usuario.usuarioComprador;

public interface Conta {
	public void listarTodas();
	public void adicionar (usuarioComprador adicionar);
	public void remover (usuarioComprador remover);

	

}
