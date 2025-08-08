package com.dto;


public class SafetyScoreResponse {
    private double latitude;
    private double longitude;
    private int score;
    private String description;

    public SafetyScoreResponse(double latitude, double longitude, int score, String description) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.score = score;
        this.description = description;
    }

    // Getters and Setters
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
```java