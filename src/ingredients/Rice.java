package ingredients;

/**
 * A special ingredient representing rice.
 */
public final class Rice implements Ingredient {
  private final String name;

  /**
   * Constructs a Rice object that takes in a name representing it.
   *
   * @param name the name of the rice
   * @throws IllegalArgumentException if the given name is <code>null</code>
   */
  public Rice(String name) throws IllegalArgumentException {
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
    if (!(o instanceof Rice)) {
      return false;
    }

    return this.name.equals(((Rice) o).name);
  }

  @Override
  public int hashCode() {
    return this.name.hashCode();
  }
}
