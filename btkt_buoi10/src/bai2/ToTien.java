/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Administrato
 */
public class ToTien {
    private String MA;
    private String loai;

    public ToTien(String MA, String loai) {
        this.MA = MA;
        this.loai = loai;
    }

    public String getMA() {
        return MA;
    }

    public String getLoai() {
        return loai;
    }

    public void setMA(String MA) {
        this.MA = MA;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    public void HienThiThongTin()
    {
        System.out.println("Ma to tien: "+MA+"      loai tien:"+loai);
    }
}
