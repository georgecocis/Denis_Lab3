public class Rectangle {
    private int height;
    private int width;
    private String color;

    public Rectangle(){
        this.height = 2;
        this.width = 1;
        this.color = "red";
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getHeight(){
        return this.height;
    }

    public int getWidth(){
        return this.width;
    }

    public String getColor(){
        return this.color;
    }

    public int getPerimeter(){
        return 2 * (this.width + this.height);
    }

    public int getArea(){
        return (this.width * this.height);
    }
}
