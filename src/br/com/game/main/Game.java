package src.br.com.game.main;
import src.br.com.game.model.Character;
import src.br.com.game.model.combat.MagicAttack;
import src.br.com.game.model.combat.PhysicAttack;
import src.br.com.game.model.weapon.Weapon;
import src.br.com.game.model.weapon.WeaponType;

public class Game {
    public static void main(String[] args) {
        System.err.println("Testing Character class...\n");

        // Try to create weapons
        // If an error occur a log will appear
        try {
            Weapon excalibur = Weapon.createWeapon("Excalibur", 27, WeaponType.SWORD, "This sword was given to the chosen one by La Dame du Lac Viviane", new PhysicAttack());
            Weapon DarkStaff = Weapon.createWeapon("Darkness Staff", 20, WeaponType.STAFF, null, new MagicAttack());
        } catch (IllegalArgumentException e) {
            System.out.println("Error trying to create a weapon: " + e.getMessage());
        }

        // Try to create character
        try {
            Character hero = Character.createCharacter("Arthur Pendragon", 100, 50, 15, 12, excalibur);
            System.out.println(hero.getWeapon().getName() + " description: " + hero.getWeapon().getDescription() + "\n");
            Character villain = Character.createCharacter("Morgana", 120, 80, 10, 23, DarkStaff);
        } catch (IllegalArgumentException e) {
            System.out.println("Error trying to create a character: " + e.getMessage());
        }


        hero.performAttack(villain);
        System.out.println(" ");
        villain.performAttack(hero);
        System.out.println(" ");
        hero.performAttack(villain);
        System.out.println(" ");
        villain.performAttack(hero);

        System.out.println("\n--- Final Status ---");
        System.out.println(hero.getName() + ": health=" + hero.getHealth() + ", Mana = " + hero.getMana());
        System.out.println(villain.getName() + ": health:" + villain.getHealth() + ", Mana = " + villain.getMana());
        System.err.println("Testing completed.");
    }
}