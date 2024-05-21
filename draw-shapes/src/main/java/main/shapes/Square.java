package main.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Square implements Shape {
    
    private int x = 0;
    private int y = 0;
    private int size = 100;
    private boolean fill = false;
    private String color = "#ffffff";
    private float lineWidth = 1;

    public Square x(int x){

        this.x = x;
        return this;
    }
    public Square y(int y){

        this.y = y;
        return this;
    }
    private Square size(int size){

        this.size = size;
        return this;
    }
    public Square color(String color){

        this.color = color;
        return this;
    }
    public Square fill(boolean fill){

        this.fill = fill;
        return this;
    }
    public Square lineWidth(float lineWidth){

        this.lineWidth = lineWidth;
        return this;
    }

    @Override
    public void draw(Graphics2D ctx) {

        ctx.setColor(Color.decode(color));
        ctx.setStroke(new BasicStroke(lineWidth));
        
        if(fill){

            ctx.fillRect(x, y, size, size);
        }
        else {

            ctx.drawRect(x, y, size, size);
        }
    }
}
