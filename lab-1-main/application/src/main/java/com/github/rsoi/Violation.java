package com.github.rsoi;

import java.util.Date;

public class Violation {
    public String violation_description;
    public Date violation_date;


    public String getViolation_description() {
        return violation_description;
    }

    public Date getViolation_date() {
        return violation_date;
    }

    public Violation(String violation_description, Date violation_date) {
        this.violation_description = violation_description;
        this.violation_date = violation_date;
    }

    @Override
    public String toString() {
        return "Violation{" +
                "violation_description='" + violation_description + '\'' +
                ", violation_date=" + violation_date +
                '}';
    }
}
