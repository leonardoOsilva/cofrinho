package trabalhoCofrinho;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}

//Comentários referentes a utilização desses métodos na classe Real, pra maior organização e menor "Poluição".
	
	@Override
	public void info() {	
		System.out.println("Valor Dolar: " + getValor());
			
	}


	@Override
	public double converter() {
		return getValor() * 5.34;
			
	}
	
	
	
}
