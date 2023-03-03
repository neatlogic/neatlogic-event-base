package neatlogic.framework.event.auth.label;

import neatlogic.framework.auth.core.AuthBase;
import neatlogic.framework.process.auth.PROCESS_BASE;

import java.util.Collections;
import java.util.List;

public class EVENT_SOLUTION_MODIFY extends AuthBase {

	@Override
	public String getAuthDisplayName() {
		return "auth.process.eventsolutionmodify.name";
	}

	@Override
	public String getAuthIntroduction() {
		return "auth.process.eventsolutionmodify.introduction";
	}

	@Override
	public String getAuthGroup() {
		return "process";
	}

	@Override
	public Integer getSort() {
		return 3;
	}

	@Override
	public List<Class<? extends AuthBase>> getIncludeAuths(){
		return Collections.singletonList(PROCESS_BASE.class);
	}
}
