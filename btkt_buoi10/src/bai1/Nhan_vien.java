/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Administrato
 */
public class Nhan_vien {
    private int MNV;
    private String tenNV;
    private String Chuc_vu;
    int luong;

    public int getMNV() {
        return MNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public String getChuc_vu() {
        return Chuc_vu;
    }

    public int getLuong() {
        return luong;
    }
    
    public void setMNV(int MNV) {
        this.MNV = MNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setChuc_vu(String Chuc_vu) {
        this.Chuc_vu = Chuc_vu;
    }
    public Nhan_vien(int MNV, String tenNV, String Chuc_vu) {
        this.MNV = MNV;
        this.tenNV = tenNV;
        this.Chuc_vu = Chuc_vu;
    }
    public void HienThiThongTin()
    {
        System.out.println("Ma nv: "+MNV+"  ten NV: "+tenNV+"   Chuc vu: "+Chuc_vu+"    luong: "+luong);
    }
    public void TinhLuong()
    {
        if(Chuc_vu=="nhan vien")
        {
            this.luong=5000000;
        }
        else if(Chuc_vu=="truong phong")
        {
            this.luong=8000000;
        }
        else if(Chuc_vu=="giam doc")
        {
            this.luong=10000000;
        }
        else
            this.luong=0;
    }
}
