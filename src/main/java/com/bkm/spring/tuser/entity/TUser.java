package com.bkm.spring.tuser.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @see t_user
 * @date 2017-03-23 16:01:46
 */
public class TUser implements Serializable {
    /**
     * 
     * @column id
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    private Long id;

    /**
     * 用户名
     * @column name
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    private String name;

    /**
     * 手机号
     * @column phone
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    private String phone;

    /**
     * 邮箱地址
     * @column email
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    private String email;

    /**
     * 加盐后用户密码
     * @column pwd
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    private String pwd;

    /**
     * MD5盐
     * @column pwd_salt
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    private String pwdSalt;

    /**
     * 创建时间
     * @column create_time
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    private Date createTime;

    /**
     * 最后修改时间
     * @column modify_time
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    private Date modifyTime;

    /**
     * 是否删除，0-未删除；1-已删除
     * @column is_delete
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    private Byte isDelete;

    /**
     * 
     * @column age
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.name
     *
     * @return the value of t_user.name
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.name
     *
     * @param name the value for t_user.name
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.phone
     *
     * @return the value of t_user.phone
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.phone
     *
     * @param phone the value for t_user.phone
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.email
     *
     * @return the value of t_user.email
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.email
     *
     * @param email the value for t_user.email
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.pwd
     *
     * @return the value of t_user.pwd
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.pwd
     *
     * @param pwd the value for t_user.pwd
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.pwd_salt
     *
     * @return the value of t_user.pwd_salt
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public String getPwdSalt() {
        return pwdSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.pwd_salt
     *
     * @param pwdSalt the value for t_user.pwd_salt
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public void setPwdSalt(String pwdSalt) {
        this.pwdSalt = pwdSalt == null ? null : pwdSalt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.create_time
     *
     * @return the value of t_user.create_time
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.create_time
     *
     * @param createTime the value for t_user.create_time
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.modify_time
     *
     * @return the value of t_user.modify_time
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.modify_time
     *
     * @param modifyTime the value for t_user.modify_time
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.is_delete
     *
     * @return the value of t_user.is_delete
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.is_delete
     *
     * @param isDelete the value for t_user.is_delete
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.age
     *
     * @return the value of t_user.age
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.age
     *
     * @param age the value for t_user.age
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated 2017-03-23 16:01:46
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", pwd=").append(pwd);
        sb.append(", pwdSalt=").append(pwdSalt);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", age=").append(age);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}