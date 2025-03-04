/*import java.awt.*;
class FlowLayoutEx{
    public static void main(String a[])
    {
        Frame f = new Frame("FlowLayoutex");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        FlowLayout f1 = new FlowLayout(2);
        f.setLayout(f1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setSize(300.300);
        f.setVisible(true);
    }
}*/


/*import java.util.*;
class Test{
    public static void main(String a[]){
        ArrayList i = new ArrayList();
        i.add("apple");
        i.add("20.5f");
        i.add("20.3");
        i.add("10");
        i.add("null");
        Iterator a1 = i.iterator();
        System.out.println("ArrayList:");
        while(a1.hasNext());
        System.out.println(a1.next());
    }
}*/


/*import java.awt.*;
class ListExample{
    public static void main(String a[])
    {
        Frame f =  new Frame("listexample");
        f.setLayout(null);
        List l1 =new List();
        l1.add("c++");
        l1.add("java");
        l1.add("mad");
        l1.add("lr");
        l1.add("maths");
        l1.setBounds(100,100,80,80);
        f.add(l1);
        f.setSize(400,400);
        f.setVisible(true);

    }
}*/

/*import java.awt.*;
class GridLayout{
    public static void main(String a[])
    {
        Frame f = new Frame();
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        GridLayout g1 = new GRIDlAYOUT(3,3);
        f.setLayout(g1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
       f.setSize(300,300);
       f.setVisible(true);
    }
}*/


import java.awt.*;
class RegistrationForm
{
    public static void main(String[] args)
    {
        Frame f=new Frame("Registration Form");
        f.setLayout(null);
        f.setSize(400,300);
        f.setVisible(true);
        f.setBackground(Color.orange);
        Label l1=new Label("Student ID");
        l1.setBounds(50,100,80,30);
        f.add(l1);
        Label l2=new Label("Student Password");
        l2.setBounds(50,150,80,30);
        f.add(l2);
        Label l3=new Label("Retype Password");
        l3.setBounds(50,200,120,30);
        f.add(l3);
        Label l4=new Label("Student Name");
        l4.setBounds(50,250,80,30);
        f.add(l4);
        Label l5=new Label("Student MobileNo");
        l5.setBounds(50,300,80,30);
        f.add(l5);
        Label l6=new Label("Student EmailID");
        l6.setBounds(50,350,80,30);
        f.add(l6);
        TextField t1=new TextField();
        t1.setBounds(150,100,150,30);
        f.add(t1);
        TextField t2=new TextField();
        t2.setBounds(150,150,150,30);
        t2.setEchoChar('@');
        f.add(t2);
        TextField t3=new TextField(10);
        t3.setBounds(150,200,150,30);
        t3.setEchoChar('@');
        f.add(t3);
        TextField t4=new TextField();
        t4.setBounds(150,250,150,30);
        f.add(t4);
        TextField t5=new TextField();
        t5.setBounds(150,300,150,30);
        f.add(t5);
        TextField t6=new TextField();
        t6.setBounds(150,350,150,30);
        f.add(t6);
       Button b=new Button("Regiration");
       b.setBounds(150,400,80,30);
       f.add(b);
    }
}