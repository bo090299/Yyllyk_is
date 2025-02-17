package Main.Models;

public class Wezipeler {
    private int id;
    private String name;
    private String surname;
    private String wezipesi;
    private double aylygy;

    public Wezipeler(int id, String name, String surname, String wezipesi, double aylygy) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.wezipesi = wezipesi;
        this.aylygy = aylygy;
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

    public String getWezipesi() {
        return wezipesi;
    }

    public void setWezipesi(String wezipesi) {
        this.wezipesi = wezipesi;
    }

    public double getAylygy() {
        return aylygy;
    }

    public void setAylygy(double aylygy) {
        this.aylygy = aylygy;
    }
}
