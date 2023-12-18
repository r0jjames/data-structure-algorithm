package leetcode.easy;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if(color == newColor) return image;
        floodFill(image, sr, sc, color, newColor);
        return image;

    }
    public void floodFill(int[][] image, int sr, int sc, int color, int newColor) {
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image.length || image[sr][sc] != color) return;
        image[sr][sc] = newColor;
        floodFill(image, sr-1, sc, color, newColor);
        floodFill(image, sr+1, sc, color, newColor);
        floodFill(image, sr, sc-1, color, newColor);
        floodFill(image, sr, sc+1, color, newColor);

    }
}
