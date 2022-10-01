package com.company;

public class Quadrilateral extends Polygon {
    public Quadrilateral(int[] sids) {
        super(sids);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Quadrilateral contains: ").append(getSidsCount()).append(" sides")
                .append(System.lineSeparator())
                .append("Its perimeter is ").append(String.format("%.2f", getPerimeter()))
                .append(System.lineSeparator());

        return sb.toString();

    }
}
