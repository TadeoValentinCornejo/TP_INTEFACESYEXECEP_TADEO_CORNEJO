package Ejercicio_6;

public class EdadIvalidaException extends RuntimeException {
    public EdadIvalidaException(String message) {
        super(message);
    }

  public EdadIvalidaException() {
  }

  public EdadIvalidaException(Throwable cause) {
    super(cause);
  }

  public EdadIvalidaException(String message, Throwable cause) {
    super(message, cause);
  }
}
