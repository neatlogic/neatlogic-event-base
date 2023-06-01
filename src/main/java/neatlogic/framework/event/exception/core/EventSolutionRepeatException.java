package neatlogic.framework.event.exception.core;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class EventSolutionRepeatException extends ApiRuntimeException {

	private static final long serialVersionUID = 7578574406227399198L;

	public EventSolutionRepeatException(String name) {
		super("解决方案：“{0}”已存在", name);
	}


}
