package br.com.fiap.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class App {

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(
					UIManager.getSystemLookAndFeelClassName()
			);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		JFrame frame = new JFrame("Fiap Movies");
		frame.setLayout(new BorderLayout());
		
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		JPanel panelPageEnd = new JPanel();
		
		JPanel panelRegister = new JPanel();
		
		JPanel panelCenter = new JPanel();
		
		JPanel panelLineEnd = new JPanel();
		
		frame.add(tabbedPane, BorderLayout.PAGE_START);
		tabbedPane.add("Cadastro",panelRegister);
		tabbedPane.add("Lista",new JLabel("Lista"));
		
		panelPageEnd.setLayout(new FlowLayout());
		panelPageEnd.add(new JButton("Salvar"));
		panelPageEnd.add(new JButton("Cancelar"));
		
		panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS));
		panelCenter.add(new JLabel("Título"));
		panelCenter.add(new MyTextField());
		panelCenter.add(new JLabel("Sinopse"));
		panelCenter.add(new MyTextField());
		panelCenter.add(new JLabel("Gênero"));
		panelCenter.add(new MyTextField());
		
		panelLineEnd.setLayout(new BoxLayout(panelLineEnd,BoxLayout.X_AXIS));
		panelLineEnd.add(new JLabel("Onde assistir"));
		List<String> radioGroup = new ArrayList<>();
		radioGroup.add("Netflix");
		radioGroup.add("Prime Video");
		radioGroup.add("Pirate Bay");
		MyRadioButtonGroup myRadio = new MyRadioButtonGroup(radioGroup);
		panelLineEnd.add(myRadio);
		panelLineEnd.add(new JCheckBox("Assistido"));
		panelLineEnd.add(new JLabel("Avaliação"));
		
		
		
		
		panelRegister.setLayout(new BorderLayout());
		panelRegister.add(new JLabel(new ImageIcon("src/homem_aranha.jpg")), BorderLayout.LINE_START);
		panelRegister.add(panelPageEnd,BorderLayout.PAGE_END);
		panelRegister.add(panelCenter,BorderLayout.CENTER);
		panelRegister.add(panelLineEnd,BorderLayout.LINE_END);
		
		

		
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
