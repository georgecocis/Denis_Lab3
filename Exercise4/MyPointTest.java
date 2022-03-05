public class MyPointTest {
    public static void main (String[] args){
        MyPoint point1 = new MyPoint(1, 2, 3);
        MyPoint point2 = new MyPoint(2, 3, 4);

        System.out.println("Distance from point1 to {1, 2, 3} is: " + point1.distance(1, 2, 3));

        System.out.println("Distance from point1 to {2, 3, 4} is: " + point1.distance(2, 3,4));

        System.out.println("Distance from point1 to point2 is: " + point1.distance(point2));
    }
}
