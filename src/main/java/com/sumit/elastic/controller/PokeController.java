package com.sumit.elastic.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.elastic.handler.IPokemonHandler;
import com.sumit.elastic.model.vo.PokemonVO;

@RestController
public class PokeController {

	@Autowired
	IPokemonHandler iPokemonHandler;

	@RequestMapping(value = "/getPokemon", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PokemonVO getPokemon(HttpServletRequest request) {
		return iPokemonHandler.getPokemon(request.getParameter("pokemon"));
	}

	@RequestMapping(value = "/savePokemon", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void savePokemon(@RequestBody List<PokemonVO> pokemon, HttpServletRequest request) {
		iPokemonHandler.savePokemon(pokemon);
	}

	@RequestMapping(value = "/updatePokemon", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void updatePokemon(@RequestBody PokemonVO pokemon, HttpServletRequest request) {
		iPokemonHandler.updatePokemon(pokemon);
	}
	
	@RequestMapping(value = "/searchPokemon", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody  List<PokemonVO> searchPokemon(@RequestBody PokemonVO pokemon, HttpServletRequest request) {
		return iPokemonHandler.searchPokemon(pokemon);
	}
	
	

}
