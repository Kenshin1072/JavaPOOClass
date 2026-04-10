package br.com.game.model;

class PhysicAttack implements Attack {

    @override
    public void execute(Character origin, Character target) {
        
        int damage = origin.getPower() * origin.weapon.getPower()

        System.out.println(origin.getName() + " attacked " + target.getName());
        target.takeDamage(damage);
        println(target.getName() + "received" + damage + "damage");
    }
}