import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.File;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane; 
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class ParkingUKM extends JFrame implements ActionListener{
	

	 JTable data1,data2;
     JFrame frame,frame1,frame2,frameload,frameload2,frameM,frameS,frameO,frameedit,frameedit2,framev,framelll,framelg1,framelg2;
	 JLabel lblname,lblid,lbljob,lblvehicle1,lblvehicle2,lblnoplate1,lblnoplate2,lbltajuk,lblnum,lblp,lblpn1,lblpn2,lblpn3,lblpl1,lblpl2,lblpl3,lblL,lblPN,lblT,lblv,lbld,lbld1,lbld2;
	 JLabel lbladmin,lblpss;
	 JTextField txtname,txtid,txtvehicle1,txtvehicle2,txtnoplate1,txtnoplate2,txtjob,txtL,txtPN,txtT,txtadmin,txtpss;
	 JRadioButton student,Ostaff,Mstaff,mspark,ospark,s1park,s2park,s3park,Mlot,Olot,Slot;
	 JButton buttonlogin,buttonlogin2,buttonb1,buttonb2;
	 JButton button1,button2,buttonsave1,buttonsave2,buttonsave3,buttonsave4,buttondata,buttonfile1,buttonfile2,buttonfile3,buttonedit,buttonedit2;
	 JButton buttonopen1,buttonopen2,buttonback1,buttonback2,buttonbackM,buttonbackO,buttonbackS,buttonback3,buttonback4,buttondelete,buttondelete2;
	 JButton buttonaccept,buttonaccept2,buttoncancel2,buttoncancel,button1v,button2v,button1l,button2l;
	 JTextArea area1,area2,area3,areadata;
	 JFileChooser filechoose;
	 BufferedReader br;
	 String file,fileload,line;
	 ButtonGroup kuku= new ButtonGroup();
	 int removes=0,returnval,v=0,save=0, rowIndex,rowIndex2, rowNumber, noOfStudents;;
	 String [][] data=new String [50][7];
	 String [][] data22 = new String [50][9];
	 
	 
	 String currentline,job="",parking="",location="",namepark="",selectedData = null;;
	 
	 
	 	Person people[]=new Person[1000];
		Vehicle1 vv[]= new Vehicle1[1000];
		ParkingLot pl[]=new ParkingLot[1000];
		
		Person p[]=new Person[1000];
		Vehicle1 vh[]=new Vehicle1 [1000];
		ParkingLot pr[]=new ParkingLot[1000];
		
		
		public ParkingUKM() throws HeadlessException {
			Design();
		}
			public void Design() {
				frame1 = new JFrame("UKM PARKING LOTS");
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setVisible(true);															// framw
				frame1.setSize(600,600);
				frame1.setResizable(false);
				frame1.setLayout(null);
			
				
				lbld = new JLabel("WELCOME TO UKM PARKING LOT");
				lbld.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 19));
				lbld.setBounds(120, 43, 376, 107);
				frame1.add(lbld);
				
				lbld1 = new JLabel("NEW USER      :");
				lbld1.setFont(new Font("Serif", Font.BOLD, 20));
				lbld1.setForeground(Color.DARK_GRAY);
				lbld1.setBounds(86, 222, 194, 67);
				frame1.add(lbld1);
				
				lbld2 = new JLabel("PARKING USER INFORMATION  :");
				lbld2.setFont(new Font("Serif", Font.BOLD, 18));
				lbld2.setForeground(Color.DARK_GRAY);
				lbld2.setBounds(25, 353, 338, 91);
				frame1.add(lbld2);
				
				
				
				buttonopen1 = new JButton("START");
				buttonopen1.setBounds(390, 232, 128, 55);
				buttonopen1.setForeground(Color.WHITE);
				buttonopen1.setBackground(Color.ORANGE);
				frame1.add(buttonopen1);
				frame1.repaint();
				
				
				buttonopen2 = new JButton("LOAD");
				buttonopen2.setBounds(390, 374, 128, 55);
				buttonopen2.setForeground(Color.WHITE);
				buttonopen2.setBackground(Color.ORANGE);
				frame1.add(buttonopen2);
				frame1.repaint();
				
				buttonopen1.addActionListener(this);
				buttonopen2.addActionListener(this);
			}

public static void main (String[] args) {				// main method
	new ParkingUKM();
	 }
public void framestart() {
	
	framev = new JFrame ("VEHICLE");
	framev.setVisible(true);
	framev.setSize(300,150);
	framev.setResizable(false);
	framev.setLayout(null);
	
	lblv = new JLabel("NUMBER OF VEHICLE");
	lblv.setBounds(73, 20, 154, 38);
	framev.add(lblv);
	framev.repaint();
	
	button1v = new JButton("1");
	button1v.setBounds(34, 68, 85, 21);
	button1v.setBackground(Color.BLACK);
	button1v.setForeground(Color.WHITE);
	framev.add(button1v);
	framev.repaint();
	
	button2v = new JButton("2");
	button2v.setBounds(140, 68, 85, 21);
	button2v.setBackground(Color.BLACK);
	button2v.setForeground(Color.WHITE);
	framev.add(button2v);
	framev.repaint();
	
	
	button1v.addActionListener(this);
	button2v.addActionListener(this);
	
}
public void frameload() {
	framelll = new JFrame (" INFORMATION VEHICLE");
	framelll.setVisible(true);
	framelll.setSize(300,150);
	framelll.setResizable(false);
	framelll.setLayout(null);
	
	
	lblv = new JLabel("NUMBER OF VEHICLE");
	lblv.setBounds(73, 20, 154, 38);
	framelll.add(lblv);
	framelll.repaint();
	
	button1l = new JButton("1");
	button1l.setBounds(34, 68, 85, 21);
	button1l.setBackground(Color.BLACK);
	button1l.setForeground(Color.WHITE);
	framelll.add(button1l);
	framelll.repaint();
	
	button2l = new JButton("2");
	button2l.setBounds(140, 68, 85, 21);
	button2l.setBackground(Color.BLACK);
	button2l.setForeground(Color.WHITE);
	framelll.add(button2l);
	framelll.repaint();
	
	button1l.addActionListener(this);
	button2l.addActionListener(this);
}

class UppercaseDocumentFilter extends DocumentFilter {

