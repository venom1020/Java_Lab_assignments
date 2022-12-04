import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;
import java.util.ArrayList;

public class Delete extends JPanel implements ActionListener{

	//Declare for the GUI component type
	private JLabel lbl_name;
	private JList list_names;
	private JButton but_remove;
	private JScrollPane scroll_pane;
	Delete(){
		
		setLayout(new BorderLayout());
		
		
		lbl_name = new JLabel("Students in Database:");
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
    	lbl_name.setFont(new Font("DialogInput",Font.BOLD,30));
    	lbl_name.setOpaque(true);
    	lbl_name.setBackground(new Color(6,57,112));
    	lbl_name.setForeground(new Color(171,219,227));
  
		

		String[] data = getNamesFromDB();
		list_names = new JList(data);
    	list_names.setFont(new Font("DialogInput",Font.BOLD,30));
		list_names.setSelectionBackground(new Color(197,76,7));
		list_names.setVisibleRowCount(6);
		scroll_pane = new JScrollPane(list_names);

		but_remove = new JButton("Remove Student");
		but_remove.addActionListener(this);
		but_remove.setFont(new Font("DialogInput",Font.BOLD,30));
    	but_remove.setOpaque(true);
    	but_remove.setBackground(new Color(197,76,7));
    	but_remove.setForeground(new Color(0,0,0));


		//Add these components to the container (Applet, Frame or Panel).
		add(lbl_name,BorderLayout.NORTH);
		add(scroll_pane,BorderLayout.CENTER);
		add(but_remove,BorderLayout.SOUTH);

		setSize(800,500);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e){

		if(e.getSource() == but_remove){ 
			{	String name2Remove=(String)list_names.getSelectedValue();
				if(name2Remove==null) 
					{	JOptionPane.showMessageDialog(this, "No student selected!");
						return;
					}
				else
				{   removeName(name2Remove);
					list_names.setListData(getNamesFromDB());
					list_names.clearSelection();
				}	
			}
			
	}

	}

	public String[] getNamesFromDB()
	{  	ArrayList<String> ls= new ArrayList<String>();
		String[] names;
		try 
		{ BufferedReader br = new BufferedReader(new FileReader("student_details.txt"));
        
        	if(br!=null){
          	String msg = br.readLine();
        	while(msg!=null)
        	 	{
            		String[] details = msg.split(" ");
            		ls.add(details[0]);
           			msg = br.readLine();
          		}
          	br.close();
        }

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return names=ls.toArray(new String[ls.size()]);

	}

	public void removeName(String s)
	{  try
	  	{
	  		File fs=new File("student_details.txt");
	  		File temp= new File("temp.txt");
	  		temp.createNewFile();	
			BufferedReader br = new BufferedReader(new FileReader(fs));
			BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

			if(br!=null){
          		String msg = br.readLine();
          		while(msg!=null)
          		{
		            String[] details = msg.split(" ");
		            if(s.equals(details[0]))
		            	{
		            	 msg=br.readLine();
		             	 continue;
		            	}
		            else
		            	{ 	bw.write(msg);
		        	  		bw.newLine();
		        	  		bw.flush();
		            	}
		            msg = br.readLine();
		        }
		          br.close();
		          bw.close();
		          fs.delete();
		          temp.renameTo(fs);
			  }	
	}
	catch(Exception e)
		{ System.out.println(e);
		}
	}
			
}