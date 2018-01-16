package org.framestudy.provider.service.impl;

import org.framestudy.api.IWeatherService;
import org.framestudy.models.WeatherInfo;
import org.springframework.stereotype.Service;

/**
 * 服务发布者实现接口
 * @author Administrator
 *
 */
@Service
public class WeatherServiceImpl implements IWeatherService {

	@Override
	public WeatherInfo getWeatherBydate(String date)  throws Exception{
		// TODO Auto-generated method stub
		return new WeatherInfo("天气晴朗", 25);
	}

}
