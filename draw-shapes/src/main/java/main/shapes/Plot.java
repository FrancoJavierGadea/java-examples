package main.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Path2D;
import java.util.function.Function;

public class Plot implements Shape {

    private Path2D path = new Path2D.Double();
    private Function<Double, Double> function;
    private double min = -5;
    private double max = 5;
    private double step = 0.1;
    private double scale = 1;
    private float lineWidth = 1;
    private int x = 0;
    private int y = 0;
    private String color = "#ffffff";


    public Plot function(Function<Double, Double> function){

        this.function = function;
        return this;
    }
    public Plot min(int min){

        this.min = min;
        return this;
    }
    public Plot max(int max){

        this.max = max;
        return this;
    }
    public Plot step(int step){

        this.step = step;
        return this;
    }
    public Plot scale(double scale){

        this.scale = scale;
        return this;
    }
    public Plot lineWidth(float lineWidth){

        this.lineWidth = lineWidth;
        return this;
    }
    public Plot x(int x){

        this.x = x;
        return this;
    }
    public Plot y(int y){

        this.y = y;
        return this;
    }
    public Plot color(String color){

        this.color = color;
        return this;
    }

    private void initPath(){

        //path.moveTo(this.x, this.y);

        double x = min;

        do {
            double y = function.apply(x);

            if(x == min){

                path.moveTo(
                    this.x + scale * 100 * x, 
                    this.y + scale * 100 * y
                );
            }
            else {

                path.lineTo(
                    this.x + scale * 100 * x, 
                    this.y + scale * 100 * y
                );
            }

            x += step;
        }
        while(x <= max);
    }

    @Override
    public void draw(Graphics2D ctx) {

       initPath();

       ctx.setColor(Color.decode(color));
       ctx.setStroke(new BasicStroke(lineWidth));
        
       ctx.draw(path);
    }
}
