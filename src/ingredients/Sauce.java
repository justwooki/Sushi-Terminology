package ingredients;

/**
 * A special ingredient representing a sauce.
 */
public final class Sauce implements Ingredient {
  private final String name;

  /**
   * Constructs a Sauce object that takes in a name representing it.
   *
   * @param name the name of the sauce
   * @throws IllegalArgumentException if the given name is <code>null</code>
   */
  public Sauce(String name) throws IllegalArgumentException {
    if (name == null) {
      throw new IllegalArgumentException("The given ingredient name cannot be null.");
    }

    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Sauce)) {
      return false;
    }

    return this.name.equals(((Sauce) o).name);
  }

  @Override
  public int hashCode() {
    return this.name.hashCode();
  }
}
