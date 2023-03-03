package neatlogic.framework.event.exception.core;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class EventSolutionNotFoundException extends ApiRuntimeException {

	private static final long serialVersionUID = -3755737935060105949L;

	public EventSolutionNotFoundException(Long id) {
		super("exception.event.eventsolutionnotfoundexception", id);
	}


}
