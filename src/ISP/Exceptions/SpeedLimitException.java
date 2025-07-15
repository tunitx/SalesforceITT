package ISP.Exceptions;

//unchecked exception
public class SpeedLimitException extends RuntimeException {
    public SpeedLimitException(String message){
        super(message);
    }
}
