package trabalhoCofrinho;

import java.util.Objects;

public abstract class Moeda {
	private double valor;

	public Moeda(double valor) {
	
//Fazendo a validação da moeda, dentro do "set", pra evitar que seja digitado zero ou números negativos: 
		
		setValor(valor);
	}
	
	
	
	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {

		if (valor <= 0) {
			
// IllegalArgumenException usado aqui pois é uma exceção mais especifica dentro do RunTimeException que pega justamente a exceção de argumentos/valores inválidos.			
			
			throw new IllegalArgumentException("Valor inválido, digite um valor acima de zero !");
		}
		
		this.valor = valor;
	}


	
	public abstract void info();
	public abstract double converter();
	
	//Utilizando os métodos equals()/hashCode() para poder comparar mais facilmente os objetos na minha lista.

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true; //Compara se as referências são as mesmas.
		}
		
		if (obj == null) {
			return false; //Se o objeto for null não haverá comparação.
		}
		
		if (this.getClass() != obj.getClass()) {
			return false; 
		}
		
		Moeda other = (Moeda) obj; //Dizendo ao Java que esse objeto é uma "Moeda".
		final double EPS = 1e-9; //Explicação no final do código. "E1"
		
		return Math.abs(this.valor - other.valor) < EPS; //Método para pegar o valor absoluto de números decimais e retornar true.		
		
	}
	
	@Override  //Explicação no final do código. "E2"
	public int hashCode() {
		return Objects.hash(this.getClass(), valor);		
	}
	
	
}



//"E1" = Notação para evitar problemas ao se trabalhar com decimais, 
//...devido a forma como o computador faz arredondamento binário.
//...(Método de tolerância ao se trabalhar com double).


//"E2" = Acompanha o "equals", se o equals ta dizendo que dois objetos são iguais, o hashCode. 
//De forma simples, vai combinar a classe e os valores das moedas.
