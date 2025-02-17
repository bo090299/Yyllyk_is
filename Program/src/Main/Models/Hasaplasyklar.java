package Main.Models;


public class Hasaplasyklar {
    private int id;
    private String name;
    private String surname;
    private String wezipe;
    private String ayy;
    private double aylygy;
    private double umumy_aylyk;
    private int islan_sagat;
    private int islemeli_sagat;

    public Hasaplasyklar(int id, String name, String surname, String wezipe, String ayy, double aylygy, double umumy_aylyk, int islan_sagat, int islemeli_sagat) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.wezipe = wezipe;
        this.ayy = ayy;
        this.aylygy = aylygy;
        this.umumy_aylyk = umumy_aylyk;
        this.islan_sagat = islan_sagat;
        this.islemeli_sagat = islemeli_sagat;
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

    public String getAyy() {
        return ayy;
    }

    public void setAyy(String ayy) {
        this.ayy = ayy;
    }

    public double getAylygy() {
        return aylygy;
    }

    public void setAylygy(double aylygy) {
        this.aylygy = aylygy;
    }

    public double getUmumy_aylyk() {
        return umumy_aylyk;
    }

    public void setUmumy_aylyk(double umumy_aylyk) {
        this.umumy_aylyk = umumy_aylyk;
    }

    public int getIslan_sagat() {
        return islan_sagat;
    }

    public void setIslan_sagat(int islan_sagat) {
        this.islan_sagat = islan_sagat;
    }

    public int getIslemeli_sagat() {
        return islemeli_sagat;
    }

    public void setIslemeli_sagat(int islemeli_sagat) {
        this.islemeli_sagat = islemeli_sagat;
    }
}
