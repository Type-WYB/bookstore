package pojo;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/1/13 16:54
 */
public class OrderItem {
    private int id;
    private int orderid;
    private String productname;
    private double listprice;
    private int qty;
    private double totalprice;

    public OrderItem(int orderid, String productname, double listprice, int qty, double totalprice) {
        this.orderid = orderid;
        this.productname = productname;
        this.listprice = listprice;
        this.qty = qty;
        this.totalprice = totalprice;
    }

    public OrderItem(String productname, double listprice, int qty, double totalprice) {
        this.productname = productname;
        this.listprice = listprice;
        this.qty = qty;
        this.totalprice = totalprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
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

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }
}
