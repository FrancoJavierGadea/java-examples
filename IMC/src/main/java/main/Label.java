package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;

public class Label extends JLabel {
    
    public Label(String text) {
        super(text);
    }

    public Label color(String color){

        this.setForeground(Color.decode(color));
        return this;
    }
    public Label color(Color color){

        this.setForeground(color);

        return this;
    }

    public Label alignmentX(float align){

        this.setAlignmentX(align);
        return this;
    }

    public Label font(Font font){

        this.setFont(font);
        return this;
    }
    public Label font(String fontName, int fontSize, double letterSpacing){

        Map<TextAttribute, Object> fontAttributes = new HashMap<>();
        fontAttributes.put(TextAttribute.TRACKING, letterSpacing);

        Font font = new Font(fontName, Font.PLAIN, fontSize)
            .deriveFont(fontAttributes); 

        this.setFont(font);
        return this;
    }
}
