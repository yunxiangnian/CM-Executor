package com.cloudmissing.core.alarm.contact;


import lombok.Getter;
import lombok.Setter;

/**
 * @author cloudmissing@ll.com
 * @date 2023/4/23 22:16
 */
@Setter
@Getter
public class EmailAlarm extends BaseAlarm {

    public EmailAlarm() {
        this.alarmType = AlarmType.EMAIL;
    }

    private String address;

    //todo 后续添加邮件的其他配置
}
