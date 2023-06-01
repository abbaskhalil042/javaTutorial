public class string_buffer_and_builder {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("abbas ");
        System.out.println(s1.capacity());
        System.out.println(s1.length());
        s1.append("khalil ");
        System.out.println(s1);
        s1.deleteCharAt(3);
        System.out.println(s1);
        s1.insert(0,"java space");
        System.out.println(s1);
        s1.setLength(30);
        System.out.println(s1);
        s1.ensureCapacity(100);
        System.out.println(s1);

//        String str=s1.toString();

    }
}
