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
public class run_main {
    public static void main(String[] args) {
    Nhan_vien a=new Nhan_vien(1,"A","nhan vien");
    Nhan_vien b=new Nhan_vien(2,"B","truong phong");
    Nhan_vien c=new Nhan_vien(3,"C","giam doc");
    Nhan_vien d=new Nhan_vien(4,"D","chu tich");
    a.TinhLuong();
    a.HienThiThongTin();
     b.TinhLuong();
    b.HienThiThongTin();
     c.TinhLuong();
    c.HienThiThongTin();
     d.TinhLuong();
    d.HienThiThongTin();
    }
   
}
