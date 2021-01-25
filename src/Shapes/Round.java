package Shapes;

public class Round extends Shape {
    private Double radius;
    private Double length;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Round(Double radius) {
        this.radius = radius;
    }

    public Double calculateArea(){
        this.area = 2 * 3.14 * (this.radius * this.radius);
        return this.area;
    }

}
