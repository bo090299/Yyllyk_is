package Main.Models;

import java.sql.Date;
import java.time.LocalDate;

public class Isgarler {
    private int id;
    private String name;
    private String surname;
    private String wezipe;
    private String brithday;
    private String login;
    private String password;
    private String number;
    private double umumyAylyk;
    private String role;
    private String own_id;

    public Isgarler(int id, String name, String surname, String wezipe, String brithday, String login, String password, String number, double umumyAylyk, String role, String own_id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.wezipe = wezipe;
        this.brithday = brithday;
        this.login = login;
        this.password = password;
        this.number = number;
        this.umumyAylyk = umumyAylyk;
        this.role = role;
        this.own_id = own_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getWezipe() {
        return wezipe;
    }

    public void setWezipe(String wezipe) {
        this.wezipe = wezipe;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getUmumyAylyk() {
        return umumyAylyk;
    }

    public void setUmumyAylyk(double umumyAylyk) {
        this.umumyAylyk = umumyAylyk;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOwn_id() {
        return own_id;
    }

    public void setOwn_id(String own_id) {
        this.own_id = own_id;
    }
}
