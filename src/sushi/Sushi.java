package sushi;

import java.util.List;

import ingredients.Ingredient;

/**
 * Sushi can be defined as a Japanese dish consisting of vinegared rice topped with other
 * ingredients.
 */
public interface Sushi {

  /**
   * Adds an ingredient to the sushi.
   *
   * @param ingredient the ingredient to add
   * @return the same sushi with the newly added ingredient
   * @throws IllegalArgumentException if the given ingredient is <code>null</code> OR the given
   *                                  ingredient has already been added OR the given the ingredient
   *                                  is invalid for whatever reason
   */
  Sushi addIngredient(Ingredient ingredient) throws IllegalArgumentException;

  /**
   * Determines whether the sushi has been constructed or not. A sushi is considered constructed
   * when it consists of all minimal ingredients that make it up.
   *
   * @return <code>true</code> if the sushi has been constructed and <code>false</code> otherwise
   */
  boolean sushiConstructed();

  /**
   * Gets all the ingredients belonging to a specific sushi.
   *
   * @return a list of ingredients that make up a sushi
   */
  List<Ingredient> getIngredients();
}
