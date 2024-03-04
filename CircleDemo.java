 class CircleDemo {
    static int temp ;//class or static variable 
    private int x ;//instance 

    static{
        temp = 10;
    }
public static void display()
{
    System.out.println(temp);
   
}

public void display2()
{
    System.out.println(temp);
    System.out.println(x);
    display();
}
    public static void main(String[] args) {


    Circle c1 = new Circle();
    Circle c2 = new Circle(4);
    Circle c3 = new Circle(6, "yellow");
    
    display();
    
    
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

    System.out.println(c1.getArea());
    System.out.println(c2.getArea());
    System.out.println(c3.getArea());
    }
    
}
