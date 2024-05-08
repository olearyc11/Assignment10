package com.coderscampus.Assignment10.domain;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Service
public class RecipeService {
	
	@Value("${spoonacular.api.key}")
	private String apiKey;
	@Value("${spoonacular.urls.base}")
	private String urlBase;
	@Value("${spoonacular.urls.mealplan}")
	private String urlMealPlan;
	

	private URI buildURI(String dayOrWeek, String numOfCals, String diet, String exclusions) {
		
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
	
	public <T>ResponseEntity<T> getData(String dayOrWeek, String numOfCals, String diet, String exclusions, Class<T> dayOrWeekClass) {
		RestTemplate rt = new RestTemplate();
		URI uri = buildURI(dayOrWeek, numOfCals, diet, exclusions);
		return rt.getForEntity(uri, dayOrWeekClass);
		
	}
	
}
