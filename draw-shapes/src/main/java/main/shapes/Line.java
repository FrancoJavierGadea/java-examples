package main.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Line implements Shape {

    private int x1 = 0;
    private int y1 = 0;
    private int x2 = 100;
    private int y2 = 100;
    private String color = "#ffffff";
    private float lineWidth = 1;

    public Line(){}

    public Line start(int x1, int y1){

        this.x1 = x1;
        this.y1 = y1;
        return this;
    }
    public Line end(int x2, int y2){

        this.x2 = x2;
        this.y2 = y2;
        return this;
    }
    public Line color(String color){

        this.color = color;
        return this;
    }
    public Line lineWidth(float lineWidth){

        this.lineWidth = lineWidth;
        return this;
    }
    
    @Override
    public void draw(Graphics2D ctx) {
        
        ctx.setColor(Color.decode(color));
        ctx.setStroke(new BasicStroke(lineWidth));

        ctx.drawLine(x1, y1, x2, y2);
    }
}
