package br.com.fiapride.model;

public class Character {
    private String name;
    private int health;
    private int mana; 
    private int power;

    public Character(String name, int health, int mana, int power) {
        this.setName(name);
        this.setHealth(health);
        this.setMana(mana);
        this.setPower(power);
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            this.health -= damage;

            if (this.health <= 0){ 
                this.health = 0;
                System.out.println(this.name + " died.");
            }
            
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
        } else { 
            System.out.println(this.name + " doesn't have enough mana!");
            target.takeDamage(this.power);
        }
    }

    // Getters for the main
    public String getName() { return name; }

    private void setName(String name) { 
        if (name != null && !name.trim().isEmpty()) {
        this.name = name; 
        } else {
            this.name = "Unknown"; // Default name if invalid name is provided
            System.out.println("Invalid name!");
        }
    }

    public int getHealth() { return health; }

    private void setHealth(int health) { 
        if (health > 0) {
            this.health = health; // Ensure health doesn't go below 0
        } else {
            this.health = 0; // Default to 0 if invalid health is provided
            System.out.println("Invalid health! Setting to 0.");
        }
    }
    public int getMana() { return mana; }

    private void setMana(int mana) { 
        if (mana >= 0) {
            this.mana = mana; // Ensure mana doesn't go below 0
        } else {
            this.mana = 0; // Default to 0 if invalid mana is provided
            System.out.println("Invalid mana! Setting to 0.");
        }

    }

    public int getPower() { return power; }

    private void setPower(int power) { 
        if (power >= 0) {
            this.power = power; // Ensure power doesn't go below 0
        } else {
            this.power = 0; // Default to 0 if invalid power is provided
            System.out.println("Invalid power! Setting to 0.");
        }
    }
}