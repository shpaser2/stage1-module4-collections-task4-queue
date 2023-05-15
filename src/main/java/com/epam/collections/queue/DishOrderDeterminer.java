package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> orderOfEating = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < everyDishNumberToEat - 1; i++) {
                queue.add(queue.poll());
            }
            orderOfEating.add(queue.poll());
        }

        return orderOfEating;
    }
}
