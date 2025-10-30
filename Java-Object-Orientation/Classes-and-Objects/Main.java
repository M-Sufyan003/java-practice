public class Main {
    public static void main(String[] args) {
        Student std1=new Student(8791);
        
        int rollNumber=std1.getRollNumber();
        String firstName="Muhammad";
        String lastName="Sufyan";

        std1.setFirstName(firstName);
        std1.setLastName(lastName);
        System.out.println("Your Roll Number is:"+std1.getRollNumber());
        System.out.println("Your First Name is:"+std1.getFirstName());
        System.out.println("Your lastname is:"+std1.getLastName());

    }
}
