# Java Class Project - Game Logic Study

## Summary
This project was developed for the Object-Oriented Programming (OOP) class at FIAP. It serves as a practical study of Java fundamentals, focusing on class structures, encapsulation, and object interaction.

## How it Works
- **Game Simulation:** The project simulates basic RPG mechanics. The `Character` class handles actions like attacking and receiving damage.
- **Attributes:** Each character has a `name`, `health`, `mana`, and `power`.
- **Combat Mechanics:** - Normal attacks are based on the `power` attribute.
    - Special attacks consume `mana` to deal enhanced damage.
- **Encapsulation:** The `attack` and `specialAttack` methods internally call `takeDamage`, ensuring the logic is contained within the class and simplifying the main execution.

## How to Run
1. Ensure you have the JDK installed.
2. Compile and run the `Game.java` file to see the combat simulation in the console.
3. Use `attack()` or `specialAttack()` for character interactions.
4. Use `takeDamage()` manually only for environmental interactions (like traps or hazards).