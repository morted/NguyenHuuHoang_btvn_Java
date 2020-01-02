/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrato
 */
public abstract class User {
    private String id;
    protected String pass;
    protected String ten;
    private int maso;
    protected String sdt;

    public String getId() {
        return id;
    }
    
    public String getPass() {
        return pass;
    }


    public int getMaso() {
        return maso;
    }

    
    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }
    
    public User(String id, String pass, String ten, int maso,String sdt) {
        this.id = id;
        this.pass = pass;
        this.ten = ten;
        this.maso = maso;
        this.sdt=sdt;
    }
    
}
