package codedriver.framework.event.auth.label;

import codedriver.framework.auth.core.AuthBase;
import codedriver.framework.process.auth.PROCESS_BASE;

import java.util.Collections;
import java.util.List;

public class EVENT_SOLUTION_MODIFY extends AuthBase {

	@Override
	public String getAuthDisplayName() {
		return "解决方案管理权限";
	}

	@Override
	public String getAuthIntroduction() {
		return "对解决方案进行添加、修改和删除";
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
