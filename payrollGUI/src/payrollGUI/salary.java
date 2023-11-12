package payrollGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class salary {

	private JFrame frame;
	private JTextField textFieldEmpName;
	private JTextField textFieldRatePerHour;
	private JTextField textFieldHours;
	private JTextField textFieldDays;
	private JTextField textFieldGROSSSALARY;
	private JTextField textFieldWageTax;
	private JTextField textFieldphtax;
	private JTextField textFieldSSS;
	private JTextField textFieldTotalded;
	private JTextField textFieldGrossSalary;
	private JTextField textFieldDed;
	private JTextField textFieldNetSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					salary window = new salary();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public salary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1064, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Payroll System");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel.setBounds(362, 24, 307, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(46, 133, 124, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rate Per Hour:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(46, 169, 100, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hour Per Day:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(46, 198, 113, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Number of days worked:");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 233, 164, 27);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("GROSS SALARY:");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_5.setBounds(10, 333, 149, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		textFieldEmpName = new JTextField();
		textFieldEmpName.setBounds(198, 129, 133, 25);
		frame.getContentPane().add(textFieldEmpName);
		textFieldEmpName.setColumns(10);
		
		textFieldRatePerHour = new JTextField();
		textFieldRatePerHour.setBounds(198, 167, 133, 25);
		frame.getContentPane().add(textFieldRatePerHour);
		textFieldRatePerHour.setColumns(10);
		
		textFieldHours = new JTextField();
		textFieldHours.setBounds(198, 202, 133, 25);
		frame.getContentPane().add(textFieldHours);
		textFieldHours.setColumns(10);
		
		textFieldDays = new JTextField();
		textFieldDays.setBounds(198, 241, 133, 25);
		frame.getContentPane().add(textFieldDays);
		textFieldDays.setColumns(10);
		
		textFieldGROSSSALARY = new JTextField();
		textFieldGROSSSALARY.setEditable(false);
		textFieldGROSSSALARY.setBounds(198, 327, 133, 25);
		frame.getContentPane().add(textFieldGROSSSALARY);
		textFieldGROSSSALARY.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_6.setForeground(new Color(128, 0, 0));
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_6.setBounds(413, 138, 213, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		textFieldWageTax = new JTextField();
		textFieldWageTax.setEditable(false);
		textFieldWageTax.setBounds(586, 170, 106, 25);
		frame.getContentPane().add(textFieldWageTax);
		textFieldWageTax.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("TAX 15% of Monthly Wage");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(362, 173, 183, 21);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Philhealth 5%");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(445, 217, 100, 22);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("SSS 2%");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(473, 270, 72, 13);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("TOTAL DEDUCTION:");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_10.setBounds(381, 330, 164, 22);
		frame.getContentPane().add(lblNewLabel_10);
		
		textFieldphtax = new JTextField();
		textFieldphtax.setEditable(false);
		textFieldphtax.setBounds(586, 217, 106, 25);
		frame.getContentPane().add(textFieldphtax);
		textFieldphtax.setColumns(10);
		
		textFieldSSS = new JTextField();
		textFieldSSS.setEditable(false);
		textFieldSSS.setBounds(586, 262, 106, 25);
		frame.getContentPane().add(textFieldSSS);
		textFieldSSS.setColumns(10);
		
		textFieldTotalded = new JTextField();
		textFieldTotalded.setEditable(false);
		textFieldTotalded.setBounds(586, 323, 106, 25);
		frame.getContentPane().add(textFieldTotalded);
		textFieldTotalded.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Gross Salary:");
		lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(757, 156, 96, 22);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Deduction:");
		lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(768, 201, 85, 18);
		frame.getContentPane().add(lblNewLabel_12);
		
		textFieldGrossSalary = new JTextField();
		textFieldGrossSalary.setEditable(false);
		textFieldGrossSalary.setBounds(873, 153, 124, 31);
		frame.getContentPane().add(textFieldGrossSalary);
		textFieldGrossSalary.setColumns(10);
		
		textFieldDed = new JTextField();
		textFieldDed.setEditable(false);
		textFieldDed.setBounds(873, 198, 124, 29);
		frame.getContentPane().add(textFieldDed);
		textFieldDed.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("NET SALARY:");
		lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_13.setBounds(727, 328, 126, 21);
		frame.getContentPane().add(lblNewLabel_13);
		
		textFieldNetSalary = new JTextField();
		textFieldNetSalary.setEditable(false);
		textFieldNetSalary.setBounds(879, 323, 118, 26);
		frame.getContentPane().add(textFieldNetSalary);
		textFieldNetSalary.setColumns(10);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.setForeground(new Color(255, 255, 255));
		btnCompute.setBackground(new Color(0, 64, 64));
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String empname;
			int rateperhour,hoursperday,daysworked,gross_sal;
			double wagetax,phtax,ssstax,ded,netsal;
			empname=textFieldEmpName.getText();
			rateperhour=Integer.parseInt(textFieldRatePerHour.getText());
			hoursperday=Integer.parseInt(textFieldHours.getText());
			daysworked=Integer.parseInt(textFieldDays.getText());
			gross_sal=(rateperhour*hoursperday)*daysworked;
			textFieldGROSSSALARY.setText(String.valueOf(gross_sal));
			wagetax=0.15*gross_sal;
			wagetax=Math.round(wagetax);
			phtax=0.05*gross_sal;
			phtax=Math.round(phtax);
			ssstax=0.02*gross_sal;
			ssstax=Math.round(ssstax);
			textFieldWageTax.setText(String.valueOf(wagetax));
			textFieldphtax.setText(String.valueOf(phtax));
			textFieldSSS.setText(String.valueOf(ssstax));
			ded=wagetax+phtax+ssstax;
			textFieldTotalded.setText(String.valueOf(ded));
			textFieldGrossSalary.setText(String.valueOf(gross_sal));
			textFieldDed.setText(String.valueOf(ded));
			netsal=gross_sal-ded;
			textFieldNetSalary.setText(String.valueOf(netsal));
			}
		});
		btnCompute.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCompute.setBounds(426, 363, 149, 36);
		frame.getContentPane().add(btnCompute);
		
		JLabel lblNewLabelicon1 = new JLabel("");
		Image icons=new ImageIcon(this.getClass().getResource("/moneyicon.png")).getImage();
		lblNewLabelicon1.setIcon(new ImageIcon(icons));
		lblNewLabelicon1.setBounds(68, 41, 78, 47);
		frame.getContentPane().add(lblNewLabelicon1);
		
		JLabel lblNewLabelicon2 = new JLabel("");
		Image icon=new ImageIcon(this.getClass().getResource("/moneyicon.png")).getImage();
		lblNewLabelicon2.setIcon(new ImageIcon(icon));
		lblNewLabelicon2.setBounds(926, 41, 64, 47);
		frame.getContentPane().add(lblNewLabelicon2);
	}
}
