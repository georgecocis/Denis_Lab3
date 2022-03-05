public class MyPoint {
    int x;
    int y;
    int z;

    public MyPoint(){
        this.x = this.y = this.z = 0;
    }

    public MyPoint(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString(){
        return "[" + x + " " + y + " " + z + "]";
    }

    public double distance(int x, int y, int z){
        return Math.sqrt(Math.pow(this.x - x, 2)
            + Math.pow(this.y - y, 2)
            + Math.pow(this.z - z, 2));
    }

    public double distance (MyPoint myPoint){
        return Math.sqrt(Math.pow(this.x - myPoint.getX(), 2)
                + Math.pow(this.y - myPoint.getY(), 2)
                + Math.pow(this.z - myPoint.getZ(), 2));
    }
}
