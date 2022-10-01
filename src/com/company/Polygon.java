package com.company;

import java.util.Arrays;

public class Polygon {

    protected int[] sids;

    public Polygon(int[] sids) {
        this.sids = sids;
        this.setSidsCount();
        this.setSide();
    }


    protected int getSidsCount() {
        return sids.length;
    }

    protected double getPerimeter() {
        return Arrays.stream(sids).sum() * 1.0;
    }

    private void setSidsCount() {
        if (getSidsCount() != 1 && getSidsCount() < 3)
            throw new IllegalArgumentException("Invalid value to sides number");
        sids = sids;
    }

    private void setSide() {
        for (int i = 0; i < this.sids.length; ++i) {
            if (sids[i] <= 0)
                throw new IllegalArgumentException("Negative value to side length " + sids[i]);
        }
        for (int i = 0; i < sids.length; ++i) {
            if (sids[i] > getPerimeter() - sids[i])
                throw new IllegalArgumentException("Wrong  value to side length " + sids[i]);
        }
        sids = sids;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Polygon contains ").append(getSidsCount()).append(" sides")
                .append(System.lineSeparator())
                .append("Its perimeter is ").append(String.format("%.2f", getPerimeter()))
                .append(System.lineSeparator());

        return sb.toString();

    }
}
