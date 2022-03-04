package codedriver.framework.event.exception.core;

public class EventNotFoundException extends EventRuntimeException {

    private static final long serialVersionUID = -1060520783702926740L;

    public EventNotFoundException(Long eventId) {
        super("事件：'" + eventId + "'不存在" );
    }
}
