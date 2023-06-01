class Human1
{
  private int age1;//instance variable.
  private String name1;

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;//this keyword
//        Human1 obj1=obj;//without this keyword, parameter:- ,Human1 obj
//        obj1.age1=age1;
    }


    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }
}


public class this_keyword
{
    public static void main(String[] args)
    {
        Human1 obj=new Human1();
//        obj.setAge1(20,obj);// calling without this keyword.
        obj.setAge1(20);//calling with this keyword.
        obj.setName1("abbas");

        System.out.println(obj.getAge1()+":"+obj.getName1());

    }
}
