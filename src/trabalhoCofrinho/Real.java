package trabalhoCofrinho;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
		
	}

	
//Sobrescrevendo um método já existente na classe mãe "Moeda" mas do jeito especifico dessa classe filha.
	//Importante pois facilita na depuração de erros de escrita/definição algum momento, o JVM irá notificar que esta escrito errado.
	
	@Override
	public void info() {		
		
		System.out.println("Valor Real: " + getValor()); //Pegando o valor referente a moeda Real e imprimindo na tela.
		
	}

//Fazendo a conversão do real que, nesse caso, é para ele mesmo e retornando o valor obtido.	
	
	@Override
	public double converter() {
		return getValor() * 1;
		
	}
	
	
	
}
