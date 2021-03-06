package gui;

import java.awt.EventQueue;
import java.awt.Image;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

public class Editor implements ActionListener {
	
	private JFrame frmMeueditor;
	
	/**
	 * Create the application.
	 */
	public Editor() {
		initialize();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editor window = new Editor();
					window.frmMeueditor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMeueditor = new JFrame();
		frmMeueditor.setTitle("MeuEditor");
		frmMeueditor.setBounds(100, 100, 650, 300);
		frmMeueditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/// tratamento das imagens
		ImageIcon aicon = new ImageIcon(Editor.class.getResource("/img/icons8-live-folder-40.png"));
		Image auxImage1 = aicon.getImage();
		ImageIcon imgAbrir = new ImageIcon(auxImage1.getScaledInstance(16, 16, java.awt.Image.SCALE_SMOOTH));
		ImageIcon sicon =  new ImageIcon(Editor.class.getResource("/img/icons8-salvar-40.png"));
		Image auxImage2 = sicon.getImage();
		ImageIcon imgGravar = new ImageIcon(auxImage2.getScaledInstance(16, 16, java.awt.Image.SCALE_SMOOTH));
		
		JMenuBar menuBar = new JMenuBar();
		frmMeueditor.setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir...");
		mntmAbrir.addActionListener(this);
		mntmAbrir.setActionCommand("ABRIR");
		mntmAbrir.setIcon(imgAbrir);
		mnArquivo.add(mntmAbrir);
		
		JMenuItem mntmGravar = new JMenuItem("Gravar");
		mntmGravar.addActionListener(this);
		mntmGravar.setActionCommand("GRAVAR");
		mntmGravar.setIcon(imgGravar);
		mnArquivo.add(mntmGravar);
		
		JMenu mnSobre = new JMenu("Sobre");
		mnSobre.addActionListener(this);
		menuBar.add(mnSobre);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		frmMeueditor.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton btnAbrir = new JButton("");
		btnAbrir.addActionListener(this);
		btnAbrir.setActionCommand("ABRIR");
		btnAbrir.setToolTipText("Abrir");
		
		// btnAbrir.setIcon(new ImageIcon(Editor.class.getResource("/img/icons8-live-folder-40.png")));
		
		btnAbrir.setIcon(imgAbrir);
		toolBar.add(btnAbrir);
		
		JButton btnGravar = new JButton("");
		
		btnGravar.addActionListener(this);
		btnGravar.setActionCommand("GRAVAR");
		
		btnGravar.setToolTipText("Gravar");
		btnGravar.setIcon(imgGravar);
		
		toolBar.add(btnGravar);
		
		JPanel panel = new JPanel();
		frmMeueditor.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JLabel lblEditoDeTexto = new JLabel("Editor de texto Vs 1.0 (BETA)");
		panel.add(lblEditoDeTexto);
		
		JScrollPane scrollPane = new JScrollPane();
		frmMeueditor.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
	}
	
	
	public void gravar() {
		//FileWriter
		//pegar o conteudo do textPanel
		//Abrir uma janela para informar o nome do arquivo e o local para gravar.
		//gravar o texto dentro do arquivo
		JFileChooser auxF = new JFileChooser();
		
	}
	
	public void abrir() {
		///FileReader
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e);
		
	}

	
}
