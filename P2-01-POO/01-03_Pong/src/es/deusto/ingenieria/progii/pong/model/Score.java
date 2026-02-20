package es.deusto.ingenieria.progii.pong.model;

public class Score {
    private int left;
    private int right;

    public int getLeft() { return left; }
    public int getRight() { return right; }

    public void point(PlayerSide side) {
        if (side == PlayerSide.LEFT) left++;
        else right++;
    }
}
