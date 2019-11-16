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
public class human2 {
    private String ten="B";

    public String getTen() {
        return ten;
    }
    
     private int HP=3500;

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }
     
     private int DMG=400;

    public int getDMG() {
        return DMG;
    }
     
     private int Attack=5;

    public void Attack(human1 A) {
        A.setHP(A.getHP() - this.DMG);
    }
     
     public void show()
    {
        System.out.println("thong so hien tai cua B: HP="+HP);
    }
}
