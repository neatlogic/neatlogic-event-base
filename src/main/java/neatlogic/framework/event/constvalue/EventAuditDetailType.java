/*
Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package neatlogic.framework.event.constvalue;

import neatlogic.framework.process.audithandler.core.IProcessTaskAuditDetailType;
import neatlogic.framework.util.I18nUtils;

public enum EventAuditDetailType implements IProcessTaskAuditDetailType {
    EVENTINFO("eventinfo", "common.event", "event", "oldEvent", 16, false),
    TASK("task", "common.task", "task", "oldTask", 18, false)
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
        return I18nUtils.getMessage(text);
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
