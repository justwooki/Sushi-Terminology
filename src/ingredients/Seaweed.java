package ingredients;

/**
 * A special ingredient representing seaweed.
 */
public final class Seaweed implements Ingredient {
  private final String name;

  /**
   * Constructs a Seaweed object that takes in a name representing it.
   *
   * @param name the name of the seaweed
   * @throws IllegalArgumentException if the given name is <code>null</code>
   */
  public Seaweed(String name) throws IllegalArgumentException {
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
    if (!(o instanceof Seaweed)) {
      return false;
    }

    return this.name.equals(((Seaweed) o).name);
  }

  @Override
  public int hashCode() {
    return this.name.hashCode();
  }
}
