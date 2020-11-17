package unit;

import org.junit.Test;
import static org.junit.Assert.*;

import com.sample.ClimbingLeaderBoard;


public class ClimbingLeaderBoardTest {
    @Test
    public void basicCase1() {
        int[] solution = ClimbingLeaderBoard.climbingLeaderboard(new int[]{100, 100, 50, 40, 40, 20, 10},
                new int[]{5, 25, 50, 120});
        assertArrayEquals(solution, new int[]{6, 4, 2, 1});
    }

    @Test
    public void basicCase2() {
        int[] solution = ClimbingLeaderBoard.climbingLeaderboard(new int[]{100, 90, 90, 80, 75, 60},
                new int[]{50, 65, 77, 90, 102});
        assertArrayEquals(solution, new int[]{6, 5, 4, 2, 1});
    }
}