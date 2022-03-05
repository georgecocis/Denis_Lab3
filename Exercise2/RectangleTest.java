import java.util.ArrayList;
import java.util.List;

public class RectangleTest {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(10, 20, "blue");

        List<Rectangle> listOfRects = new ArrayList<>();
        listOfRects.add(rectangle);
        listOfRects.add(rectangle1);
        listOfRects.add(rectangle2);

        for (Rectangle rect : listOfRects){
            System.out.println(rect.getWidth());
            System.out.println(rect.getHeight());
            System.out.println(rect.getColor());
            System.out.println(rect.getPerimeter());
            System.out.println(rect.getArea());
            System.out.println("");
        }
    }
}
