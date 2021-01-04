package InterfazGrafica;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import juegoTP.Carta;
import juegoTP.Descarte;
import juegoTP.Jugador;
import juegoTP.Mazo;
import juegoTP.Partida;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Dimension;

public class PantallaPartida extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3078354589235509430L;
	
	private JPanel contenedorPartida;
	private SpringLayout sl_contentPane;
	
	private JLabel ronda;
	private JLabel LabelPuntuacionJ1;
	private JLabel LabelPuntuacionJ2;
	private JLabel LabelPuntuacionJ3;
	private JLabel LabelPuntuacionJ4;
	private int turno=0;
	private int numRonda=0;
	private JButton cartaJugada;
	private JLabel MazoLabel;
	
	private JLabel nombre1;
	private JLabel nombre2;
	private JLabel nombre3;
	private JLabel nombre4;
	
	private JButton cartaVisible1;
	private JButton cartaVisible2;
	private JButton cartaVisible3;
	private JButton cartaVisible4;
	private JButton cartaVisible5;
	private JButton cartaVisible6;
	private JButton cartaVisible7;
	private JButton cartaVisible8;
	
	private Jugador p1;
	private Jugador p2;
	private Jugador p3;
	private Jugador p4;
	
	public JPanel getContenedorPartida() {
		return contenedorPartida;
	}

	public void setContenedorPartida(JPanel contenedorPartida) {
		this.contenedorPartida = contenedorPartida;
	}

	public SpringLayout getSl_contentPane() {
		return sl_contentPane;
	}

	public void setSl_contentPane(SpringLayout sl_contentPane) {
		this.sl_contentPane = sl_contentPane;
	}

	public JLabel getRonda() {
		return ronda;
	}

	public void setRonda(JLabel ronda) {
		this.ronda = ronda;
	}
	
	public JLabel getLabelPuntuacionJ1() {
		return LabelPuntuacionJ1;
	}

	public void setLabelPuntuacionJ1(JLabel labelPuntuacionJ1) {
		LabelPuntuacionJ1 = labelPuntuacionJ1;
	}

	public JLabel getLabelPuntuacionJ2() {
		return LabelPuntuacionJ2;
	}

	public void setLabelPuntuacionJ2(JLabel labelPuntuacionJ2) {
		LabelPuntuacionJ2 = labelPuntuacionJ2;
	}

	public JButton getCartaJugada() {
		return cartaJugada;
	}

	public void setCartaJugada(JButton cartaJugada) {
		this.cartaJugada = cartaJugada;
	}

	public JLabel getMazoLabel() {
		return MazoLabel;
	}

	public void setMazoLabel(JLabel mazoLabel) {
		MazoLabel = mazoLabel;
	}

	public JLabel getNombre1() {
		return nombre1;
	}

	public void setNombre1(JLabel nombre1) {
		this.nombre1 = nombre1;
	}

	public JLabel getNombre2() {
		return nombre2;
	}

	public void setNombre2(JLabel nombre2) {
		this.nombre2 = nombre2;
	}

	public JLabel getNombre3() {
		return nombre3;
	}

	public void setNombre3(JLabel nombre3) {
		this.nombre3 = nombre3;
	}

	public JLabel getNombre4() {
		return nombre4;
	}

	public void setNombre4(JLabel nombre4) {
		this.nombre4 = nombre4;
	}

	public JButton getCartaVisible1() {
		return cartaVisible1;
	}

	public void setCartaVisible1(JButton cartaVisible1) {
		this.cartaVisible1 = cartaVisible1;
	}

	public JButton getCartaVisible2() {
		return cartaVisible2;
	}

	public void setCartaVisible2(JButton cartaVisible2) {
		this.cartaVisible2 = cartaVisible2;
	}

	public JButton getCartaVisible3() {
		return cartaVisible3;
	}

	public void setCartaVisible3(JButton cartaVisible3) {
		this.cartaVisible3 = cartaVisible3;
	}

	public JButton getCartaVisible4() {
		return cartaVisible4;
	}

	public void setCartaVisible4(JButton cartaVisible4) {
		this.cartaVisible4 = cartaVisible4;
	}

	public JButton getCartaVisible5() {
		return cartaVisible5;
	}

	public void setCartaVisible5(JButton cartaVisible5) {
		this.cartaVisible5 = cartaVisible5;
	}

	public JButton getCartaVisible6() {
		return cartaVisible6;
	}

	public void setCartaVisible6(JButton cartaVisible6) {
		this.cartaVisible6 = cartaVisible6;
	}

	public JButton getCartaVisible7() {
		return cartaVisible7;
	}

	public void setCartaVisible7(JButton cartaVisible7) {
		this.cartaVisible7 = cartaVisible7;
	}

	public JButton getCartaVisible8() {
		return cartaVisible8;
	}

	public void setCartaVisible8(JButton cartaVisible8) {
		this.cartaVisible8 = cartaVisible8;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public int getNumRonda() {
		return numRonda;
	}

	public void setNumRonda(int numRonda) {
		this.numRonda = numRonda;
	}

	public Jugador getP1() {
		return p1;
	}

	public void setP1(Jugador p1) {
		this.p1 = p1;
	}

	public Jugador getP2() {
		return p2;
	}

	public void setP2(Jugador p2) {
		this.p2 = p2;
	}

	public Jugador getP3() {
		return p3;
	}

	public void setP3(Jugador p3) {
		this.p3 = p3;
	}

	public Jugador getP4() {
		return p4;
	}

	public void setP4(Jugador p4) {
		this.p4 = p4;
	}
	
	public PantallaPartida(ArrayList<Jugador> jugadores, Partida partida) {
		
		getContentPane().setLayout(null);

		cargarJugadoresEnPartida(jugadores);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contenedorPartida = new JPanel();
		contenedorPartida.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedorPartida);
		sl_contentPane = new SpringLayout();
		contenedorPartida.setLayout(sl_contentPane);
		
		nombre1 = new JLabel(p1.getNombre());
		nombre1.setForeground(Color.WHITE);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, nombre1, 0, SpringLayout.SOUTH, contenedorPartida);
		sl_contentPane.putConstraint(SpringLayout.EAST, nombre1, -642, SpringLayout.EAST, contenedorPartida);
		contenedorPartida.add(nombre1);
		
		nombre2 = new JLabel(p2.getNombre());
		nombre2.setForeground(Color.WHITE);
		sl_contentPane.putConstraint(SpringLayout.NORTH, nombre2, 0, SpringLayout.NORTH, contenedorPartida);
		sl_contentPane.putConstraint(SpringLayout.EAST, nombre2, 0, SpringLayout.EAST, nombre1);
		contenedorPartida.add(nombre2);
		
		cartaVisible1 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, cartaVisible1, 520, SpringLayout.NORTH, contenedorPartida);
		sl_contentPane.putConstraint(SpringLayout.WEST, cartaVisible1, 548, SpringLayout.WEST, contenedorPartida);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, cartaVisible1, -21, SpringLayout.NORTH, nombre1);
		contenedorPartida.add(cartaVisible1);
		
		cartaVisible2 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, cartaVisible2, 520, SpringLayout.NORTH, contenedorPartida);
		sl_contentPane.putConstraint(SpringLayout.EAST, cartaVisible1, -10, SpringLayout.WEST, cartaVisible2);
		sl_contentPane.putConstraint(SpringLayout.WEST, cartaVisible2, 680, SpringLayout.WEST, contenedorPartida);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, cartaVisible2, -21, SpringLayout.NORTH, nombre1);
		contenedorPartida.add(cartaVisible2);
		
		cartaVisible3 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.WEST, cartaVisible3, 0, SpringLayout.WEST, cartaVisible1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, cartaVisible3, -524, SpringLayout.SOUTH, contenedorPartida);
		sl_contentPane.putConstraint(SpringLayout.EAST, cartaVisible3, 0, SpringLayout.EAST, cartaVisible1);
        contenedorPartida.add(cartaVisible3);

		cartaVisible4 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, cartaVisible4, 17, SpringLayout.SOUTH, nombre2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, cartaVisible4, -524, SpringLayout.SOUTH, contenedorPartida);
		sl_contentPane.putConstraint(SpringLayout.NORTH, cartaVisible3, 0, SpringLayout.NORTH, cartaVisible4);
		sl_contentPane.putConstraint(SpringLayout.WEST, cartaVisible4, 680, SpringLayout.WEST, contenedorPartida);
		contenedorPartida.add(cartaVisible4);
		
		cartaJugada = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, cartaJugada, 63, SpringLayout.SOUTH, cartaVisible4);
		sl_contentPane.putConstraint(SpringLayout.WEST, cartaJugada, 0, SpringLayout.WEST, cartaVisible2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, cartaJugada, -287, SpringLayout.SOUTH, contenedorPartida);
		sl_contentPane.putConstraint(SpringLayout.EAST, cartaJugada, -548, SpringLayout.EAST, contenedorPartida);
		contenedorPartida.add(cartaJugada);
		
		ronda = new JLabel("");
		ronda.setIcon(new ImageIcon("Imagenes\\Ronda.png"));
		ronda.setForeground(Color.WHITE);
        sl_contentPane.putConstraint(SpringLayout.NORTH, ronda, 51, SpringLayout.NORTH, contenedorPartida);
        sl_contentPane.putConstraint(SpringLayout.WEST, ronda, 104, SpringLayout.WEST, contenedorPartida);
        contenedorPartida.add(ronda);
		
		LabelPuntuacionJ1 = new JLabel("Puntuacion: ");
		sl_contentPane.putConstraint(SpringLayout.EAST, cartaVisible2, -34, SpringLayout.WEST, LabelPuntuacionJ1);
		sl_contentPane.putConstraint(SpringLayout.EAST, cartaVisible2, -34, SpringLayout.WEST, LabelPuntuacionJ1);
		sl_contentPane.putConstraint(SpringLayout.WEST, LabelPuntuacionJ1, 836, SpringLayout.WEST, contenedorPartida);
		LabelPuntuacionJ1.setForeground(Color.WHITE);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, LabelPuntuacionJ1, -97, SpringLayout.SOUTH, contenedorPartida);
        contenedorPartida.add(LabelPuntuacionJ1);
        
        LabelPuntuacionJ2 = new JLabel("Puntuacion:");
        sl_contentPane.putConstraint(SpringLayout.EAST, cartaVisible4, -34, SpringLayout.WEST, LabelPuntuacionJ2);
        sl_contentPane.putConstraint(SpringLayout.WEST, LabelPuntuacionJ2, 836, SpringLayout.WEST, contenedorPartida);
        LabelPuntuacionJ2.setForeground(Color.WHITE);
        sl_contentPane.putConstraint(SpringLayout.NORTH, LabelPuntuacionJ2, 74, SpringLayout.NORTH, contenedorPartida);
        contenedorPartida.add(LabelPuntuacionJ2);
        
        MazoLabel = new JLabel("");
        MazoLabel.setIcon(new ImageIcon("Imagenes\\Mazo.png"));
        sl_contentPane.putConstraint(SpringLayout.NORTH, MazoLabel, 0, SpringLayout.NORTH, cartaJugada);
        sl_contentPane.putConstraint(SpringLayout.EAST, MazoLabel, -195, SpringLayout.WEST, cartaJugada);
        contenedorPartida.add(MazoLabel);
        
        cartaVisible6 = new JButton("");
        sl_contentPane.putConstraint(SpringLayout.NORTH, cartaVisible6, -252, SpringLayout.NORTH, cartaVisible1);
        sl_contentPane.putConstraint(SpringLayout.WEST, cartaVisible6, 191, SpringLayout.WEST, contenedorPartida);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, cartaVisible6, 0, SpringLayout.SOUTH, cartaJugada);
        sl_contentPane.putConstraint(SpringLayout.EAST, cartaVisible6, -367, SpringLayout.WEST, cartaJugada);
        contenedorPartida.add(cartaVisible6);
        
        cartaVisible5 = new JButton("");
        sl_contentPane.putConstraint(SpringLayout.NORTH, cartaVisible5, 0, SpringLayout.NORTH, cartaJugada);
        sl_contentPane.putConstraint(SpringLayout.WEST, cartaVisible5, 63, SpringLayout.WEST, contenedorPartida);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, cartaVisible5, -287, SpringLayout.SOUTH, contenedorPartida);
        sl_contentPane.putConstraint(SpringLayout.EAST, cartaVisible5, -6, SpringLayout.WEST, cartaVisible6);
        contenedorPartida.add(cartaVisible5);
        
        cartaVisible7 = new JButton("");
        sl_contentPane.putConstraint(SpringLayout.NORTH, cartaVisible7, 0, SpringLayout.NORTH, cartaJugada);
        sl_contentPane.putConstraint(SpringLayout.WEST, cartaVisible7, 1064, SpringLayout.WEST, contenedorPartida);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, cartaVisible7, -252, SpringLayout.SOUTH, cartaVisible1);
        sl_contentPane.putConstraint(SpringLayout.EAST, cartaVisible7, -164, SpringLayout.EAST, contenedorPartida);
        contenedorPartida.add(cartaVisible7);
        
        cartaVisible8 = new JButton("");
        sl_contentPane.putConstraint(SpringLayout.NORTH, cartaVisible8, 0, SpringLayout.NORTH, cartaJugada);
        sl_contentPane.putConstraint(SpringLayout.WEST, cartaVisible8, 10, SpringLayout.EAST, cartaVisible7);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, cartaVisible8, -190, SpringLayout.SOUTH, LabelPuntuacionJ1);
        sl_contentPane.putConstraint(SpringLayout.EAST, cartaVisible8, 132, SpringLayout.EAST, cartaVisible7);
        contenedorPartida.add(cartaVisible8);
        
        LabelPuntuacionJ3 = new JLabel("Puntuacion: ");
        sl_contentPane.putConstraint(SpringLayout.NORTH, LabelPuntuacionJ3, 24, SpringLayout.SOUTH, cartaVisible5);
        sl_contentPane.putConstraint(SpringLayout.EAST, LabelPuntuacionJ3, 0, SpringLayout.EAST, ronda);
        LabelPuntuacionJ3.setForeground(Color.WHITE);
        contenedorPartida.add(LabelPuntuacionJ3);
        
        LabelPuntuacionJ4 = new JLabel("Puntuacion: ");
        sl_contentPane.putConstraint(SpringLayout.SOUTH, LabelPuntuacionJ4, 0, SpringLayout.SOUTH, LabelPuntuacionJ3);
        sl_contentPane.putConstraint(SpringLayout.EAST, LabelPuntuacionJ4, -212, SpringLayout.EAST, contenedorPartida);
        LabelPuntuacionJ4.setForeground(Color.WHITE);
        contenedorPartida.add(LabelPuntuacionJ4);
  
        nombre3 = new JLabel("");
        nombre3.setForeground(Color.WHITE);
        sl_contentPane.putConstraint(SpringLayout.WEST, nombre3, 164, SpringLayout.WEST, contenedorPartida);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, nombre3, -6, SpringLayout.NORTH, cartaVisible6);
        contenedorPartida.add(nombre3);
        
        nombre4 = new JLabel("");
        nombre4.setForeground(Color.WHITE);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, nombre4, -6, SpringLayout.NORTH, cartaVisible7);
        sl_contentPane.putConstraint(SpringLayout.EAST, nombre4, -137, SpringLayout.EAST, contenedorPartida);
        contenedorPartida.add(nombre4);
        
        LabelPuntuacionJ3.setVisible(false);
        nombre3.setVisible(false);
        LabelPuntuacionJ4.setVisible(false);
        nombre4.setVisible(false);
        
        if(jugadores.size()==3) {
        	LabelPuntuacionJ3.setVisible(true);
        	nombre3.setText(p3.getNombre());
        	nombre3.setVisible(true);
        }
        if(jugadores.size()==4) {
        	LabelPuntuacionJ3.setVisible(true);
        	nombre3.setText(p3.getNombre());
        	nombre3.setVisible(true);
        	LabelPuntuacionJ4.setVisible(true);
        	nombre4.setText(p4.getNombre());
        	nombre4.setVisible(true);
        }
        
        hacerBotonesInvisibles(); 
        
		FondoPartida fondo;
		try {
			fondo = new FondoPartida(ImageIO.read(new File("Imagenes\\fondo.jpg")));
			JPanel panel = (JPanel) this.getContentPane();
	        panel.setBorder(fondo); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		numRonda=1;
		
		try {
			imprimirFotoRonda();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		setVisible(true);

		repartoInicialVisible(jugadores);

		while(partida.hayGanador() == null) { //no haya ganador de partida
			
			try {
				imprimirFotoRonda();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			actualizarLabels(jugadores);
			
			turno=0;
			int opc=0;
			Mazo mazo = new Mazo();
			Jugador jug = null;

			partida.empezarJuego(jugadores, mazo, this);
			
			JOptionPane.showMessageDialog(this, "Empieza la ronda: " + numRonda);

			while(partida.hayGanadorDeRonda() == null && mazo.getMazoNoVacio()) {	//no haya ganador de ronda
				
				int aux=0;
				int numJugador = turno%jugadores.size();
				jug = jugadores.get(numJugador);
					
				if(jug.getEstado() != "Fuera de Ronda") {
					
					JOptionPane.showMessageDialog(this, "ES EL TURNO DE " + jug.getNombre() + " , NO VEAS SUS CARTAS!!!!");
					
					if(jug.getEstado() == "Inmune") {
						jug.setEstado("Jugando");
						
						JOptionPane.showMessageDialog(this, "El jugador " + jug.getNombre() + " ya no tiene inmunidad!");
					}
					
					jug.agarrarCarta(mazo, this);
					this.actualizarPantalla(numJugador, jug);
					
					if(jug.getManoDeCartas().getMano().get(0).getNombre() == "Condesa" && (jug.getManoDeCartas().getMano().get(1).getNombre() == "Rey" || jug.getManoDeCartas().getMano().get(1).getNombre() == "Principe")
							|| (jug.getManoDeCartas().getMano().get(0).getNombre() == "Rey" || jug.getManoDeCartas().getMano().get(0).getNombre() == "Principe") && jug.getManoDeCartas().getMano().get(1).getNombre() == "Condesa") {
						
						Carta c1 = jug.getManoDeCartas().getMano().get(0);
						
						if(c1.getNombre() == "Condesa") {
							opc=0;
						}
						else {
							opc=1;
						}
						
						JOptionPane.showMessageDialog(this, "La condesa no es compatible con el Rey y el Principe, despidete de ella!");
					}
					else {
						Object[] opciones = {jug.getManoDeCartas().getMano().get(0).getNombre(),jug.getManoDeCartas().getMano().get(1).getNombre()};
						opc = JOptionPane.showOptionDialog(this, "Elija 1 carta para jugar","Jugador: " + jug.getNombre(), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,opciones, opciones[1]);
					}
					
					if(opc == 0) {
						jug.jugarCartaEnCampo(numJugador,jugadores, mazo, this, jug, 0);
					}
					else{
						jug.jugarCartaEnCampo(numJugador,jugadores, mazo, this, jug, 1);
					}				
					
					jug.setCartasTiradas(jug.getCartasTiradas()+1);			
					this.ocultarCartasJugador(numJugador, jug);
				}
				
				turno++;		
			}
			
			definirGanadorRonda(partida, jugadores);		
			reiniciarRonda(jugadores);			
			numRonda++;		
		}
		
		String listado = new String();
		
		for (Jugador jugador : jugadores) {
			listado += "Jugador:   " + jugador.getNombre() + "   Puntuacion:  " + jugador.getPuntaje() + "\n";
		}
		
		JOptionPane.showMessageDialog(this, "El ganador del juego es: " + partida.hayGanador().getNombre() + "\nFelicitaciones!\n\n" + listado);	
	}
	
	private void cargarJugadoresEnPartida(ArrayList<Jugador> jugadores) {		
		for(int i=0; i<jugadores.size(); i++) {
			if(i == 0) {
				p1 = jugadores.get(0);
			}
				
			if(i == 1){				
				p2 = jugadores.get(1);		
			}
					
			if(i == 2) {
				p3 = jugadores.get(2);
			}
				
			if(i == 3){				
				p4 = jugadores.get(3);		
			}	
		}
	}

	private void hacerBotonesInvisibles() {
		cartaVisible1.setVisible(false);
        cartaVisible2.setVisible(false);
        cartaVisible3.setVisible(false);
        cartaVisible4.setVisible(false);
        cartaVisible5.setVisible(false);
        cartaVisible6.setVisible(false);
        cartaVisible7.setVisible(false);
        cartaVisible8.setVisible(false);	
	}

	private void repartoInicialVisible(ArrayList<Jugador> jugadores) {
		
		if(jugadores.size()>1) {
			
			Image imgYugioh = null;
			try {
				imgYugioh = ImageIO.read(new File( "Imagenes\\mazo.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			cartaVisible1.setIcon(new ImageIcon(imgYugioh));
			cartaVisible1.setVisible(true);
			cartaVisible3.setIcon(new ImageIcon(imgYugioh));
			cartaVisible3.setVisible(true);
			
			if(jugadores.size()>2) {
				
				cartaVisible5.setIcon(new ImageIcon(imgYugioh));
				cartaVisible5.setVisible(true);
				
				if(jugadores.size()>3) {
					
					cartaVisible7.setIcon(new ImageIcon(imgYugioh));
					cartaVisible7.setVisible(true);
				}
			}
		}
		
	}

	private void reiniciarRonda(ArrayList<Jugador> jugadores) {
		for (Jugador jugador : jugadores) {
			jugador.setEstado("Jugando");
			jugador.setCartasTiradas(0);
		}	
	}

	private void definirGanadorRonda(Partida partida, ArrayList<Jugador> jugadores) {
		if(partida.hayGanadorDeRonda() == null) {
			
			int maxFuerza = jugadores.get(0).getManoDeCartas().getMano().get(0).getPuntajeFuerza();
			
			for (Jugador jugador : jugadores) {
				
				if(maxFuerza < jugador.getManoDeCartas().getMano().get(0).getPuntajeFuerza()) {
					maxFuerza = jugador.getManoDeCartas().getMano().get(0).getPuntajeFuerza();
				}
			}
			
			ArrayList<Jugador> posiblesGanadores = new ArrayList<Jugador>();
			Jugador ganador = null;
			
			for (Jugador jugador : jugadores) {
				if(maxFuerza == jugador.getManoDeCartas().getMano().get(0).getPuntajeFuerza()) {
					posiblesGanadores.add(jugador);
				}
			}
			
			if(posiblesGanadores.size()==1) {
				ganador = posiblesGanadores.get(0);
				ganador.sumarCorazon();
				JOptionPane.showMessageDialog(this, "El ganador de la ronda es: " + ganador.getNombre() + "\nFelicitaciones!");
				return;
			}
			
			int maxCartasTiradas = posiblesGanadores.get(0).getCartasTiradas();
			ganador = posiblesGanadores.get(0);	
			
			for (Jugador jugador : posiblesGanadores) {
				if(jugador.getCartasTiradas() > maxCartasTiradas) {
					ganador = jugador;
					maxCartasTiradas = ganador.getCartasTiradas();
				}
			}
			
			ganador.sumarCorazon();
			JOptionPane.showMessageDialog(this, "El ganador de la ronda es: " + ganador.getNombre() + "\nFelicitaciones!");
		}
		else {
			partida.hayGanadorDeRonda().sumarCorazon();
			JOptionPane.showMessageDialog(this, "El ganador de la ronda es: " + partida.hayGanadorDeRonda().getNombre() + "\nFelicitaciones!");
		}
	}

	public void actualizarLabels(ArrayList<Jugador> jugadores) {
		//ronda.setText("Ronda: " + numRonda);
		ronda.setIcon(new ImageIcon("Imagenes\\Ronda" + numRonda + ".png"));
		LabelPuntuacionJ1.setText("Puntuacion: " + p1.getPuntaje());
		LabelPuntuacionJ2.setText("Puntuacion: " + p2.getPuntaje());
		
		if(jugadores.size()==3) {
			LabelPuntuacionJ3.setText("Puntuacion: " + p3.getPuntaje());		
		}
		
		if(jugadores.size()==4) {
			LabelPuntuacionJ3.setText("Puntuacion: " + p3.getPuntaje());
			LabelPuntuacionJ4.setText("Puntuacion: " + p4.getPuntaje());
		}
	}
	
	private void actualizarPantalla(int numJugador, Jugador jug) {
		
		Carta uno = jug.getManoDeCartas().getMano().get(0);
		Carta dos = jug.getManoDeCartas().getMano().get(1);
		
		Image img1 = null;
		try {
			img1 = ImageIO.read(new File( "Imagenes\\"+uno.getNombre()+ ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Image img2 = null;
		try {
			img2 = ImageIO.read(new File( "Imagenes\\"+dos.getNombre()+ ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(numJugador == 0) {
			this.cartaVisible1.setIcon(new ImageIcon(img1));
			this.cartaVisible1.setVisible(true);
			this.cartaVisible2.setIcon(new ImageIcon(img2));
			this.cartaVisible2.setVisible(true);
		}
		else if(numJugador == 1) {
			this.cartaVisible3.setIcon(new ImageIcon(img1));
			this.cartaVisible3.setVisible(true);
			this.cartaVisible4.setIcon(new ImageIcon(img2));
			this.cartaVisible4.setVisible(true);
		}
		else if(numJugador == 2) {
			this.cartaVisible5.setIcon(new ImageIcon(img1));
			this.cartaVisible5.setVisible(true);
			this.cartaVisible6.setIcon(new ImageIcon(img2));
			this.cartaVisible6.setVisible(true);
		}
		else if(numJugador == 3) {
			this.cartaVisible7.setIcon(new ImageIcon(img1));
			this.cartaVisible7.setVisible(true);
			this.cartaVisible8.setIcon(new ImageIcon(img2));
			this.cartaVisible8.setVisible(true);
		}	
	}

	public void ocultarCartasJugador(int numJugador, Jugador jug) {
	
		Image img = null;
		try {
			img = ImageIO.read(new File("Imagenes\\mazo.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(numJugador == 0) {
			this.cartaVisible1.setIcon(new ImageIcon(img));
			this.cartaVisible2.setIcon(new ImageIcon(img));
		}	
		else if(numJugador == 1) {
			this.cartaVisible3.setIcon(new ImageIcon(img));
			this.cartaVisible4.setIcon(new ImageIcon(img));
		}	
		else if(numJugador == 2) {
			this.cartaVisible5.setIcon(new ImageIcon(img));
			this.cartaVisible6.setIcon(new ImageIcon(img));
		}	
		else if(numJugador == 3) {
			this.cartaVisible7.setIcon(new ImageIcon(img));
			this.cartaVisible8.setIcon(new ImageIcon(img));
		}
	}
	
	public void imprimirFotoRonda() throws Exception{
		final BufferedImage image = ImageIO.read(new File("Imagenes\\ronda.png"));
		
		Graphics g = image.getGraphics();
		g.setFont(g.getFont().deriveFont(30f));
		g.drawString("Ronda: " + numRonda, 75, 60);
		g.dispose();
		
		ImageIO.write(image, "png", new File("Imagenes\\ronda" + numRonda + ".png"));
	}
}
