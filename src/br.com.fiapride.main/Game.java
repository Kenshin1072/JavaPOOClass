package br.com.fiapride.main;
import br.com.fiapride.model.Character;

public class Game {
    public static void main(String[] args) {
        System.err.println("Testing Character class...");

        Character hero = new Character("Hero", 100, 50, 10);
        Character villain = new Character("Villain", 120, 60, 15);

        hero.attack(villain);
        villain.especialAttack(hero);

        System.out.println("--- Final Status ---");
        System.out.println("Hero: Health = " + hero.getHealth() + ", Mana = " + hero.getMana());
        System.out.println("Villain: Health = " + villain.getHealth() + ", Mana = " + villain.getMana());
        System.err.println("Testing completed.");
    }
}