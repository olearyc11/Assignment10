package com.coderscampus.Assignment10.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.DTO.DayResponse;

import com.coderscampus.Assignment10.DTO.WeekResponse;
import com.coderscampus.Assignment10.domain.RecipeService;


@RestController
public class RecipeController {
	
	@Autowired
	RecipeService recipeService;
	
	@GetMapping("/mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(
			@RequestParam(required = false) Integer numCalories, 
			@RequestParam(required = false) String diet, 
			@RequestParam(required = false) String exclusions) {
		return recipeService.convertWeekData(numCalories, diet, exclusions);
	}

	@GetMapping("/mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(
			@RequestParam(required = false) Integer numCalories, 
			@RequestParam(required = false) String diet, 
			@RequestParam(required = false) String exclusions) {
		return recipeService.convertDayData(2850, diet, exclusions);
	}
	
}
