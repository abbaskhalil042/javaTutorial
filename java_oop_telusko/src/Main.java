
class cal{

    public int add(int num1, int num2){
        int resutl;
        resutl=num1+num2;
        return resutl;
    }
}

//second classs

class Computer{

    public void playmusic()
    {
        System.out.println("Music playing ......");
    }

    public String getMeapen(int cost)
    {
        if(cost>=10)
            return "pen";
        else
            return "nothing";

    }
}


//###############################//main class#####################

public class Main {
    public static void main(String[] args)
    {

        cal obj=new cal();
        System.out.println(obj.add(3,1));
//        System.out.println("Hello world!");

        Computer obj2=new Computer();
        obj2.playmusic();
        String result=obj2.getMeapen(10);
        System.out.println(result);
    }
}