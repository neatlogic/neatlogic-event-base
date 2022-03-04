/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.event.constvalue;

import codedriver.framework.process.stephandler.core.IProcessStepHandlerType;

public enum EventProcessStepHandlerType implements IProcessStepHandlerType {
    EVENT("event", "process", "事件");
    private String handler;
    private String name;
    private String type;

    EventProcessStepHandlerType(String handler, String type, String name) {
        this.handler = handler;
        this.name = name;
        this.type = type;
    }

    @Override
    public String getHandler() {
        return handler;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }
}
