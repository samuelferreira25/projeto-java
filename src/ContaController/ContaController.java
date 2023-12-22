package ContaController;

import java.util.ArrayList;

import conta.repository.Conta;
import usuario.usuarioComprador;



public class ContaController implements Conta {

	private ArrayList <usuarioComprador>  listasContas = new ArrayList <usuarioComprador>();

	@Override
	public void listarTodas() {
		for (usuarioComprador x : listasContas) {
			x.imprime();
			System.out.println("--------------------------");
		}
		
	}

	@Override
	public void adicionar(usuarioComprador adicionar) {
	listasContas.add(adicionar);
		
	}

	@Override
	public void remover(usuarioComprador remover) {
		listasContas.remove(remover);
		
		
	}
	public usuarioComprador primeiro() {
		if (listasContas.isEmpty()) {
			throw new NullPointerException("Não há usuarios no sistema");
        
}else 
	return listasContas.get(0);
	}
	
}
