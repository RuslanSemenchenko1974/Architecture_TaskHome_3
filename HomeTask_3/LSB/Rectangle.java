package LSB;

public class Rectangle extends QuodRangel{
    public int width;
    public int height;
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    int area() {
       return width * height;
    }
    
}
