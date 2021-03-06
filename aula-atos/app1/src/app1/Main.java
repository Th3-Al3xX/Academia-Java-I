package app1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import java.awt.BorderLayout;

public class Main {

	private JFrame frmMinhaApp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmMinhaApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMinhaApp = new JFrame();
		frmMinhaApp.setTitle("MINHA APP");
		frmMinhaApp.setBounds(100, 100, 450, 300);
		frmMinhaApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmMinhaApp.setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmAbrirArquivo = new JMenuItem("Abrir arquivo...");
		mnArquivo.add(mntmAbrirArquivo);
		
		JMenuItem mntmGravarArquivo = new JMenuItem("Gravar arquivo...");
		mnArquivo.add(mntmGravarArquivo);
		
		JMenu mnSobre = new JMenu("Sobre");
		menuBar.add(mnSobre);
		
		JMenuItem mntmSobreAAplicao = new JMenuItem("Sobre a aplicação");
		mnSobre.add(mntmSobreAAplicao);
		
		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mnSobre.add(mntmAjuda);

		JMenuItem mnMaisum = new JMenuItem("Mais UM");
		mnSobre.add(mnMaisum);
		
		JTextPane textPane = new JTextPane();
		frmMinhaApp.getContentPane().add(textPane, BorderLayout.CENTER);
	}

}
