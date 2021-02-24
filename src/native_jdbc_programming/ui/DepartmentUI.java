package native_jdbc_programming.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.BoxLayout;
import javax.swing.table.DefaultTableModel;

public class DepartmentUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepartmentUI frame = new DepartmentUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DepartmentUI() {
		setTitle("부서정보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel pDept = new JPanel();
		contentPane.add(pDept);
		pDept.setLayout(new GridLayout(0, 2, 10, 0));
		
		JLabel lblNewLabel = new JLabel("부서번호");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		pDept.add(lblNewLabel);
		
		textField_1 = new JTextField();
		pDept.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("부서명");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		pDept.add(lblNewLabel_1);
		
		textField = new JTextField();
		pDept.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("위치");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		pDept.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		pDept.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel pBtn = new JPanel();
		contentPane.add(pBtn);
		
		JButton btnNewButton_1 = new JButton("추가");
		pBtn.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("취소");
		pBtn.add(btnNewButton_2);
		
		JPanel pList = new JPanel();
		contentPane.add(pList);
		pList.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		pList.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{1, "영업", 8},
				
			},
			new String[] {
				"부서번호", "부서명", "위치"
			}
		));
		scrollPane.setViewportView(table);
	}

}
