package src.br.com.game.model.combat;
import src.br.com.game.model.Character;

public interface Attack {
    public void execute(Character origin, Character target);
}