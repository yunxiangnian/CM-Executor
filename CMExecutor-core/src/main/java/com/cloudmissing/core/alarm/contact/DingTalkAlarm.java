package com.cloudmissing.core.alarm.contact;

import lombok.Data;

/**
 * @author cloudmissing@ll.com
 * @date 2023/4/23 21:54
 */
@Data
public class DingTalkAlarm extends BaseAlarm {

    // todo 后续的钉钉配置项

    public DingTalkAlarm() {
        super.alarmType = AlarmType.DING_TALK;
    }

}
