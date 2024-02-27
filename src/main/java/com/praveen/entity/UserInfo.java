package com.praveen.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userInfoId;
    private Long mobile;

    @Enumerated(EnumType.STRING)
    private Gender gender;


    private String nationality;

    public UserInfo() {
    }

    public UserInfo(Long userInfoId, Long mobile, Gender gender, String nationality) {
        this.userInfoId = userInfoId;
        this.mobile = mobile;
        this.gender = gender;
        this.nationality = nationality;
    }

    public Long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
