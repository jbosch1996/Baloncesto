package com.bosch.controller.DTO;

/**
 * Created by 53298857Z on 01/12/2016.
 */
public class PositionStadistics {


    private int minPoints;
    private int maxPoints;
    private Double avgPoints;
    private String position;

    public int getMinPoints() {
        return minPoints;
    }

    public void setMinPoints(int minPoints) {
        this.minPoints = minPoints;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public Double getAvgPoints() {
        return avgPoints;
    }

    public void setAvgPoints(Double avgPoints) {
        this.avgPoints = avgPoints;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
