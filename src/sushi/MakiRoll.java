package sushi;

import java.util.ArrayList;
import java.util.List;

import ingredients.Ingredient;
import ingredients.Rice;
import ingredients.Seaweed;

/**
 * A maki roll can be defined as a sushi that consists of cylindrical pieces of vinegared rice and
 * other ingredients wrapped around nori seaweed sheets.
 */
public class MakiRoll implements Sushi {
  private final String name;
  private final List<Ingredient> ingredients;
  private boolean hasRice;
  private boolean hasSeaweed;

  /**
   * Constructs a MakiRoll object that takes in a name representing it.
   *
   * @param name the name of the maki roll
   * @throws IllegalArgumentException if the given name is <code>null</code>
   */
  public MakiRoll(String name) throws IllegalArgumentException {
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
    } else if (ingredient instanceof Seaweed) {
      if (this.hasSeaweed) {
        throw new IllegalArgumentException("Too much seaweed being added.");
      }

      this.ingredients.add(ingredient);
      this.hasSeaweed = true;
    } else {
      this.ingredients.add(ingredient);
    }

    return this;
  }

  @Override
  public boolean sushiConstructed() {
    return hasRice && hasSeaweed;
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
