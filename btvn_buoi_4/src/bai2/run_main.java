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
public class run_main {
    public static void main(String[] args) {
        class_dog person=new class_dog();
        person.InputName();
        person.ShowMP();
        for(int i=0;i<3;i++)
        {
            person.Bark ();
            person.ShowMP();
        }
    }
}
