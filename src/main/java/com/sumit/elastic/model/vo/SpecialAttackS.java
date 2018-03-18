package com.sumit.elastic.model.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpecialAttackS {

	@JsonProperty("Name")
	private String name;
	@JsonProperty("Type")
	private String type;
	@JsonProperty("Damage")
	private Integer damage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

}