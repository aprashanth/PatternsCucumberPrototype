package com.java.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by PXV8340 on 10/14/2015.
 */
public class TestStreams {

    public static void main(String args[]) {
        final Collection<Task> tasks = Arrays.asList(new Task(Status.OPEN, 5), new Task(Status.CLOSED, 13),
                new Task(Status.OPEN, 10), new Task(Status.CLOSED, 15), new Task(Status.CLOSED, 50));

        long totalPoints = tasks.parallelStream().filter(task -> task.getStatus() == Status.OPEN).mapToInt(Task::getPoints).sum();
        System.out.println("Total Point for Open tasks is " + totalPoints);


        //Parallel stream
        totalPoints = tasks.stream().parallel().map(Task::getPoints).reduce(0, Integer::sum);
        System.out.println("Total Points is " + totalPoints);

        //grouping
        Map<Status, List<Task>> map = tasks.stream().collect(Collectors.groupingBy(Task::getStatus));

        System.out.println(map);


    }
}
