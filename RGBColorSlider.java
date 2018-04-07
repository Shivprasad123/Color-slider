import java.awt.*;
 
import java.awt.event.*;
 
import javax.swing.*;
import javax.swing.border.*;
 
import javax.swing.event.*;
 
public class RGBColorSlider extends JFrame{
 
	JSlider redBar; 
 
	JSlider grnBar;
 
	JSlider bluBar;
 
	int red = 128; 

	int green = 128;
 
	int blue = 128;
 
	GraphicsPanel palette; 
 
//	JTextField txtField; 
 
 
	public RGBColorSlider() {
 
	palette = new GraphicsPanel();
 
//	txtField = new JTextField();
 
//	txtField.setFont(new Font("Monospaced", Font.PLAIN, 12));
 
//	txtField.setText("Color(" + red + ", " + green + ", " + blue +") or " + "Color(0x" +Integer.toHexString(blue + 256 * (green + 256 * 		red)) + ")");
 
//	txtField.setEditable(false);
 
	ChangeListener al = new ColorListener();
 
	redBar = new JSlider(JSlider.HORIZONTAL, 0, 255, red);
 
	redBar.addChangeListener(al);
 
	redBar.setBackground(Color.red);
 
	grnBar = new JSlider(JSlider.HORIZONTAL, 0, 255, green);
 
	grnBar.addChangeListener(al);
 
	grnBar.setBackground(Color.green);
 
	bluBar = new JSlider(JSlider.HORIZONTAL, 0, 255, blue);
 
	bluBar.addChangeListener(al);
 
	bluBar.setBackground(Color.blue);
 
	Box paletteText = Box.createVerticalBox();
 
	paletteText.add(palette);
 
//	paletteText.add(txtField);
 
	JPanel colorControls = new JPanel();
 
	colorControls.setLayout(new GridLayout(3,3));
//	add(colorControls, BorderLayout.SOUTH);
 
	colorControls.add(redBar);
 
	colorControls.add(grnBar);
 
	colorControls.add(bluBar);
 
	Container content = this.getContentPane();
 
	content.setLayout(new BoxLayout(content, BoxLayout.X_AXIS));
 
	content.add(paldd(,BorderLayout.CENTER);
etteText);
 
	content.add(colorControls);
 
	this.setTitle("Color SliDER");
 
	this.pack();
 
	}
 
	class GraphicsPanel extends JPanel{
 
	public GraphicsPanel() {
 
	this.setPreferredSize(new Dimension(300, 300));
 
	this.setBackground(Color.white);
 
	this.setForeground(Color.black);
 
	}
 
	public void paintComponent(Graphics g) {
 
	super.paintComponent(g);
 
	g.setColor(new Color(red, green, blue));
 
	g.fillRect(0, 0, this.getWidth(), this.getHeight()); 
 
	}
 
	}
 
	class ColorListener implements ChangeListener {
 
		public void stateChanged(ChangeEvent ae) {
 
		red = redBar.getValue();
 
		green = grnBar.getValue();
 
		blue = bluBar.getValue();
 
//		txtField.setText("Color(" + red + ", " + green + ", " + blue +") or " + "Color(0x" + Integer.toHexString(blue +
 
//		256 * (green + 256 * red)) + ")");
 
		palette.repaint();
 
		}
 
		}
 
		public static void main(String[] args) {
 
			JFrame window = new RGBColorSlider();
 
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
				window.setVisible(true);
 
				}
 
		}
