package exceptions.ue.transporter;

public class TransportMalfunctionException extends Exception {

    public TransportMalfunctionException(String message) {
        super(message);
    }

    public TransportMalfunctionException(String message, Throwable cause) {
        super(message, cause);
    }
}
