package es.deusto.ingenieria.progii.pong.model;

public class Paddle {
    private final PlayerSide side;
    private double y;               // posición vertical (centro o esquina, a elección)
    private final double height;    // alto de la pala
    private double speed;           // velocidad vertical (unidades/seg)

    public Paddle(PlayerSide side, double y, double height) {
        this.side = side;
        this.y = y;
        this.height = height;
        this.speed = 0;
    }

    public PlayerSide getSide() { return side; }
    public double getY() { return y; }
    public double getHeight() { return height; }
    public double getSpeed() { return speed; }

    public void setSpeed(double speed) { this.speed = speed; }

    public void update(double dt, double minY, double maxY) {
        y += speed * dt;
        // Clamp básico
        if (y < minY) y = minY;
        if (y > maxY) y = maxY;
    }
}
