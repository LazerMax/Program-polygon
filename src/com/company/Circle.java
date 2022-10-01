package com.company;

public class Circle extends Polygon {
    public Circle(int[] sids) {
        super(sids);
    }

    protected double getPerimeter() {
        return 2 * sids[0] * Math.PI;
    }

    private double getArea() {
        return Math.PI * sids[0] * sids[0];
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Circle radius is ").append(sids[0])
                .append(System.lineSeparator())
                .append("Its perimeter is ").append(String.format("%.2f", getPerimeter()))
                .append(System.lineSeparator())
                .append("Its area is ").append(String.format("%.2f", this.getArea()))
                .append(System.lineSeparator());
        return sb.toString();

    }
}
