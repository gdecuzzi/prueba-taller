package ejemplo.modelo;

public class Division {
  private Double dividendo;
  private Double divisor;

  public Division() {
  }

  public Double ejecutar() {
    if (divisor == null || divisor.equals(0)) {
      throw new ElDivisorNoPuedeSerCero();
    }
    return dividendo / divisor;
  }
}
