package com.example.ticket_backend.bean;

public class Users {
    private String account;
    private String passwd;
    private boolean is_admin;

    public Users(String account, String passwd) {
        this.account = account;
        this.passwd = passwd;
        this.is_admin = false;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public boolean getAdmin() {
        return is_admin;
    }

    public void setAdmin(boolean admin) {
        this.is_admin = admin;
    }

}
