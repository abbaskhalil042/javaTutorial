class claculator
{
    int num=5;//INSTANCE VARIABLE
   public int add(int n1,int n2)
   {
       System.out.println(num);
       return n1+n2;
   }
//    public int add(int n1,int n2)
//    {
//        return n1+n2;
//    }
//    public double add(double n1,int n2)
//    {
//        return n1+n2;
//    }

}


//###################//main class ##################
public class method_overloading {
    public static void main(String[] args)
    {
        claculator obj=new claculator();
        claculator obj1=new claculator();

        obj.num=8;//i have changed the instance variable for obj.
        System.out.println(obj.num);
        System.out.println(obj1.num);
//        int r1=obj.add(12,42);
//        System.out.println(r1);
    }
}
