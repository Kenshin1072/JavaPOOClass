package src.br.com.game.model.combat;
import src.br.com.game.model.Character;
import src.br.com.game.model.weapon.WeaponType;


public class PhysicAttack implements Attack {

    @Override
    public void execute(Character origin, Character target) {

        int damage;
        if (origin.getWeapon().getType() == WeaponType.SWORD || origin.getWeapon().getType() == WeaponType.BOW) {
            damage = origin.getTotalPower();
        } else {
            damage = origin.getCharacterPower();
        }
        System.out.println(origin.getName() + " attacks " + target.getName() + " with " + origin.getWeapon().getName() + ".");
        target.takeDamage(damage);
    }
}