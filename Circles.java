import javax.swing.*;
import java.awt.*;
public class Circles extends JApplet {

	public void init(){
		getContentPane().setBackground(Color.white);
	}
	
	public void paint(Graphics g){
		drawCircles(g,10,5,300);
	}
	
	private void drawCircles(Graphics g, int n, int topXY, int size){
		if(n>0){
			g.drawOval(topXY, topXY, size, size);
			drawCircles(g,n-1,topXY+15,size-30);
		}
	}


}