    @Override
    public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
        fb.insertString(offset, text.toUpperCase(), attr);
    }

    @Override
    public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        fb.replace(offset, length, text.toUpperCase(), attrs);
    }
}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==buttonopen1) {
		framestart();
		//Start();
	}
	if(e.getSource()==button1v) {
		Start();
	}
	if(e.getSource()==button2v) {
		vehicle2();
	}
	if(e.getSource()==buttonback3) {
		frameload.dispose();
		framelll.dispose();
	}
	
	if(e.getSource()==buttonopen2) {
		frameload();
	}
	if(e.getSource()==button1l) {
		filechoose();
		returnval=filechoose.showOpenDialog(null);
		if(returnval == JFileChooser.APPROVE_OPTION) {
			file = filechoose.getSelectedFile().getAbsolutePath();
			
		
			try {
				data=readData(file);
				Load();
			}
			catch(Exception error) {
				error.printStackTrace();
			}
		}
	}
	if(e.getSource()==button2l) {
		filechoose();
		returnval=filechoose.showOpenDialog(null);
		if(returnval == JFileChooser.APPROVE_OPTION) {
			file = filechoose.getSelectedFile().getAbsolutePath();
			
		
			try {
				data22=readData2(file);
				Load2();
			}
			catch(Exception error) {
				error.printStackTrace();
			}
		}
	}
	
	if(e.getSource()==student) {
		job="STUDENT";
		Ostaff.setSelected(false);
		Mstaff.setSelected(false);
	}
	if(e.getSource()==Ostaff) {
		job="ORDINARYSTAFF";
		student.setSelected(false);
		Mstaff.setSelected(false);
	}
	if(e.getSource()==Mstaff) {
		job="MANAGEMENTSTAFF";
		student.setSelected(false);
		Ostaff.setSelected(false);
	}
	if(e.getSource()==mspark) {
		parking="MANAGEMENTLOT";
		
		location="FTSMPARKING";
				
		ospark.setSelected(false);
		s1park.setSelected(false);
		s2park.setSelected(false);
		s3park.setSelected(false);
	}
	if(e.getSource()==ospark) {
		parking="STAFFLOT";
		location="FTSMPARKING";
		mspark.setSelected(false);
		s1park.setSelected(false);
		s2park.setSelected(false);
		s3park.setSelected(false);
	}
	if(e.getSource()==s1park) {
		parking="CARLOT";
		location="FTSMPARKING";
		mspark.setSelected(false);
		s2park.setSelected(false);
		s3park.setSelected(false);
		ospark.setSelected(false);
	}
	if(e.getSource()==s2park) {
		parking="MOTORCYCLELOT";
		location="FTSMPARKING";
		ospark.setSelected(false);
		s1park.setSelected(false);
		s3park.setSelected(false);
		mspark.setSelected(false);
	}
	if(e.getSource()==s3park) {
		parking="GENERALLOT";
		location="FTSMPARKING";
		mspark.setSelected(false);
		ospark.setSelected(false);
		s1park.setSelected(false);
		s2park.setSelected(false);
	}
	if(e.getSource()==button1) {
		s3park.setEnabled(false);
		save=1;
		if(removes==1) {
			Remove(1);
		}
		removes=1;
		frame.add(lblvehicle1);
		frame.add(lblnoplate1);
		frame.add(txtnoplate1);
		frame.add(txtvehicle1);
		frame.repaint();
	}
	if(e.getSource()==buttonback1){
		frame.dispose();
		framev.dispose();
	}
	if(e.getSource()==Mlot) {
		Olot.setSelected(false);
		Slot.setSelected(false);	
	}
	if(e.getSource()==Slot) {
		Olot.setSelected(false);
		Mlot.setSelected(false);
	}
	if(e.getSource()==Olot) {
		Mlot.setSelected(false);
		Slot.setSelected(false);
	}
	if(e.getSource()==buttonsave1) {
		if(save==1) {
			for(int i=0;i<people.length;i++) {
				if(people[i]==null) {
					people[i]=new Person(txtname.getText(),txtid.getText(),job);
				break;	
				
				}
			}
			 
				for(int i=0;i<vv.length;i++) {
					if(vv[i]==null) {
						vv[i]= new Vehicle1(txtvehicle1.getText(),txtnoplate1.getText());
						break;
					}
					
			}
			
			
			if(mspark.isSelected()) {
				for(int i=0;i<pl.length;i++) {
					if(pl[i]==null) {
						pl[i]=new ParkingLot(location,parking);
						break;
					}
				}
			}
			if(ospark.isSelected()) {
				for(int i=0;i<pl.length;i++) {
					if(pl[i]==null) {
						pl[i]=new ParkingLot(location,parking);
						break;
					}
				}
			}
			if(s1park.isSelected()) {
				for(int i=0;i<pl.length;i++) {
					if(pl[i]==null) {
						pl[i]=new ParkingLot(location,parking);
						break;
					}
				}
			}
			if(s2park.isSelected()) {
				for(int i=0;i<pl.length;i++) {
					if(pl[i]==null) {
						pl[i]=new ParkingLot(location,parking);
						break;
					}
				}
			}
			if(s3park.isSelected()) {
				for(int i=0;i<pl.length;i++) {
					if(pl[i]==null) {
						pl[i]=new ParkingLot(location,parking);
						break;
					}
				}
			}
			
			writefile(file);
		
			txtname.setText("");
			txtid.setText("");
			txtvehicle1.setText("");
			//txtvehicle2.setText("");
			txtnoplate1.setText("");
			//txtnoplate2.setText("");
			mspark.setSelected(false);
			ospark.setSelected(false);
			s1park.setSelected(false);
			s2park.setSelected(false);
			s3park.setSelected(false);
			student.setSelected(false);
			Ostaff.setSelected(false);
			Mstaff.setSelected(false);
			frame.remove(txtvehicle1);
			frame.remove(txtnoplate1);
			frame.repaint();
		
			}
	}
	
	
	if(e.getSource()==buttonfile1) {
		filechoose();
		returnval=filechoose.showOpenDialog(null);
		if(returnval == JFileChooser.APPROVE_OPTION) {
			file = filechoose.getSelectedFile().getAbsolutePath();
			
			readfile(file);
			try {
				br= new BufferedReader(new FileReader(file));
				
				while((currentline = br.readLine()) != null) {
					
				}
			}
			catch(Exception error) {
				error.printStackTrace();
			}
		}
	}
	if(e.getSource()==buttonfile2) {
		Edit();
	}
	if(e.getSource()==buttonaccept) {
		if (txtname.getText().isEmpty() || txtid.getText().isEmpty()
                || txtjob.getText().isEmpty() || txtvehicle1.getText().isEmpty()
                || txtnoplate1.getText().isEmpty()|| txtL.getText().isEmpty() || txtT.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "INCOMPLETE INPUT.", "ERROR!",
                   JOptionPane.ERROR_MESSAGE);
       } else {
          data[rowIndex][0] = txtname.getText();
          data[rowIndex][1] = txtid.getText();
          data[rowIndex][2] = txtjob.getText().replaceAll(" ","");
          data[rowIndex][3] = txtvehicle1.getText().replaceAll(" ","");
          data[rowIndex][4] = txtnoplate1.getText().replaceAll(" ","");
          data[rowIndex][5] = txtL.getText();
          data[rowIndex][6] = txtT.getText().replaceAll(" ","");
          
          frameedit.dispose();
       }

       data1.updateUI();
	}
	if(e.getSource()==buttoncancel) {
		frameedit.dispose();
	}
	if(e.getSource()==buttondelete) {
		
		loginadmin1();
		
	}
	if(e.getSource()==buttonsave2) {
		filechoose();
		writeupdate(file);
	}
	if(e.getSource()==buttonsave4) {
		filechoose();
		writeupdate2(file);
	}
	if(e.getSource()==buttonsave3) {
		if(save==2) {
			for(int i=0;i<p.length;i++) {
			if(p[i]==null) {
					p[i]=new Person(txtname.getText(),txtid.getText(),job);
				break;	
				
				}
			}
			for(int i=0;i<vh.length;i++) {
				if(vh[i]==null) {
					vh[i]= new Vehicle1(txtvehicle1.getText(),txtnoplate1.getText());
					vh[i+100]= new Vehicle1(txtvehicle2.getText(),txtnoplate2.getText());
					break;
				}
				
		}
			if(mspark.isSelected()) {
				for(int i=0;i<pr.length;i++) {
					if(pr[i]==null) {
						pr[i]=new ParkingLot(location,parking);
						break;
					}
				}
			}
			if(ospark.isSelected()) {
				for(int i=0;i<pr.length;i++) {
					if(pr[i]==null) {
						pr[i]=new ParkingLot(location,parking);
						break;
					}
				}
			}
			if(s1park.isSelected()) {
				for(int i=0;i<pr.length;i++) {
					if(pr[i]==null) {
						pr[i]=new ParkingLot(location,parking);
						break;
					}
				}
			}
			if(s2park.isSelected()) {
				for(int i=0;i<pr.length;i++) {
					if(pr[i]==null) {
						pr[i]=new ParkingLot(location,parking);
						break;
					}
				}
			}
			if(s3park.isSelected()) {
				for(int i=0;i<pr.length;i++) {
					if(pr[i]==null) {
						pr[i]=new ParkingLot(location,parking);
						break;
					}
				}
			}
			writefile2(file);
			txtname.setText("");
			txtid.setText("");
			txtvehicle1.setText("");
			txtvehicle2.setText("");
			txtnoplate1.setText("");
			txtnoplate2.setText("");
			mspark.setSelected(false);
			ospark.setSelected(false);
			s1park.setSelected(false);
			s2park.setSelected(false);
			s3park.setSelected(false);
			student.setSelected(false);
			Ostaff.setSelected(false);
			Mstaff.setSelected(false);
			frame2.remove(lblvehicle2);
			frame2.remove(lblnoplate2);
			frame2.remove(txtvehicle1);
			frame2.remove(txtvehicle2);
			frame2.remove(txtnoplate1);
			frame2.remove(txtnoplate2);
			frame2.repaint();
		}
	}
	if(e.getSource()==buttonfile3) {
		filechoose();
		returnval=filechoose.showOpenDialog(null);
		if(returnval == JFileChooser.APPROVE_OPTION) {
			file = filechoose.getSelectedFile().getAbsolutePath();
			
			readfile2(file);
			try {
				br= new BufferedReader(new FileReader(file));
				
				while((currentline = br.readLine()) != null) {
					
				}
			}
			catch(Exception error) {
				error.printStackTrace();
			}
		}
	}
	if(e.getSource()==buttonback2) {
		frame2.dispose();
		framev.dispose();
	}
	if(e.getSource()==button2) {
		save=2;
		 if(removes==2) {
		Remove(2);
		}
		removes=2;
		frame2.add(lblvehicle1);
		frame2.add(lblnoplate1);
		frame2.add(txtnoplate1);
		frame2.add(txtvehicle1);
		frame2.add(lblvehicle2);
		frame2.add(lblnoplate2);
		frame2.add(txtvehicle2);
		frame2.add(txtnoplate2);
		frame2.repaint();
	}
	if(e.getSource()==buttonback4) {
		frameload2.dispose();
		framelll.dispose();
	}
	if(e.getSource()==buttondelete2) {
		loginadmin2();
	}
	if(e.getSource()==buttonlogin2) {
		String admin = txtadmin.getText();
		String password = txtpss.getText();
		
		if(admin.contains("hakim") && password.contains("rahim")) {
			delete2();
			txtadmin.setText(null);
			txtpss.setText(null);
		}
		else {
			JOptionPane.showMessageDialog(null,"WRONG ID OR PASSWORD","LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
			txtadmin.setText(null);
			txtpss.setText(null);
		}
	}
	if(e.getSource()==buttonb2) {
		framelg2.dispose();
	}
	if(e.getSource()==buttonedit2) {
		Edit2();
	}
	if(e.getSource()==buttonaccept2) {
		if (txtname.getText().isEmpty() || txtid.getText().isEmpty()
                || txtjob.getText().isEmpty() || txtvehicle1.getText().isEmpty()
                || txtnoplate1.getText().isEmpty() || txtvehicle2.getText().isEmpty() || txtnoplate2.getText().isEmpty() || txtL.getText().isEmpty() || txtT.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "INCOMPLETE INPUT.", "ERROR!",
                   JOptionPane.ERROR_MESSAGE);
       } else {
          data22[rowIndex2][0] = txtname.getText();
          data22[rowIndex][1] = txtid.getText();
          data22[rowIndex2][2] = txtjob.getText().replaceAll(" ","");
          data22[rowIndex2][3] = txtvehicle1.getText().replaceAll(" ","");
          data22[rowIndex2][4] = txtnoplate1.getText().replaceAll(" ","");
          data22[rowIndex2][5] = txtvehicle2.getText().replaceAll(" ","");     
          data22[rowIndex2][6] = txtnoplate2.getText().replaceAll(" ","");
          data22[rowIndex2][7] = txtL.getText();
          data22[rowIndex2][8] = txtT.getText().replaceAll(" ","");
          frameedit2.dispose();
       }

       data2.updateUI();
	}
	if(e.getSource()==buttonlogin) {
		String admin = txtadmin.getText();
		String password = txtpss.getText();
		
		if(admin.contains("hakim") && password.contains("rahim")) {
			delete1();
			txtadmin.setText(null);
			txtpss.setText(null);
		}
		else {
			JOptionPane.showMessageDialog(null,"WRONG ID OR PASSWORD","LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
			txtadmin.setText(null);
			txtpss.setText(null);
		}	
	}
	if(e.getSource()==buttonb1) {
		framelg1.dispose();
	}
	if(e.getSource()==buttoncancel2) {
		frameedit2.dispose();
	}

	}
