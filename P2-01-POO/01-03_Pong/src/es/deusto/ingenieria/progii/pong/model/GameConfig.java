package es.deusto.ingenieria.progii.pong.model;

public final class GameConfig {
    public final double fieldWidth;
    public final double fieldHeight;

    public final double paddleHeight;
    public final double paddleMaxY;   // límite superior para y (según convención)
    public final double paddleMinY;

    public final double ballRadius;

    public final int pointsToWin;

    public GameConfig(double fieldWidth, double fieldHeight,
                      double paddleHeight, double paddleMinY, double paddleMaxY,
                      double ballRadius, int pointsToWin) {
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;
        this.paddleHeight = paddleHeight;
        this.paddleMinY = paddleMinY;
        this.paddleMaxY = paddleMaxY;
        this.ballRadius = ballRadius;
        this.pointsToWin = pointsToWin;
    }

    public static GameConfig defaults() {
        return new GameConfig(
                800, 500,
                90, 0, 500,   // minY/maxY: simplificado, el alumno puede ajustar
                10,
                7
        );
    }
}

