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
public class BattleField {
    public static void main(String[] args) {
        human1 N1=new human1();
        human2 N2=new human2();
        for(int i=1;i<=5;i++)
        {
            System.out.println("lan danh thu "+i);
            if(N2.getAttack()>=i)
                N1.setHP(N1.getHP()-N2.getDMG());
            if(N1.getAttack()>=i)
                N2.setHP(N2.getHP()-N1.getDMG());
            N1.show();
            N2.show();
            
        }
        if(N1.getHP()>N2.getHP())
            System.out.println(N1.getTen()+" da chien thang "+N2.getTen());
        else
            if(N1.getHP()<N2.getHP())
                System.out.println(N1.getTen()+" da thua "+N2.getTen());
            else
                System.out.println(" hoa ");
    }
}
