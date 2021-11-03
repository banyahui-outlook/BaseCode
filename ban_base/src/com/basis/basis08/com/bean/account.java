package com.bean;

/**
 * @Creater banyahui
 * @Date 2019/12/01 上午 11:21
 * @Description
 */
public class account {
    private Integer id;
    private Integer userid;
    private String anum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAnum() {
        return anum;
    }

    public void setAnum(String anum) {
        this.anum = anum;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    private Double money;

    @Override
    public String toString() {
        return "account{" +
                "id=" + id +
                ", userid=" + userid +
                ", anum='" + anum + '\'' +
                ", money=" + money +
                '}';
    }
}
