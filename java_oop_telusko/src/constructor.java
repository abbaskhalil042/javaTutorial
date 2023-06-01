class Human2
{
    private int age2;
    private String name2;

    public Human2()//constructor.(Default constructor)
    {
//        System.out.println("in constructor");
        age2=30;
        name2="abbas";
    }

    public Human2(int a,String n)//parametric constructor
    {
        age2=a;
        name2=n;
    }
    public Human2(String n)//parametric constructor
    {
        this.age2=age2;
        name2=n;
    }



    public int getAge2() {
        return age2;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }


    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
}

public class constructor
{
    public static void main(String[] args)
    {
        Human2 obj=new Human2("khalil");//default constructor
        Human2 obj1=new Human2(20,"abbas");//parametric constructor.

        System.out.println(obj.getAge2()+":"+obj.getName2());
        System.out.println(obj1.getAge2()+":"+obj1.getName2());

//        obj.setAge2(20);
//        obj.setName2("abbas");
//        System.out.println(obj.getAge2()+":"+obj.getName2());

    }
}
