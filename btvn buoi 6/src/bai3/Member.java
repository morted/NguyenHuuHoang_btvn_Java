/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Random;


/**
 *
 * @author Administrato
 */
public class Member {
    Random rd = new Random();
    private String name_m;
    private int songayhd;
    private int songaynghi;

    public Member(String name_m, int songayhd, int songaynghi) {
        this.name_m = name_m;
        this.songayhd = songayhd;
        this.songaynghi = songaynghi;
    }
    
    public void showm(){    
            System.out.println("ten thanh vien: "+name_m+"   so ngay hoat dong: "+songayhd+"      so ngay nghi:"+songaynghi);
    }
}
