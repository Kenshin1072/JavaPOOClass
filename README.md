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
2. Compile and run the following comand:
``` bash
# 1. Compilar (Envia os arquivos .class para a pasta bin)
javac -d bin src/br/com/model/*.java src/br/com/main/*.java

# 2. Executar (Lê os arquivos da pasta bin)
java -cp bin br.com.main.Game
```
3. Use `attack()` or `specialAttack()` for character interactions.
4. Use `takeDamage()` manually only for environmental interactions (like traps or hazards).