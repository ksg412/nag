package com.easysport.b40.setup.vo;

import org.hibernate.validator.constraints.NotEmpty;

import com.easysport.common.vo.BaseVo;

/**
 * @Author : sgkim
 * @Date : 2016-02-01
 * @Version : 1.0
 */
public class SetupVo extends BaseVo {

    private String companySn;

    @NotEmpty
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanySn() {
        return companySn;
    }

    public void setCompanySn(String companySn) {
        this.companySn = companySn;
    }
}
