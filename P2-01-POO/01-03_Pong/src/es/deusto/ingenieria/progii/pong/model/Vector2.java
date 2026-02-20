package es.deusto.ingenieria.progii.pong.model;

public final class Vector2 {
    public double x;
    public double y;

    public Vector2(double x, double y) {
        this.x = x; this.y = y;
    }

    public Vector2 copy() {
        return new Vector2(x, y);
    }
}
