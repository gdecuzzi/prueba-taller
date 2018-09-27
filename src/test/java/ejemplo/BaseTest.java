package ejemplo;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith( SpringRunner.class )
@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
@ActiveProfiles( "test" )
public abstract class BaseTest {
  protected MockMvc mockClient;

  @Autowired
  protected WebApplicationContext webApplicationContext;

  @Before
  public void setupRestClient() throws Exception {
    this.mockClient = MockMvcBuilders
        .webAppContextSetup(webApplicationContext)
        .build();
  }

  protected final static MediaType JSON_CONTENT_TYPE = new MediaType(
      MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype());

}
