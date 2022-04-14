package igra;

import java.awt.EventQueue;
import javax.swing.JFrame;


public class Space_invaders extends JFrame{
	
	public Space_invaders() {
		
		initUI();
	}
	
	private void initUI() {
		
		 add(new Board());

	        setTitle("Space Invaders");
	        setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);

	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setResizable(false);
	        setLocationRelativeTo(null);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EventQueue.invokeLater(() -> {
			var ex = new Space_invaders();
            ex.setVisible(true);
		});
	}
}
