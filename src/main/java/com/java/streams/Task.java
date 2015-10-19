package com.java.streams;

/**
 * Created by PXV8340 on 10/14/2015.
 */
public class Task {
    private final Status status;
    private final Integer points;

    Task(Status status, Integer points) {
        this.status = status;
        this.points = points;
    }

    public Status getStatus() {
        return status;
    }

    public Integer getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d]", status, points);
    }
}
