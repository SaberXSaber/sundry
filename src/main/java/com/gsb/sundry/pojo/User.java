package com.gsb.sundry.pojo;

/**
 * @author gsb
 * @version V1.0.0
 * @date 2018-12-24
 * @time 10:02
 * @description
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String card;
    private String sex;
    private String address;
    private String phone;
    private String email;
    private String loginName;
    private String password;
    private String password2;
    private String birth;
    private String location;

    private String vertCode;

    public String getVertCode() {
        return vertCode;
    }

    public void setVertCode(String vertCode) {
        this.vertCode = vertCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", card='" + card + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", password2='" + password2 + '\'' +
                ", birth='" + birth + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
