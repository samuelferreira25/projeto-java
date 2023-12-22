package usuario;

public class usuarioComprador extends usuario{

	public usuarioComprador(String nome, String genero, int idade, float Saldo) {
		super(nome, genero, idade);
		this.Saldo=Saldo;		
	}
        public float getSaldo() {
		return Saldo;
	}
	public void setSaldo(float saldo) {
		Saldo = saldo;
	}
		private float Saldo;
		@Override
		public void imprime() {
			System.out.println("\nO nome do usuario é "+nome);
			System.out.println("\nA idade do usuario é "+idade+ "anos");
			System.out.println("\nSeu genero é "+genero);
			System.out.println("\nO seu saldo é de R$ "+Saldo);
			
		}
          public boolean comprar(float custos) {
        	  if (Saldo - custos>=0) {
        		  Saldo -= custos;
        		  return true;
        	  }else 
        		  return false;
          }
}
