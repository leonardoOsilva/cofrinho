package trabalhoCofrinho;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
		
	}
	
//Comentários referentes a utilização desses métodos na classe Real, pra maior organização e menor "Poluição".
	
	@Override
	public void info() {
		System.out.println("Valor Euro: " + getValor());
	}
	
	
	@Override
	public double converter() {
		return getValor() * 6.19;
	}
	
}
