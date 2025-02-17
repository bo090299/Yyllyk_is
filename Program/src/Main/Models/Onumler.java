package Main.Models;

public class Onumler {

    private int tb;
    private int id;
    private int category_id;
    private String name;
    private Double bahasy;
    private String info;

    public Onumler(int tb, int id, int category_id, String name, Double bahasy, String info) {
        this.tb = tb;
        this.id = id;
        this.category_id = category_id;
        this.name = name;
        this.bahasy = bahasy;
        this.info = info;
    }

    public int getTb() {
        return tb;
    }

    public void setTb(int tb) {
        this.tb = tb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBahasy() {
        return bahasy;
    }

    public void setBahasy(Double bahasy) {
        this.bahasy = bahasy;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}