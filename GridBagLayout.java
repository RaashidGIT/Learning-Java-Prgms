/*
Aim of the Program:
-------------------
To demonstrate the use of GridBagLayout in Java AWT.
The program creates a simple GUI window with three buttons arranged as:
- Button 1 at the top-left,
- Button 2 at the top-right (stretching horizontally),
- Button 3 below them, spanning two columns.
*/

import java.awt.*;
import java.awt.event.*;

public class GridBagEx extends Frame {
    public GridBagEx() {
        setTitle("GridBagLayout - Minimal");  // Window title
        setSize(300, 150);                    // Window size

        GridBagLayout gbl = new GridBagLayout();      // Create GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints(); // Create constraints
        setLayout(gbl);                        // Apply GridBagLayout to Frame

        // --- First Button (Top-left corner) ---
        gbc.gridx = 0; gbc.gridy = 0;          // Row 0, Column 0
        add(new Button("Btn 1"), gbc);

        // --- Second Button (Top row, next column) ---
        gbc.gridx = 1; gbc.gridy = 0;          // Row 0, Column 1
        gbc.fill = GridBagConstraints.HORIZONTAL; // Fill horizontally
        add(new Button("Btn 2 (wide)"), gbc);

        // --- Third Button (Second row, spanning 2 columns) ---
        gbc.gridx = 0; gbc.gridy = 1;          // Row 1, Column 0
        gbc.gridwidth = 2;                     // Span across 2 columns
        gbc.fill = GridBagConstraints.NONE;    // Normal size
        add(new Button("Btn 3 (span 2)"), gbc);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0); // Close program when [X] is clicked
            }
        });
    }

    public static void main(String[] args) {
        GridBagEx win = new GridBagEx();       // Create window
        win.setVisible(true);                  // Show window
    }
}

/*
Simulated Output Layout:
------------------------
+-----------------------------+
| Btn 1   | Btn 2 (wide)      |
|-----------------------------|
|       Btn 3 (span 2)        |
+-----------------------------+
*/
