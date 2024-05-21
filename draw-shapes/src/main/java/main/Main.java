package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.shapes.Circle;
import main.shapes.Line;
import main.shapes.Plot;
import main.shapes.Rectangle;
import main.shapes.Shape;
import main.shapes.Square;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Draw shapes");

        Shape[] shapes = {
            new Circle()
                .cx(110)
                .cy(110)
                .radius(100)
                .fill(false)
                .color("#002fff"),

            new Circle()
                .cx(110)
                .cy(210)
                .radius(70)
                .fill(true)
                .color("#002fff"),

            new Line()
                .start(10, 10)
                .end(150, 150)
                .lineWidth(2),
   
            new Rectangle()
                .x(150)
                .y(10),

            new Rectangle()
                .x(270)
                .y(10)
                .color("#05aa8f")
                .fill(true),

            new Square()
                .x(400)
                .y(10)
                .color("#aa0594")
                .lineWidth(3),

            new Square()
                .x(520)
                .y(10)
                .color("#aa0594")
                .fill(true),

            new Plot()
                .function((x) -> {

                    return Math.cos(x);
                })
                .scale(0.5)
                .x(300)
                .y(300),

            new Plot()
                .function((x) -> {

                    return -Math.pow(x, 2);
                })
                .scale(0.5)
                .x(510)
                .y(400)
                .color("#2ab300")
                .lineWidth(3.5f)
        };

        JPanel canvas = new JPanel(){

            {
                this.setBackground(Color.BLACK);
            }

            @Override
            protected void paintComponent(Graphics graphics) {

                super.paintComponent(graphics);

                Graphics2D ctx = (Graphics2D) graphics;

                for (Shape shape : shapes) {
                    
                    shape.draw(ctx);
                }
            }
        };

        frame.add(canvas);

        frame.setSize(720, 480);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}