package demo.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//This model maps the JSOPN structure returned by the API
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    
    @JsonProperty("main")
    private Main main;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public static class Main{
        @JsonProperty("temp")
        private Double temp;

        public Double getTemp() {
            return temp;
        }

        public void setTemp(Double temp) {
            this.temp = temp;
        }


    }
}
