public class TreeTest {
    public static void main(String[] args){
        Tree tree = new Tree();

        int growingMeters = 10;

        System.out.println("Initial tree height: " + tree.toString());

        tree.grow(growingMeters);

        System.out.println("Height after growing " + growingMeters + " meters: " + tree.toString());
    }
}
