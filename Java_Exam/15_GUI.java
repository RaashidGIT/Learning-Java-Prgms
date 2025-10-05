/*  Aim of the Program:- To create a Java Applet GUI with a List, a TextBox, and a Button.  */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ListTextBoxButtonApplet extends Applet implements ActionListener {
    TextField textField;   
    Button addButton;      
    List itemList;         

    public void init() {
        textField = new TextField(15);
        addButton = new Button("Add");
        itemList = new List();

        add(itemList);
        add(textField);
        add(addButton);

        addButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String text = textField.getText().trim();
        if (!text.isEmpty()) {
            itemList.add(text);  
            textField.setText(""); 
        }
    }
}
