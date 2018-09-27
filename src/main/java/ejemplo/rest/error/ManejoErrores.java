package ejemplo.rest.error;

import ejemplo.modelo.ElDivisorNoPuedeSerCero;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Collections;

@ControllerAdvice
public class ManejoErrores {

  @ExceptionHandler
  @ResponseStatus( HttpStatus.BAD_REQUEST )
  @ResponseBody
  public RespuestaError requestInvalido(ElDivisorNoPuedeSerCero e) {
    return new RespuestaError(
        CodigoError.DIVISION_ERROR,
        "El divisor no puede ser 0",
        Collections.singletonList(CodigoError.Division.DIVIDENDO_CERO));

  }
}
