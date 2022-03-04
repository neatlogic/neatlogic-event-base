package codedriver.framework.event.dto;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;

import java.util.List;

public class EventSolutionVo extends BaseEditorVo {

	@EntityField(name = "解决方案ID", type = ApiParamType.LONG)
	private Long id;
	@EntityField(name = "解决方案名称", type = ApiParamType.STRING)
	private String name;
	@EntityField(name = "是否启用", type = ApiParamType.INTEGER)
	private Integer isActive;
	@EntityField(name = "内容", type = ApiParamType.STRING)
	private String content;
	@EntityField(name = "关联的事件类型", type = ApiParamType.JSONARRAY)
	private List<EventTypeVo> eventTypeList;

	public EventSolutionVo() {}

	public Long getId() {
		if(id == null){
			id = SnowflakeUtil.uniqueLong();
		}
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<EventTypeVo> getEventTypeList() {
		return eventTypeList;
	}

	public void setEventTypeList(List<EventTypeVo> eventTypeList) {
		this.eventTypeList = eventTypeList;
	}
}
