package org.framestudy.models;

import java.io.Serializable;

public class WeatherInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7901855114267119815L;

	private Long id;
	private String weather;//天气情况
	private Integer temperature;//温度
	public WeatherInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WeatherInfo(String weather, Integer temperature) {
		super();
		this.weather = weather;
		this.temperature = temperature;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public Integer getTemperature() {
		return temperature;
	}
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "WeatherInfo [id=" + id + ", weather=" + weather + ", temperature=" + temperature + "]";
	}
}
