package com.example.fragmentweather;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherForecastResponse {
    @SerializedName("city")
    private City city;

    @SerializedName("list")
    private List<Forecast> list;

    public City getCity() {
        return city;
    }

    public List<Forecast> getList() {
        return list;
    }

//    TODO What is the reason of creating this class static?
    public static class City {
        @SerializedName("name")
        private String name;

        public String getName() {
            return name;
        }
    }

    //    TODO What is the reason of creating this class static?
    public static class Forecast {
        @SerializedName("dt_txt")
        private String dateTime;

        @SerializedName("main")
        private Main main;

        @SerializedName("weather")
        private List<Weather> weather;

        public String getDateTime() {
            return dateTime;
        }

        public Main getMain() {
            return main;
        }

        public List<Weather> getWeather() {
            return weather;
        }
    }

    //    TODO What is the reason of creating this class static?
    public static class Main {
        @SerializedName("temp")
        private float temp;

        public float getTemp() {
            return temp;
        }
    }

    //    TODO What is the reason of creating this class static?
    public static class Weather {
        ////TODO what do you understand by @SerializedName
        @SerializedName("main")
        private String main;

        @SerializedName("description")
        private String description;

        public String getMain() {
            return main;
        }

        public String getDescription() {
            return description;
        }
    }
}
