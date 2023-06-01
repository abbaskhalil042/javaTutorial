class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }

    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
    public int multi(int n1,int n2)
    {
        return n1*n2;
    }

    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}



public class Inheritance
{
    public static void main(String[] args)
    {
        VeryAdvCalc obj=new VeryAdvCalc();//from another java file.
        int r=obj.add(2,1);
        int r2=obj.sub(21,12);
        int r3=obj.multi(2,4);
        int r4=obj.div(100,10);
        double r5=obj.power(4,2);

        System.out.println(r+" "+ r2+" "+ r3+" "+ r4+" "+r5);
    }
}
