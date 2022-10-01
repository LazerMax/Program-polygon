package com.company;

import static java.lang.Math.sqrt;

public class Triangle extends Polygon {

    public Triangle(int[] sids) {
        super(sids);
    }

    private double getInRadius() {
        double a = sids[0];
        return sqrt((-a + sids[1] + sids[2]) * (a - sids[1] + sids[2]) * (a + sids[1] - sids[2]) / (4 * (sids[0] + sids[1] + sids[2]))) * 1.0;

    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Triangle contains: ").append(getSidsCount()).append(" sides")
                .append(System.lineSeparator())
                .append("Its perimeter is ").append(String.format("%.2f", getPerimeter()))
                .append(System.lineSeparator())
                .append("Its radius of incircle is ").append(String.format("%.2f", this.getInRadius()))
                .append(System.lineSeparator());

        return sb.toString();

    }

}
