package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

    private Double width;
    private Double height;

    public Rectangle() {
        super();
    }

    public Rectangle(Double width, Double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    
    @Override
    public Double area() {
        return width * height;
    }
}
