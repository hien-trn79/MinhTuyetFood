package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Staff {

    @Id
    private Integer staffId;
    private String staffName, staffSubName;
    private Integer staffAge;
    private String staffAddress, staffNumberphone;

    public Staff() {
        this.staffId = 0;
        this.staffName = "";
        this.staffSubName = "";
        this.staffAge = 1900;
        this.staffAddress = "Address";
        this.staffNumberphone = "123456789";
    }

    public Staff(Integer staffId, String staffName, String staffSubName, Integer staffAge, String staffAddress, String staffNumberphone) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffSubName = staffSubName;
        this.staffAge = staffAge;
        this.staffAddress = staffAddress;
        this.staffNumberphone = staffNumberphone;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public Integer getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(Integer staffAge) {
        this.staffAge = staffAge;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffNumberphone() {
        return staffNumberphone;
    }

    public void setStaffNumberphone(String staffNumberphone) {
        this.staffNumberphone = staffNumberphone;
    }

    public String getStaffSubName() {
        return staffSubName;
    }

    public void setStaffSubName(String staffSubName) {
        this.staffSubName = staffSubName;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffAddress='" + staffAddress + '\'' +
                ", staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", staffSubName='" + staffSubName + '\'' +
                ", staffAge=" + staffAge +
                ", staffNumberphone='" + staffNumberphone + '\'' +
                '}';
    }
}
