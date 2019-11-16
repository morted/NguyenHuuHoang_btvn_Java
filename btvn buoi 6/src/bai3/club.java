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
public class club {
    private Leader A;
    private Support B;
    private Member [] C=new Member[10];
    public club(Leader L, Support S, Member[] M) {
		A = L;
		B = S;
		C = M;
	}
    public void show()
    {
        A.showl();
        B.shows();
        System.out.println("danh sach thanh vien trong clb");
            for(int i=0;i<10;i++)
                C[i].showm();
    }
    
    
}
