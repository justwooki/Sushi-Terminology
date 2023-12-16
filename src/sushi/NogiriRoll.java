package sushi;

import ingredients.Ingredient;
import ingredients.RawSeafood;

/**
 * A nonigiri roll can be defined as a special kind of sushi maki roll in which raw seafood is
 * strictly not be present.
 */
public class NogiriRoll extends MakiRoll {
  /**
   * Constructs a NogiriRoll object that takes in a name representing it.
   *
   * @param name the name of the nogiri roll
   * @throws IllegalArgumentException if the given name is <code>null</code>
   */
  public NogiriRoll(String name) throws IllegalArgumentException {
    super(name);
  }

  @Override
  public Sushi addIngredient(Ingredient ingredient) throws IllegalArgumentException {
    super.addIngredient(ingredient);

    if (ingredient instanceof RawSeafood) {
      throw new IllegalArgumentException("This sushi roll cannot include raw seafood.");
    }

    return this;
  }
}