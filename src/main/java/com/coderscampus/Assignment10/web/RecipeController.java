package com.coderscampus.Assignment10.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.DTO.DayResponse;

import com.coderscampus.Assignment10.DTO.WeekResponse;
import com.coderscampus.Assignment10.domain.RecipeService;


@RestController
public class RecipeController {
	
	@Autowired
	RecipeService recipeService;
	
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
		return recipeService.convertWeekData("week", "2200", diet, exclusions);
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
		return recipeService.convertDayData("day", "1600", "vegan", exclusions);
	}
	
}
