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
public class run_main {
    public static void main(String[] args) {
       Leader L=new Leader("LD",20,100);
       Support S=new Support("SP",19);
       Member [] M=new Member[10];
       M[0]=new Member("A",99,1);
       M[1]=new Member("B",98,2);
       M[2]=new Member("C",100,0);
       M[3]=new Member("D",100,0);
       M[4]=new Member("E",100,0);
       M[5]=new Member("F",99,1);
       M[6]=new Member("G",99,1);
       M[7]=new Member("H",98,2);
       M[8]=new Member("I",100,0);
       M[9]=new Member("J",98,2);
       club H=new club(L,S,M);
       H.show();
       
    }
}
