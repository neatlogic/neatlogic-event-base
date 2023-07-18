package neatlogic.framework.event.exception.core;

import neatlogic.framework.exception.core.NotFoundEditTargetException;

public class EventSolutionNotFoundEditTargetException extends NotFoundEditTargetException {

	private static final long serialVersionUID = -3755737935060105949L;

	public EventSolutionNotFoundEditTargetException(Long id) {
		super("nfeec.eventsolutionnotfoundedittargetexception.eventsolutionnotfoundedittargetexception", id);
	}


}
