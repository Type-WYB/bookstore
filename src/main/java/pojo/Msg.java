package pojo;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/2/15 13:35
 */
public class Msg {
    boolean is;
    //0：正确，1参数不全，2数据库处理错误，
    int code=0;
    String msg;

    public Msg(boolean is, String msg) {
        this.is = is;
        this.msg = msg;
    }

    public boolean isIs() {
        return is;
    }

    public void setIs(boolean is) {
        this.is = is;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
