package br.unincor.controle;

import java.util.List;

import br.unincor.exception.EvolucaoException;
import br.unincor.model.Pokemon;

public class Operacoes {
	
	/**
	 * Fazer com que este método não retorne nada e
	 * lance a 'EvolucaoException' quando o pokemon
	 * não estiver com CP para evoluir. Sempre
	 * que o pokemon não estiver com no mínimo de CP
	 * lance a 'EvolucaoException'. Se estiver com pelo
	 * menos o mínimo de CP, setar 1 no CP deste pokemon.
	 */
	public boolean evoluir(Pokemon p) throws EvolucaoException {
		Long teste = p.getCp();
		
		if(teste >= 80L){
			
			teste = teste + 20L;
			
			p.setCp(teste);
			
			return true;
		}	
		else
			throw new EvolucaoException(p);
	}
	
	public Pokemon maiorCp(List<Pokemon> listaPokemons) {
		Pokemon pokemonMaiorCp = listaPokemons.get(0);
		
		for (int i = 0; i< listaPokemons.size(); i++) {
			if(listaPokemons.get(i).getCp() > pokemonMaiorCp.getCp())
				pokemonMaiorCp = listaPokemons.get(i);
		}
		return pokemonMaiorCp;
	}
	
	public Pokemon menorCp(List<Pokemon> listaPokemons) {
		Pokemon pokemonMenorCp = listaPokemons.get(0);
		
		for (int i = 0; i< listaPokemons.size(); i++) {
			if(listaPokemons.get(i).getCp() < pokemonMenorCp.getCp())
				pokemonMenorCp = listaPokemons.get(i);
		}
		
		return pokemonMenorCp;
	}

}
