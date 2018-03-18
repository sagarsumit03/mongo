package com.sumit.elastic.model.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PokemonVO {

	@JsonProperty("id")
	private String id;
	@JsonProperty("Name")
	private String name;
	@JsonProperty("Classification")
	private String classification;
	@JsonProperty("Types")
	private List<String> types = null;
	@JsonProperty("Resistant")
	private List<String> resistant = null;
	@JsonProperty("Weaknesses")
	private List<String> weaknesses = null;
	@JsonProperty("Special Attack(s)")
	private List<SpecialAttackS> specialAttackS = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public List<String> getResistant() {
		return resistant;
	}

	public void setResistant(List<String> resistant) {
		this.resistant = resistant;
	}

	public List<String> getWeaknesses() {
		return weaknesses;
	}

	public void setWeaknesses(List<String> weaknesses) {
		this.weaknesses = weaknesses;
	}

	public List<SpecialAttackS> getSpecialAttackS() {
		return specialAttackS;
	}

	public void setSpecialAttackS(List<SpecialAttackS> specialAttackS) {
		this.specialAttackS = specialAttackS;
	}

}
