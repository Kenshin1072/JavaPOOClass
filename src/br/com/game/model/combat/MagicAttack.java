package src.br.com.game.model.combat;
import src.br.com.game.model.Character;
import src.br.com.game.model.weapon.WeaponType;

public class MagicAttack implements Attack {
    @Override
    public void execute(Character origin, Character target) {
        int damage;
        
        damage = origin.getTotalIntelligence();

        System.out.println(origin.getName() + " attacks " + target.getName() + " with " + origin.getWeapon().getName() + ".");
        target.takeDamage(damage);
    }
}