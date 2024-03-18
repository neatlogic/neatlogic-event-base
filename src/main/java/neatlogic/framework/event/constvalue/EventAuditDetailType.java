/*Copyright (C) $today.year  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/

package neatlogic.framework.event.constvalue;

import neatlogic.framework.process.audithandler.core.IProcessTaskAuditDetailType;
import neatlogic.framework.util.$;

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
        return $.t(text);
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
