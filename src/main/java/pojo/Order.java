package pojo;



public class Order {
    private int oid;
    private User user;
    private String rece_adder;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRece_adder() {
        return rece_adder;
    }

    public void setRece_adder(String rece_adder) {
        this.rece_adder = rece_adder;
    }
}
