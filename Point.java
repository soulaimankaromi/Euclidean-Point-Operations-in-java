public class Point {
    private float x; // x-coordinate of the point
    private float y; // y-coordinate of the point
    Point() {
        x = 0;
        y = 0;
    }
    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    // Setter method to set the x-coordinate of the point
    public void setX(float x) {
        this.x = x;
    }
    // Setter method to set the y-coordinate of the point
    public void setY(float y) {
        this.y = y;
    }
    public float distance(Point point1) {
        float d = (float) Math.sqrt(Math.pow((point1.getX() - this.getX()), 2) + Math.pow((point1.getY() - this.getY()), 2));
        return d;
    }
    public float norm() {
        float n = (float) Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2));
        return n;
    }
}