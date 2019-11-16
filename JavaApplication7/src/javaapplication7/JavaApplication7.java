/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import common.SinhVien;

/**
 *
 * @author Administrato
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVien A = new SinhVien();
        SinhVien B = new SinhVien(13);
        SinhVien C = new SinhVien("Toan", -1);
        A.ShowInfo();
        A.ShowInfo("luong tinh");
        A.ShowInfo(5);
    }

}
