package br.com.game.model;

class MagicAttack implements Attack {

    @override
    public void execute(Character origin, Character target) {
        
        int damage = origin.getInteligence() * origin.weapon.getPower()

        System.out.println(origin.getName() + " attacked " + target.getName());
        target.takeDamage(damage);
        println(target.getName() + "received" + damage + "damage");
    }
}