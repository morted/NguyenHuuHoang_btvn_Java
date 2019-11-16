/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author Administrato
 */
public class human1 {
    private String ten;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    
     private int HP=5000;

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }
    
     private int DMG=200;

    public int getDMG() {
        return DMG;
    }
     
    public void Attack(human1 A) {
        A.setHP(A.getHP() - this.DMG);
    }
     
    public void show()
    {
        System.out.println(ten + " ,HP="+HP);
    }
}
