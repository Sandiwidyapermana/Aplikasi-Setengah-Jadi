package com.partials;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class cTextField extends JTextField{

    public cTextField(int x, int y, int width, boolean centerAlligment)
    {
        super();
        setBounds(x, y, width, 35);
        if (centerAlligment) {
            if(centerAlligment){
            setHorizontalAlignment(JTextField.CENTER);
        }
        }
        setFont(cFonts.TEXTFIELD_FONT);
        setForeground(cColor.BLACK);
        setBorder(new javax.swing.border.LineBorder(cColor.BLACK, 1));

    }

}
