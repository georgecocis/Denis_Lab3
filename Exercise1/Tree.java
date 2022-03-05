public class Tree {
    private int height;

    public Tree(){
        this.height = 15;
    }

    public void grow(int meters){
        this.height += meters;
    }

    public String toString(){
        return String.valueOf(this.height);
    }
}
