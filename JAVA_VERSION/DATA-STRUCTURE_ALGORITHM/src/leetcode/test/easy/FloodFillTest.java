package leetcode.test.easy;

import leetcode.easy.FloodFill;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
https://leetcode.com/problems/flood-fill/
733. Flood Fill
An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].
To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.
Return the modified image after performing the flood fill
 */
public class FloodFillTest {
    final private FloodFill floodFill;
    FloodFillTest() {
        floodFill = new FloodFill();
    }
    @Test
    void floodFillWithNewColor() {
        //Input: image =
        // [[1,1,1],
        //  [1,1,0],
        //  [1,0,1]],
        // sr = 1, sc = 1, color = 2
        //Output:
        // [[2,2,2],
        //  [2,2,0],
        //  [2,0,1]]

        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        int[][] expectedOutput = {{2,2,2},{2,2,0},{2,0,1}};
        assertTrue(Arrays.deepEquals(expectedOutput, floodFill.floodFill(image, sr, sc, color)));
    }
    @Test
    void floodFillWithAlreadyColored() {
        //Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
        //Output: [[0,0,0],[0,0,0]]
        //Explanation: The starting pixel is already colored 0, so no changes are made to the image.

        int[][] image = {{0,0,0},{0,0,0}};
        int sr = 0;
        int sc = 0;
        int color = 0;
        int[][] expectedOutput = {{0,0,0},{0,0,0}};
        assertTrue(Arrays.deepEquals(expectedOutput, floodFill.floodFill(image, sr, sc, color)));
    }


}
