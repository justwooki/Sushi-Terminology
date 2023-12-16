package sushi;

import ingredients.Ingredient;
import ingredients.RawSeafood;

/**
 * A sushami can be defined as a special kind of sushi maki roll in which raw seafood must be
 * present.
 */
public class Sushami extends MakiRoll {
  private boolean hasSeafood;

  /**
   * Constructs a Sushami object that takes in a name representing it.
   *
   * @param name the name of the sushami
   * @throws IllegalArgumentException if the given name is <code>null</code>
   */
  public Sushami(String name) throws IllegalArgumentException {
    super(name);
  }

  @Override
  public Sushi addIngredient(Ingredient ingredient) throws IllegalArgumentException {
    super.addIngredient(ingredient);

    if (ingredient instanceof RawSeafood) {
      this.hasSeafood = true;
    }

    return this;
  }

  @Override
  public boolean sushiConstructed() {
    return super.sushiConstructed() && this.hasSeafood;
  }
}
