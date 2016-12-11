package ch.superlogical.spigot.plugins.template.util.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherStationGson {

    @SerializedName("station")
    @Expose
    private Station_ station;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("dateTime")
    @Expose
    private String dateTime;
    @SerializedName("temperature")
    @Expose
    private String temperature;
    @SerializedName("sunshine")
    @Expose
    private String sunshine;
    @SerializedName("precipitation")
    @Expose
    private String precipitation;
    @SerializedName("windDirection")
    @Expose
    private String windDirection;
    @SerializedName("windSpeed")
    @Expose
    private String windSpeed;
    @SerializedName("qnhPressure")
    @Expose
    private String qnhPressure;
    @SerializedName("gustPeak")
    @Expose
    private String gustPeak;
    @SerializedName("humidity")
    @Expose
    private String humidity;
    @SerializedName("qfePressure")
    @Expose
    private String qfePressure;
    @SerializedName("qffPressure")
    @Expose
    private String qffPressure;

    /**
     * @return The station
     */
    public Station_ getStation() {
        return station;
    }

    /**
     * @param station The station
     */
    public void setStation(Station_ station) {
        this.station = station;
    }

    /**
     * @return The code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return The dateTime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime The dateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @return The temperature
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * @param temperature The temperature
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /**
     * @return The sunshine
     */
    public String getSunshine() {
        return sunshine;
    }

    /**
     * @param sunshine The sunshine
     */
    public void setSunshine(String sunshine) {
        this.sunshine = sunshine;
    }

    /**
     * @return The precipitation
     */
    public String getPrecipitation() {
        return precipitation;
    }

    /**
     * @param precipitation The precipitation
     */
    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    /**
     * @return The windDirection
     */
    public String getWindDirection() {
        return windDirection;
    }

    /**
     * @param windDirection The windDirection
     */
    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    /**
     * @return The windSpeed
     */
    public String getWindSpeed() {
        return windSpeed;
    }

    /**
     * @param windSpeed The windSpeed
     */
    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     * @return The qnhPressure
     */
    public String getQnhPressure() {
        return qnhPressure;
    }

    /**
     * @param qnhPressure The qnhPressure
     */
    public void setQnhPressure(String qnhPressure) {
        this.qnhPressure = qnhPressure;
    }

    /**
     * @return The gustPeak
     */
    public String getGustPeak() {
        return gustPeak;
    }

    /**
     * @param gustPeak The gustPeak
     */
    public void setGustPeak(String gustPeak) {
        this.gustPeak = gustPeak;
    }

    /**
     * @return The humidity
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     * @param humidity The humidity
     */
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    /**
     * @return The qfePressure
     */
    public String getQfePressure() {
        return qfePressure;
    }

    /**
     * @param qfePressure The qfePressure
     */
    public void setQfePressure(String qfePressure) {
        this.qfePressure = qfePressure;
    }

    /**
     * @return The qffPressure
     */
    public String getQffPressure() {
        return qffPressure;
    }

    /**
     * @param qffPressure The qffPressure
     */
    public void setQffPressure(String qffPressure) {
        this.qffPressure = qffPressure;
    }


    public class Station_ {

        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("ch1903Y")
        @Expose
        private Integer ch1903Y;
        @SerializedName("ch1903X")
        @Expose
        private Integer ch1903X;
        @SerializedName("lat")
        @Expose
        private Double lat;
        @SerializedName("lng")
        @Expose
        private Double lng;
        @SerializedName("elevation")
        @Expose
        private Integer elevation;

        /**
         * @return The code
         */
        public String getCode() {
            return code;
        }

        /**
         * @param code The code
         */
        public void setCode(String code) {
            this.code = code;
        }

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The ch1903Y
         */
        public Integer getCh1903Y() {
            return ch1903Y;
        }

        /**
         * @param ch1903Y The ch1903Y
         */
        public void setCh1903Y(Integer ch1903Y) {
            this.ch1903Y = ch1903Y;
        }

        /**
         * @return The ch1903X
         */
        public Integer getCh1903X() {
            return ch1903X;
        }

        /**
         * @param ch1903X The ch1903X
         */
        public void setCh1903X(Integer ch1903X) {
            this.ch1903X = ch1903X;
        }

        /**
         * @return The lat
         */
        public Double getLat() {
            return lat;
        }

        /**
         * @param lat The lat
         */
        public void setLat(Double lat) {
            this.lat = lat;
        }

        /**
         * @return The lng
         */
        public Double getLng() {
            return lng;
        }

        /**
         * @param lng The lng
         */
        public void setLng(Double lng) {
            this.lng = lng;
        }

        /**
         * @return The elevation
         */
        public Integer getElevation() {
            return elevation;
        }

        /**
         * @param elevation The elevation
         */
        public void setElevation(Integer elevation) {
            this.elevation = elevation;
        }
    }
}
