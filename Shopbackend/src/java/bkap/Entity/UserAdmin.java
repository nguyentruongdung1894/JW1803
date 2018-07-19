/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Entity;

import java.sql.Date;

/**
 *
 * @author ScorPius 31
 */
public class UserAdmin {
    private int idCustomer;
    private String nameCustomer;
    private String userName;
    private String password;
    private String address;
    private int telephone;
    private String email;
    private Date birthday;
    private int role;

    public UserAdmin() {
    }

    public UserAdmin(int idCustomer, String nameCustomer, String userName, String password, String address, int telephone, String email, Date birthday, int role) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.userName = userName;
        this.password = password;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.birthday = birthday;
        this.role = role;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    
}
