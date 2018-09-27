package ejemplo.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class Dia {

  @JsonFormat( pattern = "dd/MM/yyyy" )
  public LocalDate fecha;

  public Dia(LocalDate fecha) {
    this.fecha = fecha;
  }

}
