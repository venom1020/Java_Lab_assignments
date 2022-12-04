import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class LoginForm extends JFrame implements ActionListener
{   private JTextField txt_user;
    private JButton but_submit, but_reset;
    private  JPasswordField txt_password;
    private JLabel lbl_user,lbl_pass;
    
  LoginForm()
  { 
    super("Login Form");
    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(3,2));

    lbl_user=new JLabel("Username");
    lbl_user.setHorizontalAlignment(SwingConstants.CENTER);
    lbl_user.setFont(new Font("DialogInput",Font.BOLD,30));
    lbl_user. setOpaque(true);
    lbl_user.setBackground(new Color(6,57,112));
    lbl_user.setForeground(new Color(171,219,227));

    lbl_pass=new JLabel("Password");
    lbl_pass.setHorizontalAlignment(SwingConstants.CENTER);
    lbl_pass.setFont(new Font("DialogInput",Font.BOLD,30));
    lbl_pass.setOpaque(true);
    lbl_pass.setBackground(new Color(6,57,112));
    lbl_pass.setForeground(new Color(171,219,227));

    txt_password = new JPasswordField();
    txt_password.setHorizontalAlignment(SwingConstants.CENTER);
    txt_password.setFont(new Font("DialogInput",Font.BOLD,30));
    
    txt_user = new JTextField();
    txt_user.setHorizontalAlignment(SwingConstants.CENTER);
    txt_user.setFont(new Font("DialogInput",Font.BOLD,30));
    
    but_submit = new JButton("Submit");
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

    contentPane.add(lbl_user);
    contentPane.add(txt_user);
    contentPane.add(lbl_pass);
    contentPane.add(txt_password);
    contentPane.add(but_submit);
    contentPane.add(but_reset);

    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 500);
  }

  //Action listeners of this frame
  @Override
  public void actionPerformed(ActionEvent e){

    if(e.getSource() == but_submit){

      String user  = txt_user.getText();
      String password  = txt_password.getText();

      boolean flag = false;

      try{
        BufferedReader br = new BufferedReader(new FileReader("login.txt"));
        
        if(br!=null){
          String msg = br.readLine();
        

          while(msg!=null){
            String[] credential = msg.split(" ");
            if((user.equals(credential[0])) && (password.equals(credential[1]))){
              flag = true;
              break;
            }

            msg = br.readLine();
          }
        }

        if(flag){
          System.out.println("valid");
          new MainApp();
          this.dispose();
        }
        else{
          JOptionPane.showMessageDialog(this, "Invalid user....");
        } 
        
        br.close();
      }catch(Exception ex){

      }
    }
    else if(e.getSource() == but_reset){
      txt_user.setText("");
      txt_password.setText("");
    }

  }
}