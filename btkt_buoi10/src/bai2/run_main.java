/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Administrato
 */
public class run_main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ToTien [] ToThu=new ToTien[10];
       ToThu[0] = new ToTien("M110A634ABG","1k");
       ToThu[1] = new ToTien("M3255LINH45","1k");
       ToThu[2] = new ToTien("M3HIEU2AS34","1k");

        ToThu[3] = new ToTien("U13HTS34E","2k");
        ToThu[4] = new ToTien("982TUXP21","2k");
        ToThu[5] = new ToTien("38HIT7734","2k");

        ToThu[6] = new ToTien("65GSONGNGHIEN2","5k");
        ToThu[7] = new ToTien("G3C5WHZ3FDE324","5k");
        ToThu[8] = new ToTien("H34ITHUTS25551","5k");

        ToThu[9] = new ToTien("C7H10OTHAI13","10k");
        String [] ten=new String[6];
        ten[0]="SON";
        ten[1]="TU";
        ten[2]="THU";
        ten[3]="LINH";
        ten[4]="THAI";
        ten[5]="HIEU";
        System.out.println("Cac to co chua cac tu: [\"SON\",\"TU\",\"THU\",\"LINH\",\"THAI\",\"HIEU\"]");
        for(int i=0;i<10;i++)
        {
           for(int j=0;j<6;j++)
           {
               if(ToThu[i].getMA().indexOf(ten[j])!=(-1))
                   ToThu[i].HienThiThongTin();
           }
        }
        System.out.println("");
        System.out.println("Cac to co tong cac chu so trong ma chia het cho laoi tien: ");
        for(int i=0;i<10;i++)
        {
            int S=0;
            for(int j=0;j<ToThu[i].getMA().length();j++)
            {
                if(ToThu[i].getMA().charAt(j)>57||ToThu[i].getMA().charAt(j)<48)
                    continue;
                else
                S=ToThu[i].getMA().charAt(j)-'0'+S;
            }
           if(S%(ToThu[i].getLoai().charAt(0)-'0')==0) 
               ToThu[i].HienThiThongTin();
        }
        System.out.println("");
//        int k;
//        System.out.print("nhap vao k: ");
//        k=sc.nextInt();
//        System.out.println("so to tien TM de bai la: ");
//        while(int kt)
//        for(int i=0;i<10;i++)
//        {
//            int S=0;
//            for(int j=0;j<ToThu[i].getMA().length();j++)
//            {
//                if(ToThu[i].getMA().charAt(j)>57||ToThu[i].getMA().charAt(j)<48)
//                    continue;
//                else
//                S=ToThu[i].getMA().charAt(j)-'0'+S;
//            }
//           if(S%2==0) 
//           {
//               
//           }
//        }
    }
}
