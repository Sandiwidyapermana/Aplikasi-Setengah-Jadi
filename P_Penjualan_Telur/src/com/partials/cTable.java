package com.partials;
import javax.swing.JTable;

public class cTable extends JTable {

  public cTable(javax.swing.table.TableModel dm)
  {
    super(dm);
    setFont( cFonts.TEXTFIELD_FONT );
    getTableHeader().setFont( cFonts.HEADER_TABLE_FONT );
    getTableHeader().setBackground( cColor.BLACK );
    getTableHeader().setForeground( cColor.WHITE );
    getTableHeader().setBorder(null);
    setBorder(null);
    setRowHeight(30);
    getTableHeader().setReorderingAllowed(false);
    
    
    setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    setDragEnabled(true);
    setSelectionBackground(cColor.RED);
    setSelectionForeground(cColor.WHITE);
  }

  @Override
  public boolean isCellEditable(int row, int column){
    return false;
  }
  
}