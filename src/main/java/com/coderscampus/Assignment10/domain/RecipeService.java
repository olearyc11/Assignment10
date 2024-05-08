package com.coderscampus.Assignment10.domain;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Service
public class RecipeService {

	private URI buildURI(String dayOrWeek) {
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
							.queryParam("timeFrame", dayOrWeek)
							.build()
							.toUri();
		return uri;
	}
	
	public <T>ResponseEntity<T> getData(String dayOrWeek, Class<T> dayOrWeekClass) {
		RestTemplate rt = new RestTemplate();
		URI uri = buildURI(dayOrWeek);
		return rt.getForEntity(uri, dayOrWeekClass);
		
	}
	
}
