package neatlogic.framework.event.exception.core;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class EventTypeNameRepeatException extends ApiRuntimeException {

	private static final long serialVersionUID = 4304560151882499635L;

	public EventTypeNameRepeatException() {
		super("exception.event.eventtypenamerepeatexception");
	}

}
