package Main.Models;

public class Kategoriya {
    private int tb;
    private int id;
    private String name;
    private String product_name;

    public Kategoriya(int tb, int id, String name, String product_name) {
        this.tb = tb;
        this.id = id;
        this.name = name;
        this.product_name = product_name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
}
