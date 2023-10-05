package ss6_OOP_Class_Object;

public class HinhTron {
    double radius;

    HinhTron(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double chuVi() {
        return radius * Math.PI * 2;
    }

    public double dienTich() {
        return (radius * radius) * Math.PI;
    }

    @Override
    public String toString() {
        return "radius: " + radius;
    }
}
