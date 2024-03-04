public class test {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(5, 5);
        MyPoint p2 = new MyPoint(5, 5);

        System.out.println(p1);

        System.out.println(p1.distance(p2));
        System.out.println(p1.distance());

    }
}