class RowListener implements ListSelectionListener {
    public void valueChanged(ListSelectionEvent event) {
       if (event.getValueIsAdjusting()) {
          rowIndex = data1.getSelectedRow();
         
          if (data[rowIndex][0] == null || data[rowIndex][0] == "") {
             buttonfile2.setEnabled(false);
             buttondelete.setEnabled(false);
             
          } else {
        	  buttonfile2.setEnabled(true);
              buttondelete.setEnabled(true);
             
          }
       }
    }
 }

class RowListeners implements ListSelectionListener {
    public void valueChanged(ListSelectionEvent event) {
       if (event.getValueIsAdjusting()) {
          rowIndex2 = data2.getSelectedRow();
         
          if (data22[rowIndex2][0] == null || data22[rowIndex2][0] == "") {
            
             buttondelete2.setEnabled(false);
             buttonedit2.setEnabled(false);
          } else {
        	 
              buttondelete2.setEnabled(true);
              buttonedit2.setEnabled(true);
          }
       }
    }
 }

public void Start() {
	frame = new JFrame("UKM PARKING LOTS 1 VEHICLE");
	//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);															// framw
	frame.setSize(700,800);
	frame.setResizable(false);
	frame.setLayout(null);
	
	lbltajuk = new JLabel("UKM PARKING LOT");
	lbltajuk.setBounds(20, 10, 136, 60);
	frame.add(lbltajuk);
	frame.repaint();
	
	lblname = new JLabel("NAME   :");
	lblname.setBounds(20, 80, 52, 30);
	frame.add(lblname);
	frame.repaint();
	
	lblid = new JLabel("ID  :");
	lblid.setBounds(232, 84, 29, 22);
	frame.add(lblid);
	frame.repaint();
	
	txtname = new JTextField();
	txtname.setBounds(76, 86, 136, 19);
	frame.add(txtname);
	frame.repaint();
	
	txtid = new JTextField();
	txtid.setBounds(271, 86, 136, 19);
	frame.add(txtid);
	frame.repaint();
	
	 	DocumentFilter filter = new UppercaseDocumentFilter();
        AbstractDocument firstNameDoc = (AbstractDocument) txtname.getDocument();
        firstNameDoc.setDocumentFilter(filter);

        AbstractDocument lastNameDoc = (AbstractDocument) txtid.getDocument();
        lastNameDoc.setDocumentFilter(filter);
           
    lbljob = new JLabel("JOB      :");
    lbljob.setBounds(20, 129, 64, 22);
    frame.add(lbljob);
    frame.repaint();
    
    student = new JRadioButton("Student");
    student.setBounds(76, 130, 80, 21);
    frame.add(student);
    frame.repaint();
    
    Ostaff = new JRadioButton("Ordinary Staff");
    Ostaff.setBounds(306, 130, 136, 21);
    frame.add(Ostaff);
    frame.repaint();
    
    Mstaff = new JRadioButton("Management Staff");
    Mstaff.setBounds(165, 130, 131, 21);
    frame.add(Mstaff);
    frame.repaint();
    
    lblnum = new JLabel("NUM OF VEHICLE :");
    lblnum.setBounds(10, 213, 122, 28);
    frame.add(lblnum);
    frame.repaint();
    
    button1 = new JButton("1");
    button1.setBounds(193, 220, 85, 21);
    button1.setBackground(Color.BLACK);
    button1.setForeground(Color.WHITE);
    frame.add(button1);
    frame.repaint();
   
    
    student.addActionListener(this);
    Ostaff.addActionListener(this);
    Mstaff.addActionListener(this);
    button1.addActionListener(this);

    
    lblvehicle1 = new JLabel("Vehicle  :");
    lblvehicle1.setBounds(142, 274, 52, 30);
    frame.add(lblvehicle1);
    frame.repaint();
    
    lblnoplate1 = new JLabel("NoPlate :");
    lblnoplate1.setBounds(142, 307, 52, 30);
    frame.add(lblnoplate1);
    frame.repaint();
    
    txtnoplate1 = new JTextField();
    txtnoplate1.setBounds(204, 313, 113, 19);
   // frame.add(txtvehicle1);
    frame.repaint();
    
    txtvehicle1 = new JTextField();
    txtvehicle1.setBounds(204, 280, 113, 19);
   // frame.add(txtnoplate1);
    frame.repaint();
    
    
    AbstractDocument noplate1 = (AbstractDocument) txtnoplate1.getDocument();
    noplate1.setDocumentFilter(filter);
    
    AbstractDocument vehicle1 = (AbstractDocument) txtvehicle1.getDocument();
    vehicle1.setDocumentFilter(filter);
     
    lblp =  new JLabel("PARKING LOT  :");
    lblp.setBounds(20, 482, 93, 13);
    frame.add(lblp);
    frame.repaint();
    
    
    lblpn1 = new JLabel("Management Staff");
    lblpn1.setBounds(66, 538, 125, 13);
    frame.add(lblpn1);
    frame.repaint();
    
    lblpn2 = new JLabel("Ordinary Staff");
    lblpn2.setBounds(216, 538, 80, 13);
    frame.add(lblpn2);
    frame.repaint();
    
    lblpn3 = new JLabel("Student & Ordinary Staff");
    lblpn3.setBounds(380, 538, 150, 13);
    frame.add(lblpn3);
    frame.repaint();
    
    lblpl1= new JLabel("FTSM PARKING");
    lblpl1.setBounds(65, 588, 126, 13);
    frame.add(lblpl1);
    frame.repaint();
    
    lblpl2 = new JLabel("FTSM PARKING");
    lblpl2.setBounds(216, 588, 125, 13);
    frame.add(lblpl2);
    frame.repaint();
    
    lblpl3 = new JLabel("FTSM PARKING");
    lblpl3.setBounds(380, 588, 125, 13);
    frame.add(lblpl3);
    frame.repaint();
    
    mspark = new JRadioButton("MANAGEMENT LOTS");
    mspark.setBounds(45, 630, 158, 21);
    frame.add(mspark);
    frame.repaint();
    
    ospark = new JRadioButton("STAFF LOTS");
    ospark.setBounds(204, 630, 103, 21);
    frame.add(ospark);
    frame.repaint();
    
    s1park = new JRadioButton("CAR LOTS");
    s1park.setBounds(361, 630, 103, 21);
    frame.add(s1park);
    frame.repaint();
    
    s2park = new JRadioButton("MOTORCYCLE LOTS");
    s2park.setBounds(361, 666, 185, 21);
    frame.add(s2park);
    frame.repaint();
    
    s3park =new JRadioButton("CAR & MOTORCYCLE LOTS");
    s3park.setBounds(361, 700, 217, 21);
    frame.add(s3park);
    frame.repaint();
    
    
    buttonsave1 = new JButton("SAVE");
    buttonsave1.setBounds(559, 553, 85, 48);
    buttonsave1.setBackground(Color. LIGHT_GRAY);
    frame.add(buttonsave1);
    frame.repaint();
    
    buttonfile1 = new JButton("FILE");
    buttonfile1.setBounds(469, 85, 85, 21);
    buttonfile1.setBackground(Color.LIGHT_GRAY);
    frame.add(buttonfile1);
    frame.repaint();
    
    buttonback1 = new JButton("BACK");
    buttonback1.setBounds(20, 700, 85, 39);
    buttonback1.setBackground(Color.YELLOW);
    frame.add(buttonback1);
    frame.repaint();
    
  
	ospark.addActionListener(this);
	mspark.addActionListener(this);
	s1park.addActionListener(this);
	s2park.addActionListener(this);
	s3park.addActionListener(this);
	buttonsave1.addActionListener(this);
	buttonfile1.addActionListener(this);
	buttonback1.addActionListener(this);
}

