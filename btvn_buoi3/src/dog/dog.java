/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author Administrato
 */
public class dog {
    private int HP=100;// bao mat
    public String name;//cong khai

    public int getHP() {
        return HP;
    }

    public String getName() {
        return name;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void Sua()
    {
        System.out.println("sua gg");
        HP-=1;
    }
}
