package es.deusto.ingenieria.progii.pong.model;

import java.util.ArrayList;
import java.util.List;

public class PongModel {
    private final GameConfig cfg;

    private GameState state = GameState.READY;

    private final Paddle leftPaddle;
    private final Paddle rightPaddle;
    private final Ball ball;
    private final Score score;

   public PongModel(GameConfig cfg) {
        this.cfg = cfg;

        this.leftPaddle = new Paddle(PlayerSide.LEFT, cfg.fieldHeight / 2, cfg.paddleHeight);
        this.rightPaddle = new Paddle(PlayerSide.RIGHT, cfg.fieldHeight / 2, cfg.paddleHeight);

        this.ball = new Ball(cfg.fieldWidth / 2, cfg.fieldHeight / 2, 200, 80, cfg.ballRadius);
        this.score = new Score();
    }

    // Lecturas (la Vista consulta el estado)
    public GameConfig getConfig() { return cfg; }
    public GameState getState() { return state; }
    public Paddle getLeftPaddle() { return leftPaddle; }
    public Paddle getRightPaddle() { return rightPaddle; }
    public Ball getBall() { return ball; }
    public Score getScore() { return score; }


    // Comandos de alto nivel (invocados por el Controller)
    public void start() {
        if (state == GameState.READY || state == GameState.PAUSED) {
            state = GameState.RUNNING;
        }
    }

    public void pause() {
        if (state == GameState.RUNNING) {
            state = GameState.PAUSED;
           
        }
    }

    public void reset() {
        state = GameState.READY;
        // Reinicio mínimo del estado (puedes ampliar)
        ball.getPosition().x = cfg.fieldWidth / 2;
        ball.getPosition().y = cfg.fieldHeight / 2;
        ball.getVelocity().x = 200;
        ball.getVelocity().y = 80;
        leftPaddle.setSpeed(0);
        rightPaddle.setSpeed(0);
       
    }

    public void setPaddleSpeed(PlayerSide side, double speed) {
        if (side == PlayerSide.LEFT) leftPaddle.setSpeed(speed);
        else rightPaddle.setSpeed(speed);
    }

    // “Tick” de simulación (sin gráficos)
    public void update(double dt) {
        if (state != GameState.RUNNING) return;

        leftPaddle.update(dt, cfg.paddleMinY, cfg.paddleMaxY);
        rightPaddle.update(dt, cfg.paddleMinY, cfg.paddleMaxY);
        ball.update(dt);

        // Reglas mínimas (esqueleto): rebote en top/bottom
        if (ball.getPosition().y - ball.getRadius() <= 0 || ball.getPosition().y + ball.getRadius() >= cfg.fieldHeight) {
            ball.getVelocity().y *= -1;
        }

        // Punto si sale por laterales (simplificado)
        if (ball.getPosition().x + ball.getRadius() < 0) {
            score.point(PlayerSide.RIGHT);
            checkGameOver();
            resetRally();
        } else if (ball.getPosition().x - ball.getRadius() > cfg.fieldWidth) {
            score.point(PlayerSide.LEFT);
            checkGameOver();
            resetRally();
        }

    }

    private void resetRally() {
        ball.getPosition().x = cfg.fieldWidth / 2;
        ball.getPosition().y = cfg.fieldHeight / 2;
        // TODO: randomizar dirección/velocidad
        ball.getVelocity().x = -ball.getVelocity().x;
    }

    private void checkGameOver() {
        if (score.getLeft() >= cfg.pointsToWin || score.getRight() >= cfg.pointsToWin) {
            state = GameState.GAME_OVER;
        }
    }
}

