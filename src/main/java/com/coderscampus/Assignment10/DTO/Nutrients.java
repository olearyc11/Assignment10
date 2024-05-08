package com.coderscampus.Assignment10.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {

	@JsonProperty("calories")
	private Integer calories;
	@JsonProperty("protein")
	private Integer protein;
	@JsonProperty("fat")
	private Integer fat;
	@JsonProperty("carbohydrates")
	private Integer carbs;
	
	
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	public Integer getProtein() {
		return protein;
	}
	public void setProtein(Integer protein) {
		this.protein = protein;
	}
	public Integer getFat() {
		return fat;
	}
	public void setFat(Integer fat) {
		this.fat = fat;
	}
	public Integer getCarbs() {
		return carbs;
	}
	public void setCarbs(Integer carbs) {
		this.carbs = carbs;
	}

	


	
}
