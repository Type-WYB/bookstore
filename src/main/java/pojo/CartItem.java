package pojo;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/1/13 16:47
 */
public class CartItem {
    private int id;
    private int customerid;
    private int proudectid;
    private String prodectname;
    private double listprice;
    private int qty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getProudectid() {
        return proudectid;
    }

    public void setProudectid(int proudectid) {
        this.proudectid = proudectid;
    }

    public String getProdectname() {
        return prodectname;
    }

    public void setProdectname(String prodectname) {
        this.prodectname = prodectname;
    }

    public double getListprice() {
        return listprice;
    }

    public void setListprice(double listprice) {
        this.listprice = listprice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
