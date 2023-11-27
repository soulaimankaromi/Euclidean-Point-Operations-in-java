public class mainP {
    public static void main(String[] args) {
        Point point1 = new Point(10, 21);
        System.out.println("The distance is: " + point1.distance(point1));
        System.out.println("The norm is: " + point1.norm());
    }
}