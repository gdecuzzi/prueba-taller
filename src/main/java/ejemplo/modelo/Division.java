package ejemplo.modelo;

public class Division {
  private Double dividendo;
  private Double divisor;

  public Division() {
  }

  public Double getDividendo() {
    return dividendo;
  }

  public void setDividendo(Double dividendo) {
    this.dividendo = dividendo;
  }

  public Double getDivisor() {
    return divisor;
  }

  public void setDivisor(Double divisor) {
    this.divisor = divisor;
  }

  public Double ejecutar() {
    return dividendo / divisor;
  }
}
