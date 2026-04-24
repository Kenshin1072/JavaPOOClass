package src.br.com.game.model;
import src.br.com.game.model.weapon.Weapon;
import src.br.com.game.model.combat.Attack;

public class Character {
    private String name;
    private int health;
    private int mana; 
    private int power;
    private int intelligence;

    private Weapon weapon;

    public Character(String name, int health, int mana, int power, int intelligence, Weapon weapon) {
        this.setName(name);
        this.setHealth(health);
        this.setMana(mana);
        this.setPower(power);
        this.setIntelligence(intelligence);
        this.equipWeapon(weapon);
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

    public void performAttack(Attack attack, Character target) {
        if (attack != null) {
            attack.execute(this, target);
        } else {
            System.out.println(this + " has no target to attack");
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

    public int getCharacterPower() { return power; }

    public int getTotalPower() { return power + (weapon != null ? weapon.getPower(): 0); }

    private void setPower(int power) {
        if (power >= 0) {
            this.power = power; // Ensure power doesn't go below 0
        } else {
            this.power = 0; // Default to 0 if invalid power is provided
            System.out.println("Invalid power! Setting to 0.");
        }
    }

    public int getCharacterIntelligence() { return intelligence; }

    public int getTotalIntelligence() {
        return intelligence + (weapon != null ? weapon.getPower(): 0);
    }

    private void setIntelligence(int intelligence) {
        if (intelligence >= 0) {
            this.intelligence = intelligence;
        } else {
            this.intelligence = 0;
            System.out.println("Invalid intelligence! Setting to 0.");
        }
    }

    public Weapon getWeapon() { return weapon; }

    public void equipWeapon( Weapon weapon ) {
        this.weapon = weapon;
    }
}