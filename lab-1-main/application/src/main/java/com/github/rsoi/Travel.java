package com.github.rsoi;

import java.util.Date;

public class Travel {
    public Double travel_cost;
    public Date travel_date;

    public Travel(Double travel_cost, Date travel_date) {
        this.travel_cost = travel_cost;
        this.travel_date = travel_date;
    }

    public Double getTravel_cost() {
        return travel_cost;
    }

    public Date getTravel_date() {
        return travel_date;
    }

    public void setTravel_cost(Double travel_cost) {
        this.travel_cost = travel_cost;
    }

    public void setTravel_date(Date travel_date) {
        this.travel_date = travel_date;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "travel_cost=" + travel_cost +
                ", travel_date=" + travel_date +
                '}';
    }
}

