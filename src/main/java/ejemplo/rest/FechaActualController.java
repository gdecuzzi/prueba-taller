package ejemplo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("/fecha")
public class FechaActualController {

  @GetMapping
  public LocalDate hoy(){
    return LocalDate.now();
  }
}
