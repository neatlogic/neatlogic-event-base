package codedriver.framework.event.exception.core;

import codedriver.framework.exception.core.ApiException;

public class EventException extends ApiException {

    private static final long serialVersionUID = -1920154780510660259L;

    public EventException() {
		super();
	}

	public EventException(String msg) {
		super(msg);
	}

	public EventException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public EventException(Throwable cause) {
		super(cause);
	}
}
