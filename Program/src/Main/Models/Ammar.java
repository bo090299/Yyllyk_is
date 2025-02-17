package Main.Models;

import java.sql.Date;
import java.sql.Timestamp;

public class Ammar {
    private int tb;
    private int product_id;
    private int category_id;
    private String product_name;
    private int sany;
    private Timestamp last_update;
    private Date incoming_date;

    public Ammar(int tb, int product_id, int category_id, String product_name, int sany, Timestamp last_update, Date incoming_date) {
        this.tb = tb;
        this.product_id = product_id;
        this.category_id = category_id;
        this.product_name = product_name;
        this.sany = sany;
        this.last_update = last_update;
        this.incoming_date = incoming_date;
    }

    public int getTb() {
        return tb;
    }

    public void setTb(int tb) {
        this.tb = tb;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getSany() {
        return sany;
    }

    public void setSany(int sany) {
        this.sany = sany;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }

    public Date getIncoming_date() {
        return incoming_date;
    }

    public void setIncoming_date(Date incoming_date) {
        this.incoming_date = incoming_date;
    }
}
