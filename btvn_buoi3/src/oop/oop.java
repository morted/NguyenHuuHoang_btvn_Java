/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import dog.dog;
import java.util.Scanner;

/**
 *
 * @author Administrato
 */
public class oop {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        dog[]doglist=new dog[5];
//        dog meo=new dog();
//        System.out.println(meo.getHP());
//        meo.setName("hello");
//        System.out.println(meo.getName());
//        meo.Sua();
//        System.out.println(meo.getHP());
        for(int i=0;i<doglist.length;i++)
        {
            doglist[i]=new dog();
            doglist[i].setName("con cho"+i);
            System.out.println(doglist[i].getName());
        }
    }
    
}
