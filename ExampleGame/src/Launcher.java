import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RhythmGameMain game = new RhythmGameMain();
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new Main(); 
			frame.setVisible(true);
		});
	}

}