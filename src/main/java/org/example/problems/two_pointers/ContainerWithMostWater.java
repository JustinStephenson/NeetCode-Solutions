package org.example.problems.two_pointers;

/*
    You are given an integer array 'heights' where 'heights[i]' represents the height of the ith bar.

    You may choose any two bars to form a container. Return the maximum amount of water a container can store.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int leftPointer = 0;
        int rightPointer = heights.length - 1;
        int maxArea = 0;

        while (leftPointer < rightPointer) {
            int newMaxArea = (rightPointer - leftPointer) * Math.min(heights[leftPointer], heights[rightPointer]);
            maxArea = Math.max(maxArea, newMaxArea);

            if (heights[leftPointer] < heights[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maxArea;
    }
}
