package br.com.game.model;

public interface Attack {
    public void execute(Character origin, Character target, Weapon weapon);
}