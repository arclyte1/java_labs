package com.company.Lab_6_1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayDeque<Integer> firstPlayer = new ArrayDeque<>();
        ArrayDeque<Integer> secondPlayer = new ArrayDeque<>();
        for(int i = 0; i < 5; i++)
            firstPlayer.add(in.nextInt());
        for(int i = 0; i < 5; i++)
            secondPlayer.add(in.nextInt());

        int turnCounter = 0;
        while (turnCounter < 106) {
            int first, second;
            try {
                first = firstPlayer.poll();
            } catch (NullPointerException e) {
                System.out.print("second " + turnCounter);
                return;
            }
            try {
                second = secondPlayer.poll();
            } catch (NullPointerException e) {
                System.out.print("first " + turnCounter);
                return;
            }
            if (first == 0 || first > second && second != 0) {
                firstPlayer.add(first);
                firstPlayer.add(second);
            } else {
                secondPlayer.add(first);
                secondPlayer.add(second);
            }
            turnCounter++;
        }
        System.out.println("botva");
    }

}
