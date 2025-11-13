// package Java_Object_Orientation.Interfaces.Interfaces_defination;

public class Main {
    public static void main(String[] args) {
        Clickable a = new Button();
        a.click();
        a.doubleClick();

        Clickable b=new CheckBox();
        b.click();
        b.doubleClick();
    }
}
