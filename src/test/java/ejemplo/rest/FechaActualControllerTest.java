package ejemplo.rest;

import ejemplo.BaseTest;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class FechaActualControllerTest extends BaseTest {


  @Test
  public void laFechaTieneElFormatoEsperado() throws Exception {
    LocalDate hoy = LocalDate.now();
    String esperado = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(hoy);
    this.mockClient.perform(MockMvcRequestBuilders.get(Endpoints.fecha)
        .contentType(JSON_CONTENT_TYPE))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.fecha", is(esperado)));
  }

}
