/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Administrato
 */
public class run_main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner (System.in);
        may_tinh casio= new may_tinh();
        float A,B,C;
        float [] a= new float[100];
        int op;
        do{
            System.out.println("\t================menu================");
            System.out.println("\t| 1.tinh tong hai so...............|");
            System.out.println("\t| 2.tinh tong 3 so.................|");
            System.out.println("\t| 3.tinh tong nhieu so.............|");
            System.out.println("\t| 4.exit...........................|");
            System.out.println("\t====================================");
            
            System.out.print("hay nhap op cua ban: ");
            op=sc.nextInt();
            switch(op)
            {
                case 1: {
                    System.out.print("nhap vao A: "); A=sc.nextFloat();
                    System.out.print("nhap vao B: "); B=sc.nextFloat();
                    System.out.println("tong cua "+A+" va "+B+" la :"+casio.TinhTong(A, B));
                    break;
                }
                case 2: {
                    System.out.print("nhap vao A: "); A=sc.nextFloat();
                    System.out.print("nhap vao B: "); B=sc.nextFloat();
                    System.out.print("nhap vao C: "); C=sc.nextFloat();
                    System.out.println("tong cua "+A+", "+B+" va "+C+" la :"+casio.TinhTong(A, B, C));
                    break;
                }
                case 3: {
                    System.out.println("KQ="+casio.TinhTong(a));
                    break;
                }
                case 4: {
                    System.out.println("tam biet");
                    break;
                }
                default: System.out.println("xem lai menu");
            }
        }
        while(op!=4);
    }
}
