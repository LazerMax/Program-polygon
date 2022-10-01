package com.company;

public class Parallelogram extends Quadrilateral {

    public Parallelogram(int[] sids) {
        super(sids);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Parallelogram contains two pairs of parallel sides")
                .append(System.lineSeparator())
                .append("Its perimeter is ").append(String.format("%.2f", getPerimeter()))
                .append(System.lineSeparator());

        return sb.toString();

    }
}
