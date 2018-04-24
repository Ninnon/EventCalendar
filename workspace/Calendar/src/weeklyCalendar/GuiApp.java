package weeklyCalendar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.Collections;

public class GuiApp extends JFrame {

	private JPanel contentPane;
	StringBuilder sb = new StringBuilder();
	Week week = new Week();
	 

	
	public static void main(String[] args) {
	    
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiApp frame = new GuiApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public GuiApp() {
		
		 
		week.readFile();
	       
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(60, 50, 1400, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{64, 38, 41, 203, 45, 35, 44, 0};
		gbl_contentPane.rowHeights = new int[]{14, 245, 23, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblSunday = new GridBagConstraints();
		gbc_lblSunday.insets = new Insets(0, 0, 5, 5);
		gbc_lblSunday.gridx = 0;
		gbc_lblSunday.gridy = 0;
		contentPane.add(lblSunday, gbc_lblSunday);
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblMonday = new GridBagConstraints();
		gbc_lblMonday.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonday.gridx = 1;
		gbc_lblMonday.gridy = 0;
		contentPane.add(lblMonday, gbc_lblMonday);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		GridBagConstraints gbc_lblTuesday = new GridBagConstraints();
		gbc_lblTuesday.insets = new Insets(0, 0, 5, 5);
		gbc_lblTuesday.gridx = 2;
		gbc_lblTuesday.gridy = 0;
		contentPane.add(lblTuesday, gbc_lblTuesday);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		GridBagConstraints gbc_lblWednesday = new GridBagConstraints();
		gbc_lblWednesday.insets = new Insets(0, 0, 5, 5);
		gbc_lblWednesday.gridx = 3;
		gbc_lblWednesday.gridy = 0;
		contentPane.add(lblWednesday, gbc_lblWednesday);
		
		JLabel lblThursday = new JLabel("Thursday");
		GridBagConstraints gbc_lblThursday = new GridBagConstraints();
		gbc_lblThursday.insets = new Insets(0, 0, 5, 5);
		gbc_lblThursday.gridx = 4;
		gbc_lblThursday.gridy = 0;
		contentPane.add(lblThursday, gbc_lblThursday);
		
		JLabel lblFriday = new JLabel("Friday");
		GridBagConstraints gbc_lblFriday = new GridBagConstraints();
		gbc_lblFriday.insets = new Insets(0, 0, 5, 5);
		gbc_lblFriday.gridx = 5;
		gbc_lblFriday.gridy = 0;
		contentPane.add(lblFriday, gbc_lblFriday);
		
		JLabel lblSaturday = new JLabel("Saturday");
		GridBagConstraints gbc_lblSaturday = new GridBagConstraints();
		gbc_lblSaturday.insets = new Insets(0, 0, 5, 0);
		gbc_lblSaturday.gridx = 6;
		gbc_lblSaturday.gridy = 0;
		contentPane.add(lblSaturday, gbc_lblSaturday);
		
		JTextArea sunText = new JTextArea(getSunday());
		sunText.setLineWrap(true);
		sunText.setFont(new Font("Monospaced", Font.BOLD, 12));
		GridBagConstraints gbc_sunText = new GridBagConstraints();
		gbc_sunText.insets = new Insets(0, 0, 5, 5);
		gbc_sunText.fill = GridBagConstraints.BOTH;
		gbc_sunText.gridx = 0;
		gbc_sunText.gridy = 1;
		contentPane.add(sunText, gbc_sunText);
		sb.setLength(0);
		
		JTextArea monText = new JTextArea(getMonday());
		monText.setLineWrap(true);
		monText.setFont(new Font("Monospaced", Font.BOLD, 12));
		GridBagConstraints gbc_monText = new GridBagConstraints();
		gbc_monText.insets = new Insets(0, 0, 5, 5);
		gbc_monText.fill = GridBagConstraints.BOTH;
		gbc_monText.gridx = 1;
		gbc_monText.gridy = 1;
		contentPane.add(monText, gbc_monText);
		sb.setLength(0);
		
		JTextArea tueText = new JTextArea(getTuesday());
		tueText.setLineWrap(true);
		tueText.setFont(new Font("Monospaced", Font.BOLD, 12));
		GridBagConstraints gbc_tueText = new GridBagConstraints();
		gbc_tueText.insets = new Insets(0, 0, 5, 5);
		gbc_tueText.fill = GridBagConstraints.BOTH;
		gbc_tueText.gridx = 2;
		gbc_tueText.gridy = 1;
		contentPane.add(tueText, gbc_tueText);
		sb.setLength(0);
		
		JTextArea wedText = new JTextArea(getWednesday());
		wedText.setLineWrap(true);
		wedText.setFont(new Font("Monospaced", Font.BOLD, 12));
		GridBagConstraints gbc_wedText = new GridBagConstraints();
		gbc_wedText.insets = new Insets(0, 0, 5, 5);
		gbc_wedText.fill = GridBagConstraints.BOTH;
		gbc_wedText.gridx = 3;
		gbc_wedText.gridy = 1;
		contentPane.add(wedText, gbc_wedText);
		sb.setLength(0);
		
		JTextArea thuText = new JTextArea(getThursday());
		thuText.setLineWrap(true);
		thuText.setFont(new Font("Monospaced", Font.BOLD, 12));
		GridBagConstraints gbc_thuText = new GridBagConstraints();
		gbc_thuText.insets = new Insets(0, 0, 5, 5);
		gbc_thuText.fill = GridBagConstraints.BOTH;
		gbc_thuText.gridx = 4;
		gbc_thuText.gridy = 1;
		contentPane.add(thuText, gbc_thuText);
		sb.setLength(0);
		
		
		JTextArea friText = new JTextArea(getFriday());
		friText.setLineWrap(true);
		friText.setFont(new Font("Monospaced", Font.BOLD, 12));
		GridBagConstraints gbc_friText = new GridBagConstraints();
		gbc_friText.insets = new Insets(0, 0, 5, 5);
		gbc_friText.fill = GridBagConstraints.BOTH;
		gbc_friText.gridx = 5;
		gbc_friText.gridy = 1;
		contentPane.add(friText, gbc_friText);
		sb.setLength(0);
		
		JTextArea satText = new JTextArea(getSaturday());
		satText.setLineWrap(true);
		satText.setFont(new Font("Monospaced", Font.BOLD, 12));
		GridBagConstraints gbc_satText = new GridBagConstraints();
		gbc_satText.insets = new Insets(0, 0, 5, 0);
		gbc_satText.fill = GridBagConstraints.BOTH;
		gbc_satText.gridx = 6;
		gbc_satText.gridy = 1;
		contentPane.add(satText, gbc_satText);
		
		
		//Has not been implemented yet
		JButton btnAddNewItem = new JButton("Add new item to schedule");
		GridBagConstraints gbc_btnAddNewItem = new GridBagConstraints();
		gbc_btnAddNewItem.insets = new Insets(0, 0, 0, 5);
		gbc_btnAddNewItem.gridx = 3;
		gbc_btnAddNewItem.gridy = 2;
		contentPane.add(btnAddNewItem, gbc_btnAddNewItem);

		btnAddNewItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            	
            	JTextField titleField = new JTextField();
                JTextField dayField = new JTextField();
                JTextField timeField = new JTextField();

                JPanel myPanel = new JPanel();
                myPanel.add(new JLabel("Event:  "));
                myPanel.add(titleField);
                myPanel.add(new JLabel("Day:  "));
                myPanel.add(dayField);
                myPanel.add(new JLabel("Time:  "));
                myPanel.add(timeField);

                String title = JOptionPane.showInputDialog(null,"Enter an event: ");
                String day = JOptionPane.showInputDialog(null,"Enter a day: ").toUpperCase();
                String time = JOptionPane.showInputDialog(null,"Enter a time: ");
                
                switch (day) {
                case "SUNDAY":
                	week.sunday.add(new Event(title, Day.SUNDAY, LocalTime.parse(time)));
                    week.writeFile();
                    break;
                case "MONDAY":
                	week.monday.add(new Event(title, Day.MONDAY, LocalTime.parse(time)));
                    week.writeFile();
                    break;
                case "TUESDAY":
                	week.tuesday.add(new Event(title, Day.TUESDAY, LocalTime.parse(time)));
                    week.writeFile();
                    break;
                case "WEDNESDAY":
                	week.wednesday.add(new Event(title, Day.WEDNESDAY, LocalTime.parse(time)));
                    week.writeFile();
                    break;
                case "THURSDAY":
                	week.thursday.add(new Event(title, Day.THURSDAY, LocalTime.parse(time)));
                    week.writeFile();
                    break;
                case "FRIDAY":
                	week.friday.add(new Event(title, Day.FRIDAY, LocalTime.parse(time)));
                    week.writeFile();
                    break;
                case "SATURDAY":
                	week.saturday.add(new Event(title, Day.SATURDAY, LocalTime.parse(time)));
                    week.writeFile();
                    break;
            }
            }
        });
	}

	private String getSunday() {
		for (Event event:
            week.sunday) {
           sb.append(event + "\n");
       }
		 return sb.toString();
		 
	}


	private String getMonday() {
		 for (Event event:
            week.monday) {
           sb.append(event + "\n");
       }
		 return sb.toString();
	}
	
	private String getTuesday() {
		for (Event event:
            week.tuesday) {
           sb.append(event + "\n");
       }
		 return sb.toString();
	}

	
	private String getWednesday() {
		for (Event event:
            week.wednesday) {
           sb.append(event + "\n");
       }
		 return sb.toString();
	}
	
	private String getThursday() {
		for (Event event:
            week.thursday) {
           sb.append(event + "\n");
       }
		 return sb.toString();
	}


	private String getFriday() {
		for (Event event:
            week.friday) {
           sb.append(event + "\n");
       }
		 return sb.toString();
	}

	private String getSaturday() {
		for (Event event:
            week.saturday) {
           sb.append(event + "\n");
       }
		 return sb.toString();
	}

	
	
//	Build GUI
//	Use event handlers to send items to Week.java that a user inputs to add to calendar
//	Use event handler to display items in array list for each day

}
