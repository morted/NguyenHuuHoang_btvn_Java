
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrato
 */
public class NewClass {
    public static void main(String[] args) {
        Random rd = new Random();
    String [] name_m=new ;
    int [] songayhd;
    int [] songaynghi;
        for(int i=0;i<10;i++)
        {
            name_m[i]="A"+i;
            songayhd[i]=100+i;
            songaynghi[i]=rd.nextInt(3);
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("ten thanh vien: "+name_m[i]+"   so ngay hoat dong: "+songayhd[i]+"      so ngay nghi:"+songaynghi[i]);
        }
    }
    }
}
