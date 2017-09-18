package com.winterfell.pilot.domain;

import java.util.Date;

public class EmpVO {
    private String empNo;
    private String empNm;
    private String empPos;
    private int deptNo;
    private String deptNm;
    private String email;
    private String phone;
    private Date regDate;
    private String etc;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpNm() {
        return empNm;
    }

    public void setEmpNm(String empNm) {
        this.empNm = empNm;
    }

    public String getEmpPos() {
        return empPos;
    }

    public void setEmpPos(String empPos) {
        this.empPos = empPos;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptNm() {
        return deptNm;
    }

    public void setDeptNm(String deptNm) {
        this.deptNm = deptNm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    @Override
    public String toString() {
        return "EmpVO {" +
                "empNo='" + empNo + '\'' +
                ", empNm='" + empNm + '\'' +
                ", empPos='" + empPos + '\'' +
                ", deptNo=" + deptNo +
                ", deptNm='" + deptNm + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", regDate=" + regDate +
                ", etc='" + etc + '\'' +
                '}';
    }
}
