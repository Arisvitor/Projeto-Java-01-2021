package reservas;
	
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;	
	import javax.swing.JFrame;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;

	public class Menu extends JFrame {

		JMenuBar barra = new JMenuBar();
		
			JMenu prmt = new JMenu("Parâmetros do Sistema");
			JMenu rsva = new JMenu("Reserva de Passagens");
			JMenu end = new JMenu("Sair");

				JMenuItem prmt1 = new JMenuItem("Cadastrar Aeronave");
				JMenuItem prmt2 = new JMenuItem("Cadastrar Vôo");
				JMenuItem prmt3 = new JMenuItem("Voltar");
				
				JMenuItem rsva1 = new JMenuItem("Fazer rezerva");
				JMenuItem rsva2 = new JMenuItem("Consultar lugares vazios");
				JMenuItem rsva3 = new JMenuItem("Consultar reservas realizadas");
				JMenuItem rsva4 = new JMenuItem("Voltar");
				
				JMenuItem end1 = new JMenuItem("Fechar");

		public Menu() {
			setJMenuBar(barra);
			barra.add(prmt);
			barra.add(rsva);
			barra.add(end);
		
	/*------------------------------------
			Parâmetros do Sistema
	------------------------------------*/
			//Cadastrar Aeronave
			prmt.add(prmt1);
			prmt1.addActionListener(new ActionListener(){
		       public void actionPerformed(java.awt.event.ActionEvent evt){
		       setVisible(true);
		    }
			});
			
			//Cadastrar Vôo
			prmt.add(prmt2);
			prmt2.addActionListener(new ActionListener(){
		       public void actionPerformed(java.awt.event.ActionEvent evt){
		       setVisible(true);
		    }
			});
			
			//Voltar
			prmt.add(prmt3);
			prmt3.addActionListener(new ActionListener(){
		       public void actionPerformed(java.awt.event.ActionEvent evt){
		       setVisible(true);
		    }
			});
			
	/*------------------------------------
			Reserva de Passagens
	------------------------------------*/
			
			//Fazer rezerva
			rsva.add(rsva1);
			rsva1.addActionListener(new ActionListener(){
		       public void actionPerformed(java.awt.event.ActionEvent evt){
		       setVisible(true);
		    }
			});
			
			//Consultar lugares vazios
			rsva.add(rsva2);
			rsva2.addActionListener(new ActionListener(){
		       public void actionPerformed(java.awt.event.ActionEvent evt){
		       setVisible(true);
		    }
			});
			
			//Consultar reservas realizadas
			rsva.add(rsva3);
			rsva3.addActionListener(new ActionListener(){
				public void actionPerformed(java.awt.event.ActionEvent evt){
				setVisible(true);
		   }
		});
			
		//Voltar
		 rsva.add(rsva4);
		 rsva4.addActionListener(new ActionListener(){
		 public void actionPerformed(java.awt.event.ActionEvent evt){
	     setVisible(true);
	    }
		});
			
/*------------------------------------
		Sair
------------------------------------*/
		end.add(end1);
		end1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
		{ 
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
