package src.br.com.game.model.weapon;

public class Weapon {
    private String name;
    private int power;
    private WeaponType type;
    private String description;

    public Weapon(String name, int power, WeaponType type, String description) {
        this.setName(name);
        this.setPower(power);
        this.setType(type);
        this.setDescription(description);
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

    public String getName() { return name; }

    private void setName(String name) { 
        if (name != null && !name.trim().isEmpty()) {
        this.name = name; 
        } else {
            this.name = "Unknown"; // Default name if invalid name is provided
            System.out.println("Invalid name!");
        }
    }

    public WeaponType getType() { return type; }

    private void setType(WeaponType type) {
        this.type = (type != null) ? type:WeaponType.SWORD;
    }

    public String getDescription() { return description; }

    private void setDescription(String description) {
        this.description = (description != null) ? description : "No description";
    }
}