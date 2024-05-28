package com.templates;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import com.partials.cColor;

import com.partials.cFonts;
import com.partials.cFormLabel;
import com.partials.cTextField;
import com.partials.cLinkStart;
import com.partials.cBlueButton;


public class cStartFrame1 extends JFrame{

    public JPanel bg = new JPanel();
    public JPanel cardStart = new JPanel();

    public JLabel titleStart = new JLabel("Title Start");
    public cFormLabel labelUsername = new cFormLabel("Username", 0, 84, 450, true);
    public cTextField txtUsername = new cTextField(65, 114, 320, true);
    public cLinkStart link1 = new cLinkStart("Menuju Kemana?", 200);
    public cBlueButton btnSubmit = new cBlueButton("Submit", 65, 282, 320);
    

public cStartFrame1()
{
    super();
    setSize(1920, 1080);
    setLocationRelativeTo(null);
    setLayout(null);
    
    setDefaultCloseOperation(cStartFrame1.EXIT_ON_CLOSE);

    bg.setBackground(cColor.RED);
    bg.setBounds(0, 0, 1920, 1080);
    bg.setLayout(null);

    cardStart.setBackground(cColor.WHITE);
    cardStart.setBounds(730, 120, 450, 650);
    cardStart.setLayout(null);

    titleStart.setFont(cFonts.TITLE_START_FONT);
    titleStart.setForeground(cColor.BLACK);
    titleStart.setBounds(0, 30, 450, 40);
    titleStart.setHorizontalAlignment(JLabel.CENTER);
    titleStart.setVerticalAlignment(JLabel.CENTER);


    cardStart.add(titleStart);
    cardStart.add(labelUsername);
    cardStart.add(txtUsername);
    cardStart.add(link1);
    cardStart.add(btnSubmit);
    
    bg.add(cardStart);
    add(bg);

}

public cStartFrame1(String title)
{
    this();
    setTitle(title);
}

}
