package ISP;

public class Cube implements Shape3d {
    int len;

    public Cube(int len) {
        this.len = len;
    }

    @Override
    public double perimetr() {
        return len
                * 12;
    }    

    @Override
    public double value() {
        return len*len*len;
    }

}
