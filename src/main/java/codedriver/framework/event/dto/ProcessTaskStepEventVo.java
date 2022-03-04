package codedriver.framework.event.dto;

public class ProcessTaskStepEventVo {

    private Long processTaskId;
    private Long processTaskStepId;
    private Long eventId;
    public ProcessTaskStepEventVo() {}
    public ProcessTaskStepEventVo(Long processTaskId, Long processTaskStepId, Long eventId) {
        this.processTaskId = processTaskId;
        this.processTaskStepId = processTaskStepId;
        this.eventId = eventId;
    }
    public Long getProcessTaskId() {
        return processTaskId;
    }
    public void setProcessTaskId(Long processTaskId) {
        this.processTaskId = processTaskId;
    }
    public Long getProcessTaskStepId() {
        return processTaskStepId;
    }
    public void setProcessTaskStepId(Long processTaskStepId) {
        this.processTaskStepId = processTaskStepId;
    }
    public Long getEventId() {
        return eventId;
    }
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
}
