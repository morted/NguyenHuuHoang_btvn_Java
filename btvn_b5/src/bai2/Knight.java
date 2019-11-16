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
public class Knight {
     private String ten="abadon";
     private int HP=100;
     private int MP=100;

    public String getTen() {
        return ten;
    }
    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }
     
     public void Heal()
     {
         if (this.MP>=50)
         {
             System.out.println("su dung hoi mau");
              MP-=50;
              HP+=30;
         }
         else
         {
             System.out.println("het mp");
         }
        
     }
     
     public void show()
     {
         System.out.println("trang thai hien tai: HP="+HP+"     MP="+MP);
     }
}
