package LSB;

public class Square extends QuodRangel {
    int len;
    public Square(int len){
        this.len = len;
    }
    @Override
    int area() {
       return len * len;
    }

}
