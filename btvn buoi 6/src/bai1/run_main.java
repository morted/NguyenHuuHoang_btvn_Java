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
public class run_main {
    public static void main(String[] args) {
        con_heo H1=new con_heo();
        con_heo H2=new con_heo("heo2");
        con_heo H3=new con_heo(18);
        con_heo H4=new con_heo("heo4",19);
        con_heo H5=new con_heo("heo5",19,"58kg");
        H1.show();
        H2.show();
        H3.show();
        H4.show();
        H5.show();
    }
}
