package ejemplo.rest.filtro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LogTodosLosRequests extends OncePerRequestFilter {
  private static final Logger logger = LoggerFactory.getLogger("MESSAGES");

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
    try {
      logRequest(request);
      filterChain.doFilter(request, response);
    } finally {
      logResponse(response);
    }
  }

  private void logResponse(HttpServletResponse response) {
    logger.info("Response: {}", response.getStatus());
  }

  private void logRequest(HttpServletRequest request) {
    logger.info("Request: {} [{}]", request.getRequestURI(), request.getMethod());
  }
}
