package com.coderscampus.Assignment10.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meal {
	
	@JsonProperty("id")
	private Integer ID;
	@JsonProperty("imageType")
	private String imageType;
	@JsonProperty("title")
	private String title;
	@JsonProperty("readyInMinutes")
	private Integer readyInMinutes;
	@JsonProperty("servings")
	private Integer servings;
	@JsonProperty("sourceUrl")
	private String sourceURL;
	
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}
	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}
	public Integer getServings() {
		return servings;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	public String getSourceURL() {
		return sourceURL;
	}
	public void setSourceURL(String sourceURL) {
		this.sourceURL = sourceURL;
	}


	

	
}
