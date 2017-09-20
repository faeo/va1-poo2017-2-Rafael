package br.unincor.controle;

import java.util.ArrayList;
import java.util.List;

import br.unincor.exception.EvolucaoException;
import br.unincor.model.Pokemon;
import br.unincor.view.Usuario;

public class Main {

	public static void main(String[] args) {
		
		Usuario view = new Usuario();
		Operacoes op = new Operacoes();
		List<Pokemon> listaPokemons = new ArrayList<Pokemon>();
		
		Long qntd = view.recebeLong("Digite a qtd de pokemons: ");
		
		for (int i = 0; i < qntd; i++) {
			
			Pokemon pokemon = new Pokemon 
					("Pokemon " + (i+1), 
					"Fogo", 
					(double)(Math.random() * (10.0 - 2.0) + 1), 
					(double)(Math.random() * (10.0 - 2.0) + 1));
			
			listaPokemons.add(pokemon);
			
		}
		
		for (int i = 0; i < qntd; i++) {
		
			try {
				op.evoluir(listaPokemons.get(i));
			} catch (EvolucaoException e) {
				view.exibeMsg(e.getMessage());
			}
		}
		
		//gui.exibeMsg("--- MAIOR SALDO ---\n" + t.maiorSaldo(listaContas).toString());
		view.exibeMsg("POKEMON COM MAIOR CP: \n" + op.maiorCp(listaPokemons).verDados());
		view.exibeMsg("POKEMON COM MENOR CP: \n" + op.menorCp(listaPokemons).verDados());
		
	
		
	}
	
}
		
			
