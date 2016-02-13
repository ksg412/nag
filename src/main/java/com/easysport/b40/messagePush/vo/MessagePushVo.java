package com.easysport.b40.messagePush.vo;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author : sgkim
 * @Date : 2016-02-12
 * @Version : 1.0
 */
public class MessagePushVo {

    @NotEmpty
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
