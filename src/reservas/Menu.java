package reservas;
	
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

	public class Menu extends JFrame {
		//poder� armazenar 10 aeronaves nesse array: 10 voos
		private Aviao[] aeronaves = new Aviao[10];
		private int aeronavesCounts = 0;
		
		private Voo[] voos = new Voo[10];
		private int voosCounts = 0;
		
		//representa a barra
		JMenuBar barra = new JMenuBar();
		//representa o menu inicial
		JMenu prmt = new JMenu("Par�metros do Sistema");
		JMenu rsva = new JMenu("Reserva de Passagens");
		JMenu end = new JMenu("Sair");
		//representam os submenus
		JMenuItem prmt1 = new JMenuItem("Cadastrar Aeronave");
		JMenuItem prmt2 = new JMenuItem("Cadastrar V�o");
		JMenuItem prmt3 = new JMenuItem("Voltar");
		
		JMenuItem rsva1 = new JMenuItem("Fazer reserva");
		JMenuItem rsva2 = new JMenuItem("Consultar lugares vazios");
		JMenuItem rsva3 = new JMenuItem("Consultar reservas realizadas");
		JMenuItem rsva4 = new JMenuItem("Voltar");
		
		JMenuItem end1 = new JMenuItem("Fechar");
		
		Menu menu = this;
		//para gerenciar as abas/telas
		JPanel panelAeronave = new JPanel();
		JPanel panelVoo = new JPanel();
		JPanel panelReserva = new JPanel();
		JPanel consultaLugares = new JPanel();
		JPanel consultaReservas = new JPanel();
		
		private void hideAllPanels(){
			panelAeronave.setVisible(false);
			panelVoo.setVisible(false);
			panelReserva.setVisible(false);
			consultaLugares.setVisible(false);
			consultaReservas.setVisible(false);
		}
		
		public Menu() {
			setJMenuBar(barra);
			barra.add(prmt);
			barra.add(rsva);
			barra.add(end);
		
	/*------------------------------------
			Par�metros do Sistema
	------------------------------------*/
			//Cadastrar Aeronave
			prmt.add(prmt1);
			prmt1.addActionListener(new ActionListener(){
		       public void actionPerformed(java.awt.event.ActionEvent evt){
		    	   hideAllPanels();
		    	   //criando o componente panel a partir da panelAeronave
		    	   panelAeronave = new JPanel();
		    	   //panel.setBackground(Color.pink); //setar uma cor decente no final O/
		    	   
		    	   //iniciando o label modelo
		    	   JLabel labelModelo = new JLabel();
		    	   labelModelo.setText("Modelo da Aeronave: "); 
		    	   
		    	   JTextField textFieldModelo = new JTextField("", 10);
		    	   
		    	   //fileiras
		    	   JLabel labelFileiras = new JLabel();
		    	   labelFileiras.setText("Fileiras da aeronave: "); 
		    	   
		    	   JTextField textFieldFileiras = new JTextField("", 10);
		    	   
		    	   //assentos
		    	   JLabel labelAssentos = new JLabel();
		    	   labelAssentos.setText("Assentos por fileira da aeronave: "); 
		    	   
		    	   JTextField textFieldAssentos = new JTextField("", 10);
		    	   
		    	   
		    	   JButton button = new JButton();
		    	   button.setText("Cadastrar");
		    	   button.addActionListener(new ActionListener(){
				       public void actionPerformed(java.awt.event.ActionEvent evt){
				    	   try {
				    		   if(menu.aeronavesCounts < menu.aeronaves.length) {
				    			   int fileiras = Integer.parseInt(textFieldFileiras.getText());
				    			   int assentos = Integer.parseInt(textFieldAssentos.getText());
						    	   //aeronave recebe um par�metro modelo, que � exatamente o que capturamos no textfield
						    	   Aviao aeronave = new Aviao(textFieldModelo.getText(), fileiras, assentos );
						    	   menu.aeronaves[menu.aeronavesCounts] = aeronave;
						    	   menu.aeronavesCounts++;
						    	   JOptionPane.showMessageDialog(null, "Aeronave cadastrada com sucesso !!!");
						    	   textFieldModelo.setText("");
						    	   textFieldFileiras.setText("");
						    	   textFieldAssentos.setText("");
					    	   } else {
					    		   JOptionPane.showMessageDialog(null, "Limite de aeronaves cadastradas excedido !!");
					    	   }
				    	   } catch(Exception e) {
					    	   JOptionPane.showMessageDialog(null, "Valor Inv�lido");
				    	   }
				    	  
				       }
					});

		    	   menu.add(panelAeronave); //add o JPanel no JFrame
		    	   panelAeronave.add(labelModelo); 
		    	   panelAeronave.add(textFieldModelo);
		    	   panelAeronave.add(labelFileiras); 
		    	   panelAeronave.add(textFieldFileiras);
		    	   panelAeronave.add(labelAssentos); 
		    	   panelAeronave.add(textFieldAssentos);
		    	   panelAeronave.add(button);
		    	   
		    	   setVisible(true);
		       }
			});
			
			//Cadastrar V�o
			prmt.add(prmt2);
			prmt2.addActionListener(new ActionListener(){
		       public void actionPerformed(java.awt.event.ActionEvent evt){
		    	   hideAllPanels();
		    	 //criando o componente panel
		    	   panelVoo = new JPanel();
		    	   //iniciando o label numero do voo
		    	   JLabel labelNroVoo = new JLabel();
		    	   labelNroVoo.setText("Informe o n�mero do v�o: "); 
		    	   
		    	   JTextField textFieldNroVoo = new JTextField("", 15);
		    	   
		    	 //iniciando o label data 
		    	   JLabel labelData = new JLabel();
		    	   labelData.setText("Informe a data do v�o: "); 
		    	   
		    	   //***JTextField textFieldData = new JTextField("", 10);
		    	   MaskFormatter mascaraData = null;
		    	   try{
			    	   mascaraData = new MaskFormatter("##/##/####");
			    	   mascaraData.setPlaceholderCharacter('_');
		    	   	  }
		    	   catch(ParseException excp) {
	                    System.err.println("A data informada � inv�lida: " + excp.getMessage());
	                    System.exit(-1);
		    	   		}
		    	  JFormattedTextField jFormattedTextData = new JFormattedTextField(mascaraData);
		    	   
		    	   
		    	 //iniciando o label hora
		    	   JLabel labelHora = new JLabel();
		    	   labelHora.setText("Informe o hor�rio do voo"); 
		    	   
		    	   //**JTextField textFieldHora = new JTextField("", 10);
		    	   MaskFormatter mascaraHora = null;
		    	   try{
			    	   mascaraHora = new MaskFormatter("##:##");
			    	   mascaraHora.setPlaceholderCharacter('_');
		    	   	  }
		    	   catch(ParseException excp) {
	                    System.err.println("O hor�rio informado � inv�lido: " + excp.getMessage());
	                    System.exit(-1);
		    	   		}
		    	  JFormattedTextField jFormattedTextHora = new JFormattedTextField(mascaraHora);
		    	   
		    	   //selecione um avi�o
		    	   JLabel labelSelecioneAviao = new JLabel();
		    	   labelSelecioneAviao.setText("Escolha o avi�o"); 
		    	   
		    	   JComboBox<Aviao> comboSelecioneAviao = new JComboBox<Aviao>(aeronaves);
		    	   
		    	   JButton button = new JButton();
		    	   button.setText("Cadastrar");
		    	   button.addActionListener(new ActionListener(){
				       public void actionPerformed(java.awt.event.ActionEvent evt){
				    	   try {
					    	   if(menu.voosCounts < menu.voos.length) {
					    		   int numero = Integer.parseInt(textFieldNroVoo.getText());
						    	   //aeronave recebe um par�metro modelo, que � exatamente o que capturamos no textfield
						    	   Voo voo = new Voo((Aviao) comboSelecioneAviao.getSelectedItem(), numero, jFormattedTextData.getText(), jFormattedTextHora.getText());
						    	   
						    	   menu.voos[menu.voosCounts] = voo;
						    	   menu.voosCounts++;
						    	   JOptionPane.showMessageDialog(null, "Voo cadastrado com sucesso !!!");
						    	   textFieldNroVoo.setText("");
						    	   jFormattedTextData.setText("");
						    	   jFormattedTextHora.setText("");
					    	   } else {
					    		   JOptionPane.showMessageDialog(null, "Limite de voos cadastrados excedido !!");
					    	   }
				    	   }catch(Exception e){
				    		   JOptionPane.showMessageDialog(null, "Valor Inv�lido!!");
				    	   }
				    	   
				       }
					});

		    	   menu.add(panelVoo); 
		    	   panelVoo.add(labelNroVoo);
		    	   panelVoo.add(textFieldNroVoo);
		    	   
		    	   panelVoo.add(labelData);
		    	   panelVoo.add(jFormattedTextData);
		    	   
		    	   panelVoo.add(labelHora);
		    	   panelVoo.add(jFormattedTextHora);
		    	   
		    	   panelVoo.add(labelSelecioneAviao);
		    	   panelVoo.add(comboSelecioneAviao);
		    	   
		    	  
		    	   panelVoo.add(button);

		    	   setVisible(true);
		       }
			});
			
			//Voltar
			prmt.add(prmt3);
			prmt3.addActionListener(new ActionListener(){
		       public void actionPerformed(java.awt.event.ActionEvent evt){
		    	   hideAllPanels();
		    	   setVisible(true);
		       }
			});
			
	/*------------------------------------
			Reserva de Passagens
	------------------------------------*/
			
			//Fazer reserva
			rsva.add(rsva1);
			rsva1.addActionListener(new ActionListener(){
		       public void actionPerformed(java.awt.event.ActionEvent evt){
		    	   //setVisible(false);
		       }
			});
			
			//Consultar lugares vazios
			rsva.add(rsva2);
			rsva2.addActionListener(new ActionListener(){
		       public void actionPerformed(java.awt.event.ActionEvent evt){
		    	   //setVisible(false);
		       }
			});
			
			//Consultar reservas realizadas
			rsva.add(rsva3);
			rsva3.addActionListener(new ActionListener(){
				public void actionPerformed(java.awt.event.ActionEvent evt){
					//setVisible(false);
				}
			});
			
			//Voltar
			 rsva.add(rsva4);
			 rsva4.addActionListener(new ActionListener(){
				 public void actionPerformed(java.awt.event.ActionEvent evt){
					 hideAllPanels();
					 setVisible(true);
				 }
			});
			
	/*------------------------------------
			Sair
	------------------------------------*/
			end.add(end1);
			end1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){ 
					System.exit(0);      
				}
			});
			
			
			setTitle("Menu");
			setSize(600,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setVisible(true);
	}
}
