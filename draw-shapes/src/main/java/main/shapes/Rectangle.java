package main.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle implements Shape {
    
    private int x = 0;
    private int y = 0;
    private int width = 100;
    private int height = 80;
    private boolean fill = false;
    private String color = "#ffffff";
    private float lineWidth = 1;

    public Rectangle x(int x){

        this.x = x;
        return this;
    }
    public Rectangle y(int y){

        this.y = y;
        return this;
    }
    private Rectangle width(int width){

        this.width = width;
        return this;
    }
    private Rectangle height(int height){

        this.height = height;
        return this;
    }
    public Rectangle color(String color){

        this.color = color;
        return this;
    }
    public Rectangle fill(boolean fill){

        this.fill = fill;
        return this;
    }
    public Rectangle lineWidth(float lineWidth){

        this.lineWidth = lineWidth;
        return this;
    }

    @Override
    public void draw(Graphics2D ctx) {

        ctx.setColor(Color.decode(color));
        ctx.setStroke(new BasicStroke(lineWidth));
        
        if(fill){

            ctx.fillRect(x, y, width, height);
        }
        else {

            ctx.drawRect(x, y, width, height);
        }
    }
}
