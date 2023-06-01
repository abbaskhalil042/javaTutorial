class Human
{
   private int age;//this variable is bound in this class only.
   private String name;

   public int getAge()//instead of getAge we can write any other name.
   {
       return age;
   }

   public void setAge(int a)//instead of setAge we can write any other name.
   {
       age=a;
   }

    public void setName(String n)
    {
        name = n;
    }

    public String getName()
   {
       return name;
   }
}


public class encapsulation {
    public static void main(String[] args)
    {
        Human obj=new Human();
        obj.setAge(20);
        obj.setName("abbas");

        System.out.println(obj.getAge()+":"+ obj.getName());
    }
}
