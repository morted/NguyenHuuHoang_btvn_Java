package common;

public class SinhVien {
    private String name;
    private int age;

//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    
    public void ShowInfo()
    {
        System.out.println("Ten: " + name + " ,tuoi: " + age);
    }
    
    public void ShowInfo(String Gt)
    {
        System.out.println("Ten: " + name + " ,tuoi: " + age + " ,gioi tinh;" +Gt);
    }
    
    public void ShowInfo(int a)
    {
        System.out.println(a);
    }
    
    public SinhVien()
    {
        
    }
    
    public SinhVien(int age)
    {
        this.age = age;
    }
    
    public SinhVien(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    
}
