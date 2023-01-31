package neatlogic.framework.event.exception.core;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class EventRuntimeException extends ApiRuntimeException {

    private static final long serialVersionUID = -4651663182719416361L;

    public EventRuntimeException() {
		super();
	}

	public EventRuntimeException(String msg) {
		super(msg);
	}

	public EventRuntimeException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public EventRuntimeException(Throwable cause) {
		super(cause);
	}
}
