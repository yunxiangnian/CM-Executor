package com.cloudmissing.core.alarm.contact;


import lombok.Getter;
import lombok.Setter;

/**
 * @author cloudmissing@ll.com
 * @date 2023/4/23 22:01
 */
@Getter
@Setter
public class MobileAlarm extends BaseAlarm {

    private String mobile;

    public MobileAlarm() {
        this.alarmType = AlarmType.MOBILE;
    }

}
