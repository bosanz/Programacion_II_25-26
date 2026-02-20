package es.deusto.ingenieria.progii.pong.controller;

import es.deusto.ingenieria.progii.pong.model.PlayerSide;
import es.deusto.ingenieria.progii.pong.model.PongModel;

public class PongController {
    private final PongModel model;

    // Parámetros de control (podrían ir a config)
    private final double paddleSpeed = 300;

    public PongController(PongModel model) {
        this.model = model;
    }

    public void startGame() { model.start(); }
    public void pauseGame() { model.pause(); }
    public void resetGame() { model.reset(); }

    public void commandPaddle(PlayerSide side, PaddleCommand cmd) {
        switch (cmd) {
            case MOVE_UP -> model.setPaddleSpeed(side, -paddleSpeed);
            case MOVE_DOWN -> model.setPaddleSpeed(side, paddleSpeed);
            case STOP -> model.setPaddleSpeed(side, 0);
        }
    }

    // Avanzar el “mundo” (el main loop llamaría a esto con dt)
    public void tick(double dt) {
        model.update(dt);
    }
}

