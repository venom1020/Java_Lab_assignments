import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;
import javax.swing.event.*;

public class StudentSearch extends JFrame implements ActionListener
{   

  private JLabel lbl_regno,lbl_name,lbl_course,lbl_gpa;
  private JTextField txt_regno,txt_name,txt_course,txt_gpa;
  private JButton but_srch;
  private JList lst_details;
  private JPanel pnl_R,pnl_T;
  private JScrollPane scroll_pane;

  StudentSearch()
  { 
    super("Student details....");

    lbl_regno=new JLabel("Reg No");
    lbl_regno.setHorizontalAlignment(SwingConstants.CENTER);
    lbl_regno.setFont(new Font("DialogInput",Font.BOLD,20));

    lbl_name=new JLabel("Name ");
    lbl_name.setHorizontalAlignment(SwingConstants.RIGHT);
    lbl_name.setFont(new Font("DialogInput",Font.BOLD,20));

    lbl_course=new JLabel("Course ");
    lbl_course.setHorizontalAlignment(SwingConstants.RIGHT);
    lbl_course.setFont(new Font("DialogInput",Font.BOLD,20));

    lbl_gpa=new JLabel("GPA ");
    lbl_gpa.setHorizontalAlignment(SwingConstants.RIGHT);
    lbl_gpa.setFont(new Font("DialogInput",Font.BOLD,20));
   
    txt_regno = new JTextField();
    txt_regno.setHorizontalAlignment(SwingConstants.LEFT);
    txt_regno.setFont(new Font("DialogInput",Font.BOLD,20));
    txt_regno.setColumns(20);
    
    txt_name = new JTextField();
    txt_name.setHorizontalAlignment(SwingConstants.CENTER);
    txt_name.setFont(new Font("DialogInput",Font.BOLD,20));
    txt_name.setColumns(20);
    
    txt_course = new JTextField();
    txt_course.setHorizontalAlignment(SwingConstants.CENTER);
    txt_course.setFont(new Font("DialogInput",Font.BOLD,20));
    txt_course.setColumns(20);
  
    txt_gpa = new JTextField();
    txt_gpa.setHorizontalAlignment(SwingConstants.CENTER);
    txt_gpa.setFont(new Font("DialogInput",Font.BOLD,20));
    txt_gpa.setColumns(20);
    
    but_srch = new JButton("Search");
    but_srch.addActionListener(this);
    but_srch.setFont(new Font("DialogInput",Font.BOLD,20));

    lst_details =new JList();
    lst_details.setFont(new Font("DialogInput",Font.BOLD,30));
    lst_details.setVisibleRowCount(10);

    lst_details.addListSelectionListener(new ListSelectionListener() {
      @Override
      public void valueChanged(ListSelectionEvent e) {
        String Selected = (String) lst_details.getSelectedValue();
        updateTxtFields(Selected);
      }
    });

    scroll_pane = new JScrollPane(lst_details);
    

    pnl_T= new JPanel();
    pnl_T.setLayout(new FlowLayout());
    pnl_T.add(lbl_regno);
    pnl_T.add(txt_regno);
    pnl_T.add(but_srch);

    pnl_R=new JPanel();
    pnl_R.setLayout(new GridLayout(3,2));
    pnl_R.add(lbl_name);
    pnl_R.add(txt_name);
    pnl_R.add(lbl_course);
    pnl_R.add(txt_course);
    pnl_R.add(lbl_gpa);
    pnl_R.add(txt_gpa);

    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());
    contentPane.add(scroll_pane,BorderLayout.CENTER);
    contentPane.add(pnl_T,BorderLayout.NORTH);
    contentPane.add(pnl_R,BorderLayout.EAST);

    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 500);
  }


  @Override
  public void actionPerformed(ActionEvent e){
   if(e.getSource()== but_srch)
    { ArrayList<String> ls= new ArrayList<String>();
      String[] regno;
      String search= txt_regno.getText();
      try
      {   
          BufferedReader br = new BufferedReader(new FileReader("details.txt"));
          if(br!=null)
          {
            String msg = br.readLine();
            while(msg!=null)
             {
                String[] details = msg.split(" ");
                if(details[0].startsWith(search))
                    { ls.add(details[0]);
                    }
                msg = br.readLine();
             }
            br.close();

          }
      }
      catch(Exception ex)
      { 
        System.out.println(ex);
      }
      finally
      { regno=ls.toArray(new String[ls.size()]);
        lst_details.setListData(regno);
      }
      }
    }
    

    public void updateTxtFields(String s)
      {  try
        {   
          BufferedReader br = new BufferedReader(new FileReader("details.txt"));
          if(br!=null)
          {
            String msg = br.readLine();
            while(msg!=null)
             {
                String[] details = msg.split(" ");
                if(details[0].equals(s))
                    { txt_name.setText(details[1]);
                      txt_course.setText(details[2]);
                      txt_gpa.setText(details[3]);
                    }
                msg = br.readLine();
             }
            br.close();

          }
      }
      catch(Exception ex)
        { 
        System.out.println(ex);
        }
      }
  }

  

