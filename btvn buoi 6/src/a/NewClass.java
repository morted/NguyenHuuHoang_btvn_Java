/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

/**
 *
 * @author Administrato
 */
public class NewClass {

    
    int test;
    void tinh(NewClass op)
    {
        op.test=test+1;
    }
    public static void main(String[] args) {
        NewClass t=new NewClass();
        t.tinh(t);
        
    }
    
}
