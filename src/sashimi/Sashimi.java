package sashimi;

import ingredients.RawSeafood;

/**
 * Sashimi can simply be defined as slices of raw seafood alone.
 */
public final class Sashimi {
  private final RawSeafood seafood;

  public Sashimi(RawSeafood seafood) throws IllegalArgumentException {
    if (seafood == null) {
      throw new IllegalArgumentException("The given raw seafood cannot be null.");
    }

    this.seafood = seafood;
  }

  /**
   * Gets the species of fish that the sashimi is made of.
   *
   * @return the fish species that makes up the sashimi
   */
  public RawSeafood getFishSpecies() {
    return this.seafood;
  }
}
