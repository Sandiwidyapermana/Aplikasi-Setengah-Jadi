package com.templates;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import com.partials.cLinkKeluar;
import com.partials.cColor;
import com.partials.cFonts;


import com.partials.cLabelInfo;
import com.partials.cBigFont;
import com.partials.cRadioButton;
import com.partials.cCheckbox;
import com.partials.cSidebarMenu;
import com.partials.cTable;
import com.partials.cTextarea;
import com.partials.cScrollPane;

public abstract class cDashboardFrame extends JFrame{

  public JPanel sidebar = new JPanel();
  public JPanel header = new JPanel();
  public JPanel main = new JPanel();
  public JPanel content = new JPanel();

  private JLabel appText = new JLabel("Hello TI - B");
  public JLabel roleText = new JLabel("Role | Nama User");
  public JLabel menuTitle = new JLabel("Menu Title");
  public JLabel copyrightText = new JLabel("Copyright 2024. In Syaa Allah Penghuni Surga.");

  private cLinkKeluar exitLink = new cLinkKeluar(930);

  public cLabelInfo infoPulsa = new cLabelInfo("Sisa Pulsa Anda", 25, 25);
  public cBigFont valuePulsa = new cBigFont("15.000", 25, 60);
  public cRadioButton rd1 = new cRadioButton("Pilihan 1", "pilihan1", 25, 150, 100);
  public cCheckbox ch1 = new cCheckbox("Checkbox 1", "checkbox1", 200, 150, 100);

  public cSidebarMenu berandaMenu = new cSidebarMenu("Beranda", 70);
  public cTextarea txtArea = new cTextarea(false);
  public cScrollPane sp = new cScrollPane(txtArea, 25, 100, 300, 100);
  public cTable tableUser;
  public cScrollPane spTable;
  

  public cDashboardFrame()
  {
    super();
    setSize(1280, 720);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setUndecorated(true);
    setLocationRelativeTo(null);
    setLayout(null);

    sidebar.setBackground(cColor.BLACK);
    sidebar.setBounds(0, 0, 230, 720);
    sidebar.setLayout(null);

    header.setBackground(cColor.BLACK_GRAY);
    header.setBounds(230, 0, 1050, 70);
    header.setLayout(null);

    main.setBackground(cColor.WHITE_GRAY);
    main.setBounds(230, 70, 1050, 650);
    main.setLayout(null);

    content.setBackground(cColor.WHITE);
    content.setBounds(30, 70, 990, 520);
    content.setLayout(null);

    appText.setFont(cFonts.APP_FONT);
    appText.setBounds(0, 0, 230, 70);
    appText.setHorizontalAlignment(JLabel.CENTER);
    appText.setVerticalAlignment(JLabel.CENTER);
    appText.setForeground(cColor.WHITE);

    roleText.setFont(cFonts.ROLE_FONT);
    roleText.setBounds(30, 0, 400, 70);
    roleText.setVerticalAlignment(JLabel.CENTER);
    roleText.setForeground(cColor.WHITE);

    menuTitle.setFont(cFonts.MENU_TITLE_FONT);
    menuTitle.setBounds(30, 10, 600, 50);
    menuTitle.setVerticalAlignment(JLabel.CENTER);
    menuTitle.setForeground(cColor.BLACK_GRAY);

    copyrightText.setFont(cFonts.TEXTFIELD_FONT);
    copyrightText.setBounds(0, 610, 1050, 20);
    copyrightText.setHorizontalAlignment(JLabel.CENTER);
    copyrightText.setVerticalAlignment(JLabel.CENTER);
    copyrightText.setForeground(cColor.BLACK);

    txtArea.setText("Sholat lah sebelum kalian di sholati.");

    String[] dataUserHeader = {"Nama", "Username", "Umur"};
    String[][] dataUser = {
      {"Sandi Widya Permana", "Sandi", "21"},
      {"Ananda Cahyo Kartiko", "Nanda", "20"},
      {"Annisa Kusuma Dewi", "Annisa", "19"},
      {"Dini Ika Kurnia", "Dini", "20"},
      {"Vegananda", "Vega", "20"}
    };
    javax.swing.table.DefaultTableModel dmUser = new javax.swing.table.DefaultTableModel(dataUser, dataUserHeader);

    tableUser = new cTable(dmUser);

    spTable = new cScrollPane(tableUser, 25, 300, 500, 100);


    sidebar.add(berandaMenu);

    content.add(infoPulsa);
    content.add(valuePulsa);
    content.add(rd1);
    content.add(ch1);
    content.add(sp);
    content.add(spTable);


    
    header.add(exitLink);
    header.add(roleText);
    sidebar.add(appText);
    main.add(content);
    main.add(menuTitle);
    main.add(copyrightText);
    add(sidebar);
    add(header);
    add(main);
  }

  public cDashboardFrame(String title)
  {
    this();
    setTitle(title);
  }
  
}