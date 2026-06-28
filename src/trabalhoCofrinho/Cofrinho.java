package trabalhoCofrinho;

import java.util.ArrayList;


public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas = new ArrayList<>();
	
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
		System.out.println("Moeda Adicionada com sucesso");
	}
	
	
	public void remover(Moeda moeda) {
//Adicionando um tratamento extra para caso não haja a moeda especifica ou moeda alguma		
		
		if (listaMoedas.remove(moeda)) {
			System.out.println("Moeda Removida com Sucesso");
		} else {
			System.out.println("A moeda especificada não foi encontrada");
		}
		
	}
	
	
	public void listagemMoedas() {
//Adicionando tratamento para caso o Array esteja vazio:
		
		if (listaMoedas.isEmpty()) {
			System.out.println("Nenhuma Moeda Adicionada");
			return;
		}
		
		for (Moeda m : listaMoedas) {
			m.info();
		}
		
	}
	
	
	public double totalConvertido() {
//Declarando a variavel total com valor inicial 0 para incrementar a conversão dentro do for.		
		
		double total = 0;
		
		for (Moeda m : listaMoedas) {
			total += m.converter();
		}
		return total; //retornando o valor obtido após o for.
	}
	
}
