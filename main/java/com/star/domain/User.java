package com.star.domain;

import javax.persistence.*;

/**
 * Created by hp on 2017/3/10.
 */
//@Table的catalog属性指定要使用的数据库名，不指定则使用dataSource中url指定的数据库，一般不设置
//schema 作用与catalog一致
@Entity
@Table(name="users")
public class User {
    @Id
    private int id;
    @Column(name="username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
