package com.java.pojo;

/**
 * description:
 * author: ws
 * time: 2020/2/29 19:48
 */
public class User {
    private String uName;
    private Integer age;
    private Float height;

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" +
                "uName='" + uName + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
