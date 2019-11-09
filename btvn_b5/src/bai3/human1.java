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
    private String ten="A";

    public String getTen() {
        return ten;
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
     
     private int Attack=4;

    public int getAttack() {
        return Attack;
    }
     
    public void show()
    {
        System.out.println("thong so hien tai cua A: HP="+HP);
    }
}
