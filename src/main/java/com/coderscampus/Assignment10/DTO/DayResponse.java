package com.coderscampus.Assignment10.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayResponse {
	
	@JsonProperty
	private List<Meal> meals;
	@JsonProperty
	private Nutrients nutrients;
	
	
	public List<Meal> getMeals() {
		return meals;
	}
	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}
	public Nutrients getNutrients() {
		return nutrients;
	}
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
	
	
	
	
	
}
