package com.cloudmissing.core.alarm.contact;

/**
 * @author cloudmissing@ll.com
 * @date 2023/4/23 22:02
 */
public class WeChatAlarm extends BaseAlarm {

    public WeChatAlarm() {
        this.alarmType = AlarmType.WECHAT;
    }

    // todo wechat extra config
}
