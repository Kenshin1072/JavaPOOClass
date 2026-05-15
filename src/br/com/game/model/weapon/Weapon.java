package src.br.com.game.model.weapon;
import src.br.com.game.model.combat.Attack;

public class Weapon {
    private String name;
    private int weaponPower;
    private WeaponType weaponType;
    private String description;
    private Attack attack;

    private Weapon(String name, int weaponPower, WeaponType type, String description, Attack attack) {
        this.setName(name);
        this.setWeaponPower(weaponPower);
        this.setWeaponType(type);
        this.setDescription(description);
        this.setAttack(attack);
    }

    public static Weapon createWeapon(String name, int weaponPower, WeaponType weaponType, String description, Attack attack) {
        if (name == null || !name.trim().isEmpty()) {
            throw new IllegalArgumentException("The weapon's name is invalid!");
        }

        if (weaponPower <= 0 ) {
            throw new IllegalArgumentException("The weapon can't have 0 power!");
        }

        if (weaponType == null) {
            throw new IllegalArgumentException("This weapon type does not exist!");
        }

        if (attack == null) {
            throw new IllegalArgumentException("This type of weapon power does not exist");
        }

        return new Weapon(name, weaponPower, weaponType, description, attack);
    }

    // Weapon power functions
    public int getWeaponPower() { return weaponPower; }
    private void setWeaponPower(int weaponPower) { this.weaponPower = weaponPower; }

    // Name functions
    public String getName() { return name; }
    private void setName(String name) { this.name = name; }

    // Weapon type functions
    public WeaponType getWweaponType() { return weaponType; }
    private void setWeaponType(WeaponType weaponType) { this.weaponType = weaponType; }

    // Description functions
    public String getDescription() { return description; }
    private void setDescription(String description) { this.description = description; }

    // Attack functions
    public Attack getAttack() { return attack; }
    private void setAttack(Attack attack) { this.attack = attack; }
}