public void Remove(int m) {
	if(m==1) {
		frame.remove(lblvehicle1);
		frame.remove(lblnoplate1);
	}
		if(m==2) {
		frame2.remove(lblvehicle1);
		frame2.remove(lblnoplate1);
	}
}
public void Load() {
	
	frameload = new JFrame("PARKING INFORMATION 1 VEHICLE");
	//frameload.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameload.setVisible(true);															// framw
	frameload.setSize(1100,750);
	frameload.setResizable(false);
	frameload.setLayout(null);
	
	buttonback3 = new JButton("BACK");
    buttonback3.setBounds(28, 601, 85, 52);
    buttonback3.setBackground(Color.YELLOW);
    frameload.add(buttonback3);
    frameload.repaint();
    
 
   buttonfile2 = new JButton("EDIT");
   buttonfile2.setBounds(458, 596, 112, 35 );
   frameload.add(buttonfile2);
   buttonfile2.setEnabled(false);
   frameload.repaint();
   
   buttonsave2 = new JButton("SAVE");
   buttonsave2.setBounds(834, 596, 112, 35);
   buttonsave2.setBackground(Color.RED);
   frameload.add(buttonsave2);
   frameload.repaint();
   
   buttondelete = new JButton("REMOVE");
   buttondelete.setBounds(580, 596, 116, 35);
   frameload.add(buttondelete);
   buttondelete.setEnabled(false);
   frameload.repaint();
    
   	buttonfile2.addActionListener(this);
    buttonback3.addActionListener(this);
    buttonsave2.addActionListener(this);
    buttondelete.addActionListener(this);

    String []columnnames = { "NAME","ID","JOB","VEHICLE","NO.PLATE","LOCATION","TYPE OF PARKING"};
    
    
   // int []columnWidth = {150,150,150,150,150,150,150,150};
    
    
    
    
    data1 = new JTable(data,columnnames) {
    public boolean isCellEditable(int row, int column) {
        return false; // returns false, cannot be edited
     }
    };
    data1.setFillsViewportHeight(true);   
    data1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    data1.getSelectionModel().addListSelectionListener(new RowListener());
    data1.getTableHeader().setResizingAllowed(false);
    data1.getTableHeader().setReorderingAllowed(false);
    DefaultTableModel model= new DefaultTableModel();
    JScrollPane scrollPane = new JScrollPane(data1);
	scrollPane.setBounds(10, 10, 1066, 524);
	frameload.getContentPane().add(scrollPane);
	 

    
    
    
    
    
} 
   
