package src.br.com.game.main;
import src.br.com.game.model.Character;
import src.br.com.game.model.combat.Attack;
import src.br.com.game.model.combat.MagicAttack;
import src.br.com.game.model.combat.PhysicAttack;
import src.br.com.game.model.weapon.Weapon;
import src.br.com.game.model.weapon.WeaponType;

public class Game {
    public static void main(String[] args) {
        Attack PhysicAttack = new PhysicAttack();
        Attack MagicAttack = new MagicAttack();

        System.err.println("Testing Character class...\n");

        Weapon excalibur = new Weapon("Excalibur", 27, null, "This sword was given to the chosen one by La Dame du Lac Viviane");
        Weapon DarkStaff = new Weapon("Darkness Staff", 20, WeaponType.STAFF, null);
        Character hero = new Character("Arthur Pendragon", 100, 50, 15, 12, excalibur);
        System.out.println(hero.getWeapon().getName() + " description: " + hero.getWeapon().getDescription() + "\n");
        Character villain = new Character("Morgana", 120, 80, 10, 23, DarkStaff);

        hero.performAttack(PhysicAttack, villain);
        System.out.println(" ");
        villain.performAttack(MagicAttack, hero);
        System.out.println(" ");
        hero.performAttack(MagicAttack, villain);
        System.out.println(" ");
        villain.performAttack(PhysicAttack, hero);

        System.out.println("\n--- Final Status ---");
        System.out.println(hero.getName() + ": health=" + hero.getHealth() + ", Mana = " + hero.getMana());
        System.out.println(villain.getName() + ": health:" + villain.getHealth() + ", Mana = " + villain.getMana());
        System.err.println("Testing completed.");
    }
}