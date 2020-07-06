
package cn.jdbc.bean;


/**
 * @author:ZouJun
 * @version：1.0
 * @Date: 2020-07-01 22:37
 * @description: [一句话描述改类的功能]
 * @company:厦门市
 **/

public class Account {
    private int id;
    private String name;
    private String money;

    public Account() {
    }

    public Account(int id, String name, String money) {
        this.id = id;
        this.name = name;
        this.money = money;
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

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }


}

