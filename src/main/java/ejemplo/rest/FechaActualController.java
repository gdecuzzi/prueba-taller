package ejemplo.rest;

import ejemplo.modelo.Dia;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping( Endpoints.fecha )
public class FechaActualController {

  @GetMapping
  public Dia hoy() {
    return new Dia(LocalDate.now());
  }
}
