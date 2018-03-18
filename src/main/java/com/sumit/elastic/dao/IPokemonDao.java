package com.sumit.elastic.dao;

import java.util.List;

import com.sumit.elastic.model.vo.PokemonVO;

public interface IPokemonDao {

	void insertPokemon(List<PokemonVO> pokemon);

	PokemonVO findPokemon(String parameter);

	void updatePokemon(PokemonVO pokemon);

	List<PokemonVO> searchAll(PokemonVO pokemon);


}
