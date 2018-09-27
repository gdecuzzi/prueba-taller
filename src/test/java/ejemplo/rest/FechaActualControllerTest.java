package ejemplo.rest;

import ejemplo.BaseTest;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class FechaActualControllerTest extends BaseTest {

  @Test
  public void laFechaTieneElFormatoEsperado() throws Exception {
    this.mockClient.perform(MockMvcRequestBuilders.get("/fecha")
        .contentType(JSON_CONTENT_TYPE))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.fecha", is("27/09/2018")));
  }

}
