package main;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Container {
    

    /**
     * JPanel with vertical BoxLayout
     * @return JPanel
     */
    static JPanel vertical(int rows){

        JPanel panel = new JPanel();

        GridLayout layout = new GridLayout();
        layout.setColumns(1);
        layout.setRows(rows);

        panel.setLayout(layout);

        return panel;
    }

    /**
     * JPanel with FlowLayout
     * @param hgap default: 10
     * @param vgap default: 10
     * @return JPanel
     */
    static JPanel horizontal(Integer hgap, Integer vgap){

        JPanel panel = new JPanel();

        FlowLayout layout = new FlowLayout();
        
        layout.setHgap(hgap != null ? hgap.intValue() : 10);
        layout.setVgap(vgap != null ? vgap.intValue() : 10);

        panel.setLayout(layout);
        panel.setBackground(null);

        return panel;
    }


    static Component whiteSpace(int width, int heigth){

        return Box.createRigidArea(new Dimension(width, heigth));
    }


}
