public class Character {
    public String name;
    private int health = 100;
    private int mana = 50; // Added missing semicolon
    private int power = 10;

    public Character(String name){
        this.name = name;
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            this.health -= damage;

            if (this.health <= 0){ // Changed to <= to be more precise
                this.health = 0;
                System.out.println(this.name + " died.");
            }
            // Added spaces inside the string for better readability
            System.out.println(this.name + " received " + damage + " damage. Health: " + this.health);
        } else {
            System.out.println("Invalid damage!");
        }
    }

    // Normal attack 
    public void attack(Character target) {
        System.out.println(this.name + " attacked " + target.getName());
        target.takeDamage(this.power);
    }

    // Attack using mana for more damage
    public void especialAttack(Character target) {
        int manaCost = 20;
        int especialDamage = this.power * 3;

        if (this.mana >= manaCost) {
            this.mana -= manaCost;
            System.out.println(this.name + " attacked " + target.getName() + " with magic!");
            target.takeDamage(especialDamage);
        } else { // Fixed: changed brackets [] to braces {}
            System.out.println(this.name + " doesn't have enough mana!");
            target.takeDamage(this.power);
        }
    }

    // Getters for the main
    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMana() { return mana; }
}