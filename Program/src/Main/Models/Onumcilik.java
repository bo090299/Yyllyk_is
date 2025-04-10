package Main.Models;

import java.util.Date;

public class Onumcilik {
    private int id;
    private int onum_id;
    private String ady;
    private int kategoriya_id;
    private Double bahasy;
    private Date ondurilensenesi;
    private Date mohleti;
    private int umumymukdary;
    private Double nace_girdejilik_onum;

    public Onumcilik(int id, int onum_id, String ady, int kategoriya_id, Double bahasy, Date ondurilensenesi, Date mohleti, int umumymukdary, Double nace_girdejilik_onum) {
        this.id = id;
        this.onum_id = onum_id;
        this.ady = ady;
        this.kategoriya_id = kategoriya_id;
        this.bahasy = bahasy;
        this.ondurilensenesi = ondurilensenesi;
        this.mohleti = mohleti;
        this.umumymukdary = umumymukdary;
        this.nace_girdejilik_onum = nace_girdejilik_onum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOnum_id() {
        return onum_id;
    }

    public void setOnum_id(int onum_id) {
        this.onum_id = onum_id;
    }

    public String getAdy() {
        return ady;
    }

    public void setAdy(String ady) {
        this.ady = ady;
    }

    public int getKategoriya_id() {
        return kategoriya_id;
    }

    public void setKategoriya_id(int kategoriya_id) {
        this.kategoriya_id = kategoriya_id;
    }

    public Double getBahasy() {
        return bahasy;
    }

    public void setBahasy(Double bahasy) {
        this.bahasy = bahasy;
    }

    public Date getOndurilensenesi() {
        return ondurilensenesi;
    }

    public void setOndurilensenesi(Date ondurilensenesi) {
        this.ondurilensenesi = ondurilensenesi;
    }

    public Date getMohleti() {
        return mohleti;
    }

    public void setMohleti(Date mohleti) {
        this.mohleti = mohleti;
    }

    public int getUmumymukdary() {
        return umumymukdary;
    }

    public void setUmumymukdary(int umumymukdary) {
        this.umumymukdary = umumymukdary;
    }

    public Double getNace_girdejilik_onum() {
        return nace_girdejilik_onum;
    }

    public void setNace_girdejilik_onum(Double nace_girdejilik_onum) {
        this.nace_girdejilik_onum = nace_girdejilik_onum;
    }
}
