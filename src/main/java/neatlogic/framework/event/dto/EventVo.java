package neatlogic.framework.event.dto;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.annotation.JSONField;

public class EventVo {

    @EntityField(name = "事件id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "事件归档类型id", type = ApiParamType.LONG)
    private Long eventTypeId;
    @EntityField(name = "事件归档类型名称路径", type = ApiParamType.STRING)
    private String eventTypeNamePath;
    @EntityField(name = "事件解决方案id", type = ApiParamType.LONG)
    private Long eventSolutionId;
    @EntityField(name = "事件解决方案名称", type = ApiParamType.STRING)
    private String eventSolutionName;
    @JSONField(serialize = false)
    private Boolean isAutoGenerateId = true;
    public synchronized Long getId() {
        if(id == null && isAutoGenerateId) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(Long eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public Long getEventSolutionId() {
        return eventSolutionId;
    }

    public void setEventSolutionId(Long eventSolutionId) {
        this.eventSolutionId = eventSolutionId;
    }

    public String getEventTypeNamePath() {
        return eventTypeNamePath;
    }

    public void setEventTypeNamePath(String eventTypeNamePath) {
        this.eventTypeNamePath = eventTypeNamePath;
    }

    public String getEventSolutionName() {
        return eventSolutionName;
    }

    public void setEventSolutionName(String eventSolutionName) {
        this.eventSolutionName = eventSolutionName;
    }

    public Boolean getIsAutoGenerateId() {
        return isAutoGenerateId;
    }

    public void setIsAutoGenerateId(Boolean isAutoGenerateId) {
        this.isAutoGenerateId = isAutoGenerateId;
    }
    
}
