package org.framestudy.api;

import org.framestudy.models.WeatherInfo;

public interface IWeatherService {
	/**
	 * 根据当前日期获取天气情况
	 * @param date
	 * @return
	 */
	public WeatherInfo getWeatherBydate(String date) throws Exception;
}
