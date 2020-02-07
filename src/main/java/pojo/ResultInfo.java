package pojo;

public class ResultInfo {
    private int code;
    private String msg;
    private String page;
    private Object data;

    public ResultInfo(int code, String msg, String page) {
        this.code = code;
        this.msg = msg;
        this.page = page;
    }

    public ResultInfo(int code, String msg, String page, Object data) {
        this.code = code;
        this.msg = msg;
        this.page = page;
        this.data = data;
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

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
