package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class InputBuilder {
    
    private Color borderColor = Color.WHITE;
    private Color textColor = Color.WHITE;
    private int size = 10;
    private int padding = 5;
    private String fontName = Font.SANS_SERIF;
    private int fontSize = 18;
    private float letterSpacing = 0;
    private String title = "";

    public InputBuilder title(String title){
        this.title = title;
        return this;
    }
    public InputBuilder size(int size){
        this.size = size;
        return this;
    }
    public InputBuilder padding(int padding){
        this.padding = padding;
        return this;
    }
    public InputBuilder borderColor(Color borderColor){
        this.borderColor = borderColor;
        return this;
    }
    public InputBuilder borderColor(String borderColor){
        this.borderColor = Color.decode(borderColor);
        return this;
    }
    public InputBuilder textColor(Color textColor){
        this.textColor = textColor;
        return this;
    }
    public InputBuilder textColor(String textColor){
        this.textColor = Color.decode(textColor);
        return this;
    }
    public InputBuilder fontName(String fontName){
        this.fontName = fontName;
        return this;
    }
    public InputBuilder fontSize(int fontSize){
        this.fontSize = fontSize;
        return this;
    }
    public InputBuilder letterSpacing(float letterSpacing){
        this.letterSpacing = letterSpacing;
        return this;
    }


    public JTextField build(){

        JTextField input = new JTextField("");

        input.setColumns(size);
        input.setBackground(null);
        input.setForeground(textColor);
        input.setCaretColor(textColor);

        //Font
        Map<TextAttribute, Object> fontAttributes = new HashMap<>();
        fontAttributes.put(TextAttribute.TRACKING, letterSpacing);

        Font font = new Font(fontName, Font.PLAIN, fontSize)
            .deriveFont(fontAttributes); 

        input.setFont(font);

        //Border and padding    
        Border paddingBorder = BorderFactory.createEmptyBorder(padding, padding, padding, padding);
        Border border = BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(borderColor, 2, false), 
            title,
            TitledBorder.LEFT,
            TitledBorder.CENTER,
            font,
            borderColor
        );

        input.setBorder(BorderFactory.createCompoundBorder(border, paddingBorder));

        //Events
        input.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyTyped(KeyEvent e) {
                
                Character chart = e.getKeyChar();

                if(!Character.isDigit(chart)){

                    e.consume();
                }
            }
        });

        return input;
    }
}
