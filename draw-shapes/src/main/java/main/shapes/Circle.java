package main.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Circle implements Shape {

    private int cx = 0;
    private int cy = 0;
    private int radius = 50;
    private boolean fill = false;
    private String color = "#ffffff";
    private float lineWidth = 1;

    public Circle(){}


    public Circle cx(int cx){

        this.cx = cx;
        return this;
    }
    public Circle cy(int cy){

        this.cy = cy;
        return this;
    }
    public Circle radius(int radius){

        this.radius = radius;
        return this;
    }
    public Circle fill(boolean fill){

        this.fill = fill;
        return this;
    }
    public Circle color(String color){
        
        this.color = color;
        return this;
    }
    public Circle lineWidth(float lineWidth){

        this.lineWidth = lineWidth;
        return this;
    }



    @Override
    public void draw(Graphics2D ctx) {
        
        ctx.setColor(Color.decode(this.color));
        ctx.setStroke(new BasicStroke(lineWidth));

        if(fill){

            ctx.fillArc(cx - radius, cy - radius, radius, radius, 0, 360);
        }
        else {

            ctx.drawArc(cx - radius, cy - radius, radius, radius, 0, 360);
        }
    }
    
}
