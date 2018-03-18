package com.sumit.elastic.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sumit.elastic.dao.IPokemonDao;
import com.sumit.elastic.model.vo.PokemonVO;

@Component
public class PokemonHandler implements IPokemonHandler {
	@Autowired
	IPokemonDao pokemonDao;

	@Override
	public PokemonVO getPokemon(String parameter) {
		return pokemonDao.findPokemon(parameter);
	}

	public void savePokemon(List<PokemonVO> pokemon) {
		if (pokemon != null && pokemon.size() > 0) {
			pokemonDao.insertPokemon(pokemon);
		}
	}

	@Override
	public void updatePokemon(PokemonVO pokemon) {
		if (pokemon != null) {
			if (pokemon.getId() != null) {
				pokemonDao.updatePokemon(pokemon);
			}
		} else {
			List<PokemonVO> pokemonList = new ArrayList<PokemonVO>();
			pokemonList.add(pokemon);
			pokemonDao.insertPokemon(pokemonList);
		}

	}


	@Override
	public List<PokemonVO> searchPokemon(PokemonVO pokemon) {
		 return pokemonDao.searchAll(pokemon);		
	}

}
