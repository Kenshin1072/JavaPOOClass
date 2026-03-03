public class Game {
    public static void main(String[] args) {
        Character mage = new Character("Morgana");
        Character monster = new Character("Orc");

        System.out.println("--- Initial Turn ---");

        mage.especialAttack(monster);
        mage.especialAttack(monster);
        // This will end in else.
        mage.especialAttack(monster);

        System.out.println("\n--- Final Status ---");
        System.out.println(monster.getName() + " Health: " + monster.getHealth());
        System.out.println(mage.getName() + " Mana left: " + mage.getMana());
    }
}