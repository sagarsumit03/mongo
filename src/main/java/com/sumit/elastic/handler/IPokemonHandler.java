package com.sumit.elastic.handler;

import java.util.List;

import com.sumit.elastic.model.vo.PokemonVO;

public interface IPokemonHandler {

	PokemonVO getPokemon(String parameter);

	void savePokemon(List<PokemonVO> pokemon);

	void updatePokemon(PokemonVO pokemon);

	List<PokemonVO> searchPokemon(PokemonVO pokemon);

}
