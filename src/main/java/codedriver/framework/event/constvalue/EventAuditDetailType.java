/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.event.constvalue;

import codedriver.framework.process.audithandler.core.IProcessTaskAuditDetailType;

public enum EventAuditDetailType implements IProcessTaskAuditDetailType {
    EVENTINFO("eventinfo", "事件", "event", "oldEvent", 16, false),
    TASK("task", "任务", "task", "oldTask", 18, false)
    ;
    
    private EventAuditDetailType(String _value, String _text, String _paramName, String _oldDataParamName, int _sort, boolean _needCompression) {
        this.value = _value;
        this.text = _text;
        this.paramName = _paramName;
        this.oldDataParamName = _oldDataParamName;
        this.sort = _sort;
        this.needCompression = _needCompression;
    }
    
    private String value;
    private String text;
    private String paramName;
    private String oldDataParamName;
    private int sort;
    private boolean needCompression;
    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getParamName() {
        return paramName;
    }

    @Override
    public String getOldDataParamName() {
        return oldDataParamName;
    }

    @Override
    public int getSort() {
        return sort;
    }

    @Override
    public boolean getNeedCompression() {
        return needCompression;
    }

}
