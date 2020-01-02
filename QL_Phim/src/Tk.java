
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrato
 */
public class Tk extends User {
    private ArrayList <User> Tk;
    Scanner sc=new Scanner (System.in);
    public Tk(String id, String pass, String ten, int maso,String sdt) {
        super(id, pass, ten, maso,sdt);
    }
    void them_TK(User A)
    {
        
    }
    int TimKiemID(String id)
    {
        int size = Tk.size();
        for(int i=0;i<size;i++)
            if(Tk.get(i).getId()==id)
                return 1;
        return 0;
    }
    void HienThiThongTin(String id)
    {
        int size = Tk.size();
        for(int i=0;i<size;i++)
             System.out.println("Xin chao:"+Tk.get(i).getId()+"\nmaso:"+Tk.get(i).getMaso()+"\nten:"+Tk.get(i).getTen());
    }
    void SuaThongTin(int i)
    {
        int op;
        do
       {
            System.out.println("========Thay doi thong tin=========");
            System.out.println("|1.doi pass........................|");
            System.out.println("|2.doi ten.........................|");
            System.out.println("|3.doi sdt.........................|");
            System.out.println("|4.exit............................|");
            System.out.println("|==================================");
        
            System.out.print("hay nhap op cua ban: ");
           op=sc.nextInt();
            switch(op)
            {
                case 1:{
                    System.out.println("Hay nhap lai pass cu cua ban");
                        String kt=sc.nextLine();
                     if(Tk.get(i).getPass().equals(kt))
                     {
                         System.out.println("Nhap pass moi: ");
                            Tk.get(i).pass=sc.nextLine();
                     }
                     else   
                         System.out.println("ban da nhap sai pass");
                    break;
                }
                case 2:{
                    System.out.println("Nhap ten moi: ");
                        Tk.get(i).ten=sc.nextLine();
                    break;
                }
                case 3:{
                    System.out.println("Nhap sdt moi: ");
                        Tk.get(i).sdt=sc.nextLine();
                }
                case 4:{
                    System.out.println("exit: ");
                    break;
                }
            }
        }
       while(op!=4);
    }
    void XoaThongTin(String id)
    {
        int size = Tk.size();
        for(int i=0;i<size;i++)
            if(Tk.get(i).getId()==id)
                Tk.remove(i);
    }
    void XemThongTin(String id)
    {
        int size = Tk.size();
        for(int i=0;i<size;i++)
            if(Tk.get(i).getId()==id)
            {
                System.out.println("");
            }
    }
}
