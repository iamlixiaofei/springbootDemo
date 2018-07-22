package com.myproject.demo.system.entity;

import java.util.Date;


public class Loglogin {
    private Integer logloginId;

    private String loginName;

    private String operatorName;

    private Integer operatorId;

    private String loginIp;
    
    private String operate;

    private Date time;

    public Integer getLogloginId() {
        return logloginId;
    }

    public void setLogloginId(Integer logloginId) {
        this.logloginId = logloginId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getOperate() {
		return operate;
	}

	public void setOperate(String operate) {
		this.operate = operate;
	}


}