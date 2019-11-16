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
public class con_heo {
    String name;
    String weight;
    int age;

    public con_heo()
    {
        this.name="heo1";
        this.weight="50kg";
        this.age=16;
    }
    public con_heo(String name)
    {
        this.name=name;
        this.weight="51kg";
        this.age=17;
    }
    public con_heo(int age)
    {
        this.name="heo3";
        this.weight="52kg";
        this.age=age;
    }
    public con_heo(String name, int age)
    {
        this.name=name;
        this.weight="53kg";
        this.age=age;
    }
    public con_heo(String name, int age, String weight)
    {
        this.name=name;
        this.weight=weight;
        this.age=age;
    }
    public void show()
    {
        System.out.println("name: "+name+"      weight: "+weight+"      age: "+age);
    }
}