public void writefile(String text) {

	try {
		File mywriter = new File(text);
		FileWriter fw= new FileWriter(mywriter,false);
		
		for(int i=0;i<people.length;i++) {
			if(people[i]!=null) {
			
			fw.write(people[i].getName().replaceAll(" ","")+" "+people[i].getId().replaceAll(" ","")+" "+people[i].getJob()+" "+vv[i].getvehicle().replaceAll(" ","")+" "+vv[i].getNoPlate().replaceAll(" ","")+" "+pl[i].getLocation()+" "+pl[i].getType()+"\n");

		}
		
			
}
		fw.close();

	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}

public void writeupdate(String t) {
	try {
		File myupdate = new File (t);
		FileWriter update = new FileWriter(myupdate,false);
		
		for(int r=0;r<data.length;r++) {
			String data11="";
			for(int i=0;i<data[r].length;i++) {
				if(data[r][i]!=null) {
					data11 = data11 + (String)data[r][i]+" ";
				}
			}
			if(data11.trim().length()>0) {
				update.write(data11+System.getProperty("line.separator" ));
			}
		}
		update.flush();
		update.close();
		
	}
	catch(Exception e) {
//		e.printStackTrace();
	}

}
public void writeupdate2(String t) {
	try {
		File myupdate = new File (t);
		FileWriter update = new FileWriter(myupdate,false);
		
		for(int r=0;r<data22.length;r++) {
			String data11="";
			for(int i=0;i<data22[r].length;i++) {
				if(data22[r][i]!=null) {
					data11 = data11 + (String)data22[r][i]+" ";
				}
			}
			if(data11.trim().length()>0) {
				update.write(data11+System.getProperty("line.separator" ));
			}
		}
		update.flush();
		update.close();
		
	}
	catch(Exception e) {
	//	e.printStackTrace();
	}

}

public void filechoose() {
	
	filechoose = new JFileChooser();
	
	setPreferredSize(new Dimension(278,179));
	setLayout(null);
	
}
public void readfile(String d) {
	
	String Name,Id,Job,vehicle,Noplate,Location,Namepark,Type;
	int i=0;
	
	try {
	File myfile= new File(d);
	Scanner scan = new Scanner (myfile);
	
	if(scan != null) {
		while(scan.hasNext()) {
			Name= scan.next();
			Id=scan.next();
			Job=scan.next();
			vehicle=scan.next();
			Noplate=scan.next();
			Location=scan.next();	
			Type=scan.next();
			
			people[i]= new Person(Name,Id,Job);
			vv[i]=new Vehicle1(vehicle,Noplate);
			pl[i]=new ParkingLot(Location,Type);
			i++;
			
	
		}
	}
	
}
	catch(IOException e) {
			System.out.println(e);
	}
}
public String [][] readData(String dir)throws IOException {
	File files = new File(dir);
	String [][] data =new String[50][7];
	
	try {
		int j=countLine(dir);
		Scanner sc = new Scanner (files);
		while(sc.hasNext()) {
			for(int i=0;i<j;i++) {
				for(int h=0;h<7;h++) {
					data[i][h]=sc.next();
				}
			}
		}	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	return data;
}
public int countLine(String filepath)throws IOException {
	File fh=new File(filepath);
	int linecount=0;
	FileReader ff = new FileReader(fh);
	BufferedReader br = new BufferedReader(ff);
	String s;
	while((s=br.readLine())!= null)
	{
		linecount++;
	}
	ff.close();
	return linecount;
	
}
public void Edit() {
	frameedit = new JFrame("UPDATE DATA");
	//frameload.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameedit.setVisible(true);															// framw
	frameedit.setSize(400,430);
	frameedit.setResizable(false);
	frameedit.setLayout(null);
	
	lblname = new JLabel("NAME");
	lblname.setBounds(30, 65, 105, 13);
	frameedit.add(lblname);
	frameedit.repaint();
	
	lblid = new JLabel("ID");
	lblid.setBounds(30, 101, 105, 13);
	frameedit.add(lblid);
	frameedit.repaint();
	
	txtname = new JTextField();
	txtname.setBounds(149, 62, 152, 19);
	frameedit.add(txtname);
	frameedit.repaint();
	
	txtid = new JTextField();
	txtid.setBounds(149, 98, 152, 19);
	frameedit.add(txtid);
	frameedit.repaint();
	
	lbljob = new JLabel("JOB");
    lbljob.setBounds(30, 138, 105, 13);
    frameedit.add(lbljob);
    frameedit.repaint();
    
    txtjob = new JTextField();
	txtjob.setBounds(147, 135, 154, 19);
	frameedit.add(txtjob);
	frameedit.repaint();
	
	lblvehicle1 = new JLabel("Vehicle");
    lblvehicle1.setBounds(30, 176, 146, 13);
    frameedit.add(lblvehicle1);
    frameedit.repaint();
    
    lblnoplate1 = new JLabel("NoPlate");
    lblnoplate1.setBounds(30, 212, 146, 13);
    frameedit.add(lblnoplate1);
    frameedit.repaint();
    
    txtnoplate1 = new JTextField();
    txtnoplate1.setBounds(149, 209, 152, 19);
    frameedit.add(txtnoplate1);
    frameedit.repaint();
    
    txtvehicle1 = new JTextField();
    txtvehicle1.setBounds(147, 173, 154, 19);
    frameedit.add(txtvehicle1);
    frameedit.repaint();
    
    lblL = new JLabel("LOCATION");
    lblL.setBounds(30, 247, 146, 13);
    frameedit.add(lblL);
    frameedit.repaint();
    
    
    lblT = new JLabel("TYPE OF PARKING");
    lblT.setBounds(30, 279, 130, 13);
    frameedit.add(lblT);
    frameedit.repaint();
    
    txtL = new JTextField();
    txtL.setBounds(149, 244, 152, 19);
    frameedit.add(txtL);
    frameedit.repaint();
    
    
    txtT = new JTextField();
    txtT.setBounds(149, 276, 152, 19);
    frameedit.add(txtT);
    frameedit.repaint();
    
    buttonaccept = new JButton("ACCEPT");
    buttonaccept.setBounds(30, 332, 105, 34);
    buttonaccept.setBackground(Color.ORANGE);
    frameedit.add(buttonaccept);
    frameedit.repaint();
    
    buttoncancel = new JButton("CANCEL");
    buttoncancel.setBounds(136, 332, 105, 34);
    buttoncancel.setBackground(Color.YELLOW);
    frameedit.add(buttoncancel);
    frameedit.repaint();
    
    buttonaccept.addActionListener(this);
    buttoncancel.addActionListener(this);
	
 	DocumentFilter filter = new UppercaseDocumentFilter();
    AbstractDocument firstNameDoc = (AbstractDocument) txtname.getDocument();
    firstNameDoc.setDocumentFilter(filter);

    AbstractDocument lastNameDoc = (AbstractDocument) txtid.getDocument();
    lastNameDoc.setDocumentFilter(filter);
    
    AbstractDocument job = (AbstractDocument) txtjob.getDocument();
    job.setDocumentFilter(filter);

    AbstractDocument vehicle = (AbstractDocument) txtvehicle1.getDocument();
    vehicle.setDocumentFilter(filter);
    
    AbstractDocument NOP = (AbstractDocument) txtnoplate1.getDocument();
    NOP.setDocumentFilter(filter);

    AbstractDocument L= (AbstractDocument) txtL.getDocument();
    L.setDocumentFilter(filter);
    
    AbstractDocument T = (AbstractDocument) txtT.getDocument();
    T.setDocumentFilter(filter);
    

    
    txtname.setText(data[rowIndex][0] + "");   
    txtid.setText(data[rowIndex][1] + "");  
    if(data[rowIndex][2]=="STUDENT" || data[rowIndex][2]=="STUDENT") {
    	txtjob.setEditable(false);
    }
    else {
    	txtjob.setEditable(true);
    }
    txtjob.setText(data[rowIndex][2] + "");     
    txtvehicle1.setText(data[rowIndex][3] + "");      
    txtnoplate1.setText(data[rowIndex][4] + ""); 
    txtL.setText(data[rowIndex][5]+ ""); 
    txtT.setText(data[rowIndex][6]+ "");
    txtname.setEditable(false);
    txtid.setEditable(false);
    txtL.setEditable(false);
    
}
	public void vehicle2() {
		frame2 = new JFrame("UKM PARKING LOTS 2 VEHICLE");
		//frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);															// framw
		frame2.setSize(800,800);
		frame2.setResizable(false);
		frame2.setLayout(null);
		
		lbltajuk = new JLabel("UKM PARKING LOT");
		lbltajuk.setBounds(20, 10, 136, 60);
		frame2.add(lbltajuk);
		frame2.repaint();
		
		lblname = new JLabel("NAME   :");
		lblname.setBounds(20, 80, 52, 30);
		frame2.add(lblname);
		frame2.repaint();
		
		lblid = new JLabel("ID  :");
		lblid.setBounds(232, 84, 29, 22);
		frame2.add(lblid);
		frame2.repaint();
		
		txtname = new JTextField();
		txtname.setBounds(76, 86, 136, 19);
		frame2.add(txtname);
		frame2.repaint();
		
		txtid = new JTextField();
		txtid.setBounds(271, 86, 136, 19);
		frame2.add(txtid);
		frame2.repaint();
		
		 	DocumentFilter filter = new UppercaseDocumentFilter();
	        AbstractDocument firstNameDoc = (AbstractDocument) txtname.getDocument();
	        firstNameDoc.setDocumentFilter(filter);

	        AbstractDocument lastNameDoc = (AbstractDocument) txtid.getDocument();
	        lastNameDoc.setDocumentFilter(filter);
	    
	        lbljob = new JLabel("JOB      :");
		    lbljob.setBounds(20, 129, 64, 22);
		    frame2.add(lbljob);
		    frame2.repaint();
		    
		    student = new JRadioButton("Student");
		    student.setBounds(76, 130, 80, 21);
		    frame2.add(student);
		    frame2.repaint();
		    
		    Ostaff = new JRadioButton("Ordinary Staff");
		    Ostaff.setBounds(306, 130, 136, 21);
		    frame2.add(Ostaff);
		    frame2.repaint();
		    
		    Mstaff = new JRadioButton("Management Staff");
		    Mstaff.setBounds(165, 130, 131, 21);
		    frame2.add(Mstaff);
		    frame2.repaint();
		    
		    lblnum = new JLabel("NUM OF VEHICLE :");
		    lblnum.setBounds(10, 213, 122, 28);
		    frame2.add(lblnum);
		    frame2.repaint();
		    
		    button2 = new JButton("2");
			button2.setBounds(193, 220, 85, 21);
			button2.setForeground(Color.WHITE);
			button2.setBackground(Color.BLACK);
			frame2.add(button2);
			frame2.repaint();
			
			student.addActionListener(this);
		    Ostaff.addActionListener(this);
		    Mstaff.addActionListener(this);
		    button2.addActionListener(this);
		    
		    lblvehicle1 = new JLabel("Vehicle  :");
		    lblvehicle1.setBounds(142, 274, 52, 30);
		    frame2.add(lblvehicle1);
		    frame2.repaint();
		    
		    lblnoplate1 = new JLabel("NoPlate :");
		    lblnoplate1.setBounds(142, 307, 52, 30);
		    frame2.add(lblnoplate1);
		    frame2.repaint();
		    
		    txtnoplate1 = new JTextField();
		    txtnoplate1.setBounds(204, 313, 113, 19);
		   // frame.add(txtvehicle1);
		    frame2.repaint();
		    
		    txtvehicle1 = new JTextField();
		    txtvehicle1.setBounds(204, 280, 113, 19);
		   // frame.add(txtnoplate1);
		    frame2.repaint();
	        

		    lblvehicle2 = new JLabel("Vehicle  :");
		    lblvehicle2.setBounds(142, 356, 57, 30);
		   // frame.add(lblvehicle2);
		    frame2.repaint();
		    
		    lblnoplate2 = new JLabel("NoPlate :");
		    lblnoplate2.setBounds(142, 398, 57, 13);
		   // frame.add(lblnoplate2);
		   	frame2.repaint();
		    
		    txtvehicle2 = new JTextField();
		    txtvehicle2.setBounds(204, 362, 113, 19);
		    //frame.add(txtvehicle2);
		    frame2.repaint();
		    
		    txtnoplate2 = new JTextField();
		    txtnoplate2.setBounds(204, 395, 113, 19);
		  //  frame2.add(txtnoplate2);
		    frame2.repaint();
		    
		    AbstractDocument noplate1 = (AbstractDocument) txtnoplate1.getDocument();
	        noplate1.setDocumentFilter(filter);
	        
	        AbstractDocument vehicle1 = (AbstractDocument) txtvehicle1.getDocument();
	        vehicle1.setDocumentFilter(filter);
	        
	        AbstractDocument vehicle2 = (AbstractDocument) txtvehicle2.getDocument();
	       vehicle2.setDocumentFilter(filter);
	        
	        AbstractDocument noplate2 = (AbstractDocument) txtnoplate2.getDocument();
	       noplate2.setDocumentFilter(filter);
	       
	       lblp =  new JLabel("PARKING LOT  :");
	       lblp.setBounds(20, 482, 93, 13);
	       frame2.add(lblp);
	       frame2.repaint();
	       
	       
	       lblpn1 = new JLabel("Management Staff");
	       lblpn1.setBounds(66, 538, 125, 13);
	       frame2.add(lblpn1);
	       frame2.repaint();
	       
	       lblpn2 = new JLabel("Ordinary Staff");
	       lblpn2.setBounds(216, 538, 80, 13);
	       frame2.add(lblpn2);
	       frame2.repaint();
	       
	       lblpn3 = new JLabel("Student & Ordinary Staff");
	       lblpn3.setBounds(380, 538, 150, 13);
	       frame2.add(lblpn3);
	       frame2.repaint();
	       
	       lblpl1= new JLabel("FTSM PARKING");
	       lblpl1.setBounds(65, 588, 126, 13);
	       frame2.add(lblpl1);
	       frame2.repaint();
	       
	       lblpl2 = new JLabel("FTSM PARKING");
	       lblpl2.setBounds(216, 588, 125, 13);
	       frame2.add(lblpl2);
	       frame2.repaint();
	       
	       lblpl3 = new JLabel("FTSM PARKING");
	       lblpl3.setBounds(380, 588, 125, 13);
	       frame2.add(lblpl3);
	       frame2.repaint();
	       
	       mspark = new JRadioButton("MANAGEMENT LOTS");
	       mspark.setBounds(45, 630, 158, 21);
	       frame2.add(mspark);
	       frame2.repaint();
	       
	       ospark = new JRadioButton("STAFF LOTS");
	       ospark.setBounds(204, 630, 103, 21);
	       frame2.add(ospark);
	       frame2.repaint();
	       
	       s1park = new JRadioButton("CAR LOTS");
	       s1park.setBounds(361, 630, 103, 21);
	       frame2.add(s1park);
	       frame2.repaint();
	       
	       s2park = new JRadioButton("MOTORCYCLE LOTS");
	       s2park.setBounds(361, 666, 185, 21);
	       frame2.add(s2park);
	       frame2.repaint();
	       
	       s3park =new JRadioButton("CAR & MOTORCYCLE LOTS");
	       s3park.setBounds(361, 700, 217, 21);
	       frame2.add(s3park);
	       frame2.repaint();
	       
	       buttonsave3 = new JButton("SAVE");
	       buttonsave3.setBounds(559, 553, 85, 48);
	       buttonsave3.setBackground(Color.LIGHT_GRAY);
	       frame2.add(buttonsave3);
	       frame2.repaint();
	       
	       buttonfile3 = new JButton("FILE");
	       buttonfile3.setBounds(469, 85, 85, 21);
	       buttonfile3.setBackground(Color.LIGHT_GRAY);
	       frame2.add(buttonfile3);
	       frame2.repaint();
	       
	       buttonback2 = new JButton("BACK");
	       buttonback2.setBounds(20, 700, 85, 39);
	       buttonback2.setBackground(Color.YELLOW);
	       frame2.add(buttonback2);
	       frame2.repaint();
	       
			ospark.addActionListener(this);
			mspark.addActionListener(this);
			s1park.addActionListener(this);
			s2park.addActionListener(this);
			s3park.addActionListener(this);
			buttonsave3.addActionListener(this);
			buttonfile3.addActionListener(this);
		    buttonback2.addActionListener(this);
	}
	public void Load2(){
		frameload2 = new JFrame("PARKING INFORMATION 2 VEHICLE");
		//frameload.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameload2.setVisible(true);															// framw
		frameload2.setSize(1350,600);
		frameload2.setResizable(false);
		frameload2.setLayout(null);
		
		buttondelete2 = new JButton("REMOVE");
		buttondelete2.setBounds(858, 505, 116, 35);
		frameload2.add(buttondelete2);
		frameload2.repaint();
		buttondelete2.setEnabled(false);
		
		buttonback4 = new JButton("BACK");
		buttonback4.setBounds(36, 505, 85, 48);
		buttonback4.setBackground(Color.YELLOW);
		frameload2.add(buttonback4);
		frameload2.repaint();
		
		
		buttonsave4 = new JButton("SAVE");
		buttonsave4.setBounds(1030, 505, 116, 35);
		buttonsave4.setBackground(Color.RED);
		frameload2.add(buttonsave4);
		frameload2.repaint();
		
		
		buttonedit2 = new JButton("EDIT");
		buttonedit2.setBounds(736, 505, 112, 35);
		frameload2.add(buttonedit2);
		frameload2.repaint();
		buttonedit2.setEnabled(false);
		
		buttonedit2.addActionListener(this);
		buttonsave4.addActionListener(this);
		buttonback4.addActionListener(this);
		buttondelete2.addActionListener(this);
		
		
		String [] column = {"NAME","ID","JOB","VEHICLE","NO.PLATE","VEHICLE","NOP.PLATE","LOCATION","TYPE OF PARKING"};
		
		
		
		 		data2 = new JTable(data22,column) {
			    public boolean isCellEditable(int row, int column) {
			        return false; // returns false, cannot be edited
			     }
			    };
			    data2.setFillsViewportHeight(true);   
			    data2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			    data2.getSelectionModel().addListSelectionListener(new RowListeners());
			    data2.getTableHeader().setResizingAllowed(false);
			    data2.getTableHeader().setReorderingAllowed(false);
			    DefaultTableModel model= new DefaultTableModel();
			    JScrollPane scrollPane = new JScrollPane(data2);
				scrollPane.setBounds(10, 10, 1304, 425);
				frameload2.getContentPane().add(scrollPane);
				 
	}
	public String [][] readData2(String dir)throws IOException {
		File files = new File(dir);
		String [][] data =new String[50][9];
		
		try {
			int j=countLine(dir);
			Scanner sc = new Scanner (files);
			while(sc.hasNext()) {
				for(int i=0;i<j;i++) {
					for(int h=0;h<9;h++) {
						data[i][h]=sc.next();
					}
				}
			}	}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		return data;
	}
	public void writefile2(String text) {
		try {
			File mywriter = new File(text);
			FileWriter fw= new FileWriter(mywriter,false);
			
			for(int i=0;i<p.length;i++) {
				if(p[i]!=null) {
				
				fw.write(p[i].getName().replaceAll(" ","")+" "+p[i].getId().replaceAll(" ","")+" "+p[i].getJob()+" "+vh[i].getvehicle().replaceAll(" ","")+" "+vh[i].getNoPlate().replaceAll(" ","")+" "+vh[i+100].getvehicle().replaceAll(" ","")+" "+vh[i+100].getNoPlate().replaceAll(" ","")+" "+pr[i].getLocation()+" "+pr[i].getType()+"\n");
				
			}
			
				
	}
			fw.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		
	  }
	 }
	public void readfile2(String dir) {
		String Name,Id,Job,vehicle,vehicle2,Noplate2,Noplate,Location,Namepark,Type;
		int i=0;
		try {
			File myfile= new File(dir);
			Scanner scan = new Scanner (myfile);
			
			if(scan != null) {
				while(scan.hasNext()) {
					Name= scan.next();
					Id=scan.next();
					Job=scan.next();
					vehicle=scan.next();
					Noplate=scan.next();
					vehicle2=scan.next();
					Noplate2=scan.next();
					Location=scan.next();
					Type=scan.next();
					
					
					
					p[i]= new Person(Name,Id,Job);
					vh[i]=new Vehicle1(vehicle,Noplate);
					vh[i+100]=new Vehicle1(vehicle2,Noplate2);
					pr[i]=new ParkingLot(Location,Type);
					i++;

				}
			}
			
		}
			catch(IOException e) {
					System.out.println(e);
			}
		
	}
	public void Edit2() {
		frameedit2 = new JFrame("UPDATE DATA");
		//frameload.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameedit2.setVisible(true);															// framw
		frameedit2.setSize(400,500);
		frameedit2.setResizable(false);
		frameedit2.setLayout(null);
		
		lblname = new JLabel("NAME");
		lblname.setBounds(30, 65, 105, 13);
		frameedit2.add(lblname);
		frameedit2.repaint();
		
		lblid = new JLabel("ID");
		lblid.setBounds(30, 101, 105, 13);
		frameedit2.add(lblid);
		frameedit2.repaint();
		
		txtname = new JTextField();
		txtname.setBounds(149, 62, 152, 19);
		frameedit2.add(txtname);
		frameedit2.repaint();
		
		txtid = new JTextField();
		txtid.setBounds(149, 98, 152, 19);
		frameedit2.add(txtid);
		frameedit2.repaint();
		
		lbljob = new JLabel("JOB");
	    lbljob.setBounds(30, 138, 105, 13);
	    frameedit2.add(lbljob);
	    frameedit2.repaint();
	    
	    txtjob = new JTextField();
		txtjob.setBounds(147, 135, 154, 19);
		frameedit2.add(txtjob);
		frameedit2.repaint();
		
		lblvehicle1 = new JLabel("Vehicle");
	    lblvehicle1.setBounds(30, 176, 146, 13);
	    frameedit2.add(lblvehicle1);
	    frameedit2.repaint();
	    
	    lblnoplate1 = new JLabel("NoPlate");
	    lblnoplate1.setBounds(30, 212, 146, 13);
	    frameedit2.add(lblnoplate1);
	    frameedit2.repaint();
	    
		lblvehicle2 = new JLabel("Vehicle");
	    lblvehicle2.setBounds(30, 246, 130, 19);
	    frameedit2.add(lblvehicle2);
	    frameedit2.repaint();
	    
	    lblnoplate2 = new JLabel("NoPlate");
	    lblnoplate2.setBounds(30, 281, 130, 21);
	    frameedit2.add(lblnoplate2);
	    frameedit2.repaint();
	    
	    txtnoplate1 = new JTextField();
	    txtnoplate1.setBounds(149, 209, 152, 19);
	    frameedit2.add(txtnoplate1);
	    frameedit2.repaint();
	    
	    txtvehicle1 = new JTextField();
	    txtvehicle1.setBounds(147, 173, 154, 19);
	    frameedit2.add(txtvehicle1);
	    frameedit2.repaint();
	    
	    txtnoplate2 = new JTextField();
	    txtnoplate2.setBounds(149, 282, 152, 19);
	    frameedit2.add(txtnoplate2);
	    frameedit2.repaint();
	    
	    txtvehicle2 = new JTextField();
	    txtvehicle2.setBounds(149, 246, 152, 19);
	    frameedit2.add(txtvehicle2);
	    frameedit2.repaint();
	    
	    lblL = new JLabel("LOCATION");
	    lblL.setBounds(30, 322, 146, 13);
	    frameedit2.add(lblL);
	    frameedit2.repaint();
	    
	    
	    lblT = new JLabel("TYPE OF PARKING");
	    lblT.setBounds(30, 359, 130, 13);
	    frameedit2.add(lblT);
	    frameedit2.repaint();
	    
	    txtL = new JTextField();
	    txtL.setBounds(149, 319, 152, 19);
	    frameedit2.add(txtL);
	    frameedit2.repaint();
	    
	    
	    txtT = new JTextField();
	    txtT.setBounds(149, 353, 152, 19);
	    frameedit2.add(txtT);
	    frameedit2.repaint();
	    
	    buttonaccept2 = new JButton("ACCEPT");
	    buttonaccept2.setBounds(58, 419, 118, 34);
	    buttonaccept2.setBackground(Color.ORANGE);
	    frameedit2.add(buttonaccept2);
	    frameedit2.repaint();
	    
	    buttoncancel2 = new JButton("CANCEL");
	    buttoncancel2.setBounds(183, 419, 118, 34);
	    buttoncancel2.setBackground(Color.YELLOW);
	    frameedit2.add(buttoncancel2);
	    frameedit2.repaint();
	    
	    buttonaccept2.addActionListener(this);
	    buttoncancel2.addActionListener(this);
	    
	    DocumentFilter filter = new UppercaseDocumentFilter();
	    AbstractDocument firstNameDoc = (AbstractDocument) txtname.getDocument();
	    firstNameDoc.setDocumentFilter(filter);

	    AbstractDocument lastNameDoc = (AbstractDocument) txtid.getDocument();
	    lastNameDoc.setDocumentFilter(filter);
	    
	    AbstractDocument job = (AbstractDocument) txtjob.getDocument();
	    job.setDocumentFilter(filter);

	    AbstractDocument vehicle = (AbstractDocument) txtvehicle1.getDocument();
	    vehicle.setDocumentFilter(filter);
	    
	    AbstractDocument NOP = (AbstractDocument) txtnoplate1.getDocument();
	    NOP.setDocumentFilter(filter);

	    AbstractDocument L= (AbstractDocument) txtL.getDocument();
	    L.setDocumentFilter(filter);
	    
	    AbstractDocument T = (AbstractDocument) txtT.getDocument();
	    T.setDocumentFilter(filter);
	    
	    AbstractDocument vehicle2 = (AbstractDocument) txtvehicle2.getDocument();
	    vehicle2.setDocumentFilter(filter);
	    
	    AbstractDocument NOP2 = (AbstractDocument) txtnoplate2.getDocument();
	    NOP2.setDocumentFilter(filter);
	    
	    
	    txtname.setText(data22[rowIndex2][0] + "");   
	    txtid.setText(data22[rowIndex2][1] + "");      
	    txtjob.setText(data22[rowIndex2][2] + "");    	 
	    txtvehicle1.setText(data22[rowIndex2][3] + "");      
	    txtnoplate1.setText(data22[rowIndex2][4] + ""); 
	    txtvehicle2.setText(data22[rowIndex2][5]+ "");
	    txtnoplate2.setText(data22[rowIndex2][6]+ "");
	    txtL.setText(data22[rowIndex2][7]+ ""); 
	    txtT.setText(data22[rowIndex2][8]+ "");
	    
	    txtname.setEditable(false);
	    txtid.setEditable(false);
	    txtL.setEditable(false);
	    
	}
	public void loginadmin1() {
		
		framelg1 = new JFrame("ADMIN");
		//frameload.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framelg1.setVisible(true);															// framw
		framelg1.setSize(400,350);
		framelg1.setResizable(false);
		framelg1.setLayout(null);
		
		lbladmin = new JLabel("ADMIN ID");
	    lbladmin.setBounds(27, 69, 104, 24);
	    framelg1.add(lbladmin);
	    framelg1.repaint();
	    
	    lblpss = new JLabel("PASSWORD");
	    lblpss.setBounds(27, 124, 89, 24);
	    framelg1.add(lblpss);
	    framelg1.repaint();
	    
	    txtadmin = new JTextField();
	    txtadmin.setBounds(119, 71, 150, 21);
	    framelg1.add(txtadmin);
	    framelg1.repaint();
	    
	    txtpss = new JTextField();
	    txtpss.setBounds(119, 127, 150, 19);
	    framelg1.add(txtpss);
	    framelg1.repaint();
	    
	    buttonlogin = new JButton("LOGIN");
	    buttonlogin.setBounds(255, 191, 104, 34);
	    framelg1.add(buttonlogin);
	    framelg1.repaint();
	    
	   buttonb1 = new JButton("BACK");
	   buttonb1.setBounds(10, 269, 106, 34);
	   framelg1.add(buttonb1);
	   framelg1.repaint();
	   
	   buttonlogin.addActionListener(this);
	   buttonb1.addActionListener(this);
		   
		
	}
	public void delete1() {
		int confirm = JOptionPane.showConfirmDialog(frame, "ARE YOU SURE?", "CONFIRM",
                JOptionPane.YES_NO_OPTION);

       if (confirm == 0) {
          rowIndex = data1.getSelectedRow();
          rowNumber = 0;

          noOfStudents--;
          for (int i = 0; i <= 10; i++) {
             if (rowIndex != i && i <= noOfStudents) {
                data[rowIndex][0] = data[i][0];
                data[rowIndex][1] = data[i][1];
                data[rowIndex][2] = data[i][2];
                data[rowIndex][3] = data[i][3];
                data[rowIndex][4] = data[i][4];
                data[rowIndex][5] = data[i][5];
                data[rowIndex][6] = data[i][6];
                rowNumber++;
             } else if (rowIndex != i && i > noOfStudents) {
                data[rowIndex][0] = "";
                data[rowIndex][1] = "";
                data[rowIndex][2] = "";
                data[rowIndex][3] = "";
                data[rowIndex][4] = "";
                data[rowIndex][5] = "";
                data[rowIndex][6] = "";
                rowNumber++;
             }
          }
        

			rowIndex = data1.getSelectedRow();
			if (data[rowIndex][0] == null || data[rowIndex][0] == "") {
				buttonfile2.setEnabled(false);
	             buttondelete.setEnabled(false);
			} else {
				buttonfile2.setEnabled(true);
	            buttondelete.setEnabled(true);
			}

			data1.updateUI();
			framelg1.dispose();
       }
	}
	public void loginadmin2() {
		framelg2 = new JFrame("ADMIN");
		//frameload.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framelg2.setVisible(true);															// framw
		framelg2.setSize(400,350);
		framelg2.setResizable(false);
		framelg2.setLayout(null);
		
		lbladmin = new JLabel("ADMIN ID");
	    lbladmin.setBounds(27, 69, 104, 24);
	    framelg2.add(lbladmin);
	    framelg2.repaint();
	    
	    lblpss = new JLabel("PASSWORD");
	    lblpss.setBounds(27, 124, 89, 24);
	    framelg2.add(lblpss);
	    framelg2.repaint();
	    
	    txtadmin = new JTextField();
	    txtadmin.setBounds(119, 71, 150, 21);
	    framelg2.add(txtadmin);
	    framelg2.repaint();
	    
	    txtpss = new JTextField();
	    txtpss.setBounds(119, 127, 150, 19);
	    framelg2.add(txtpss);
	    framelg2.repaint();
	    
	    buttonlogin2= new JButton("LOGIN");
	    buttonlogin2.setBounds(255, 191, 104, 34);
	    framelg2.add(buttonlogin2);
	    framelg2.repaint();
	    
	    
	   buttonb2 = new JButton("BACK");
	   buttonb2.setBounds(10, 269, 106, 34);
	   framelg2.add(buttonb2);
	   framelg2.repaint();
	   
	   buttonlogin2.addActionListener(this);
	   buttonb2.addActionListener(this);
	}
	public void delete2() {
		int confirm = JOptionPane.showConfirmDialog(frame, "ARE YOU SURE?", "CONFIRM",
                JOptionPane.YES_NO_OPTION);

       if (confirm == 0) {
          rowIndex2 = data2.getSelectedRow();
          rowNumber = 0;

          noOfStudents--;
          for (int i = 0; i <= 10; i++) {
             if (rowIndex2 != i && i <= noOfStudents) {
                data22[rowIndex2][0] = data22[i][0];
                data22[rowIndex2][1] = data22[i][1];
                data22[rowIndex2][2] = data22[i][2];
                data22[rowIndex2][3] = data22[i][3];
                data22[rowIndex2][4] = data22[i][4];
                data22[rowIndex2][5] = data22[i][5];
                data22[rowIndex2][6] = data22[i][6];
                data22[rowIndex2][7] = data22[i][7];
                data22[rowIndex2][8] = data22[i][8];
                rowNumber++;
             } else if (rowIndex2 != i && i > noOfStudents) {
                data22[rowIndex2][0] = "";
                data22[rowIndex2][1] = "";
                data22[rowIndex2][2] = "";
                data22[rowIndex2][3] = "";
                data22[rowIndex2][4] = "";
                data22[rowIndex2][5] = "";
                data22[rowIndex2][6] = "";
                data22[rowIndex2][7] = "";
                data22[rowIndex2][8] = "";
                rowNumber++;
             }
          }
        

			rowIndex2 = data2.getSelectedRow();
			if (data22[rowIndex2][0] == null || data22[rowIndex2][0] == "") {
				buttonedit2.setEnabled(false);
	             buttondelete2.setEnabled(false);
			} else {
				buttonedit2.setEnabled(true);
	            buttondelete2.setEnabled(true);
			}
			
			data2.updateUI();
			framelg2.dispose();
       }
		
	}
	
}