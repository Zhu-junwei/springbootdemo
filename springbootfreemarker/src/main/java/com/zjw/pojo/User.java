package com.zjw.pojo;

import java.util.Objects;

public class User {

    private String username;

    private String usersex;

    private String userage;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getUserage() {
        return userage;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }

    public User(String username, String usersex, String userage) {
        this.username = username;
        this.usersex = usersex;
        this.userage = userage;
    }

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(usersex, user.usersex) &&
                Objects.equals(userage, user.userage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, usersex, userage);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", usersex='" + usersex + '\'' +
                ", userage='" + userage + '\'' +
                '}';
    }
}
