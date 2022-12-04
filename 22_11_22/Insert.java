import javax.swing.*;

import java.awt.event.*;

import java.io.*;

import java.awt.*;

public class Insert extends JPanel implements ActionListener{

      //Declare for the GUI component type
      private JLabel lbl_name, lbl_regno,lbl_course;
      private JTextField txt_name,txt_regno,txt_course;
      private JButton but_submit, but_reset;

      Insert(){
            
             setLayout(new GridLayout(4,2));

            //Call the appropriate constructor with the suitable arguments.
            lbl_name = new JLabel("NAME");
            lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
            lbl_name.setFont(new Font("DialogInput",Font.BOLD,30));
            lbl_name.setOpaque(true);
            lbl_name.setBackground(new Color(6,57,112));
            lbl_name.setForeground(new Color(171,219,227));
            
            txt_name = new JTextField();
            txt_name.setHorizontalAlignment(SwingConstants.CENTER);
            txt_name.setFont(new Font("DialogInput",Font.BOLD,30));

            lbl_regno = new JLabel("REGISTRATION NUMBER");
            lbl_regno.setHorizontalAlignment(SwingConstants.CENTER);
            lbl_regno.setFont(new Font("DialogInput",Font.BOLD,30));
            lbl_regno.setOpaque(true);
            lbl_regno.setBackground(new Color(6,57,112));
            lbl_regno.setForeground(new Color(171,219,227));

            txt_regno = new JTextField();
            txt_regno.setHorizontalAlignment(SwingConstants.CENTER);
            txt_regno.setFont(new Font("DialogInput",Font.BOLD,30));

            lbl_course = new JLabel("COURSE");
            lbl_course.setHorizontalAlignment(SwingConstants.CENTER);
            lbl_course.setFont(new Font("DialogInput",Font.BOLD,30));
            lbl_course.setOpaque(true);
            lbl_course.setBackground(new Color(6,57,112));
            lbl_course.setForeground(new Color(171,219,227));

            txt_course = new JTextField();
            txt_course.setHorizontalAlignment(SwingConstants.CENTER);
            txt_course.setFont(new Font("DialogInput",Font.BOLD,30));

            but_submit = new JButton("Insert");
            but_submit.addActionListener(this);
            but_submit.setFont(new Font("DialogInput",Font.BOLD,30));
            but_submit.setOpaque(true);
            but_submit.setBackground(new Color(158,168,30));
            but_submit.setForeground(new Color(0,0,0));

            but_reset = new JButton("Reset");
            but_reset.addActionListener(this);
            but_reset.setFont(new Font("DialogInput",Font.BOLD,30));
            but_reset.setOpaque(true);
            but_reset.setBackground(new Color(197,76,7));
            but_reset.setForeground(new Color(0,0,0));


            //Add these components to the container (Applet, Frame or Panel).
            add(lbl_name);
            add(txt_name);
            add(lbl_regno);
            add(txt_regno);
            add(lbl_course);
            add(txt_course);
            add(but_submit);
            add(but_reset);

            setSize(800,500);
            setVisible(true);

      }

      @Override
      public void actionPerformed(ActionEvent e){

            if(e.getSource() == but_submit){ 
                  String name  = txt_name.getText();
                  String reg_no= txt_regno.getText();
                  String course= txt_course.getText();
                  if(name.equals("") || reg_no.equals("") || course.equals("")) 
                        { JOptionPane.showMessageDialog(this, "Fields cannot be empty!!");
                          return;
                        }

                  try{
                        BufferedWriter bw = new BufferedWriter(new FileWriter("student_details.txt", true));
                        bw.write(name + " " + reg_no+" "+course);
                        bw.newLine();
                        bw.flush();
                        bw.close();
                        JOptionPane.showMessageDialog(this, "Successfully written....");
                        txt_regno.setText("");
                        txt_course.setText("");
                        txt_name.setText("");
                  }catch(Exception ex){
                        System.out.println(ex);
                        JOptionPane.showMessageDialog(this, ex.getMessage());
                  }
            }
            else if(e.getSource() == but_reset){
                  txt_regno.setText("");
                  txt_course.setText("");
                  txt_name.setText("");
            }

      }
}