package neatlogic.framework.event.exception.core;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class EventRuntimeException extends ApiRuntimeException {

    private static final long serialVersionUID = -4651663182719416361L;

	public EventRuntimeException(String key, Object ... values) {
		super(key, values);
	}
}
