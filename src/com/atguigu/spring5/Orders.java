package com.atguigu.spring5;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/6/28 7:27
 */
public class Orders {
    private String oname;
    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void orderTest(){
        System.out.println(oname+"::"+address);
    }
}
