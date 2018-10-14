package com.example.furka.justweather;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import com.example.furka.justweather.Models.CurrentWeather.CurrentWeather;
import com.example.furka.justweather.Models.WeatherForecast.WeatherForecast;

import java.util.List;

public interface ApiInterface {
    @GET("weather?q=trabzon&appid=70519525643fea9551d7682ce4a2efa5")
    Call<List<CurrentWeather>> getWeather();
    @GET("weather?")
    Call<List<CurrentWeather>> getWeather(
            @Query("q") String cityName,
            @Query("units") String units,
            @Query("lang") String lang,
            @Query("appid") String appid
    );

    @GET("weather?")
    Call<List<CurrentWeather>> getWeather(
            @Query("id") int cityID,
            @Query("units") String units,
            @Query("lang") String lang,
            @Query("appid") String appid
    );

    @GET("weather?")
    Call<List<CurrentWeather>> getWeather(
            @Query("lon") double longitude,
            @Query("lat") double latitude,
            @Query("units") String units,
            @Query("lang") String lang,
            @Query("appid") String appid
    );

    @GET("forecast?")
    Call<List<WeatherForecast>> getForecast(
            @Query("q") String cityName,
            @Query("units") String units,
            @Query("lang") String lang,
            @Query("appid") String appid
    );

    @GET("forecast?")
    Call<List<WeatherForecast>> getForecast(
            @Query("id") int cityID,
            @Query("units") String units,
            @Query("lang") String lang,
            @Query("appid") String appid
    );

    @GET("forecast?")
    Call<List<WeatherForecast>> getForecast(
            @Query("lon") double longitude,
            @Query("lat") double latitude,
            @Query("units") String units,
            @Query("lang") String lang,
            @Query("appid") String appid
    );
}