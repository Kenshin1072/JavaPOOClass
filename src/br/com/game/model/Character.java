package src.br.com.game.model;
import src.br.com.game.model.weapon.Weapon;
import src.br.com.game.model.combat.Attack;

public class Character {
    private String name;
    private int health;
    private int mana; 
    private int strenght;
    private int intelligence;

    private Weapon weapon;

    private Character(String name, int health, int mana, int strenght, int intelligence, Weapon weapon) {
        this.setName(name);
        this.setHealth(health);
        this.setMana(mana);
        this.setStrenght(strenght);
        this.setIntelligence(intelligence);
        this.equipWeapon(weapon);
    }

    public static Character createCharacter(String name, int initialHealth, int initialMana, int initialStrenght, int initialIntelligence, Weapon weapon) {
        if (name == null || !name.trim().isEmpty()) {
            throw new IllegalArgumentException("The character's name is invalid!");
        }

        if (initialHealth <= 0) {
            throw new IllegalArgumentException("The character's health can't be 0!");
        }

        if (initialMana <= 0) {
            throw new IllegalArgumentException("The character's mana can't be 0!");
        }

        if (initialStrenght <= 0) {
            throw new IllegalArgumentException("The character's strenght can't be 0!");
        }

        if (initialIntelligence <= 0) {
            throw new IllegalArgumentException("The character's intelligence can't be 0!");
        }

        return new Character(name, initialHealth, initialMana, initialStrenght, initialIntelligence, weapon);
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

    public void performAttack(Character target) {
        this.weapon.getAttack().execute(this, target);
    }

    // Name functions
    public String getName() { return name; }
    private void setName(String name) { this.name = name; }

    // Health functions
    public int getHealth() { return health; }
    private void setHealth(int health) { this.health = health; }

    // mana functions
    public int getMana() { return mana; }
    private void setMana(int mana) { this.mana = mana; }

    // strenght functions
    public int getCharacterStrenght() { return strenght; }
    public int getTotalStrenght() { return strenght + (weapon != null ? weapon.getWeaponPower(): 0); }
    private void setStrenght(int strenght) { this.strenght = strenght; }

    // Intelligence functions
    public int getCharacterIntelligence() { return intelligence; }
    public int getTotalIntelligence() { return intelligence + (weapon != null ? weapon.getWeaponPower(): 0); }
    private void setIntelligence(int intelligence) { this.intelligence = intelligence; }

    // Weapon functions
    public Weapon getWeapon() { return weapon; }
    public void equipWeapon( Weapon weapon ) { this.weapon = weapon; }
}