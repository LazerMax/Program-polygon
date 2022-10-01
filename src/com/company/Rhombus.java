package com.company;

public class Rhombus extends Parallelogram {
    public Rhombus(int[] sids) {
        super(sids);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Quadrilateral contains: ").append(getSidsCount()).append(" equal sides")
                .append(System.lineSeparator())
                .append("Its perimeter is ").append(String.format("%.2f", getPerimeter()))
                .append(System.lineSeparator());

        return sb.toString();

    }
}
