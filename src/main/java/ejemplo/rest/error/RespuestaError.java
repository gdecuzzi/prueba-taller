package ejemplo.rest.error;

import java.util.List;

public class RespuestaError {
  private CodigoError codigo;
  private String detalle;
  private List<String> errores;

  public RespuestaError() {

  }

  public RespuestaError(CodigoError codigo, String detalle, List<String> errores) {
    this.codigo = codigo;
    this.detalle = detalle;
    this.errores = errores;
  }

  public CodigoError getCodigo() {
    return codigo;
  }

  public void setCodigo(CodigoError codigo) {
    this.codigo = codigo;
  }

  public String getDetalle() {
    return detalle;
  }

  public void setDetalle(String detalle) {
    this.detalle = detalle;
  }

  public List<String> getErrores() {
    return errores;
  }

  public void setErrores(List<String> errores) {
    this.errores = errores;
  }
}
