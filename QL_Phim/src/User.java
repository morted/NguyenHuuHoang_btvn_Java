
import java.util.Random;
import java.util.Scanner;

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
    protected String id;
    protected String pass;
    protected String ten;
    private int maso;
    protected String sdt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
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
    Scanner sc=new Scanner (System.in);
    Random rd = new Random();
    public void Inputinfo()
    {
        System.out.println("Hay nhap id cua ban: ");
        id=sc.nextLine();
        sc.nextLine();
        System.out.println("Hay nhap pass cua ban: ");
        pass=sc.nextLine();
        sc.nextLine();
        System.out.println("hay nhap ten cua ban: ");
        ten= sc.nextLine();
        sc.nextLine();
        System.out.println("hay nhap sdt cua ban: ");
        sdt=sc.nextLine();
        maso=rd.nextInt(1000);
    }

    void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
