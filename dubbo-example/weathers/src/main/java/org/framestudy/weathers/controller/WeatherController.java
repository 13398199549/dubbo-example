package org.framestudy.weathers.controller;

import javax.annotation.Resource;

import org.framestudy.api.IWeatherService;
import org.framestudy.models.WeatherInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/weathers")
@RestController
public class WeatherController {

	@Resource
	private IWeatherService weatherServiceImpl;
	
	@RequestMapping(value="/{date}",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	public WeatherInfo getWeatherBydate(@PathVariable("date") String date) {
		WeatherInfo weather = null;
		try {
			weather = weatherServiceImpl.getWeatherBydate(date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return weather;
	}
}
