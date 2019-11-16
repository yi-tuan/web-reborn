package com.web.provider.model;

import java.io.Serializable;

/**
 * @author liuxing
 * @date 2019/11/14
 * @description
 */
public class User implements Serializable {
    private String studentNum;
    private String userName;
    private String password;
    private int isActive;

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }
}
