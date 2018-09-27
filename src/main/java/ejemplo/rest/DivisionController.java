package ejemplo.rest;

import ejemplo.modelo.Division;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping( Endpoints.dividir )
public class DivisionController {

  @PostMapping
  public Map<String, Double> dividir(@RequestBody Division division) {
    Map<String, Double> resultado = new HashMap<String, Double>();
    resultado.put("resultado", division.ejecutar());
    return resultado;
  }
}
