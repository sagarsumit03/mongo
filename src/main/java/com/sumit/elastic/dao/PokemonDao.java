package com.sumit.elastic.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.sumit.elastic.model.vo.PokemonVO;

@Repository
public class PokemonDao implements IPokemonDao {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public void insertPokemon(List<PokemonVO> pokemon) {
		mongoTemplate.insert(pokemon, "pokemon");
	}

	/*
	 * Save – It should rename to saveOrUpdate(), it performs insert() if “_id” is
	 * NOT exist or update() if “_id” is existed”. Insert – Only insert, if “_id” is
	 * existed, an error is generated.
	 */
	@Override
	public PokemonVO findPokemon(String parameter) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(parameter));
		return mongoTemplate.findOne(query, PokemonVO.class, "pokemon");
	}

	@Override
	public void updatePokemon(PokemonVO pokemon) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(pokemon.getId()));
		Update update = new Update();
		update.set("name", pokemon.getName());
		mongoTemplate.updateFirst(query, update, PokemonVO.class, "pokemon");
	}

	@Override
	public List<PokemonVO> searchAll(PokemonVO pokemon) {
		return mongoTemplate.find(new Query().addCriteria(Criteria.where("name").exists(true)), PokemonVO.class, "pokemon");
	}

}
