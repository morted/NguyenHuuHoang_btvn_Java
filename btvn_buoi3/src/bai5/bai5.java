/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.math.BigInteger;
import java.util.Scanner;

/**1000000000000000000000000000000000000000000000000000000
 *
 * @author Administrato
 */
public class bai5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BigInteger a,b;
        System.out.println("nhap vao a: ");
        a=sc.nextBigInteger();
        System.out.println("nhap vao b: ");
        b=sc.nextBigInteger();
        System.out.println("KQ a+b="+a.add(b));
    }
}
