package srcGUI;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import computer.Memory;

public class MemoryPanel extends JPanel
{
	JList<Memory> list;
	DefaultListModel<Memory> listModel;

	/**
	 * Create the panel.
	 */
	public MemoryPanel(JFrame frame, Memory pc)
	{
		this.setBounds(100, 100, 1920, 1080);
		setLayout(null);
		
		JTextArea instructionTA = new JTextArea();
		instructionTA.setBounds(991, 52, 911, 980);
		add(instructionTA);
		
		JLabel lblEnterTheProgram = new JLabel("Enter the program instructions. (END EACH INSTRUCTION WITH A ';')");
		lblEnterTheProgram.setBounds(991, 13, 483, 26);
		add(lblEnterTheProgram);
		
		JButton btnExecute = new JButton("EXECUTE");
		btnExecute.setBounds(1805, 14, 97, 25);
		add(btnExecute);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1358, 216, 2, 2);
		instructionTA.add(scrollPane);

		listModel = new DefaultListModel<Memory>();

		list = new JList<Memory>(listModel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 52, 990, 980);
		add(scrollPane_1);



	}
}
