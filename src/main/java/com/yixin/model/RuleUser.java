package com.yixin.model;

import javax.persistence.*;

@Table(name = "rule_user")
public class RuleUser extends BaseEntity{

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String telphone;

    /**
     * 身份证号
     */
    @Column(name = "credit_card")
    private String creditCard;

    /**
     * 头像
     */
    @Column(name = "head_image_url")
    private String headImageUrl;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 个人描述
     */
    private String remark;

    /**
     * 图片
     */
    private byte[] picture;


    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取手机号
     *
     * @return telphone - 手机号
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * 设置手机号
     *
     * @param telphone 手机号
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    /**
     * 获取身份证号
     *
     * @return credit_card - 身份证号
     */
    public String getCreditCard() {
        return creditCard;
    }

    /**
     * 设置身份证号
     *
     * @param creditCard 身份证号
     */
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * 获取头像
     *
     * @return head_image_url - 头像
     */
    public String getHeadImageUrl() {
        return headImageUrl;
    }

    /**
     * 设置头像
     *
     * @param headImageUrl 头像
     */
    public void setHeadImageUrl(String headImageUrl) {
        this.headImageUrl = headImageUrl;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取个人描述
     *
     * @return remark - 个人描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置个人描述
     *
     * @param remark 个人描述
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取图片
     *
     * @return picture - 图片
     */
    public byte[] getPicture() {
        return picture;
    }

    /**
     * 设置图片
     *
     * @param picture 图片
     */
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}