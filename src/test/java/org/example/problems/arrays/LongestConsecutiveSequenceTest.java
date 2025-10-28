package org.example.problems.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestConsecutiveSequenceTest {

    @Test
    public void longestConsecutiveSequenceOne() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int result = longestConsecutiveSequence.longestConsecutive(new int[]{2,20,4,10,3,4,5});
        assertEquals(4, result);
    }

    @Test
    public void longestConsecutiveSequenceTwo() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int result = longestConsecutiveSequence.longestConsecutive(new int[]{0,3,2,5,4,6,1,1});
        assertEquals(7, result);
    }
}