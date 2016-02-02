package com.easysport.b40.userInfo.vo;

import com.easysport.common.vo.BaseVo;
import com.easysport.customAnnotation.annotation.EmailOverlabCheck;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

/**
 * Created by sgkim on 2016-01-21.
 */
public class UserInfoVo extends BaseVo{

    private Integer memberId;

    @NotEmpty
    @EmailOverlabCheck
    private String email;

    @NotEmpty
    private String password;

    @NotEmpty
    private String passwordCheck;

    @NotEmpty
    private String name;

    @NotEmpty
    private String phoneNumber;

    private String userYn;

    private Date registDate;

    private Date changeDate;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordCheck() {
        return passwordCheck;
    }

    public void setPasswordCheck(String passwordCheck) {
        this.passwordCheck = passwordCheck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserYn() {
        return userYn;
    }

    public void setUserYn(String userYn) {
        this.userYn = userYn;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }


}
