package neatlogic.framework.event.auth.label;

import neatlogic.framework.auth.core.AuthBase;
import neatlogic.framework.process.auth.PROCESS_BASE;

import java.util.Collections;
import java.util.List;

public class EVENT_TYPE_MODIFY extends AuthBase {

	@Override
	public String getAuthDisplayName() {
		return "auth.process.eventtypemodify.name";
	}

	@Override
	public String getAuthIntroduction() {
		return "auth.process.eventtypemodify.introduction";
	}

	@Override
	public String getAuthGroup() {
		return "process";
	}

	@Override
	public Integer getSort() {
		return 4;
	}

	@Override
	public List<Class<? extends AuthBase>> getIncludeAuths(){
		return Collections.singletonList(PROCESS_BASE.class);
	}
}
