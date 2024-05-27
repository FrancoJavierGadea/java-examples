package main;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {

    public final int WIDTH = 400;
    public final int HEIGHT = 540;
    
    public MainFrame(){

        this.setTitle("Calculadora IMC");

        this.setSize(400, 540);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.initComponents();
    }


    private void initComponents(){

        JPanel root = Container.vertical(5);
        root.setBackground(Color.BLACK);

        //MARK: Inputs
        InputBuilder inputBuilder = new InputBuilder()
            .padding(5)
            .textColor("#ffffff")
            .borderColor("#a3a3a3")
            .letterSpacing(0.1f)
        ;

        JTextField weightInput = inputBuilder
            .title("Peso")
            .build();
        
        JTextField heightInput = inputBuilder
            .title("Altura")
            .build();


        //MARK: Submit btn
        JButton submitBtn = new JButton("Calcular");

        submitBtn.setAlignmentX(Component.CENTER_ALIGNMENT);

        submitBtn.addActionListener((e) -> {

            double height = Double.parseDouble(heightInput.getText());
            double weight = Double.parseDouble(weightInput.getText());

            double IMC = weight / Math.pow(height / 100, 2);

            this.alert(
                String.format("Tu IMC es %.2f", IMC)
            );
        });

        
        
        //MARK: Panel Content
        ArrayList<Component[]> components = new ArrayList<>();
        
        components.addAll(List.of(
            new Component[]{
                weightInput,
                new Label("Kg")
                    .color(Color.WHITE)
                    .font(weightInput.getFont())
            },
            new Component[]{
                heightInput, 
                new Label("cm")
                    .color(Color.WHITE)
                    .font(heightInput.getFont())
            },
            new Component[]{
                submitBtn
            }
        ));
  
        components.stream().forEach((children) -> {

            JPanel row = Container.horizontal(null, null);

            for (Component component : children) {
                
                row.add(component);
            }

            root.add(row);
        });

        this.add(root);
    }


    //MARK: Alert Dialog
    private void alert(String message){

        JDialog dialog = new JDialog(this);

        dialog.setSize(200, 150);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setLocationRelativeTo(this);

        JPanel root = Container.horizontal(null, 40);

        root.setBackground(Color.BLACK);

        root.add(
            new Label(message)
                .color("#ffffff")
                .alignmentX(Component.CENTER_ALIGNMENT)
                .font(Font.SANS_SERIF, 18, 0.1)
        );

        dialog.add(root);

        dialog.setVisible(true);
    }
}
