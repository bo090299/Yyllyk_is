package Main.Models;

public class Tutumlar {
    private int id;
    private String isgar_ady;
    private String isgar_familiyasy;
    private String wezipesi;
    private String ady;
    private String bahasy;

    public Tutumlar(int id, String isgar_ady, String isgar_familiyasy, String wezipesi, String ady, String bahasy) {
        this.id = id;
        this.isgar_ady = isgar_ady;
        this.isgar_familiyasy = isgar_familiyasy;
        this.wezipesi = wezipesi;
        this.ady = ady;
        this.bahasy = bahasy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsgar_ady() {
        return isgar_ady;
    }

    public void setIsgar_ady(String isgar_ady) {
        this.isgar_ady = isgar_ady;
    }

    public String getIsgar_familiyasy() {
        return isgar_familiyasy;
    }

    public void setIsgar_familiyasy(String isgar_familiyasy) {
        this.isgar_familiyasy = isgar_familiyasy;
    }

    public String getWezipesi() {
        return wezipesi;
    }

    public void setWezipesi(String wezipesi) {
        this.wezipesi = wezipesi;
    }

    public String getAdy() {
        return ady;
    }

    public void setAdy(String ady) {
        this.ady = ady;
    }

    public String getBahasy() {
        return bahasy;
    }

    public void setBahasy(String bahasy) {
        this.bahasy = bahasy;
    }
}
