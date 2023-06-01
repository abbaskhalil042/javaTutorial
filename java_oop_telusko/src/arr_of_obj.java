class Student{
    int rollno;
    String name;
    int marks;

}

public class arr_of_obj
{
    public static void main(String[] args) {

        Student s1=new Student();
        s1.rollno=1;
        s1.name="Abbas";
        s1.marks=90;

        Student s2=new Student();
        s2.rollno=2;
        s2.name="Waseem";
        s2.marks=95;

        Student s3=new Student();
        s3.rollno=3;
        s3.name="Ashfaque";
        s3.marks=88;




        Student students[]=new Student[3];//in order to work with this you need above things to work with.
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;


        for (Student n:students)//for each loop
        {
            System.out.println(n.name+":"+ n.marks);
        }


        for (int i=0;i<students.length;i++)//normal for loop
        {
            System.out.println(students[i].name+":"+students[i].marks);
        }
//
//        int num[]=new int [4];
//        num[0]=2;
//        num[1]=22;
//        num[2]=24;
//        num[3]=3;
//
//        for (int i=0;i<num.length;i++)
//        {
//            System.out.println(num[i]);
//        }


    }
}
