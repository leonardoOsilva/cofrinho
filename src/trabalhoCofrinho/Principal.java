package trabalhoCofrinho;

import java.util.Scanner;

public class Principal {	
	
	public static void main(String[] args) {
	//Criando os atributos:
		
		Scanner teclado = new Scanner(System.in);
		Cofrinho cofre = new Cofrinho();
		
	//While para gerar um menu com um loop infinito, que só encerrará quando o usuário acionar essa opção:
		
		while(true) {
			
			//MENU:
			System.out.println("\nCofrinho:");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Total convertido para Real");
			System.out.println("0 - Sair\n");
				
			
			//Executando validação da classe validarEntrada para garantir que o usuário escolhera uma opção válida.
			
			int opcao = validarEntrada.validarInt(teclado, "Escolha: ", 0, 4);
			
			if (opcao == 0) {
				System.out.println("\nPrograma encerrado !");
				break;
			}
			
//Evitar o uso repetido de vários if/elses obtendo o mesmo resultado, já que estou trabalhando com números:
			
			switch (opcao) {
				case 1:
					int tipoAdicionar = validarEntrada.validarInt(teclado, "\nEscolha a moeda que deseja adicionar:\n1 - Dólar | 2 - Euro | 3 - Real", 1, 3);
					double valor = validarEntrada.validarDouble(teclado, "Digite o valor da moeda que deseja adicionar: ");
					Moeda a = null; //Atribuindo uma variavel genérica para a classe abstrata moedas, aguardando o usuário definir a classe que será trabalhada
					
					if (tipoAdicionar == 1) {
						a = new Dolar(valor);
					}
					else if (tipoAdicionar == 2) {
						a = new Euro(valor);
					}
					else if (tipoAdicionar == 3) {
						a = new Real(valor);
					}
					else {
						System.out.println("Valor digitado inválido");
						break;
					}
					
					cofre.adicionar(a);
					break;
					
				case 2:
					int tipoRemover = validarEntrada.validarInt(teclado, "\n Escolha o tipo de moeda que deseja remover:\n1 - Dólar | 2 - Euro | 3 - Real ", 1, 3);
					double valorRemover = validarEntrada.validarDouble(teclado, "Digite o valor da moeda que deseja remover: ");
					
					Moeda r = null; //A mesma coisa que no "Moeda a = null" só que agora no contexto de remoção
					
					if (tipoRemover == 1) {
						r = new Dolar(valorRemover);
					}
					else if (tipoRemover == 2) {
						r = new Euro(valorRemover);
					}
					else if (tipoRemover == 3) {
						r = new Real(valorRemover);
					}
					else {
						System.out.println("Valor digitado inválido");
						break;
					}
					
					cofre.remover(r);
					break;
				
				case 3:
					cofre.listagemMoedas();
					break;
				
				case 4:
					System.out.println("Total Convertido: " + cofre.totalConvertido());
					break;
				
				default:
					System.out.println("Opção inválida");
					
			}			
		}
	}	
}