package neatlogic.framework.event.exception.core;

public class EventNotFoundException extends EventRuntimeException {

    private static final long serialVersionUID = -1060520783702926740L;

    public EventNotFoundException(Long eventId) {
        super("exception.event.eventnotfoundexception", eventId);
    }
}
