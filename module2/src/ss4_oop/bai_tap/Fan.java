package ss4_oop.bai_tap;

public class Fan {
    final int SLOW = 1; // final là khai báo hằng số
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "blue";


    public Fan(){
    }
    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString (){
        if (isOn()){
            System.out.println("The speed is"+getSpeed()+"\n"+"The color is"+getColor()+"The radius is"+getRadius()+"the fan is on");
        }else {
            System.out.println("The speed is"+getSpeed()+"\n"+"The color is"+getColor()+"The radius is"+getRadius()+"the fan is off");
        }
    }
    public static void main(String[] args) {

    }
}

