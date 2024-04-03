package rocketseat.com.passin.domain.event.exceptions;

import org.springframework.context.support.MessageSourceAccessor;

public class EventNotFoundException extends RuntimeException {

    public EventNotFoundException(String message){
        super(message);
    }
}
