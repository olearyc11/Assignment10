package com.coderscampus.Assignment10.domain;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment10.DTO.DayResponse;
import com.coderscampus.Assignment10.DTO.WeekResponse;


@Service
public class RecipeService {
	
	@Value("${spoonacular.api.key}")
	private String apiKey;
	@Value("${spoonacular.urls.base}")
	private String urlBase;
	@Value("${spoonacular.urls.mealplan}")
	private String urlMealPlan;
	

	private URI buildURI(String dayOrWeek, Integer numOfCals, String diet, String exclusions) {
		
		URI uri = UriComponentsBuilder.fromHttpUrl(urlBase + urlMealPlan)
							.queryParam("timeFrame", dayOrWeek)
							.queryParam("apiKey", apiKey)
							.queryParamIfPresent("targetCalories", Optional.ofNullable(numOfCals))
							.queryParamIfPresent("diet", Optional.ofNullable(diet))
							.queryParamIfPresent("exclude", Optional.ofNullable(exclusions))							
							.build()
							.toUri();
		return uri;
	}
	
	public ResponseEntity<DayResponse> convertDayData(Integer numOfCals, String diet, String exclusions) {
		RestTemplate rt = new RestTemplate();
		URI uri = buildURI("day", numOfCals, diet, exclusions);
		return rt.getForEntity(uri, DayResponse.class);
		
	}
	
	public ResponseEntity<WeekResponse> convertWeekData(Integer numOfCals, String diet, String exclusions) {
		RestTemplate rt = new RestTemplate();
		URI uri = buildURI("week", numOfCals, diet, exclusions);
		return rt.getForEntity(uri, WeekResponse.class);
		
	}
	
}
