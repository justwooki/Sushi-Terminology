package sushi;

import java.util.ArrayList;
import java.util.List;

import ingredients.Ingredient;
import ingredients.RawSeafood;
import ingredients.Rice;
import ingredients.Sauce;

/**
 * A nigiri can be defined as a sushi that consists of vinegared rice topped with a single raw
 * seafood and some sauces.
 */
public class Nigiri implements Sushi {
  private final String name;
  private final List<Ingredient> ingredients;
  private boolean hasRice;
  private boolean hasSeafood;

  /**
   * Constructs a Nigiri object that takes in a name representing it.
   *
   * @param name the name of the nigiri
   * @throws IllegalArgumentException if the given name is <code>null</code>
   */
  public Nigiri(String name) throws IllegalArgumentException {
    if (name == null) {
      throw new IllegalArgumentException("The given name cannot be null.");
    }

    this.name = name;
    this.ingredients = new ArrayList<>();
  }

  @Override
  public Sushi addIngredient(Ingredient ingredient) throws IllegalArgumentException {
    if (ingredient == null) {
      throw new IllegalArgumentException("The given ingredient cannot be null.");
    } else if (this.ingredients.contains(ingredient)) {
      throw new IllegalArgumentException("This ingredient has already been added.");
    } else if (ingredient instanceof Rice) {
      if (this.hasRice) {
        throw new IllegalArgumentException("Too much rice being added.");
      }

      this.ingredients.add(ingredient);
      this.hasRice = true;
    } else if (ingredient instanceof RawSeafood) {
      if (this.hasSeafood) {
        throw new IllegalArgumentException("Too many fish being added.");
      }

      this.ingredients.add(ingredient);
      this.hasSeafood = true;
    } else if (ingredient instanceof Sauce) {
      this.ingredients.add(ingredient);
    } else {
      throw new IllegalArgumentException("This ingredient doesn't belong in nigiri");
    }

    return this;
  }

  @Override
  public boolean sushiConstructed() {
    return this.hasRice && this.hasSeafood;
  }

  @Override
  public List<Ingredient> getIngredients() {
    return new ArrayList<>(this.ingredients);
  }

  @Override
  public String toString() {
    return this.name;
  }
}
