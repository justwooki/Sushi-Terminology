package ingredients;

/**
 * A special ingredient representing raw seafood.
 */
public final class RawSeafood implements Ingredient {
  private final String name;

  /**
   * Constructs a RawSeafood object that takes in a name representing it.
   *
   * @param name the name of the raw seafood
   * @throws IllegalArgumentException if the given name is <code>null</code>
   */
  public RawSeafood(String name) throws IllegalArgumentException {
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
    if (!(o instanceof RawSeafood)) {
      return false;
    }

    return this.name.equals(((RawSeafood) o).name);
  }

  @Override
  public int hashCode() {
    return this.name.hashCode();
  }
}
