import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class MainApp extends JFrame implements ActionListener
{   
  //UI elements
  private JMenuItem mnu_insert, mnu_delete,mnu_exit;
  private JMenu mnu_student;
  private JMenuBar mnu_main;
  private JPanel pnl_student;
   
   MainApp()
  { 
    super("Main Window");
    mnu_insert = new JMenuItem("Insert");
    mnu_insert.addActionListener(this);
    mnu_delete = new JMenuItem("Delete");
    mnu_delete.addActionListener(this);
    mnu_exit = new JMenuItem("Exit");
    mnu_exit.addActionListener(this);

    mnu_student = new JMenu("Student Database Manager");
    mnu_main = new JMenuBar();
    setJMenuBar(mnu_main);
    mnu_main.add(mnu_student);
    mnu_student.add(mnu_insert);
    mnu_student.add(mnu_delete);
    mnu_student.add(mnu_exit);

    pnl_student= new JPanel(); 
    Container contentPane = getContentPane();
    contentPane.add(pnl_student);

    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 500);
  }

  @Override
  public void actionPerformed(ActionEvent e){

    if(e.getSource() == mnu_insert){
      pnl_student.removeAll();
      pnl_student.add(new Insert());
      pnl_student.updateUI();
    }
    else if(e.getSource() == mnu_delete){
      pnl_student.removeAll();
      pnl_student.add(new Delete());
      pnl_student.updateUI();
    }else if(e.getSource() == mnu_exit){
      System.exit(0);
    }
  }

}