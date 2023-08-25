package ssac.emp.rsh;

public class EMSException extends Exception{
  public int code;
  public EMSException() {
    super();
  }

  public EMSException(String message, int code) {
    super(message);
    this.code = code;
  }
}
