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
public class bai2 {
    public static void main(String[] args) {
        Knight H1=new Knight();
        System.out.println("hiep si "+H1.getTen()+"co thong so ban dau la: ");
        System.out.println("HP="+H1.getHP()+"   MP="+H1.getMP());
        for(int i=1;i<5;i++)
        {
            if(H1.getMP()<50)
            {
                System.out.println("hiep si ko du mp de su dung ki nang nua");
                break;
            }
            System.out.println("hiep si su dung ki nang lan "+i);
            H1.Heal();
            H1.show();
        }
    }
}
