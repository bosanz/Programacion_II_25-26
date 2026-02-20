package es.deusto.ingenieria.progii.pong.model;

public class Ball {
    private final Vector2 position;
    private final Vector2 velocity;
    private final double radius;

    public Ball(double x, double y, double vx, double vy, double radius) {
        this.position = new Vector2(x, y);
        this.velocity = new Vector2(vx, vy);
        this.radius = radius;
    }

    public Vector2 getPosition() { return position; }
    public Vector2 getVelocity() { return velocity; }
    public double getRadius() { return radius; }

    public void update(double dt) {
        position.x += velocity.x * dt;
        position.y += velocity.y * dt;
    }
}
