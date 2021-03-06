package com.pokemon.game;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.resources.Resources;

public class Main {
    public static void main(String[] args) {
        Game.setInfo("gameinfo.xml");
        Game.init(args);
        Resources.load("game.litidata");
        Game.addGameListener(new Listener());
        Game.screens().add(new TestScreen());
//        Game.screens().display("TEST");
        Game.start();
    }
}
