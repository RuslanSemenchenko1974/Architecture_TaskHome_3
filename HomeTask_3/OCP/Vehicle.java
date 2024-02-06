package OCP;
public class Vehicle {

    public int maxSpeed;
    public String type;
    public Vehicle(int maxSpeed, String type){
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
    public double calculateAllowedSpeed(){
        return maxSpeed;
    }
}