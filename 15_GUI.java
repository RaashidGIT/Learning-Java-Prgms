/*
Aim of the Program:
-------------------
To create a Java Applet GUI with a List, a TextBox, and a Button.
The user can type text into the TextBox, click the Button, and the
text will be added to the List.
*/

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code="ListTextBoxButtonApplet" width=400 height=300>
   </applet> */

public class ListTextBoxButtonApplet extends Applet implements ActionListener {

    TextField textField;   // TextBox
    Button addButton;      // Button
    List itemList;         // List (AWT List)

    public void init() {
        // Initialize components
        textField = new TextField(15);
        addButton = new Button("Add");
        itemList = new List();

        // Add components to applet
        add(itemList);
        add(textField);
        add(addButton);

        // Register listener for button
        addButton.addActionListener(this);
    }

    // Event handling for button click
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText().trim();
        if (!text.isEmpty()) {
            itemList.add(text);   // Add to list
            textField.setText(""); // Clear textbox
        }
    }
}

/*
Simulated Output:
-----------------
Applet window contains:
- A list box at the top-left.
- A text field and a button below.

Example interaction:
--------------------
User types: "Apple" in textbox -> clicks Add -> "Apple" appears in the list.
User types: "Banana" -> clicks Add -> "Banana" appears in the list.

[List box]
Apple
Banana

[ Textbox ] [ Add ]
*/
