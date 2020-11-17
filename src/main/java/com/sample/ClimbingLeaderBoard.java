package com.sample;

import java.util.*;

public class ClimbingLeaderBoard {
    public static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] alicePositions = new int[alice.length];

        TreeSet<Integer> positionScores = Arrays.stream(scores).boxed().collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        int position = positionScores.size() + 1;
        Integer playerScore = positionScores.pollFirst();
        if(playerScore == null) {
            position = 1;
        }
        for (int i = 0; i < alice.length; i++) {
            int aliceScore = alice[i];

            while(playerScore != null && aliceScore >= playerScore) {
                position --;
                playerScore = positionScores.pollFirst();
                if(playerScore == null) {
                    position = 1;
                }
            }

            alicePositions[i] = position;
        }

        return alicePositions;
    }
}