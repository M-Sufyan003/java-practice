public class StringTest
{
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3=s1;
        String s4= new String("Hello");
        String s5=new String("Hello");

       System.out.println(s1==s1);
       System.out.println(s1==s2);
       System.out.println(s1==s3);
       System.out.println(s1.equals(s3));
       System.out.println(s1==s4);
       System.out.println(s1.equals(s4));
       System.out.println(s4==s5);
       System.out.println(s4.equals(s5));
    }
}