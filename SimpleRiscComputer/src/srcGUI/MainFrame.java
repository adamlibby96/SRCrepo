package srcGUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import problemDomain.Computer;

public class MainFrame extends JFrame
{
	
	private JPanel contentPane;
	private JFrame currentFrame = this;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					Computer pc = new Computer(10);
					MainFrame frame = new MainFrame(pc);
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public MainFrame(Computer pc)
	{
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1920, 30);
		setJMenuBar(menuBar);
		
		JMenu Memory = new JMenu("Memory");
		Memory.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				memoryPanel mp = new memoryPanel(currentFrame, pc);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(mp);
				currentFrame.revalidate();
				
			}
			
		});
		menuBar.add(Memory);
	}
}
