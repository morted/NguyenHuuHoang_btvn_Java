/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Administrato
 */
public class bai1 {
    public static void main(String[] args) {
        club[] sv= new club[10];
        String s="HIT";
        for(int i=0;i<5;i++)
        {
            sv[i]=new club();
            sv[i].input();
        }
        System.out.println("cac sv co ten HIT la: ");
        for(int i=0;i<5;i++)
        {
            if(sv[i].getTen().equals(s))
            {
                sv[i].output();
            }
        }
    }
}
