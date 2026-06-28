package trabalhoCofrinho;

import java.util.Scanner;

//Classe criada para tratamentos de exceção pois estava usando muitos try/catch repetidos ao longo do código. Tentando tornar ele mais limpo... 
//e legível.



public class validarEntrada {
//Bloqueando a instanciação para que essa classe fique exclusivamente utilitária e não possa ser transformada em objeto no futuro.
	
	private validarEntrada() {}
	
//Tratamento de exceções tanto para valores Int quanto Double:
	
	public static double validarDouble(Scanner teclado, String mensagem) {
		double valor;
		
	//Loop de validação.
		
		while(true) {
			try {
				System.out.println(mensagem);
				valor = teclado.nextDouble();
				
				if (valor <= 0) {
					System.out.println("Número inválido, valor deve ser maior que zero");
					continue; //Vai garantir que caso a condição não seja atendida o while continue rodando.
				}
				
				return valor; //Caso a condição seja atendida o loop encerra aqui.
				
			} catch (Exception e) {
				System.out.println("Entrada inválida. Digite um número"); //Tratando casos que simbolos ou letras são digitados.
				teclado.nextLine(); //Explicação da utilização na ultima linha do programa.
			}
		}
	}	
	
//Método readaptado para validar 4 coisas diferentes, evitar que seja digitado números negativos ou letras e símbolos;
//Fazer o usuário digitar um valor de 0 à 4 no menu principal e de 1 à 3 no menu de adicção e remoção de moedas.
	
	public static int validarInt(Scanner teclado, String mensagem, int min, int max) {

		int numero;
		
		while(true) {
			try {
				System.out.println(mensagem);
				numero = teclado.nextInt();
				
			//Validação da faixa "menu".
				
				if (numero < min || numero > max) {
					System.out.println("Número inválido digite um número entre " + min + " e " + max + " . ");
					continue;
				}
				
				return numero;
				
			} catch (Exception e) {
				System.out.println("Entrada Inválida. Digite um número");
				teclado.nextLine();
			}
		}
	}	
	
}

//*.nextLine() foi utilizado no catch para que o scanner pudesse ser apagado após o usuário digitar uma letra, se utilizasse o ".nextDouble()/.NextInt()" 
//ele criaria a exceção, mas o campo continuaria preenchindo correndo o risco de loop infinito de erros.
//Para evitar isso, .nextLine() foi recomendado no lugar de .nextDoule()/.nextInt(). 

